package com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveVoicePartyMicSeatsReadyResponse implements Serializable	// class@001790
{
    public String mKsCoin;
    public VoicePartyMicSeatInfo mMicSeatInfo;
    public int mMicSeatsReason;
    public int mMicSeatsVersion;
    public int mUserLevel;
    public LiveVoicePartyMicSeatsReadyResponse$UserMicSeatLevelInfo mUserMicSeatLevelInfo;
    public LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState mVoicePartyUserInitialState;
    public static final long serialVersionUID = 0x804b6bb3aae56673;

    public void LiveVoicePartyMicSeatsReadyResponse(){
       super();
    }
}
