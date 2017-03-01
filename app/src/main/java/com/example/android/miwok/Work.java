package com.example.android.miwok;

/**
 * Created by yijiewu on 2/22/17.
 */

public class Work {
    private String e_word;
    private String m_word;
    //image resource identifier is an Int rather than a string
    private int pic_id;


    public Work(String w1,String w2){
        e_word=w1;
        m_word=w2;
    }

    public Work(String w1,String w2,int pic){
        e_word=w1;
        m_word=w2;
        pic_id=pic;
    }

    public String getDefaultTrans(){
        return e_word;
    }

    public String getMiwokTrans(){
        return m_word;
    }

    public int getPic(){return this.pic_id;};
}
