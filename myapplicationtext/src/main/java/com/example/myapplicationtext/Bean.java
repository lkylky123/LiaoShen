package com.example.myapplicationtext;

import java.util.List;

/**
 * Created by Administrator on 2016/11/25.
 */

public class Bean {


    private String title;

    private String date;

    private String category;

    private String author_name;

    private String thumbnail_pic_s;

    private String url;

    private String thumbnail_pic_s03;

    @Override
    public String toString() {
        return "Bean{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", category='" + category + '\'' +
                ", author_name='" + author_name + '\'' +
                ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                ", url='" + url + '\'' +
                ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                '}';
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public void setAuthor_name(String author_name){
        this.author_name = author_name;
    }
    public String getAuthor_name(){
        return this.author_name;
    }
    public void setThumbnail_pic_s(String thumbnail_pic_s){
        this.thumbnail_pic_s = thumbnail_pic_s;
    }
    public String getThumbnail_pic_s(){
        return this.thumbnail_pic_s;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setThumbnail_pic_s03(String thumbnail_pic_s03){
        this.thumbnail_pic_s03 = thumbnail_pic_s03;
    }
    public String getThumbnail_pic_s03(){
        return this.thumbnail_pic_s03;
    }


    public class Result {
        private String stat;

        private List<Bean> data ;

        @Override
        public String toString() {
            return "Result{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        public void setStat(String stat){
            this.stat = stat;
        }
        public String getStat(){
            return this.stat;
        }
        public void setData(List<Bean> data){
            this.data = data;
        }
        public List<Bean> getData(){
            return this.data;
        }

    }

    public class Root {
        private String reason;

        private Result result;

        private int error_code;

        @Override
        public String toString() {
            return "Root{" +
                    "reason='" + reason + '\'' +
                    ", result=" + result +
                    ", error_code=" + error_code +
                    '}';
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getReason() {
            return this.reason;
        }

        public void setResult(Result result) {
            this.result = result;
        }

        public Result getResult() {
            return this.result;
        }

        public void setError_code(int error_code) {
            this.error_code = error_code;
        }

        public int getError_code() {
            return this.error_code;
        }

    }

}