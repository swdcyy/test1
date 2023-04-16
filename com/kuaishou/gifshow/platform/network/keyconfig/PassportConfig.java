package com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig;
import java.lang.Object;

public class PassportConfig	// class@00087c
{
    public boolean mDisableAccountOperationFlag;
    public boolean mEnableIspLogin;
    public boolean mEnableSfAccountRequest;
    public boolean mHideQQ;
    public boolean mHideWx;
    public int mSmsDelay;
    public long mTokenRefreshInterval;
    public static final String PREFERENCE_NAME = "PassportConfigPrefs";

    public void PassportConfig(){
       super();
       this.mSmsDelay = 60;
    }
}
