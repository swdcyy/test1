package com.kuaishou.live.core.show.ask.model.LiveAskQuestionCountResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveAskQuestionCountResponse implements Serializable	// class@0009cf
{
    public int mQuestionCount;
    public int mRequestIntervalMs;
    public static final long serialVersionUID = 0xb1cd70e65bf2319c;

    public void LiveAskQuestionCountResponse(){
       super();
       this.mRequestIntervalMs = 5000;
    }
}
