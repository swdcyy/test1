package com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class GameCenterDownloadParams$DownloadInfo implements Serializable	// class@00129a
{
    public String mDownloadCapabilityProvider;
    public String mGameIcon;
    public String mGameId;
    public String mGameName;
    public String mMsg;
    public long mNetSpeed;
    public String mPackageName;
    public long mPackageVersion;
    public int mPercent;
    public int mResult;
    public long mSoFarBytes;
    public String mStage;
    public String mStatsticData;
    public long mTotalBytes;
    public String mTraceId;
    public String mUrl;
    public static final long serialVersionUID = 0x8ee14ee07a2da4da;

    public void GameCenterDownloadParams$DownloadInfo(){
       super();
    }
    public int getPercent(){
       GameCenterDownloadParams$DownloadInfo tmTotalBytes = this.mTotalBytes;
       if (tmTotalBytes > 0) {
          return (int)(((double)this.mSoFarBytes * 100.00f) / (double)tmTotalBytes);
       }
       return 0;
    }
    public boolean isCompleteStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("complete").equals(this.mStage);
    }
    public boolean isDownloadingStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!("start").equals(this.mStage) && (("resume").equals(this.mStage) || ("progress").equals(this.mStage)))? true: false;
       return b;
    }
    public boolean isErrorStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("error").equals(this.mStage);
    }
    public boolean isPauseStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("pause").equals(this.mStage);
    }
    public boolean isProgressStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("progress").equals(this.mStage);
    }
    public boolean isStartStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("start").equals(this.mStage);
    }
    public boolean isWaitStatus(){
       Object obj = PatchProxy.apply(null, this, GameCenterDownloadParams$DownloadInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("wait").equals(this.mStage);
    }
}
