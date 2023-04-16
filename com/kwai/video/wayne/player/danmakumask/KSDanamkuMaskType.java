package com.kwai.video.wayne.player.danmakumask.KSDanamkuMaskType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSDanamkuMaskType extends Enum	// class@000d14
{
    public static final KSDanamkuMaskType[] $VALUES;
    public static final KSDanamkuMaskType TYPE_LAYOUT;
    public static final KSDanamkuMaskType TYPE_PATH_DATA;
    public static final KSDanamkuMaskType TYPE_SVG_DATA;
    public static final KSDanamkuMaskType TYPE_TRANSFORM_PATH_DATA;
    public static final KSDanamkuMaskType TYPE_UNKNOWN;

    static {
       KSDanamkuMaskType kSDanamkuMas = new KSDanamkuMaskType("TYPE_UNKNOWN", 0);
       KSDanamkuMaskType.TYPE_UNKNOWN = kSDanamkuMas;
       KSDanamkuMaskType kSDanamkuMas1 = new KSDanamkuMaskType("TYPE_SVG_DATA", 1);
       KSDanamkuMaskType.TYPE_SVG_DATA = kSDanamkuMas1;
       KSDanamkuMaskType kSDanamkuMas2 = new KSDanamkuMaskType("TYPE_LAYOUT", 2);
       KSDanamkuMaskType.TYPE_LAYOUT = kSDanamkuMas2;
       KSDanamkuMaskType kSDanamkuMas3 = new KSDanamkuMaskType("TYPE_PATH_DATA", 3);
       KSDanamkuMaskType.TYPE_PATH_DATA = kSDanamkuMas3;
       KSDanamkuMaskType kSDanamkuMas4 = new KSDanamkuMaskType("TYPE_TRANSFORM_PATH_DATA", 4);
       KSDanamkuMaskType.TYPE_TRANSFORM_PATH_DATA = kSDanamkuMas4;
       KSDanamkuMaskType[] kSDanamkuMas5 = new KSDanamkuMaskType[]{kSDanamkuMas,kSDanamkuMas1,kSDanamkuMas2,kSDanamkuMas3,kSDanamkuMas4};
       KSDanamkuMaskType.$VALUES = kSDanamkuMas5;
    }
    public void KSDanamkuMaskType(String p0,int p1){
       super(p0, p1);
    }
    public static KSDanamkuMaskType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSDanamkuMaskType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSDanamkuMaskType.class, p0);
    }
    public static KSDanamkuMaskType[] values(){
       Object obj = PatchProxy.apply(null, null, KSDanamkuMaskType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSDanamkuMaskType.$VALUES.clone();
    }
}
