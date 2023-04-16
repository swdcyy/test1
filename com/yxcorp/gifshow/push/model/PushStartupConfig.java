package com.yxcorp.gifshow.push.model.PushStartupConfig;
import java.io.Serializable;
import java.lang.Object;

public class PushStartupConfig implements Serializable	// class@001692
{
    public boolean mEnableClientTriggerPush;
    public boolean mIsGetuiPushOn;
    public boolean mIsHuaweiPushOn;
    public boolean mIsJiGuangPushOn;
    public boolean mIsMeizuPushOn;
    public boolean mIsVivoPushOn;
    public boolean mIsXiaomiPushOn;
    public boolean mIsXinGePushOn;
    public NotificationSocialConfig mNotificationSocialConfig;
    public boolean mOppoPushInit;
    public boolean mOppoPushOn;
    public NotificationPermissionConfig mPushGuideDialogControl;
    public static final long serialVersionUID = 0x121f40f46d6d45ab;

    public void PushStartupConfig(){
       super();
       this.mIsMeizuPushOn = true;
       this.mIsGetuiPushOn = true;
       this.mIsXiaomiPushOn = true;
       this.mIsJiGuangPushOn = true;
       this.mIsXinGePushOn = true;
       this.mIsHuaweiPushOn = true;
       this.mIsVivoPushOn = true;
       this.mOppoPushOn = true;
    }
}
