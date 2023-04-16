package com.kuaishou.merchant.dynamicpendant.event.LiveState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveState extends Enum	// class@001697
{
    public static final LiveState[] $VALUES;
    public static final LiveState SHOP_HALF_SCREEN_STATE;
    public static final LiveState YELLOW_CAR_ICON_STATE;

    static {
       LiveState liveState;
       LiveState[] liveStateArr = new LiveState[]{liveState,liveState};
       liveState = new LiveState("YELLOW_CAR_ICON_STATE", 0);
       LiveState.YELLOW_CAR_ICON_STATE = liveState;
       liveState = new LiveState("SHOP_HALF_SCREEN_STATE", 1);
       LiveState.SHOP_HALF_SCREEN_STATE = liveState;
       LiveState.$VALUES = liveStateArr;
    }
    public void LiveState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveState.class, p0);
    }
    public static LiveState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveState.$VALUES.clone();
    }
}
