package com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils$KtvAssetIdType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KtvEditUtils$KtvAssetIdType extends Enum	// class@001b64
{
    public static final KtvEditUtils$KtvAssetIdType[] $VALUES;
    public static final KtvEditUtils$KtvAssetIdType KTV_MUSIC_AUDIO_ASSET;
    public static final KtvEditUtils$KtvAssetIdType KTV_RECORD_AUDIO_ASSET;

    static {
       KtvEditUtils$KtvAssetIdType ktvAssetIdTy = new KtvEditUtils$KtvAssetIdType("KTV_RECORD_AUDIO_ASSET", 0);
       KtvEditUtils$KtvAssetIdType.KTV_RECORD_AUDIO_ASSET = ktvAssetIdTy;
       KtvEditUtils$KtvAssetIdType ktvAssetIdTy1 = new KtvEditUtils$KtvAssetIdType("KTV_MUSIC_AUDIO_ASSET", 1);
       KtvEditUtils$KtvAssetIdType.KTV_MUSIC_AUDIO_ASSET = ktvAssetIdTy1;
       KtvEditUtils$KtvAssetIdType[] ktvAssetIdTy2 = new KtvEditUtils$KtvAssetIdType[]{ktvAssetIdTy,ktvAssetIdTy1};
       KtvEditUtils$KtvAssetIdType.$VALUES = ktvAssetIdTy2;
    }
    public void KtvEditUtils$KtvAssetIdType(String p0,int p1){
       super(p0, p1);
    }
    public static KtvEditUtils$KtvAssetIdType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KtvEditUtils$KtvAssetIdType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KtvEditUtils$KtvAssetIdType.class, p0);
    }
    public static KtvEditUtils$KtvAssetIdType[] values(){
       Object obj = PatchProxy.apply(null, null, KtvEditUtils$KtvAssetIdType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KtvEditUtils$KtvAssetIdType.$VALUES.clone();
    }
}
