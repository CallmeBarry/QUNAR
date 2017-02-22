package com.example.administrator.qunar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @BindView(R.id.Edfrom)
    EditText mEdfrom;
    @BindView(R.id.Edto)
    EditText mEdto;
    @BindView(R.id.Eddata)
    TextView mEddata;
    @BindView(R.id.btn)
    Button mBtn;


    private Intent mIntent;

    AlertDialog mAlertDialog;
    DatePicker mDatePicker;
    int myear, mmouth, mday;
    static String data;
    private Calendar mCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCalendar = Calendar.getInstance();


        ButterKnife.bind(this);
        myear = mCalendar.get(Calendar.YEAR);
        mmouth = mCalendar.get(Calendar.MONTH) + 1;
        mday = mCalendar.get(Calendar.DAY_OF_MONTH);
        Log.d(TAG, "onCreate: " + myear + "++++++" + mmouth + "++++++" + mday);
        data = myear + "-" + mmouth + "-" + mday;
        mEddata.setText(mmouth + "月" + mday + "日");


    }


    @OnClick({R.id.Eddata, R.id.btn})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Eddata:
                mAlertDialog = new AlertDialog.Builder(this).create();
                mAlertDialog.show();
                mAlertDialog.setContentView(R.layout.datapicker);
                mDatePicker = (DatePicker) mAlertDialog.getWindow().findViewById(R.id.datapicker);

                mDatePicker.init(myear, mmouth-1, mday, new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        myear = year;
                        mmouth = monthOfYear + 1;
                        mday = dayOfMonth;


                        mEddata.setText(mmouth + "月" + mday + "日");
                    }
                });

                break;
            case R.id.btn:

                if (mmouth < 10 && mday < 10) {
                    data = myear + "-0" + mmouth + "-0" + mday;
                } else if (mmouth < 10 && mday > 10) {
                    data = myear + "-0" + mmouth + "-" + mday;
                } else if (mday < 10 && mmouth > 10) {
                    data = myear + "-" + mmouth + "-0" + mday;
                } else if (mmouth >= 10 && mday >= 10) {
                    data = myear + "-" + mmouth + "-" + mday;
                }
                mIntent = new Intent(this, informationActivity.class);
                mIntent.putExtra("from", mEdfrom.getText().toString().trim());
                mIntent.putExtra("to", mEdto.getText().toString().trim());
                mIntent.putExtra("data", data);
                startActivity(mIntent);
                break;
        }
    }


}
