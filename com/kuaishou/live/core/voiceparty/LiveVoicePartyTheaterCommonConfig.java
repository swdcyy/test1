package com.kuaishou.live.core.voiceparty.LiveVoicePartyTheaterCommonConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoicePartyTheaterCommonConfig implements Serializable	// class@001313
{
    public boolean mEnableVoicePartyMovieChannelV2;
    public long mPlayAlignAdjustDuration;
    public long mPlayAlignTolerantMillis;
    public LiveVoicePartyTheaterCommonConfig$TheaterPlaySptsConfig mTheaterPlaySptsConfig;
    public List mTheaterTabs;
    public static final long serialVersionUID = 0x251a678ba26e2fe;

    public void LiveVoicePartyTheaterCommonConfig(){
       super();
       this.mPlayAlignTolerantMillis = 3000;
       this.mPlayAlignAdjustDuration = 0x2710;
       this.mEnableVoicePartyMovieChannelV2 = false;
    }
}
