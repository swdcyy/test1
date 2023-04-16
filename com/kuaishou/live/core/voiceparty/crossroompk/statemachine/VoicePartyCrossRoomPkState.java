package com.kuaishou.live.core.voiceparty.crossroompk.statemachine.VoicePartyCrossRoomPkState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoicePartyCrossRoomPkState extends Enum	// class@00148d
{
    public static final VoicePartyCrossRoomPkState[] $VALUES;
    public static final VoicePartyCrossRoomPkState CONNECT;
    public static final VoicePartyCrossRoomPkState IDLE;
    public static final VoicePartyCrossRoomPkState PLAY;
    public static final VoicePartyCrossRoomPkState POST_PUNISH;
    public static final VoicePartyCrossRoomPkState PUNISH;

    static {
       VoicePartyCrossRoomPkState voicePartyCr1;
       VoicePartyCrossRoomPkState[] voicePartyCr = new VoicePartyCrossRoomPkState[]{voicePartyCr1,voicePartyCr1,voicePartyCr1,voicePartyCr1,voicePartyCr1};
       voicePartyCr1 = new VoicePartyCrossRoomPkState("IDLE", 0);
       VoicePartyCrossRoomPkState.IDLE = voicePartyCr1;
       voicePartyCr1 = new VoicePartyCrossRoomPkState("CONNECT", 1);
       VoicePartyCrossRoomPkState.CONNECT = voicePartyCr1;
       voicePartyCr1 = new VoicePartyCrossRoomPkState("PLAY", 2);
       VoicePartyCrossRoomPkState.PLAY = voicePartyCr1;
       voicePartyCr1 = new VoicePartyCrossRoomPkState("PUNISH", 3);
       VoicePartyCrossRoomPkState.PUNISH = voicePartyCr1;
       voicePartyCr1 = new VoicePartyCrossRoomPkState("POST_PUNISH", 4);
       VoicePartyCrossRoomPkState.POST_PUNISH = voicePartyCr1;
       VoicePartyCrossRoomPkState.$VALUES = voicePartyCr;
    }
    public void VoicePartyCrossRoomPkState(String p0,int p1){
       super(p0, p1);
    }
    public static VoicePartyCrossRoomPkState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartyCrossRoomPkState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartyCrossRoomPkState.class, p0);
    }
    public static VoicePartyCrossRoomPkState[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartyCrossRoomPkState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartyCrossRoomPkState.$VALUES.clone();
    }
}
