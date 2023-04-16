package com.kwai.video.krtc.GL.TextureBuffer$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextureBuffer$Type extends Enum	// class@000756
{
    public final int glTarget;
    public static final TextureBuffer$Type[] $VALUES;
    public static final TextureBuffer$Type INVALID;
    public static final TextureBuffer$Type OES;
    public static final TextureBuffer$Type RGB;

    static {
       TextureBuffer$Type type = new TextureBuffer$Type("OES", 0, 0x8d65);
       TextureBuffer$Type.OES = type;
       TextureBuffer$Type type1 = new TextureBuffer$Type("RGB", 1, 3553);
       TextureBuffer$Type.RGB = type1;
       TextureBuffer$Type type2 = new TextureBuffer$Type("INVALID", 2, -1);
       TextureBuffer$Type.INVALID = type2;
       TextureBuffer$Type[] typeArray = new TextureBuffer$Type[]{type,type1,type2};
       TextureBuffer$Type.$VALUES = typeArray;
    }
    public void TextureBuffer$Type(String p0,int p1,int p2){
       super(p0, p1);
       this.glTarget = p2;
    }
    public static TextureBuffer$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextureBuffer$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TextureBuffer$Type.class, p0);
    }
    public static TextureBuffer$Type[] values(){
       Object obj = PatchProxy.apply(null, null, TextureBuffer$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextureBuffer$Type.$VALUES.clone();
    }
    public int getGlTarget(){
       return this.glTarget;
    }
}
