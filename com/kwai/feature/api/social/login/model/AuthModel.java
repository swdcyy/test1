package com.kwai.feature.api.social.login.model.AuthModel;
import java.io.Serializable;
import java.lang.Object;

public class AuthModel implements Serializable	// class@00110d
{
    public String mAccessToken;
    public long mExpiredTime;
    public int operatorType;
    public static final long serialVersionUID = 0xb1cf96b2bf60b48b;

    public void AuthModel(){
       super();
    }
}
