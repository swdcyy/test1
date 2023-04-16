package com.kwai.library.kwaiplayerkit.domain.play.ui.impl.SurfaceTypeReport;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SurfaceTypeReport extends Enum	// class@000864
{
    public static final SurfaceTypeReport[] $VALUES;
    public static final SurfaceTypeReport DEFAULT;
    public static final SurfaceTypeReport SURFACE_VIEW;
    public static final SurfaceTypeReport TEXTURE_VIEW;

    static {
       SurfaceTypeReport surfaceTypeR1;
       SurfaceTypeReport[] surfaceTypeR = new SurfaceTypeReport[]{surfaceTypeR1,surfaceTypeR1,surfaceTypeR1};
       surfaceTypeR1 = new SurfaceTypeReport("DEFAULT", 0);
       SurfaceTypeReport.DEFAULT = surfaceTypeR1;
       surfaceTypeR1 = new SurfaceTypeReport("TEXTURE_VIEW", 1);
       SurfaceTypeReport.TEXTURE_VIEW = surfaceTypeR1;
       surfaceTypeR1 = new SurfaceTypeReport("SURFACE_VIEW", 2);
       SurfaceTypeReport.SURFACE_VIEW = surfaceTypeR1;
       SurfaceTypeReport.$VALUES = surfaceTypeR;
    }
    public void SurfaceTypeReport(String p0,int p1){
       super(p0, p1);
    }
    public static SurfaceTypeReport valueOf(String p0){
       return Enum.valueOf(SurfaceTypeReport.class, p0);
    }
    public static SurfaceTypeReport[] values(){
       return SurfaceTypeReport.$VALUES.clone();
    }
}
