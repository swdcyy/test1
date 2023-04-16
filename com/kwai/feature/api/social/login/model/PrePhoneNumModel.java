package com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import java.io.Serializable;
import java.lang.Object;

public class PrePhoneNumModel implements Serializable	// class@00111a
{
    public String mAccessCode;
    public String mAccessToken;
    public long mExpiredTime;
    public String mPrePhone;
    public int operatorType;
    public static final long serialVersionUID = 0x6adadc8a93e4496;

    public void PrePhoneNumModel(){
       super();
    }
}
