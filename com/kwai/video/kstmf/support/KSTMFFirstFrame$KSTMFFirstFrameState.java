package com.kwai.video.kstmf.support.KSTMFFirstFrame$KSTMFFirstFrameState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSTMFFirstFrame$KSTMFFirstFrameState extends Enum	// class@000949
{
    public static final KSTMFFirstFrame$KSTMFFirstFrameState[] $VALUES;
    public static final KSTMFFirstFrame$KSTMFFirstFrameState KSTMFFirstFrameState_Cancel;
    public static final KSTMFFirstFrame$KSTMFFirstFrameState KSTMFFirstFrameState_Complete;
    public static final KSTMFFirstFrame$KSTMFFirstFrameState KSTMFFirstFrameState_Idle;
    public static final KSTMFFirstFrame$KSTMFFirstFrameState KSTMFFirstFrameState_Running;

    static {
       KSTMFFirstFrame$KSTMFFirstFrameState kSTMFFirstFr = new KSTMFFirstFrame$KSTMFFirstFrameState("KSTMFFirstFrameState_Idle", 0);
       KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Idle = kSTMFFirstFr;
       KSTMFFirstFrame$KSTMFFirstFrameState kSTMFFirstFr1 = new KSTMFFirstFrame$KSTMFFirstFrameState("KSTMFFirstFrameState_Running", 1);
       KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Running = kSTMFFirstFr1;
       KSTMFFirstFrame$KSTMFFirstFrameState kSTMFFirstFr2 = new KSTMFFirstFrame$KSTMFFirstFrameState("KSTMFFirstFrameState_Cancel", 2);
       KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Cancel = kSTMFFirstFr2;
       KSTMFFirstFrame$KSTMFFirstFrameState kSTMFFirstFr3 = new KSTMFFirstFrame$KSTMFFirstFrameState("KSTMFFirstFrameState_Complete", 3);
       KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Complete = kSTMFFirstFr3;
       KSTMFFirstFrame$KSTMFFirstFrameState[] kSTMFFirstFr4 = new KSTMFFirstFrame$KSTMFFirstFrameState[]{kSTMFFirstFr,kSTMFFirstFr1,kSTMFFirstFr2,kSTMFFirstFr3};
       KSTMFFirstFrame$KSTMFFirstFrameState.$VALUES = kSTMFFirstFr4;
    }
    public void KSTMFFirstFrame$KSTMFFirstFrameState(String p0,int p1){
       super(p0, p1);
    }
    public static KSTMFFirstFrame$KSTMFFirstFrameState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFFirstFrame$KSTMFFirstFrameState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSTMFFirstFrame$KSTMFFirstFrameState.class, p0);
    }
    public static KSTMFFirstFrame$KSTMFFirstFrameState[] values(){
       Object obj = PatchProxy.apply(null, null, KSTMFFirstFrame$KSTMFFirstFrameState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSTMFFirstFrame$KSTMFFirstFrameState.$VALUES.clone();
    }
}
