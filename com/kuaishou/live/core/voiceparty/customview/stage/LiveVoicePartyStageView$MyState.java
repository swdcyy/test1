package com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView$MyState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveVoicePartyStageView$MyState extends Enum	// class@0014cc
{
    public static final LiveVoicePartyStageView$MyState[] $VALUES;
    public static final LiveVoicePartyStageView$MyState EMPTY;
    public static final LiveVoicePartyStageView$MyState LOADING;
    public static final LiveVoicePartyStageView$MyState PREPARE;
    public static final LiveVoicePartyStageView$MyState PlAY;

    static {
       LiveVoicePartyStageView$MyState myState = new LiveVoicePartyStageView$MyState("EMPTY", 0);
       LiveVoicePartyStageView$MyState.EMPTY = myState;
       LiveVoicePartyStageView$MyState myState1 = new LiveVoicePartyStageView$MyState("PREPARE", 1);
       LiveVoicePartyStageView$MyState.PREPARE = myState1;
       LiveVoicePartyStageView$MyState myState2 = new LiveVoicePartyStageView$MyState("LOADING", 2);
       LiveVoicePartyStageView$MyState.LOADING = myState2;
       LiveVoicePartyStageView$MyState myState3 = new LiveVoicePartyStageView$MyState("PlAY", 3);
       LiveVoicePartyStageView$MyState.PlAY = myState3;
       LiveVoicePartyStageView$MyState[] myStateArray = new LiveVoicePartyStageView$MyState[]{myState,myState1,myState2,myState3};
       LiveVoicePartyStageView$MyState.$VALUES = myStateArray;
    }
    public void LiveVoicePartyStageView$MyState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveVoicePartyStageView$MyState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveVoicePartyStageView$MyState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveVoicePartyStageView$MyState.class, p0);
    }
    public static LiveVoicePartyStageView$MyState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveVoicePartyStageView$MyState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveVoicePartyStageView$MyState.$VALUES.clone();
    }
}
