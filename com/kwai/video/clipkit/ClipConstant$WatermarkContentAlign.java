package com.kwai.video.clipkit.ClipConstant$WatermarkContentAlign;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipConstant$WatermarkContentAlign extends Enum	// class@001a00
{
    public static final ClipConstant$WatermarkContentAlign[] $VALUES;
    public static final ClipConstant$WatermarkContentAlign CENTER;
    public static final ClipConstant$WatermarkContentAlign LEFT;
    public static final ClipConstant$WatermarkContentAlign RIGHT;

    static {
       ClipConstant$WatermarkContentAlign watermarkCon = new ClipConstant$WatermarkContentAlign("CENTER", 0);
       ClipConstant$WatermarkContentAlign.CENTER = watermarkCon;
       ClipConstant$WatermarkContentAlign watermarkCon1 = new ClipConstant$WatermarkContentAlign("RIGHT", 1);
       ClipConstant$WatermarkContentAlign.RIGHT = watermarkCon1;
       ClipConstant$WatermarkContentAlign watermarkCon2 = new ClipConstant$WatermarkContentAlign("LEFT", 2);
       ClipConstant$WatermarkContentAlign.LEFT = watermarkCon2;
       ClipConstant$WatermarkContentAlign[] watermarkCon3 = new ClipConstant$WatermarkContentAlign[]{watermarkCon,watermarkCon1,watermarkCon2};
       ClipConstant$WatermarkContentAlign.$VALUES = watermarkCon3;
    }
    public void ClipConstant$WatermarkContentAlign(String p0,int p1){
       super(p0, p1);
    }
    public static ClipConstant$WatermarkContentAlign valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipConstant$WatermarkContentAlign.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipConstant$WatermarkContentAlign.class, p0);
    }
    public static ClipConstant$WatermarkContentAlign[] values(){
       Object obj = PatchProxy.apply(null, null, ClipConstant$WatermarkContentAlign.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipConstant$WatermarkContentAlign.$VALUES.clone();
    }
}
