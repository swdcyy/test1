package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ToggleState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ToggleState extends Enum	// class@0015c9
{
    public static final ToggleState[] $VALUES;
    public static final ToggleState TOGGLE_STATE_CARD_TO_INFO;
    public static final ToggleState TOGGLE_STATE_INFO_TO_CARD;

    static {
       ToggleState toggleState;
       ToggleState[] toggleStateA = new ToggleState[]{toggleState,toggleState};
       toggleState = new ToggleState("TOGGLE_STATE_CARD_TO_INFO", 0);
       ToggleState.TOGGLE_STATE_CARD_TO_INFO = toggleState;
       toggleState = new ToggleState("TOGGLE_STATE_INFO_TO_CARD", 1);
       ToggleState.TOGGLE_STATE_INFO_TO_CARD = toggleState;
       ToggleState.$VALUES = toggleStateA;
    }
    public void ToggleState(String p0,int p1){
       super(p0, p1);
    }
    public static ToggleState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ToggleState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ToggleState.class, p0);
    }
    public static ToggleState[] values(){
       Object obj = PatchProxy.apply(null, null, ToggleState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ToggleState.$VALUES.clone();
    }
}
