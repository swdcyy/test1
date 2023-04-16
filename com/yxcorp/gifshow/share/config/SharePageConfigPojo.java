package com.yxcorp.gifshow.share.config.SharePageConfigPojo;
import java.io.Serializable;
import java.lang.Object;

public class SharePageConfigPojo implements Serializable	// class@001b78
{
    public boolean mEnableSnapshotShare;
    public boolean mEnableWechatWow;
    public PhotoShareGuideConfig mPhotoShareGuideConfig;
    public int mScreenShotShareDays;
    public int mScreenShotShareShowSeconds;
    public int mScreenShotShareTimes;
    public boolean mSupportImGroupOnShare;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void SharePageConfigPojo(){
       super();
    }
}
