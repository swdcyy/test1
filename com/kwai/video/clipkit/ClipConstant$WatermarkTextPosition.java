package com.kwai.video.clipkit.ClipConstant$WatermarkTextPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipConstant$WatermarkTextPosition extends Enum	// class@001a02
{
    public static final ClipConstant$WatermarkTextPosition[] $VALUES;
    public static final ClipConstant$WatermarkTextPosition BOTTOM;
    public static final ClipConstant$WatermarkTextPosition TOP;

    static {
       ClipConstant$WatermarkTextPosition watermarkTex = new ClipConstant$WatermarkTextPosition("TOP", 0);
       ClipConstant$WatermarkTextPosition.TOP = watermarkTex;
       ClipConstant$WatermarkTextPosition watermarkTex1 = new ClipConstant$WatermarkTextPosition("BOTTOM", 1);
       ClipConstant$WatermarkTextPosition.BOTTOM = watermarkTex1;
       ClipConstant$WatermarkTextPosition[] watermarkTex2 = new ClipConstant$WatermarkTextPosition[]{watermarkTex,watermarkTex1};
       ClipConstant$WatermarkTextPosition.$VALUES = watermarkTex2;
    }
    public void ClipConstant$WatermarkTextPosition(String p0,int p1){
       super(p0, p1);
    }
    public static ClipConstant$WatermarkTextPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipConstant$WatermarkTextPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipConstant$WatermarkTextPosition.class, p0);
    }
    public static ClipConstant$WatermarkTextPosition[] values(){
       Object obj = PatchProxy.apply(null, null, ClipConstant$WatermarkTextPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipConstant$WatermarkTextPosition.$VALUES.clone();
    }
}
