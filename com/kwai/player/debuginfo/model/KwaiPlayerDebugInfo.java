package com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import java.lang.Object;
import com.kwai.player.debuginfo.model.PlayerConfigDebugInfo;
import com.kwai.player.debuginfo.model.AppVodQosDebugInfoNew;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfoNew;
import com.kwai.player.debuginfo.model.AppLiveQosDebugInfo;

public class KwaiPlayerDebugInfo	// class@0012e6
{
    public AppLiveQosDebugInfo mAppLiveQosDebugInfo;
    public AppLiveQosDebugInfoNew mAppLiveQosDebugInfoNew;
    public AppVodQosDebugInfoNew mAppVodQosDebugInfo;
    public boolean mIsLive;
    public PlayerConfigDebugInfo mPlayerApplyConfig;
    public String mSdkVersion;

    public void KwaiPlayerDebugInfo(){
       super();
       this.mIsLive = false;
       this.mPlayerApplyConfig = new PlayerConfigDebugInfo();
       this.mAppVodQosDebugInfo = new AppVodQosDebugInfoNew();
       this.mAppLiveQosDebugInfoNew = new AppLiveQosDebugInfoNew();
       this.mAppLiveQosDebugInfo = new AppLiveQosDebugInfo();
    }
    public boolean isLive(){
       return this.mIsLive;
    }
    public void setIsLive(boolean p0){
       this.mIsLive = p0;
    }
}
