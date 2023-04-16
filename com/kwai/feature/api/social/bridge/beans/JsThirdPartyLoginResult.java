package com.kwai.feature.api.social.bridge.beans.JsThirdPartyLoginResult;
import java.io.Serializable;
import java.lang.Object;

public final class JsThirdPartyLoginResult implements Serializable	// class@0010b4
{
    public String mAccessToken;
    public String mAccessTokenSecret;
    public String mCallback;
    public String mOpenId;
    public String mPlatform;
    public String mRefreshtoken;
    public final int mResult;
    public static final long serialVersionUID = 0xe255c0b97bfc2d99;

    public void JsThirdPartyLoginResult(){
       super();
       this.mResult = 1;
    }
}
