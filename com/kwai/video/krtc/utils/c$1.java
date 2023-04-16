package com.kwai.video.krtc.utils.c$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaInitConfig;

public final class c$1 implements KSFFmpegAARDistribution$SoLoader	// class@0008c0
{

    public void c$1(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$1.class, "1")) {
          return;
       }
       AryaInitConfig.loadLibrary(p0);
       return;
    }
}
