package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyVoiceControlButton$VoiceState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveVoicePartyVoiceControlButton$VoiceState extends Enum	// class@0014b9
{
    public static final LiveVoicePartyVoiceControlButton$VoiceState[] $VALUES;
    public static final LiveVoicePartyVoiceControlButton$VoiceState Mute;
    public static final LiveVoicePartyVoiceControlButton$VoiceState Ready;

    static {
       LiveVoicePartyVoiceControlButton$VoiceState voiceState = new LiveVoicePartyVoiceControlButton$VoiceState("Mute", 0);
       LiveVoicePartyVoiceControlButton$VoiceState.Mute = voiceState;
       LiveVoicePartyVoiceControlButton$VoiceState voiceState1 = new LiveVoicePartyVoiceControlButton$VoiceState("Ready", 1);
       LiveVoicePartyVoiceControlButton$VoiceState.Ready = voiceState1;
       LiveVoicePartyVoiceControlButton$VoiceState[] voiceStateAr = new LiveVoicePartyVoiceControlButton$VoiceState[]{voiceState,voiceState1};
       LiveVoicePartyVoiceControlButton$VoiceState.$VALUES = voiceStateAr;
    }
    public void LiveVoicePartyVoiceControlButton$VoiceState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveVoicePartyVoiceControlButton$VoiceState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyVoiceControlButton$VoiceState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyVoiceControlButton$VoiceState.class, p0);
    }
    public static LiveVoicePartyVoiceControlButton$VoiceState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyVoiceControlButton$VoiceState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyVoiceControlButton$VoiceState.$VALUES.clone();
    }
}
