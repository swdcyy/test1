package com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.gifshow.platform.network.keyconfig.GameCenterKeyConfig$ToggleConfig;
import java.util.concurrent.TimeUnit;

public class GameCenterKeyConfig implements Serializable	// class@000866
{
    public long mCloudGameNoOperationCountDownloadTimeInMills;
    public long mCloudGameNoOperationTimeInMills;
    public long mCloudGameShortcutSingleTime;
    public long mCloudGameShortcutTotalTime;
    public boolean mEnableSpringTabShow;
    public String mInstallVpnServiceRomList;
    public long mLongTimeNotInstallDelIntervalMinute;
    public boolean mNeedThrowException;
    public long mReqAppointedGameIdInterval;
    public long mShowFloatingCardInterval;
    public boolean mShowReserveRemind;
    public long mSyncInstalledGamesIntervalInMills;
    public GameCenterKeyConfig$ToggleConfig mToggleConfig;
    public String mWelfareTitleBarUrl;
    public static final long serialVersionUID = 0x1a38f618ff9edc85;

    public void GameCenterKeyConfig(){
       super();
       this.mToggleConfig = new GameCenterKeyConfig$ToggleConfig();
       this.mReqAppointedGameIdInterval = TimeUnit.DAYS.toMillis(1);
       TimeUnit sECONDS = TimeUnit.SECONDS;
       this.mCloudGameNoOperationTimeInMills = sECONDS.toMillis(360);
       this.mCloudGameNoOperationCountDownloadTimeInMills = sECONDS.toMillis(60);
       sECONDS = TimeUnit.MINUTES;
       this.mCloudGameShortcutSingleTime = sECONDS.toMillis(5);
       this.mCloudGameShortcutTotalTime = sECONDS.toMillis(10);
       this.mSyncInstalledGamesIntervalInMills = TimeUnit.HOURS.toMillis(6);
    }
}
