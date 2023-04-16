package com.kwai.video.clipkit.ClipKitUtils$2;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.devicepersonabenchmark.DPBenchmarkConfigManager;

public final class ClipKitUtils$2 implements Runnable	// class@001a2f
{

    public void ClipKitUtils$2(){
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ClipKitUtils$2.class, "1")) {
          return;
       }
       DPBenchmarkConfigManager.getInstance().startEncodeAsync();
       return;
    }
}
