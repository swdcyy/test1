package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySdkPlatformConfig;

public class LiveGzoneAccompanyGameInfo implements Serializable, a	// class@000c36
{
    public LiveGzoneAccompanySdkPlatformConfig mAccompanySdkPlatformConfig;
    public CDNUrl[] mBackground;
    public int mEasyBoardType;
    public boolean mEnableOneClick;
    public CDNUrl[] mGameCardBackground;
    public LiveGzoneAccompanyGameDownloadConfig mGameDownloadConfig;
    public CDNUrl[] mGameIcon;
    public String mGameId;
    public String mGameName;
    public CDNUrl[] mGamePanelBackground;
    public LiveGzoneAccompanySdkPlatformConfig[] mLiveAccompanySdkPlatformConfigs;
    public static final long serialVersionUID = 0x13c28c9d383b84b1;

    public void LiveGzoneAccompanyGameInfo(){
       super();
       this.mEnableOneClick = true;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyGameInfo.class, "1")) {
          return;
       }
       if (!j.h(this.mLiveAccompanySdkPlatformConfigs) && this.mAccompanySdkPlatformConfig == null) {
          LiveGzoneAccompanyGameInfo tmLiveAccomp = this.mLiveAccompanySdkPlatformConfigs;
          int len = tmLiveAccomp.length;
          int i = 0;
          while (i < len) {
             object oobject = tmLiveAccomp[i];
             if (("ANDROID_PHONE").equals(oobject.mPlatform)) {
                this.mAccompanySdkPlatformConfig = oobject;
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
}
