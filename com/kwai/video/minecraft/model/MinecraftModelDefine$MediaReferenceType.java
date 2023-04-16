package com.kwai.video.minecraft.model.MinecraftModelDefine$MediaReferenceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MinecraftModelDefine$MediaReferenceType extends Enum	// class@000a06
{
    public static final MinecraftModelDefine$MediaReferenceType[] $VALUES;
    public static final MinecraftModelDefine$MediaReferenceType MediaReferenceType_AudioVideoReference;
    public static final MinecraftModelDefine$MediaReferenceType MediaReferenceType_Default;
    public static final MinecraftModelDefine$MediaReferenceType MediaReferenceType_StickerReference;
    public static final MinecraftModelDefine$MediaReferenceType MediaReferenceType_TemplateReference;
    public static final MinecraftModelDefine$MediaReferenceType MediaReferenceType_TrailerReference;

    static {
       MinecraftModelDefine$MediaReferenceType mediaReferen = new MinecraftModelDefine$MediaReferenceType("MediaReferenceType_Default", 0);
       MinecraftModelDefine$MediaReferenceType.MediaReferenceType_Default = mediaReferen;
       MinecraftModelDefine$MediaReferenceType mediaReferen1 = new MinecraftModelDefine$MediaReferenceType("MediaReferenceType_AudioVideoReference", 1);
       MinecraftModelDefine$MediaReferenceType.MediaReferenceType_AudioVideoReference = mediaReferen1;
       MinecraftModelDefine$MediaReferenceType mediaReferen2 = new MinecraftModelDefine$MediaReferenceType("MediaReferenceType_TemplateReference", 2);
       MinecraftModelDefine$MediaReferenceType.MediaReferenceType_TemplateReference = mediaReferen2;
       MinecraftModelDefine$MediaReferenceType mediaReferen3 = new MinecraftModelDefine$MediaReferenceType("MediaReferenceType_StickerReference", 3);
       MinecraftModelDefine$MediaReferenceType.MediaReferenceType_StickerReference = mediaReferen3;
       MinecraftModelDefine$MediaReferenceType mediaReferen4 = new MinecraftModelDefine$MediaReferenceType("MediaReferenceType_TrailerReference", 4);
       MinecraftModelDefine$MediaReferenceType.MediaReferenceType_TrailerReference = mediaReferen4;
       MinecraftModelDefine$MediaReferenceType[] mediaReferen5 = new MinecraftModelDefine$MediaReferenceType[]{mediaReferen,mediaReferen1,mediaReferen2,mediaReferen3,mediaReferen4};
       MinecraftModelDefine$MediaReferenceType.$VALUES = mediaReferen5;
    }
    public void MinecraftModelDefine$MediaReferenceType(String p0,int p1){
       super(p0, p1);
    }
    public static MinecraftModelDefine$MediaReferenceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MinecraftModelDefine$MediaReferenceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MinecraftModelDefine$MediaReferenceType.class, p0);
    }
    public static MinecraftModelDefine$MediaReferenceType[] values(){
       Object obj = PatchProxy.apply(null, null, MinecraftModelDefine$MediaReferenceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MinecraftModelDefine$MediaReferenceType.$VALUES.clone();
    }
}
