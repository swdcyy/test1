package com.kwai.video.krtc.rtcengine.JoinChannelParam;
import java.lang.Object;

public class JoinChannelParam	// class@0007e3
{
    public String channelId;
    public int channelProfile;
    public boolean isAudioOnly;
    public String token;

    public void JoinChannelParam(){
       super();
       this.channelProfile = 2;
       this.isAudioOnly = false;
    }
    public boolean isLiveStream(){
       boolean b = true;
       if (this.channelProfile == b) {
       }else {
          b = false;
       }
       return b;
    }
}
