package com.example.lenovo.bicycle.receiver;

/**
 * Created by lenovo on 2016/5/6.
 */
public class Msg {

    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;
    private String content;
    private int type;
    public Msg(String content,int type){
        this.content=content;
        this.type=type;
    }
    public String getContent(){
        return content;
    }
    public int getType() {
        return type;
    }
}
