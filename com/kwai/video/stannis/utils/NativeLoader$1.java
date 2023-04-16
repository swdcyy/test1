package com.kwai.video.stannis.utils.NativeLoader$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.StannisSoLoader;

public final class NativeLoader$1 implements KSFFmpegAARDistribution$SoLoader	// class@000c7c
{

    public void NativeLoader$1(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NativeLoader$1.class, "1")) {
          return;
       }
       StannisSoLoader.loadSoLibrary(p0);
       return;
    }
}
