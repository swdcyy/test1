package com.kwai.feature.api.social.bridge.beans.JsFollowRequestParams;
import java.io.Serializable;
import java.lang.Object;

public class JsFollowRequestParams implements Serializable	// class@001093
{
    public String mActivityId;
    public String mCallBack;
    public Map mExtraInfoMap;
    public int mFollowRefer;
    public boolean mFollowing;
    public String mUserId;
    public String mWebUrl;
    public boolean showErrorToast;
    public static final long serialVersionUID = 0xecee9c38060cb62c;

    public void JsFollowRequestParams(){
       super();
       this.mWebUrl = "";
    }
}
