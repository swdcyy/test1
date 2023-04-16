package com.yxcorp.login.http.response.RefreshTokenResponse;
import java.io.Serializable;
import java.lang.Object;

public class RefreshTokenResponse implements Serializable	// class@001ad3
{
    public String apiClientSalt;
    public String apiServiceToken;
    public String h5ServiceToken;
    public long mQuickloginTokenExpireTime;
    public String passToken;
    public String quickLoginToken;
    public String sid;
    public static final long serialVersionUID = 0xbed630a6f47b6fd6;

    public void RefreshTokenResponse(){
       super();
    }
}
