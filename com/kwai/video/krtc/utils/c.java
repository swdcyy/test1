package com.kwai.video.krtc.utils.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.utils.c$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution;
import com.kwai.video.krtc.AryaInitConfig;

public class c	// class@0008c1
{

    public static void a(){
       if (PatchProxy.applyVoid(null, null, c.class, "1")) {
          return;
       }
       KSFFmpegAARDistribution.checkAbiAndLoadFFmpeg("30d6bc259d76805709c1e4f0dc1c8f3955a7729a", new c$1());
       AryaInitConfig.loadLibrary("KSTMF");
       AryaInitConfig.loadLibrary("krtcengine");
       return;
    }
}
