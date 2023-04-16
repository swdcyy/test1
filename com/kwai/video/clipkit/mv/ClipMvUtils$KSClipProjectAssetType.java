package com.kwai.video.clipkit.mv.ClipMvUtils$KSClipProjectAssetType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipMvUtils$KSClipProjectAssetType extends Enum	// class@001aa6
{
    public static final ClipMvUtils$KSClipProjectAssetType[] $VALUES;
    public static final ClipMvUtils$KSClipProjectAssetType KSClipProjectAssetTypeAnimatedAe2;
    public static final ClipMvUtils$KSClipProjectAssetType KSClipProjectAssetTypeTrack;
    public static final ClipMvUtils$KSClipProjectAssetType KSClipProjectAssetTypeUnknown;

    static {
       ClipMvUtils$KSClipProjectAssetType kSClipProjec = new ClipMvUtils$KSClipProjectAssetType("KSClipProjectAssetTypeUnknown", 0);
       ClipMvUtils$KSClipProjectAssetType.KSClipProjectAssetTypeUnknown = kSClipProjec;
       ClipMvUtils$KSClipProjectAssetType kSClipProjec1 = new ClipMvUtils$KSClipProjectAssetType("KSClipProjectAssetTypeTrack", 1);
       ClipMvUtils$KSClipProjectAssetType.KSClipProjectAssetTypeTrack = kSClipProjec1;
       ClipMvUtils$KSClipProjectAssetType kSClipProjec2 = new ClipMvUtils$KSClipProjectAssetType("KSClipProjectAssetTypeAnimatedAe2", 2);
       ClipMvUtils$KSClipProjectAssetType.KSClipProjectAssetTypeAnimatedAe2 = kSClipProjec2;
       ClipMvUtils$KSClipProjectAssetType[] kSClipProjec3 = new ClipMvUtils$KSClipProjectAssetType[]{kSClipProjec,kSClipProjec1,kSClipProjec2};
       ClipMvUtils$KSClipProjectAssetType.$VALUES = kSClipProjec3;
    }
    public void ClipMvUtils$KSClipProjectAssetType(String p0,int p1){
       super(p0, p1);
    }
    public static ClipMvUtils$KSClipProjectAssetType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils$KSClipProjectAssetType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipMvUtils$KSClipProjectAssetType.class, p0);
    }
    public static ClipMvUtils$KSClipProjectAssetType[] values(){
       Object obj = PatchProxy.apply(null, null, ClipMvUtils$KSClipProjectAssetType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipMvUtils$KSClipProjectAssetType.$VALUES.clone();
    }
}
