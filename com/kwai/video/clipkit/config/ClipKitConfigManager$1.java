package com.kwai.video.clipkit.config.ClipKitConfigManager$1;
import h97.j;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;

public class ClipKitConfigManager$1 implements j	// class@001a5e
{
    public final ClipKitConfigManager this$0;

    public void ClipKitConfigManager$1(ClipKitConfigManager p0){
       this.this$0 = p0;
       super();
    }
    public void onConfigChanged(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipKitConfigManager$1.class, "1")) {
          return;
       }
       this.this$0.updateConfig();
       KSClipLog.d("ClipKitConfig", "onConfigChanged:"+p0);
       return;
    }
}
