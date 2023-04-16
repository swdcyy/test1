package com.yxcorp.login.http.response.AuthInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class AuthInfoResponse implements Serializable	// class@001ac4
{
    public AuthInfoResponse$AppInfo mAppInfo;
    public String mConfirmToken;
    public AuthInfoResponse$Follow mFollow;
    public AuthInfoResponse$MaxLimit mMaxLimit;
    public List mScopeList;
    public String mState;
    public static final long serialVersionUID = 0x73f42df7baad0e5;

    public void AuthInfoResponse(){
       super();
    }
}
