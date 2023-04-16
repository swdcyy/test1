package com.kwai.feature.post.api.feature.bridge.JsVideoResumeDataResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsVideoResumeDataResult implements Serializable	// class@001389
{
    public String mErrorMsg;
    public int mResult;
    public String mTaskId;
    public static final long serialVersionUID = 0x270a908d7f3bf3cc;

    public void JsVideoResumeDataResult(int p0,String p1,String p2){
       super();
       this.mResult = p0;
       this.mErrorMsg = p1;
       this.mTaskId = p2;
    }
}
