package com.kwai.video.minecraft.model.MinecraftModelDefine$ClipType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MinecraftModelDefine$ClipType extends Enum	// class@000a04
{
    public static final MinecraftModelDefine$ClipType[] $VALUES;
    public static final MinecraftModelDefine$ClipType ClipType_AudioSpectrumClip;
    public static final MinecraftModelDefine$ClipType ClipType_Default;
    public static final MinecraftModelDefine$ClipType ClipType_KSAVClip;
    public static final MinecraftModelDefine$ClipType ClipType_KSCompTextClip;
    public static final MinecraftModelDefine$ClipType ClipType_KSTextClip;
    public static final MinecraftModelDefine$ClipType ClipType_TemplateClip;

    static {
       MinecraftModelDefine$ClipType uClipType = new MinecraftModelDefine$ClipType("ClipType_Default", 0);
       MinecraftModelDefine$ClipType.ClipType_Default = uClipType;
       MinecraftModelDefine$ClipType uClipType1 = new MinecraftModelDefine$ClipType("ClipType_KSTextClip", 1);
       MinecraftModelDefine$ClipType.ClipType_KSTextClip = uClipType1;
       MinecraftModelDefine$ClipType uClipType2 = new MinecraftModelDefine$ClipType("ClipType_KSCompTextClip", 2);
       MinecraftModelDefine$ClipType.ClipType_KSCompTextClip = uClipType2;
       MinecraftModelDefine$ClipType uClipType3 = new MinecraftModelDefine$ClipType("ClipType_AudioSpectrumClip", 3);
       MinecraftModelDefine$ClipType.ClipType_AudioSpectrumClip = uClipType3;
       MinecraftModelDefine$ClipType uClipType4 = new MinecraftModelDefine$ClipType("ClipType_KSAVClip", 4);
       MinecraftModelDefine$ClipType.ClipType_KSAVClip = uClipType4;
       MinecraftModelDefine$ClipType uClipType5 = new MinecraftModelDefine$ClipType("ClipType_TemplateClip", 5);
       MinecraftModelDefine$ClipType.ClipType_TemplateClip = uClipType5;
       MinecraftModelDefine$ClipType[] uClipTypeArr = new MinecraftModelDefine$ClipType[]{uClipType,uClipType1,uClipType2,uClipType3,uClipType4,uClipType5};
       MinecraftModelDefine$ClipType.$VALUES = uClipTypeArr;
    }
    public void MinecraftModelDefine$ClipType(String p0,int p1){
       super(p0, p1);
    }
    public static MinecraftModelDefine$ClipType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftModelDefine$ClipType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MinecraftModelDefine$ClipType.class, p0);
    }
    public static MinecraftModelDefine$ClipType[] values(){
       Object obj = PatchProxy.apply(null, null, MinecraftModelDefine$ClipType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftModelDefine$ClipType.$VALUES.clone();
    }
}
