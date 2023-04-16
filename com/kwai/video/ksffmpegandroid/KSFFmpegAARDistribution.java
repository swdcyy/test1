package com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$1;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public class KSFFmpegAARDistribution	// class@000f92
{
    public static KSFFmpegAARDistribution$SoLoader defaultLoader;
    public static boolean sDisabled;

    static {
       KSFFmpegAARDistribution.defaultLoader = new KSFFmpegAARDistribution$1();
    }
    public void KSFFmpegAARDistribution(){
       super();
    }
    public static void checkAbiAndLoadFFmpeg(String p0,KSFFmpegAARDistribution$SoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSFFmpegAARDistribution.class, "3")) {
          return;
       }
       if (!KSFFmpegAARDistribution.sDisabled && !("30d6bc259d76805709c1e4f0dc1c8f3955a7729a").equals(p0)) {
          throw new RuntimeException("Wrong FFmpeg ABI version. Contact library\'s owner. Check if KSFFmpeg_Android\'s commit matches ffmpeg-aar-distribution\'s. distributed ABI version: 30d6bc259d76805709c1e4f0dc1c8f3955a7729a requested version: "+p0);
       }
       p1.loadLibrary("ffmpeg");
       return;
    }
    public static void checkVersionAndLoadFFmpeg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSFFmpegAARDistribution.class, "1")) {
          return;
       }
       KSFFmpegAARDistribution.checkVersionAndLoadFFmpeg(p0, KSFFmpegAARDistribution.defaultLoader);
       return;
    }
    public static void checkVersionAndLoadFFmpeg(String p0,KSFFmpegAARDistribution$SoLoader p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSFFmpegAARDistribution.class, "2")) {
          return;
       }
       if (!KSFFmpegAARDistribution.sDisabled && !("a29c2987af047059cc510ed662ba71857efd3bd6").equals(p0)) {
          throw new RuntimeException("Wrong FFmpeg version. Contact library\'s owner. Check if KSFFmpeg_Android\'s commit matches ffmpeg-aar-distribution\'s. distributed version: a29c2987af047059cc510ed662ba71857efd3bd6 requested version: "+p0);
       }
       p1.loadLibrary("ffmpeg");
       return;
    }
    public static void disableCheck(){
       KSFFmpegAARDistribution.sDisabled = true;
    }
}
