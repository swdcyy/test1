package com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.growth.widget.WidgetType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WidgetType extends Enum	// class@0015dd
{
    public final String type;
    public static final WidgetType[] $VALUES;
    public static final WidgetType$a Companion;
    public static final WidgetType RANK_DARK;
    public static final WidgetType RANK_LIGHT;
    public static final WidgetType SCREENS;
    public static final WidgetType SEARCH_DARK;
    public static final WidgetType SEARCH_LIGHT;
    public static final WidgetType TODAY_EAT;
    public static final WidgetType TODAY_EAT_SMALL;

    static {
       WidgetType widgetType;
       WidgetType[] widgetTypeAr = new WidgetType[]{widgetType,widgetType,widgetType,widgetType,widgetType,widgetType,widgetType};
       widgetType = new WidgetType("SEARCH_LIGHT", 0, "search_light");
       WidgetType.SEARCH_LIGHT = widgetType;
       widgetType = new WidgetType("SEARCH_DARK", 1, "search_dark");
       WidgetType.SEARCH_DARK = widgetType;
       widgetType = new WidgetType("RANK_LIGHT", 2, "rank_light");
       WidgetType.RANK_LIGHT = widgetType;
       widgetType = new WidgetType("RANK_DARK", 3, "rank_dark");
       WidgetType.RANK_DARK = widgetType;
       widgetType = new WidgetType("TODAY_EAT", 4, "today_eat");
       WidgetType.TODAY_EAT = widgetType;
       widgetType = new WidgetType("TODAY_EAT_SMALL", 5, "today_eat_small");
       WidgetType.TODAY_EAT_SMALL = widgetType;
       widgetType = new WidgetType("SCREENS", 6, "screens");
       WidgetType.SCREENS = widgetType;
       WidgetType.$VALUES = widgetTypeAr;
       WidgetType.Companion = new WidgetType$a(null);
    }
    public void WidgetType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static WidgetType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WidgetType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WidgetType.class, p0);
    }
    public static WidgetType[] values(){
       Object obj = PatchProxy.apply(null, null, WidgetType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WidgetType.$VALUES.clone();
    }
    public final String getType(){
       return this.type;
    }
}
