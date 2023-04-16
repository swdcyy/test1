package com.tachikoma.component.container.round.RoundTKYogaLayout$RadiusMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RoundTKYogaLayout$RadiusMode extends Enum	// class@000ceb
{
    public static final RoundTKYogaLayout$RadiusMode[] $VALUES;
    public static final RoundTKYogaLayout$RadiusMode ALL;
    public static final RoundTKYogaLayout$RadiusMode BOTTOM_LEFT;
    public static final RoundTKYogaLayout$RadiusMode BOTTOM_RIGHT;
    public static final RoundTKYogaLayout$RadiusMode NONE;
    public static final RoundTKYogaLayout$RadiusMode TOP_LEFT;
    public static final RoundTKYogaLayout$RadiusMode TOP_RIGHT;

    static {
       RoundTKYogaLayout$RadiusMode radiusMode = new RoundTKYogaLayout$RadiusMode("NONE", 0);
       RoundTKYogaLayout$RadiusMode.NONE = radiusMode;
       RoundTKYogaLayout$RadiusMode radiusMode1 = new RoundTKYogaLayout$RadiusMode("ALL", 1);
       RoundTKYogaLayout$RadiusMode.ALL = radiusMode1;
       RoundTKYogaLayout$RadiusMode radiusMode2 = new RoundTKYogaLayout$RadiusMode("TOP_LEFT", 2);
       RoundTKYogaLayout$RadiusMode.TOP_LEFT = radiusMode2;
       RoundTKYogaLayout$RadiusMode radiusMode3 = new RoundTKYogaLayout$RadiusMode("TOP_RIGHT", 3);
       RoundTKYogaLayout$RadiusMode.TOP_RIGHT = radiusMode3;
       RoundTKYogaLayout$RadiusMode radiusMode4 = new RoundTKYogaLayout$RadiusMode("BOTTOM_RIGHT", 4);
       RoundTKYogaLayout$RadiusMode.BOTTOM_RIGHT = radiusMode4;
       RoundTKYogaLayout$RadiusMode radiusMode5 = new RoundTKYogaLayout$RadiusMode("BOTTOM_LEFT", 5);
       RoundTKYogaLayout$RadiusMode.BOTTOM_LEFT = radiusMode5;
       RoundTKYogaLayout$RadiusMode[] radiusModeAr = new RoundTKYogaLayout$RadiusMode[]{radiusMode,radiusMode1,radiusMode2,radiusMode3,radiusMode4,radiusMode5};
       RoundTKYogaLayout$RadiusMode.$VALUES = radiusModeAr;
    }
    public void RoundTKYogaLayout$RadiusMode(String p0,int p1){
       super(p0, p1);
    }
    public static RoundTKYogaLayout$RadiusMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RoundTKYogaLayout$RadiusMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RoundTKYogaLayout$RadiusMode.class, p0);
    }
    public static RoundTKYogaLayout$RadiusMode[] values(){
       Object obj = PatchProxy.apply(null, null, RoundTKYogaLayout$RadiusMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RoundTKYogaLayout$RadiusMode.$VALUES.clone();
    }
}
