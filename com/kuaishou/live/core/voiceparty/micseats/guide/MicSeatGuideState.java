package com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MicSeatGuideState extends Enum	// class@0015b3
{
    public static final MicSeatGuideState[] $VALUES;
    public static final MicSeatGuideState IDLE;
    public static final MicSeatGuideState READY;
    public static final MicSeatGuideState SHOWN;

    static {
       MicSeatGuideState micSeatGuide1;
       MicSeatGuideState[] micSeatGuide = new MicSeatGuideState[]{micSeatGuide1,micSeatGuide1,micSeatGuide1};
       micSeatGuide1 = new MicSeatGuideState("IDLE", 0);
       MicSeatGuideState.IDLE = micSeatGuide1;
       micSeatGuide1 = new MicSeatGuideState("READY", 1);
       MicSeatGuideState.READY = micSeatGuide1;
       micSeatGuide1 = new MicSeatGuideState("SHOWN", 2);
       MicSeatGuideState.SHOWN = micSeatGuide1;
       MicSeatGuideState.$VALUES = micSeatGuide;
    }
    public void MicSeatGuideState(String p0,int p1){
       super(p0, p1);
    }
    public static MicSeatGuideState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MicSeatGuideState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MicSeatGuideState.class, p0);
    }
    public static MicSeatGuideState[] values(){
       Object obj = PatchProxy.apply(null, null, MicSeatGuideState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MicSeatGuideState.$VALUES.clone();
    }
}
