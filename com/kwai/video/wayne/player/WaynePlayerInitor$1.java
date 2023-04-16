package com.kwai.video.wayne.player.WaynePlayerInitor$1;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.PlayerLibraryLoader;
import com.kwai.video.wayne.player.WaynePlayerInitor$VodSoLoader;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.System;

public class WaynePlayerInitor$1 implements AwesomeCacheSoLoader	// class@000cb3
{
    public final WaynePlayerInitor this$0;

    public void WaynePlayerInitor$1(WaynePlayerInitor p0){
       this.this$0 = p0;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayerInitor$1.class, "1")) {
          return;
       }
       String str = "ffmpeg";
       if (PlayerLibraryLoader.getInstance().isLoaded(str) && p0.equals(str)) {
          return;
       }
       if (this.this$0.sInjectedSoLoader != null) {
          this.this$0.sInjectedSoLoader.loadLibrary(p0);
       }else {
          DebugLog.w("WaynePlayerIniter", "WARNING! AwesomeCacheSoLoader is using System.loadLibrary");
          System.loadLibrary(p0);
       }
       return;
    }
}
