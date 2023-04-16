package com.kwai.video.aemonplayer.MediaCodecLimit;
import java.lang.Object;

public class MediaCodecLimit	// class@0019cf
{
    public static int sCount = 0;
    public static int sMax = 1;

    public void MediaCodecLimit(){
       super();
    }
    public static int Acquire(){
       MediaCodecLimit mediaCodecLi = MediaCodecLimit.class;
       _monitor_enter(mediaCodecLi);
       int sCount = MediaCodecLimit.sCount;
       if (sCount >= MediaCodecLimit.sMax) {
          _monitor_exit(mediaCodecLi);
          return -1;
       }else {
          MediaCodecLimit.sCount = sCount + 1;
          _monitor_exit(mediaCodecLi);
          return 0;
       }
    }
    public static int Count(){
       return MediaCodecLimit.sCount;
    }
    public static int Release(){
       MediaCodecLimit mediaCodecLi = MediaCodecLimit.class;
       _monitor_enter(mediaCodecLi);
       int sCount = MediaCodecLimit.sCount;
       if (sCount > 0) {
          MediaCodecLimit.sCount = sCount - 1;
       }
       _monitor_exit(mediaCodecLi);
       return 0;
    }
    public static void SetMax(int p0){
       MediaCodecLimit.sMax = p0;
    }
}
