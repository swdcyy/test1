package com.kwai.feature.api.social.bridge.beans.JsAuthParams;
import java.io.Serializable;
import java.lang.Object;

public class JsAuthParams implements Serializable	// class@00108b
{
    public String mAppId;
    public String mCallback;
    public String mScope;
    public String mType;
    public String mWebUrl;
    public static final long serialVersionUID = 0x344382445feb37bb;

    public void JsAuthParams(){
       super();
       this.mWebUrl = "";
    }
}
