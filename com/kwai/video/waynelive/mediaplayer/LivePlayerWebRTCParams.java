package com.kwai.video.waynelive.mediaplayer.LivePlayerWebRTCParams;
import java.lang.Object;
import java.lang.String;

public class LivePlayerWebRTCParams	// class@000e0c
{
    public String mConfigWebRTC;
    public boolean mEnableWebRTCManifest;

    public void LivePlayerWebRTCParams(){
       super();
    }
    public String getConfigWebRTC(){
       return this.mConfigWebRTC;
    }
    public boolean isEnableWebRTCManifest(){
       return this.mEnableWebRTCManifest;
    }
    public void setConfigWebRTC(String p0){
       this.mConfigWebRTC = p0;
    }
    public void setEnableWebRTCManifest(boolean p0){
       this.mEnableWebRTCManifest = p0;
    }
}
