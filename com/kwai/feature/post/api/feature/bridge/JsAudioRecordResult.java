package com.kwai.feature.post.api.feature.bridge.JsAudioRecordResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;

public class JsAudioRecordResult implements Serializable	// class@001330
{
    public String mData;
    public String mErrorMsg;
    public int mResult;
    public long mTimeLength;
    public static final long serialVersionUID = 0xc1d1684b21480710;

    public void JsAudioRecordResult(int p0,String p1){
       super();
       this.mResult = 0;
       this.mResult = p0;
       this.mErrorMsg = p1;
    }
    public void JsAudioRecordResult(String p0,long p1){
       super();
       this.mResult = 0;
       this.mData = p0;
       this.mTimeLength = p1;
       this.mResult = 1;
    }
    public void JsAudioRecordResult(Throwable p0){
       super();
       this.mResult = 0;
       this.mResult = 412;
       this.mErrorMsg = p0.getMessage();
    }
}
