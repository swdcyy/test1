package com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadVersion;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMagicGiftDownloadVersion extends Enum	// class@001b2a
{
    public static final LiveMagicGiftDownloadVersion[] $VALUES;
    public static final LiveMagicGiftDownloadVersion V1;
    public static final LiveMagicGiftDownloadVersion V2;

    static {
       LiveMagicGiftDownloadVersion liveMagicGif = new LiveMagicGiftDownloadVersion("V1", 0);
       LiveMagicGiftDownloadVersion.V1 = liveMagicGif;
       LiveMagicGiftDownloadVersion liveMagicGif1 = new LiveMagicGiftDownloadVersion("V2", 1);
       LiveMagicGiftDownloadVersion.V2 = liveMagicGif1;
       LiveMagicGiftDownloadVersion[] liveMagicGif2 = new LiveMagicGiftDownloadVersion[]{liveMagicGif,liveMagicGif1};
       LiveMagicGiftDownloadVersion.$VALUES = liveMagicGif2;
    }
    public void LiveMagicGiftDownloadVersion(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMagicGiftDownloadVersion valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMagicGiftDownloadVersion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMagicGiftDownloadVersion.class, p0);
    }
    public static LiveMagicGiftDownloadVersion[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMagicGiftDownloadVersion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMagicGiftDownloadVersion.$VALUES.clone();
    }
}
