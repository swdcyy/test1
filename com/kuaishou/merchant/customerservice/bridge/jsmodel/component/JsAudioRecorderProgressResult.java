package com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecorderProgressResult;
import java.io.Serializable;
import java.lang.Object;

public class JsAudioRecorderProgressResult implements Serializable	// class@001661
{
    public long mDuration;
    public int mVolume;

    public void JsAudioRecorderProgressResult(int p0,long p1){
       super();
       this.mVolume = p0;
       this.mDuration = p1;
    }
}
