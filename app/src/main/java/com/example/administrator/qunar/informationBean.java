package com.example.administrator.qunar;

import java.util.List;

/**
 * Created by Administrator on 2016/12/27.
 */

public class informationBean {

    /**
     * ret : true
     * data : {"trainList":[{"trainType":"高速动车","trainNo":"G1","from":"北京南","to":"上海虹桥","startTime":"09:00","endTime":"13:48","duration":"4时48分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G3","from":"北京南","to":"上海虹桥","startTime":"14:00","endTime":"18:48","duration":"4时48分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G5","from":"北京南","to":"上海虹桥","startTime":"07:00","endTime":"11:55","duration":"4时55分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G13","from":"北京南","to":"上海虹桥","startTime":"10:00","endTime":"14:55","duration":"4时55分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"特等座","seatPrice":"1053","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G15","from":"北京南","to":"上海虹桥","startTime":"11:00","endTime":"15:55","duration":"4时55分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G7","from":"北京南","to":"上海虹桥","startTime":"19:00","endTime":"23:55","duration":"4时55分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":12},{"seat":"二等座","seatPrice":"553","remainNum":46},{"seat":"一等座","seatPrice":"933","remainNum":18}]},{"trainType":"高速动车","trainNo":"G17","from":"北京南","to":"上海虹桥","startTime":"15:00","endTime":"19:56","duration":"4时56分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G11","from":"北京南","to":"上海虹桥","startTime":"08:00","endTime":"13:10","duration":"5时10分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"特等座","seatPrice":"1053","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G19","from":"北京南","to":"上海虹桥","startTime":"16:00","endTime":"21:14","duration":"5时14分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G41","from":"北京南","to":"上海虹桥","startTime":"09:16","endTime":"14:48","duration":"5时32分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G43","from":"北京南","to":"上海虹桥","startTime":"14:05","endTime":"19:37","duration":"5时32分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G107","from":"北京南","to":"上海虹桥","startTime":"08:05","endTime":"13:38","duration":"5时33分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G153","from":"北京南","to":"上海虹桥","startTime":"17:15","endTime":"22:49","duration":"5时34分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G113","from":"北京南","to":"上海虹桥","startTime":"08:53","endTime":"14:30","duration":"5时37分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"特等座","seatPrice":"1053","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G21","from":"北京南","to":"上海虹桥","startTime":"17:00","endTime":"22:39","duration":"5时39分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G157","from":"北京南","to":"上海虹桥","startTime":"17:43","endTime":"23:22","duration":"5时39分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G105","from":"北京南","to":"上海虹桥","startTime":"07:35","endTime":"13:15","duration":"5时40分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G129","from":"北京南","to":"上海虹桥","startTime":"12:10","endTime":"17:50","duration":"5时40分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G119","from":"北京南","to":"上海虹桥","startTime":"10:05","endTime":"15:47","duration":"5时42分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G115","from":"北京南","to":"上海虹桥","startTime":"09:22","endTime":"15:07","duration":"5时45分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G125","from":"北京南","to":"上海虹桥","startTime":"11:10","endTime":"16:58","duration":"5时48分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G411","from":"北京南","to":"上海虹桥","startTime":"11:20","endTime":"17:08","duration":"5时48分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G131","from":"北京南","to":"上海虹桥","startTime":"12:25","endTime":"18:14","duration":"5时49分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G111","from":"北京南","to":"上海虹桥","startTime":"08:35","endTime":"14:25","duration":"5时50分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G137","from":"北京南","to":"上海虹桥","startTime":"13:07","endTime":"18:59","duration":"5时52分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G101","from":"北京南","to":"上海虹桥","startTime":"06:44","endTime":"12:38","duration":"5时54分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G143","from":"北京南","to":"上海虹桥","startTime":"14:31","endTime":"20:25","duration":"5时54分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G133","from":"北京南","to":"上海虹桥","startTime":"12:40","endTime":"18:35","duration":"5时55分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G135","from":"北京南","to":"上海虹桥","startTime":"12:55","endTime":"18:52","duration":"5时57分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G149","from":"北京南","to":"上海虹桥","startTime":"16:25","endTime":"22:22","duration":"5时57分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G117","from":"北京南","to":"上海虹桥","startTime":"09:40","endTime":"15:39","duration":"5时59分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G121","from":"北京南","to":"上海虹桥","startTime":"10:28","endTime":"16:28","duration":"6时","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G145","from":"北京南","to":"上海虹桥","startTime":"14:36","endTime":"20:37","duration":"6时1分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G141","from":"北京南","to":"上海虹桥","startTime":"14:10","endTime":"20:13","duration":"6时3分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G139","from":"北京南","to":"上海虹桥","startTime":"13:40","endTime":"19:44","duration":"6时4分","seatInfos":[{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"高速动车","trainNo":"G147","from":"北京南","to":"上海虹桥","startTime":"15:41","endTime":"21:50","duration":"6时9分","seatInfos":[{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]},{"trainType":"动车组","trainNo":"D321","from":"北京南","to":"上海","startTime":"21:23","endTime":"09:13","duration":"11时50分","seatInfos":[{"seat":"无座","seatPrice":"309","remainNum":4},{"seat":"二等座","seatPrice":"309","remainNum":0},{"seat":"软卧","seatPrice":"615","remainNum":229}]},{"trainType":"动车组","trainNo":"D313","from":"北京南","to":"上海","startTime":"19:34","endTime":"07:41","duration":"12时7分","seatInfos":[{"seat":"无座","seatPrice":"309","remainNum":-1},{"seat":"二等座","seatPrice":"309","remainNum":-1},{"seat":"软卧","seatPrice":"615","remainNum":-1}]},{"trainType":"空调特快","trainNo":"T109","from":"北京","to":"上海","startTime":"19:33","endTime":"10:43","duration":"15时10分","seatInfos":[{"seat":"高级软卧","seatPrice":"879.5","remainNum":5},{"seat":"无座","seatPrice":"177.5","remainNum":192},{"seat":"硬座","seatPrice":"177.5","remainNum":87},{"seat":"硬卧","seatPrice":"304.5","remainNum":0},{"seat":"软卧","seatPrice":"476.5","remainNum":0}]},{"trainType":"其他","trainNo":"1461","from":"北京","to":"上海","startTime":"11:54","endTime":"07:19","duration":"19时25分","seatInfos":[{"seat":"无座","seatPrice":"156.5","remainNum":-1},{"seat":"硬座","seatPrice":"156.5","remainNum":-1},{"seat":"硬卧","seatPrice":"283.5","remainNum":-1}]}]}
     */

    private boolean ret;
    private DataBean data;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * trainType : 高速动车
         * trainNo : G1
         * from : 北京南
         * to : 上海虹桥
         * startTime : 09:00
         * endTime : 13:48
         * duration : 4时48分
         * seatInfos : [{"seat":"无座","seatPrice":"553","remainNum":-1},{"seat":"商务座","seatPrice":"1748","remainNum":-1},{"seat":"二等座","seatPrice":"553","remainNum":-1},{"seat":"一等座","seatPrice":"933","remainNum":-1}]
         */

        private List<TrainListBean> trainList;

        public List<TrainListBean> getTrainList() {
            return trainList;
        }

        public void setTrainList(List<TrainListBean> trainList) {
            this.trainList = trainList;
        }

        public static class TrainListBean {
            private String trainType;
            private String trainNo;
            private String from;
            private String to;
            private String startTime;
            private String endTime;
            private String duration;
            /**
             * seat : 无座
             * seatPrice : 553
             * remainNum : -1
             */

            private List<SeatInfosBean> seatInfos;

            public String getTrainType() {
                return trainType;
            }

            public void setTrainType(String trainType) {
                this.trainType = trainType;
            }

            public String getTrainNo() {
                return trainNo;
            }

            public void setTrainNo(String trainNo) {
                this.trainNo = trainNo;
            }

            public String getFrom() {
                return from;
            }

            public void setFrom(String from) {
                this.from = from;
            }

            public String getTo() {
                return to;
            }

            public void setTo(String to) {
                this.to = to;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public List<SeatInfosBean> getSeatInfos() {
                return seatInfos;
            }

            public void setSeatInfos(List<SeatInfosBean> seatInfos) {
                this.seatInfos = seatInfos;
            }

            public static class SeatInfosBean {
                private String seat;
                private String seatPrice;
                private int remainNum;

                public String getSeat() {
                    return seat;
                }

                public void setSeat(String seat) {
                    this.seat = seat;
                }

                public String getSeatPrice() {
                    return seatPrice;
                }

                public void setSeatPrice(String seatPrice) {
                    this.seatPrice = seatPrice;
                }

                public int getRemainNum() {
                    return remainNum;
                }

                public void setRemainNum(int remainNum) {
                    this.remainNum = remainNum;
                }
            }
        }
    }
}
