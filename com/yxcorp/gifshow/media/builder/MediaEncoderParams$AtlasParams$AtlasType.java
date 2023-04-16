package com.yxcorp.gifshow.media.builder.MediaEncoderParams$AtlasParams$AtlasType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MediaEncoderParams$AtlasParams$AtlasType extends Enum	// class@001cf9
{
    public static final MediaEncoderParams$AtlasParams$AtlasType[] $VALUES;
    public static final MediaEncoderParams$AtlasParams$AtlasType HORIZONTAL;
    public static final MediaEncoderParams$AtlasParams$AtlasType VERTICAL;

    static {
       MediaEncoderParams$AtlasParams$AtlasType uAtlasParams = new MediaEncoderParams$AtlasParams$AtlasType("HORIZONTAL", 0);
       MediaEncoderParams$AtlasParams$AtlasType.HORIZONTAL = uAtlasParams;
       MediaEncoderParams$AtlasParams$AtlasType uAtlasParams1 = new MediaEncoderParams$AtlasParams$AtlasType("VERTICAL", 1);
       MediaEncoderParams$AtlasParams$AtlasType.VERTICAL = uAtlasParams1;
       MediaEncoderParams$AtlasParams$AtlasType[] uAtlasParams2 = new MediaEncoderParams$AtlasParams$AtlasType[]{uAtlasParams,uAtlasParams1};
       MediaEncoderParams$AtlasParams$AtlasType.$VALUES = uAtlasParams2;
    }
    public void MediaEncoderParams$AtlasParams$AtlasType(String p0,int p1){
       super(p0, p1);
    }
    public static MediaEncoderParams$AtlasParams$AtlasType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MediaEncoderParams$AtlasParams$AtlasType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MediaEncoderParams$AtlasParams$AtlasType.class, p0);
    }
    public static MediaEncoderParams$AtlasParams$AtlasType[] values(){
       Object obj = PatchProxy.apply(null, null, MediaEncoderParams$AtlasParams$AtlasType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MediaEncoderParams$AtlasParams$AtlasType.$VALUES.clone();
    }
}
