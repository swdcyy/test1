package com.kuaishou.live.bottombar.component.widget.LiveBottomBarWidgetStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBottomBarWidgetStyle extends Enum	// class@000d42
{
    public static final LiveBottomBarWidgetStyle[] $VALUES;
    public static final LiveBottomBarWidgetStyle Audience;
    public static final LiveBottomBarWidgetStyle Grid;
    public static final LiveBottomBarWidgetStyle Normal;

    static {
       LiveBottomBarWidgetStyle liveBottomBa = new LiveBottomBarWidgetStyle("Normal", 0);
       LiveBottomBarWidgetStyle.Normal = liveBottomBa;
       LiveBottomBarWidgetStyle liveBottomBa1 = new LiveBottomBarWidgetStyle("Grid", 1);
       LiveBottomBarWidgetStyle.Grid = liveBottomBa1;
       LiveBottomBarWidgetStyle liveBottomBa2 = new LiveBottomBarWidgetStyle("Audience", 2);
       LiveBottomBarWidgetStyle.Audience = liveBottomBa2;
       LiveBottomBarWidgetStyle[] liveBottomBa3 = new LiveBottomBarWidgetStyle[]{liveBottomBa,liveBottomBa1,liveBottomBa2};
       LiveBottomBarWidgetStyle.$VALUES = liveBottomBa3;
    }
    public void LiveBottomBarWidgetStyle(String p0,int p1){
       super(p0, p1);
    }
    public static LiveBottomBarWidgetStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBottomBarWidgetStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBottomBarWidgetStyle.class, p0);
    }
    public static LiveBottomBarWidgetStyle[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBottomBarWidgetStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBottomBarWidgetStyle.$VALUES.clone();
    }
}
