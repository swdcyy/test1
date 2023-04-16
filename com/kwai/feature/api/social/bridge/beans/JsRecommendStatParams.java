package com.kwai.feature.api.social.bridge.beans.JsRecommendStatParams;
import java.io.Serializable;
import java.lang.Object;

public class JsRecommendStatParams implements Serializable	// class@0010a6
{
    public int mAction;
    public long mAuthorId;
    public String mCallBack;
    public long mProfileUserId;
    public String mPrsid;
    public String mWebUrl;
    public static final long serialVersionUID = 0xbae4b916bcd93d33;

    public void JsRecommendStatParams(){
       super();
       this.mWebUrl = "";
    }
}
