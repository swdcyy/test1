package com.kwai.video.ksheifdec.KSHeifConfig$FFmpegLoader;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import java.lang.Object;
import com.kwai.video.ksheifdec.KSHeifConfig$1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksheifdec.KSHeifConfig;

public class KSHeifConfig$FFmpegLoader implements KSFFmpegAARDistribution$SoLoader	// class@000f9c
{

    public void KSHeifConfig$FFmpegLoader(){
       super();
    }
    public void KSHeifConfig$FFmpegLoader(KSHeifConfig$1 p0){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSHeifConfig$FFmpegLoader.class, "1")) {
          return;
       }
       KSHeifConfig.loadLibrary(p0);
       return;
    }
}
