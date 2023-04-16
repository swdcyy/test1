package com.kuaishou.live.common.core.component.multipk.core.statemachine.MultiPkState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MultiPkState extends Enum	// class@0015d1
{
    public static final MultiPkState[] $VALUES;
    public static final MultiPkState GAMING;
    public static final MultiPkState IDLE;
    public static final MultiPkState MATCHING;
    public static final MultiPkState READY;

    static {
       MultiPkState multiPkState1;
       MultiPkState[] multiPkState = new MultiPkState[]{multiPkState1,multiPkState1,multiPkState1,multiPkState1};
       multiPkState1 = new MultiPkState("IDLE", 0);
       MultiPkState.IDLE = multiPkState1;
       multiPkState1 = new MultiPkState("MATCHING", 1);
       MultiPkState.MATCHING = multiPkState1;
       multiPkState1 = new MultiPkState("READY", 2);
       MultiPkState.READY = multiPkState1;
       multiPkState1 = new MultiPkState("GAMING", 3);
       MultiPkState.GAMING = multiPkState1;
       MultiPkState.$VALUES = multiPkState;
    }
    public void MultiPkState(String p0,int p1){
       super(p0, p1);
    }
    public static MultiPkState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MultiPkState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MultiPkState.class, p0);
    }
    public static MultiPkState[] values(){
       Object obj = PatchProxy.apply(null, null, MultiPkState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MultiPkState.$VALUES.clone();
    }
}
