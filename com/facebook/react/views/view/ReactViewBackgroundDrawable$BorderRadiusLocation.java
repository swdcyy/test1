package com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ReactViewBackgroundDrawable$BorderRadiusLocation extends Enum	// class@001436
{
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation[] $VALUES;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation BOTTOM_END;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation BOTTOM_LEFT;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation BOTTOM_RIGHT;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation BOTTOM_START;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation TOP_END;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation TOP_LEFT;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation TOP_RIGHT;
    public static final ReactViewBackgroundDrawable$BorderRadiusLocation TOP_START;

    static {
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu = new ReactViewBackgroundDrawable$BorderRadiusLocation("TOP_LEFT", 0);
       ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_LEFT = uBorderRadiu;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu1 = new ReactViewBackgroundDrawable$BorderRadiusLocation("TOP_RIGHT", 1);
       ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_RIGHT = uBorderRadiu1;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu2 = new ReactViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_RIGHT", 2);
       ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_RIGHT = uBorderRadiu2;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu3 = new ReactViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_LEFT", 3);
       ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_LEFT = uBorderRadiu3;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu4 = new ReactViewBackgroundDrawable$BorderRadiusLocation("TOP_START", 4);
       ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_START = uBorderRadiu4;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu5 = new ReactViewBackgroundDrawable$BorderRadiusLocation("TOP_END", 5);
       ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_END = uBorderRadiu5;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu6 = new ReactViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_START", 6);
       ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_START = uBorderRadiu6;
       ReactViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu7 = new ReactViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_END", 7);
       ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_END = uBorderRadiu7;
       ReactViewBackgroundDrawable$BorderRadiusLocation[] uBorderRadiu8 = new ReactViewBackgroundDrawable$BorderRadiusLocation[]{uBorderRadiu,uBorderRadiu1,uBorderRadiu2,uBorderRadiu3,uBorderRadiu4,uBorderRadiu5,uBorderRadiu6,uBorderRadiu7};
       ReactViewBackgroundDrawable$BorderRadiusLocation.$VALUES = uBorderRadiu8;
    }
    public void ReactViewBackgroundDrawable$BorderRadiusLocation(String p0,int p1){
       super(p0, p1);
    }
    public static ReactViewBackgroundDrawable$BorderRadiusLocation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactViewBackgroundDrawable$BorderRadiusLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReactViewBackgroundDrawable$BorderRadiusLocation.class, p0);
    }
    public static ReactViewBackgroundDrawable$BorderRadiusLocation[] values(){
       Object obj = PatchProxy.apply(null, null, ReactViewBackgroundDrawable$BorderRadiusLocation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReactViewBackgroundDrawable$BorderRadiusLocation.$VALUES.clone();
    }
}
