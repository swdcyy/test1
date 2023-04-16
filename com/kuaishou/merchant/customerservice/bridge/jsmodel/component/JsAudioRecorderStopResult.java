package com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecorderStopResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsAudioRecorderStopResult implements Serializable	// class@001662
{
    public String mData;
    public long mDuration;
    public static final long serialVersionUID = 0xfaa27ef5;

    public void JsAudioRecorderStopResult(long p0,String p1){
       super();
       this.mDuration = p0;
       this.mData = p1;
    }
}
