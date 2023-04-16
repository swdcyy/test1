package com.yxcorp.gifshow.relation.select.half.HalfPanelState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HalfPanelState extends Enum	// class@001994
{
    public static final HalfPanelState[] $VALUES;
    public static final HalfPanelState NORMAL;
    public static final HalfPanelState STRETCH;

    static {
       HalfPanelState halfPanelSta = new HalfPanelState("NORMAL", 0);
       HalfPanelState.NORMAL = halfPanelSta;
       HalfPanelState halfPanelSta1 = new HalfPanelState("STRETCH", 1);
       HalfPanelState.STRETCH = halfPanelSta1;
       HalfPanelState[] halfPanelSta2 = new HalfPanelState[]{halfPanelSta,halfPanelSta1};
       HalfPanelState.$VALUES = halfPanelSta2;
    }
    public void HalfPanelState(String p0,int p1){
       super(p0, p1);
    }
    public static HalfPanelState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HalfPanelState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HalfPanelState.class, p0);
    }
    public static HalfPanelState[] values(){
       Object obj = PatchProxy.apply(null, null, HalfPanelState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HalfPanelState.$VALUES.clone();
    }
}
