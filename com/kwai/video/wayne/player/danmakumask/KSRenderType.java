package com.kwai.video.wayne.player.danmakumask.KSRenderType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSRenderType extends Enum	// class@000d17
{
    public static final KSRenderType[] $VALUES;
    public static final KSRenderType TYPE_NORMAL;
    public static final KSRenderType TYPE_OTHER;
    public static final KSRenderType TYPE_SURFACE;
    public static final KSRenderType TYPE_TEXTURE;

    static {
       KSRenderType kSRenderType = new KSRenderType("TYPE_NORMAL", 0);
       KSRenderType.TYPE_NORMAL = kSRenderType;
       KSRenderType kSRenderType1 = new KSRenderType("TYPE_TEXTURE", 1);
       KSRenderType.TYPE_TEXTURE = kSRenderType1;
       KSRenderType kSRenderType2 = new KSRenderType("TYPE_SURFACE", 2);
       KSRenderType.TYPE_SURFACE = kSRenderType2;
       KSRenderType kSRenderType3 = new KSRenderType("TYPE_OTHER", 3);
       KSRenderType.TYPE_OTHER = kSRenderType3;
       KSRenderType[] kSRenderType4 = new KSRenderType[]{kSRenderType,kSRenderType1,kSRenderType2,kSRenderType3};
       KSRenderType.$VALUES = kSRenderType4;
    }
    public void KSRenderType(String p0,int p1){
       super(p0, p1);
    }
    public static KSRenderType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSRenderType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSRenderType.class, p0);
    }
    public static KSRenderType[] values(){
       Object obj = PatchProxy.apply(null, null, KSRenderType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSRenderType.$VALUES.clone();
    }
}
