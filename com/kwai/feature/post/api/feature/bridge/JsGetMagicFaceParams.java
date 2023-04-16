package com.kwai.feature.post.api.feature.bridge.JsGetMagicFaceParams;
import java.io.Serializable;
import java.lang.Object;

public class JsGetMagicFaceParams implements Serializable	// class@00133e
{
    public int mBizId;
    public String mChildMagicFaceId;
    public String mMagicFaceId;
    public long mTimeout;
    public static final long serialVersionUID = 0x73d0025f55cef412;

    public void JsGetMagicFaceParams(){
       super();
       this.mBizId = 0;
       this.mTimeout = 5000;
    }
}
