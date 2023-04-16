package com.kuaishou.android.live.model.LiveAdaptiveManifest$ManifestType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAdaptiveManifest$ManifestType extends Enum	// class@0007e1
{
    public static final LiveAdaptiveManifest$ManifestType[] $VALUES;
    public static final LiveAdaptiveManifest$ManifestType FLV;
    public static final LiveAdaptiveManifest$ManifestType HLS;
    public static final LiveAdaptiveManifest$ManifestType OTHER;
    public static final LiveAdaptiveManifest$ManifestType WebRTC;

    static {
       LiveAdaptiveManifest$ManifestType manifestType = new LiveAdaptiveManifest$ManifestType("FLV", 0);
       LiveAdaptiveManifest$ManifestType.FLV = manifestType;
       LiveAdaptiveManifest$ManifestType manifestType1 = new LiveAdaptiveManifest$ManifestType("WebRTC", 1);
       LiveAdaptiveManifest$ManifestType.WebRTC = manifestType1;
       LiveAdaptiveManifest$ManifestType manifestType2 = new LiveAdaptiveManifest$ManifestType("HLS", 2);
       LiveAdaptiveManifest$ManifestType.HLS = manifestType2;
       LiveAdaptiveManifest$ManifestType manifestType3 = new LiveAdaptiveManifest$ManifestType("OTHER", 3);
       LiveAdaptiveManifest$ManifestType.OTHER = manifestType3;
       LiveAdaptiveManifest$ManifestType[] manifestType4 = new LiveAdaptiveManifest$ManifestType[]{manifestType,manifestType1,manifestType2,manifestType3};
       LiveAdaptiveManifest$ManifestType.$VALUES = manifestType4;
    }
    public void LiveAdaptiveManifest$ManifestType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAdaptiveManifest$ManifestType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAdaptiveManifest$ManifestType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAdaptiveManifest$ManifestType.class, p0);
    }
    public static LiveAdaptiveManifest$ManifestType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAdaptiveManifest$ManifestType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAdaptiveManifest$ManifestType.$VALUES.clone();
    }
}
