package com.kwai.video.clipkit.ClipConstant$WatermarkPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipConstant$WatermarkPosition extends Enum	// class@001a01
{
    public static final ClipConstant$WatermarkPosition[] $VALUES;
    public static final ClipConstant$WatermarkPosition CENTER;
    public static final ClipConstant$WatermarkPosition LEFT_BOTTOM;
    public static final ClipConstant$WatermarkPosition LEFT_TOP;
    public static final ClipConstant$WatermarkPosition RIGHT_BOTTOM;
    public static final ClipConstant$WatermarkPosition RIGHT_TOP;

    static {
       ClipConstant$WatermarkPosition watermarkPos = new ClipConstant$WatermarkPosition("LEFT_TOP", 0);
       ClipConstant$WatermarkPosition.LEFT_TOP = watermarkPos;
       ClipConstant$WatermarkPosition watermarkPos1 = new ClipConstant$WatermarkPosition("RIGHT_TOP", 1);
       ClipConstant$WatermarkPosition.RIGHT_TOP = watermarkPos1;
       ClipConstant$WatermarkPosition watermarkPos2 = new ClipConstant$WatermarkPosition("CENTER", 2);
       ClipConstant$WatermarkPosition.CENTER = watermarkPos2;
       ClipConstant$WatermarkPosition watermarkPos3 = new ClipConstant$WatermarkPosition("LEFT_BOTTOM", 3);
       ClipConstant$WatermarkPosition.LEFT_BOTTOM = watermarkPos3;
       ClipConstant$WatermarkPosition watermarkPos4 = new ClipConstant$WatermarkPosition("RIGHT_BOTTOM", 4);
       ClipConstant$WatermarkPosition.RIGHT_BOTTOM = watermarkPos4;
       ClipConstant$WatermarkPosition[] watermarkPos5 = new ClipConstant$WatermarkPosition[]{watermarkPos,watermarkPos1,watermarkPos2,watermarkPos3,watermarkPos4};
       ClipConstant$WatermarkPosition.$VALUES = watermarkPos5;
    }
    public void ClipConstant$WatermarkPosition(String p0,int p1){
       super(p0, p1);
    }
    public static ClipConstant$WatermarkPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipConstant$WatermarkPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipConstant$WatermarkPosition.class, p0);
    }
    public static ClipConstant$WatermarkPosition[] values(){
       Object obj = PatchProxy.apply(null, null, ClipConstant$WatermarkPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipConstant$WatermarkPosition.$VALUES.clone();
    }
}
