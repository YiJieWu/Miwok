package com.example.android.miwok;

/**
 * Created by yijiewu on 2/22/17.
 */

public class Work {
    private String e_word;
    private String m_word;

    public Work(String w1,String w2){
        e_word=w1;
        m_word=w2;
    }

    public String getDefaultTrans(){
        return e_word;
    }

    public String getMiwokTrans(){
        return m_word;
    }
}
