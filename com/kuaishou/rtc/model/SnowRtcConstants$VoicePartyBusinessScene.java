package com.kuaishou.rtc.model.SnowRtcConstants$VoicePartyBusinessScene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SnowRtcConstants$VoicePartyBusinessScene extends Enum	// class@000efd
{
    public final int mArya5Value;
    public static final SnowRtcConstants$VoicePartyBusinessScene[] $VALUES;
    public static final SnowRtcConstants$VoicePartyBusinessScene KTV;
    public static final SnowRtcConstants$VoicePartyBusinessScene VIDEO_CHAT;

    static {
       SnowRtcConstants$VoicePartyBusinessScene voicePartyBu = new SnowRtcConstants$VoicePartyBusinessScene("VIDEO_CHAT", 0, 0);
       SnowRtcConstants$VoicePartyBusinessScene.VIDEO_CHAT = voicePartyBu;
       SnowRtcConstants$VoicePartyBusinessScene voicePartyBu1 = new SnowRtcConstants$VoicePartyBusinessScene("KTV", 1, 1);
       SnowRtcConstants$VoicePartyBusinessScene.KTV = voicePartyBu1;
       SnowRtcConstants$VoicePartyBusinessScene[] voicePartyBu2 = new SnowRtcConstants$VoicePartyBusinessScene[]{voicePartyBu,voicePartyBu1};
       SnowRtcConstants$VoicePartyBusinessScene.$VALUES = voicePartyBu2;
    }
    public void SnowRtcConstants$VoicePartyBusinessScene(String p0,int p1,int p2){
       super(p0, p1);
       this.mArya5Value = p2;
    }
    public static SnowRtcConstants$VoicePartyBusinessScene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SnowRtcConstants$VoicePartyBusinessScene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SnowRtcConstants$VoicePartyBusinessScene.class, p0);
    }
    public static SnowRtcConstants$VoicePartyBusinessScene[] values(){
       Object obj = PatchProxy.apply(null, null, SnowRtcConstants$VoicePartyBusinessScene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SnowRtcConstants$VoicePartyBusinessScene.$VALUES.clone();
    }
}
