package com.yxcorp.upgrade.network.CheckUpgradeRequestListener$UpgradeResponse;
import java.io.Serializable;
import java.lang.Object;

public class CheckUpgradeRequestListener$UpgradeResponse implements Serializable	// class@00099a
{
    public boolean mCanUpgrade;
    public String mDownloadUrl;
    public boolean mForceUpdate;
    public int mMediaType;
    public String mMediaUrl;
    public boolean mNeedCheckSign;
    public long mShowDialogInterval;
    public long mTaskId;
    public int mUpdateType;
    public long mUpgradeNeedStartupTime;
    public boolean mUseMarket;
    public String mVer;
    public int mVerCode;
    public String mVerMsg;
    public String mVerTitle;
    public String mX64DownloadUrl;

    public void CheckUpgradeRequestListener$UpgradeResponse(){
       super();
       this.mShowDialogInterval = -1;
       this.mUpdateType = -1;
    }
}
