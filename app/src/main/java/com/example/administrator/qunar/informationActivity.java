package com.example.administrator.qunar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/12/29.
 */

public class informationActivity  extends AppCompatActivity{

    private static final String TAG ="informationActivity" ;
    private informationBean mInformationBean;
    Gson gson = new Gson();
    Handler mHandler = new Handler();
    private ListView mList;
    Handler handler;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
handler=new Handler();

        Intent intent=getIntent();
        String from=intent.getStringExtra("from");
        String to=intent.getStringExtra("to");
        String data=intent.getStringExtra("data");
        mList = (ListView) findViewById(R.id.LVinformation);

        Log.d(TAG, "onCreate: QQQQQQQQQ"+data);
        loadData(from, to,data);

        mList.setAdapter(mBaseAdapter);

    }


    private void loadData(String from, String to, String data) {
        String url = "http://apis.baidu.com/qunar/qunar_train_service/s2ssearch?version=1.0&from=" + from + "&to=" + to + "&date=" + data;
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .header("apikey", "e2c67c6376b608ac01086ddccc84f88f").build();
        okHttpClient.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: " + e.getLocalizedMessage());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(informationActivity.this, "查询失败重新查询", Toast.LENGTH_SHORT).show();
                    }
                });

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
//                Log.d(TAG, "onResponse: "+response.body().string());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(informationActivity.this, "查询成功", Toast.LENGTH_SHORT).show();
                    }
                });

                String result = response.body().string();
                mInformationBean = gson.fromJson(result, informationBean.class);
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mBaseAdapter.notifyDataSetChanged();
                    }
                });

            }
        });
    }

    BaseAdapter mBaseAdapter = new BaseAdapter() {

        private ViewHolder mHolder = null;

        @Override
        public int getCount() {
            if (mInformationBean == null) {
                return 0;
            }
            return mInformationBean.getData().getTrainList().size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = View.inflate(informationActivity.this, R.layout.list_item, null);
                mHolder = new ViewHolder(convertView);
                convertView.setTag(mHolder);
            } else {
                mHolder = (ViewHolder) convertView.getTag();
            }
            informationBean.DataBean.TrainListBean trainListBean = mInformationBean.getData().getTrainList().get(position);
            mHolder.trainType.setText(trainListBean.getTrainType());
            mHolder.trainNo.setText(trainListBean.getTrainNo());
            mHolder.to.setText(trainListBean.getTo());
            mHolder.from.setText(trainListBean.getFrom());
            mHolder.startTime.setText(trainListBean.getStartTime());
            mHolder.endTime.setText(trainListBean.getEndTime());
            mHolder.duration.setText(trainListBean.getDuration());

            StringBuffer stringBuffer = new StringBuffer();

            for (int i = 0; i < trainListBean.getSeatInfos().size(); i++) {
                String seat = trainListBean.getSeatInfos().get(i).getSeat();
                String seatPrice = trainListBean.getSeatInfos().get(i).getSeatPrice();
                int remainNum = trainListBean.getSeatInfos().get(i).getRemainNum();
                stringBuffer.append(seat + " 剩余：" + remainNum + " 单价：" + seatPrice + "\n");

            }

            mHolder.seatInfos.setText(stringBuffer);

            return convertView;
        }
    };

    public class ViewHolder {
        private TextView trainType;
        private TextView trainNo;
        private TextView from;
        private TextView to;
        private TextView startTime;
        private TextView endTime;
        private TextView duration;
        private TextView seatInfos;

        ViewHolder(View root) {
            trainType = (TextView) root.findViewById(R.id.trainType);
            trainNo = (TextView) root.findViewById(R.id.trainNo);
            from = (TextView) root.findViewById(R.id.from);
            to = (TextView) root.findViewById(R.id.to);
            startTime = (TextView) root.findViewById(R.id.startTime);
            endTime = (TextView) root.findViewById(R.id.endTime);
            duration = (TextView) root.findViewById(R.id.duration);
            seatInfos = (TextView) root.findViewById(R.id.seatInfos);

        }

    }
}
