package com.kwai.feature.api.social.bridge.beans.JsFollowUserParams;
import java.io.Serializable;
import java.lang.Object;

public class JsFollowUserParams implements Serializable	// class@001096
{
    public String mCallBack;
    public Map mExtraInfoMap;
    public boolean mFollowing;
    public String mUserId;
    public String mWebUrl;
    public static final long serialVersionUID = 0xecee9c38060cb62c;

    public void JsFollowUserParams(){
       super();
       this.mWebUrl = "";
    }
}
