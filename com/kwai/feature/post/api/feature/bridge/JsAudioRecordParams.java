package com.kwai.feature.post.api.feature.bridge.JsAudioRecordParams;
import java.io.Serializable;
import java.lang.Object;

public class JsAudioRecordParams implements Serializable	// class@00132f
{
    public String mCallback;
    public String mData;
    public int mQuality;
    public long mTimeLength;
    public long mTimeLimit;

    public void JsAudioRecordParams(){
       super();
       this.mQuality = 1;
    }
}
