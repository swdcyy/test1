package com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig implements Serializable	// class@001310
{
    public long mPlayLiveAnchorSptsMillis;
    public long mPlayLiveAudienceSptsMillis;
    public long mPlayLiveGuestSptsMillis;
    public static final long serialVersionUID = 0xc22b4c323878cc8e;

    public void LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig(){
       super();
       this.mPlayLiveAnchorSptsMillis = 3000;
       this.mPlayLiveGuestSptsMillis = 5000;
       this.mPlayLiveAudienceSptsMillis = 0x2710;
    }
}
