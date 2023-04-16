package com.kwai.nearby.model.WidgetState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WidgetState extends Enum	// class@001017
{
    public static final WidgetState[] $VALUES;
    public static final WidgetState ICON;
    public static final WidgetState SUITS;

    static {
       WidgetState widgetState = new WidgetState("ICON", 0);
       WidgetState.ICON = widgetState;
       WidgetState widgetState1 = new WidgetState("SUITS", 1);
       WidgetState.SUITS = widgetState1;
       WidgetState[] widgetStateA = new WidgetState[]{widgetState,widgetState1};
       WidgetState.$VALUES = widgetStateA;
    }
    public void WidgetState(String p0,int p1){
       super(p0, p1);
    }
    public static WidgetState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WidgetState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WidgetState.class, p0);
    }
    public static WidgetState[] values(){
       Object obj = PatchProxy.apply(null, null, WidgetState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WidgetState.$VALUES.clone();
    }
}
