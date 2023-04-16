package com.feature.post.bridge.jsmodel.JsUploadVideoResult;
import java.io.Serializable;
import java.util.Map;
import java.lang.Object;

public class JsUploadVideoResult implements Serializable	// class@001491
{
    public final Map mData;
    public final int mResult;
    public static final long serialVersionUID = 0x2baf5f151085d976;

    public void JsUploadVideoResult(Map p0){
       super();
       this.mResult = 1;
       this.mData = p0;
    }
    public void JsUploadVideoResult(Map p0,int p1){
       super();
       this.mResult = p1;
       this.mData = p0;
    }
}
