package com.kwai.video.wayne.player.WaynePlayerInitor$2;
import com.kwai.video.player.KsSoLoader;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.WaynePlayerInitor$VodSoLoader;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.System;

public class WaynePlayerInitor$2 implements KsSoLoader	// class@000cb4
{
    public final WaynePlayerInitor this$0;

    public void WaynePlayerInitor$2(WaynePlayerInitor p0){
       this.this$0 = p0;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WaynePlayerInitor$2.class, "1")) {
          return;
       }
       if (this.this$0.sInjectedSoLoader != null) {
          this.this$0.sInjectedSoLoader.loadLibrary(p0);
       }else {
          DebugLog.w("WaynePlayerIniter", "WARNING! KsMediaPlayerInitConfig is using System.loadLibrary");
          System.loadLibrary(p0);
       }
       return;
    }
}
