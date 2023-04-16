package com.kwai.framework.krn.bridges.kid.WidgetTokenTypeEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WidgetTokenTypeEnum extends Enum	// class@0015b5
{
    public final String value;
    public static final WidgetTokenTypeEnum[] $VALUES;
    public static final WidgetTokenTypeEnum Type_color;
    public static final WidgetTokenTypeEnum Type_font;
    public static final WidgetTokenTypeEnum Type_widget;

    static {
       WidgetTokenTypeEnum widgetTokenT = new WidgetTokenTypeEnum("Type_widget", 0, "widget");
       WidgetTokenTypeEnum.Type_widget = widgetTokenT;
       WidgetTokenTypeEnum widgetTokenT1 = new WidgetTokenTypeEnum("Type_font", 1, "font");
       WidgetTokenTypeEnum.Type_font = widgetTokenT1;
       WidgetTokenTypeEnum widgetTokenT2 = new WidgetTokenTypeEnum("Type_color", 2, "color");
       WidgetTokenTypeEnum.Type_color = widgetTokenT2;
       WidgetTokenTypeEnum[] widgetTokenT3 = new WidgetTokenTypeEnum[]{widgetTokenT,widgetTokenT1,widgetTokenT2};
       WidgetTokenTypeEnum.$VALUES = widgetTokenT3;
    }
    public void WidgetTokenTypeEnum(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static WidgetTokenTypeEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WidgetTokenTypeEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WidgetTokenTypeEnum.class, p0);
    }
    public static WidgetTokenTypeEnum[] values(){
       Object obj = PatchProxy.apply(null, null, WidgetTokenTypeEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WidgetTokenTypeEnum.$VALUES.clone();
    }
    public String getValue(){
       return this.value;
    }
}
