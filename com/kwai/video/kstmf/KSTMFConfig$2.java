package com.kwai.video.kstmf.KSTMFConfig$2;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.kstmf.KSTMFConfig;

public final class KSTMFConfig$2 implements KSFFmpegAARDistribution$SoLoader	// class@000938
{

    public void KSTMFConfig$2(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTMFConfig$2.class, "1")) {
          return;
       }
       KSTMFConfig.loadLibrary("ffmpeg");
       return;
    }
}
