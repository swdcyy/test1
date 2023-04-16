package com.yxcorp.gifshow.album.model.KSMemoryClipType;
import java.lang.Enum;
import java.lang.String;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaiShanAssetTag;
import com.yxcorp.gifshow.album.model.KSMemoryClipType$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSMemoryClipType extends Enum	// class@001a25
{
    public final String assetTag;
    public static final KSMemoryClipType[] $VALUES;
    public static final KSMemoryClipType COMMON;
    public static final KSMemoryClipType$a Companion;
    public static final KSMemoryClipType ENDING;
    public static final KSMemoryClipType OPENING;

    static {
       KSMemoryClipType kSMemoryClip1;
       KSMemoryClipType[] kSMemoryClip = new KSMemoryClipType[]{kSMemoryClip1,kSMemoryClip1,kSMemoryClip1};
       kSMemoryClip1 = new KSMemoryClipType("COMMON", 0, "");
       KSMemoryClipType.COMMON = kSMemoryClip1;
       kSMemoryClip1 = new KSMemoryClipType("OPENING", 1, KuaiShanAssetTag.OPENING.getAssetTag());
       KSMemoryClipType.OPENING = kSMemoryClip1;
       kSMemoryClip1 = new KSMemoryClipType("ENDING", 2, KuaiShanAssetTag.ENDING.getAssetTag());
       KSMemoryClipType.ENDING = kSMemoryClip1;
       KSMemoryClipType.$VALUES = kSMemoryClip;
       KSMemoryClipType.Companion = new KSMemoryClipType$a(null);
    }
    public void KSMemoryClipType(String p0,int p1,String p2){
       super(p0, p1);
       this.assetTag = p2;
    }
    public static KSMemoryClipType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSMemoryClipType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSMemoryClipType.class, p0);
    }
    public static KSMemoryClipType[] values(){
       Object obj = PatchProxy.apply(null, null, KSMemoryClipType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSMemoryClipType.$VALUES.clone();
    }
    public final String getAssetTag(){
       return this.assetTag;
    }
}
