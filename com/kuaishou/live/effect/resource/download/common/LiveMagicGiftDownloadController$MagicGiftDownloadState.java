package com.kuaishou.live.effect.resource.download.common.LiveMagicGiftDownloadController$MagicGiftDownloadState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMagicGiftDownloadController$MagicGiftDownloadState extends Enum	// class@001b24
{
    public static final LiveMagicGiftDownloadController$MagicGiftDownloadState[] $VALUES;
    public static final LiveMagicGiftDownloadController$MagicGiftDownloadState COMPLETED;
    public static final LiveMagicGiftDownloadController$MagicGiftDownloadState DOWNLOADING;
    public static final LiveMagicGiftDownloadController$MagicGiftDownloadState READY;

    static {
       LiveMagicGiftDownloadController$MagicGiftDownloadState magicGiftDow = new LiveMagicGiftDownloadController$MagicGiftDownloadState("READY", 0);
       LiveMagicGiftDownloadController$MagicGiftDownloadState.READY = magicGiftDow;
       LiveMagicGiftDownloadController$MagicGiftDownloadState magicGiftDow1 = new LiveMagicGiftDownloadController$MagicGiftDownloadState("DOWNLOADING", 1);
       LiveMagicGiftDownloadController$MagicGiftDownloadState.DOWNLOADING = magicGiftDow1;
       LiveMagicGiftDownloadController$MagicGiftDownloadState magicGiftDow2 = new LiveMagicGiftDownloadController$MagicGiftDownloadState("COMPLETED", 2);
       LiveMagicGiftDownloadController$MagicGiftDownloadState.COMPLETED = magicGiftDow2;
       LiveMagicGiftDownloadController$MagicGiftDownloadState[] magicGiftDow3 = new LiveMagicGiftDownloadController$MagicGiftDownloadState[]{magicGiftDow,magicGiftDow1,magicGiftDow2};
       LiveMagicGiftDownloadController$MagicGiftDownloadState.$VALUES = magicGiftDow3;
    }
    public void LiveMagicGiftDownloadController$MagicGiftDownloadState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMagicGiftDownloadController$MagicGiftDownloadState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMagicGiftDownloadController$MagicGiftDownloadState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMagicGiftDownloadController$MagicGiftDownloadState.class, p0);
    }
    public static LiveMagicGiftDownloadController$MagicGiftDownloadState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMagicGiftDownloadController$MagicGiftDownloadState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMagicGiftDownloadController$MagicGiftDownloadState.$VALUES.clone();
    }
}
