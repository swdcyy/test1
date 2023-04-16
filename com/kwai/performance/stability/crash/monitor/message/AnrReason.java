package com.kwai.performance.stability.crash.monitor.message.AnrReason;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class AnrReason implements Serializable	// class@0011f4
{
    public String mLongMsg;
    public String mShortMsg;
    public String mTag;
    public static final long serialVersionUID = 0xbbe4f9dc3a041b66;

    public void AnrReason(){
       super();
    }
    public String toString(){
       return "mTag: "+this.mTag+10+"mShortMsg: "+this.mShortMsg+10+"mLongMsg: "+this.mLongMsg+10;
    }
}
