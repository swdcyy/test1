package com.kwai.feature.api.pendant.core.model.FloatWidgetType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FloatWidgetType extends Enum	// class@001034
{
    public final int mValue;
    public static final FloatWidgetType[] $VALUES;
    public static final FloatWidgetType DETAIL;
    public static final FloatWidgetType LIVE;

    static {
       FloatWidgetType uFloatWidget = new FloatWidgetType("DETAIL", 0, 1);
       FloatWidgetType.DETAIL = uFloatWidget;
       FloatWidgetType uFloatWidget1 = new FloatWidgetType("LIVE", 1, 2);
       FloatWidgetType.LIVE = uFloatWidget1;
       FloatWidgetType[] uFloatWidget2 = new FloatWidgetType[]{uFloatWidget,uFloatWidget1};
       FloatWidgetType.$VALUES = uFloatWidget2;
    }
    public void FloatWidgetType(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static FloatWidgetType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FloatWidgetType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FloatWidgetType.class, p0);
    }
    public static FloatWidgetType[] values(){
       Object obj = PatchProxy.apply(null, null, FloatWidgetType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FloatWidgetType.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
