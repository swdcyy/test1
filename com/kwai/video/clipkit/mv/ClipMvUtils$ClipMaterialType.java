package com.kwai.video.clipkit.mv.ClipMvUtils$ClipMaterialType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipMvUtils$ClipMaterialType extends Enum	// class@001aa2
{
    public static final ClipMvUtils$ClipMaterialType[] $VALUES;
    public static final ClipMvUtils$ClipMaterialType ClipMaterialTypeDefault;
    public static final ClipMvUtils$ClipMaterialType ClipMaterialTypeNoAssets;
    public static final ClipMvUtils$ClipMaterialType ClipMaterialTypeNoConfig;
    public static final ClipMvUtils$ClipMaterialType ClipMaterialTypeNoSetings;

    static {
       ClipMvUtils$ClipMaterialType uClipMateria = new ClipMvUtils$ClipMaterialType("ClipMaterialTypeDefault", 0);
       ClipMvUtils$ClipMaterialType.ClipMaterialTypeDefault = uClipMateria;
       ClipMvUtils$ClipMaterialType uClipMateria1 = new ClipMvUtils$ClipMaterialType("ClipMaterialTypeNoConfig", 1);
       ClipMvUtils$ClipMaterialType.ClipMaterialTypeNoConfig = uClipMateria1;
       ClipMvUtils$ClipMaterialType uClipMateria2 = new ClipMvUtils$ClipMaterialType("ClipMaterialTypeNoAssets", 2);
       ClipMvUtils$ClipMaterialType.ClipMaterialTypeNoAssets = uClipMateria2;
       ClipMvUtils$ClipMaterialType uClipMateria3 = new ClipMvUtils$ClipMaterialType("ClipMaterialTypeNoSetings", 3);
       ClipMvUtils$ClipMaterialType.ClipMaterialTypeNoSetings = uClipMateria3;
       ClipMvUtils$ClipMaterialType[] uClipMateria4 = new ClipMvUtils$ClipMaterialType[]{uClipMateria,uClipMateria1,uClipMateria2,uClipMateria3};
       ClipMvUtils$ClipMaterialType.$VALUES = uClipMateria4;
    }
    public void ClipMvUtils$ClipMaterialType(String p0,int p1){
       super(p0, p1);
    }
    public static ClipMvUtils$ClipMaterialType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils$ClipMaterialType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipMvUtils$ClipMaterialType.class, p0);
    }
    public static ClipMvUtils$ClipMaterialType[] values(){
       Object obj = PatchProxy.apply(null, null, ClipMvUtils$ClipMaterialType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipMvUtils$ClipMaterialType.$VALUES.clone();
    }
}
