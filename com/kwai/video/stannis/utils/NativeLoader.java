package com.kwai.video.stannis.utils.NativeLoader;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.NativeLoader$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution;
import com.kwai.video.stannis.utils.NativeLoader$2;
import wt6.b$b;
import wt6.b;
import com.kwai.video.stannis.StannisSoLoader;

public class NativeLoader	// class@000c7e
{

    public void NativeLoader(){
       super();
    }
    public static void loadNative(){
       if (PatchProxy.applyVoid(null, null, NativeLoader.class, "1")) {
          return;
       }
       KSFFmpegAARDistribution.checkAbiAndLoadFFmpeg("30d6bc259d76805709c1e4f0dc1c8f3955a7729a", new NativeLoader$1());
       b.b("v5.15.0.10", false, new NativeLoader$2());
       StannisSoLoader.loadSoLibrary("kwaiaudio");
       return;
    }
}
