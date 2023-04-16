package com.yxcorp.login.model.AnonymousUserResponse;
import java.io.Serializable;
import java.lang.Object;

public class AnonymousUserResponse implements Serializable	// class@001af3
{
    public long mRefreshTime;
    public int mRetryTimes;
    public String mSecurity;
    public String mUserId;
    public String mVisitorToken;
    public static final long serialVersionUID = 0x70fb6e2a2b246d62;

    public void AnonymousUserResponse(){
       super();
    }
}
