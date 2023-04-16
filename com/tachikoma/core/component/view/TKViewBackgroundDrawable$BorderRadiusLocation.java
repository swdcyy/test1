package com.tachikoma.core.component.view.TKViewBackgroundDrawable$BorderRadiusLocation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TKViewBackgroundDrawable$BorderRadiusLocation extends Enum	// class@000db2
{
    public static final TKViewBackgroundDrawable$BorderRadiusLocation[] $VALUES;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation BOTTOM_END;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation BOTTOM_LEFT;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation BOTTOM_RIGHT;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation BOTTOM_START;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation TOP_END;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation TOP_LEFT;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation TOP_RIGHT;
    public static final TKViewBackgroundDrawable$BorderRadiusLocation TOP_START;

    static {
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu = new TKViewBackgroundDrawable$BorderRadiusLocation("TOP_LEFT", 0);
       TKViewBackgroundDrawable$BorderRadiusLocation.TOP_LEFT = uBorderRadiu;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu1 = new TKViewBackgroundDrawable$BorderRadiusLocation("TOP_RIGHT", 1);
       TKViewBackgroundDrawable$BorderRadiusLocation.TOP_RIGHT = uBorderRadiu1;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu2 = new TKViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_RIGHT", 2);
       TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_RIGHT = uBorderRadiu2;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu3 = new TKViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_LEFT", 3);
       TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_LEFT = uBorderRadiu3;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu4 = new TKViewBackgroundDrawable$BorderRadiusLocation("TOP_START", 4);
       TKViewBackgroundDrawable$BorderRadiusLocation.TOP_START = uBorderRadiu4;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu5 = new TKViewBackgroundDrawable$BorderRadiusLocation("TOP_END", 5);
       TKViewBackgroundDrawable$BorderRadiusLocation.TOP_END = uBorderRadiu5;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu6 = new TKViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_START", 6);
       TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_START = uBorderRadiu6;
       TKViewBackgroundDrawable$BorderRadiusLocation uBorderRadiu7 = new TKViewBackgroundDrawable$BorderRadiusLocation("BOTTOM_END", 7);
       TKViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_END = uBorderRadiu7;
       TKViewBackgroundDrawable$BorderRadiusLocation[] uBorderRadiu8 = new TKViewBackgroundDrawable$BorderRadiusLocation[]{uBorderRadiu,uBorderRadiu1,uBorderRadiu2,uBorderRadiu3,uBorderRadiu4,uBorderRadiu5,uBorderRadiu6,uBorderRadiu7};
       TKViewBackgroundDrawable$BorderRadiusLocation.$VALUES = uBorderRadiu8;
    }
    public void TKViewBackgroundDrawable$BorderRadiusLocation(String p0,int p1){
       super(p0, p1);
    }
    public static TKViewBackgroundDrawable$BorderRadiusLocation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKViewBackgroundDrawable$BorderRadiusLocation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TKViewBackgroundDrawable$BorderRadiusLocation.class, p0);
    }
    public static TKViewBackgroundDrawable$BorderRadiusLocation[] values(){
       Object obj = PatchProxy.apply(null, null, TKViewBackgroundDrawable$BorderRadiusLocation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKViewBackgroundDrawable$BorderRadiusLocation.$VALUES.clone();
    }
}
