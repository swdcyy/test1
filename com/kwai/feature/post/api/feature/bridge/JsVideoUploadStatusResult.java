package com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusResult$StatusResultData;
import java.lang.Object;

public class JsVideoUploadStatusResult implements Serializable	// class@00138c
{
    public JsVideoUploadStatusResult$StatusResultData mData;
    public final int mResult;
    public static final long serialVersionUID = 0x97f42af9f6e1bd4e;

    public void JsVideoUploadStatusResult(JsVideoUploadStatusResult$StatusResultData p0,int p1){
       super();
       this.mResult = p1;
       this.mData = p0;
    }
}
