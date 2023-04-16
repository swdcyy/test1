package com.kuaishou.live.common.core.component.pk.audience.LiveAudiencePKState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAudiencePKState extends Enum	// class@001732
{
    public static final LiveAudiencePKState[] $VALUES;
    public static final LiveAudiencePKState ESTABLISHED;
    public static final LiveAudiencePKState IDLE;
    public static final LiveAudiencePKState PLAYING;
    public static final LiveAudiencePKState PRE_PUNISH;
    public static final LiveAudiencePKState PUNISH;

    static {
       LiveAudiencePKState liveAudience = new LiveAudiencePKState("IDLE", 0);
       LiveAudiencePKState.IDLE = liveAudience;
       LiveAudiencePKState liveAudience1 = new LiveAudiencePKState("ESTABLISHED", 1);
       LiveAudiencePKState.ESTABLISHED = liveAudience1;
       LiveAudiencePKState liveAudience2 = new LiveAudiencePKState("PLAYING", 2);
       LiveAudiencePKState.PLAYING = liveAudience2;
       LiveAudiencePKState liveAudience3 = new LiveAudiencePKState("PRE_PUNISH", 3);
       LiveAudiencePKState.PRE_PUNISH = liveAudience3;
       LiveAudiencePKState liveAudience4 = new LiveAudiencePKState("PUNISH", 4);
       LiveAudiencePKState.PUNISH = liveAudience4;
       LiveAudiencePKState[] liveAudience5 = new LiveAudiencePKState[]{liveAudience,liveAudience1,liveAudience2,liveAudience3,liveAudience4};
       LiveAudiencePKState.$VALUES = liveAudience5;
    }
    public void LiveAudiencePKState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAudiencePKState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAudiencePKState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAudiencePKState.class, p0);
    }
    public static LiveAudiencePKState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAudiencePKState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAudiencePKState.$VALUES.clone();
    }
}
