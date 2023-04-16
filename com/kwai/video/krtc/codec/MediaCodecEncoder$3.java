package com.kwai.video.krtc.codec.MediaCodecEncoder$3;
import java.lang.Runnable;
import com.kwai.video.krtc.codec.MediaCodecEncoder;
import android.media.MediaCodec;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.Log;

public class MediaCodecEncoder$3 implements Runnable	// class@000779
{
    public final MediaCodec a;
    public final CountDownLatch b;
    public final MediaCodecEncoder c;

    public void MediaCodecEncoder$3(MediaCodecEncoder p0,MediaCodec p1,CountDownLatch p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, MediaCodecEncoder$3.class, "1")) {
          return;
       }
       MediaCodecEncoder$3 ta = this.a;
       if (ta != null) {
          try{
             ta.stop();
          }catch(java.lang.Exception e0){
             Log.e(MediaCodecEncoder.a(), "Media codec stop failed.", e0);
          }
          this.a.release();
       }
       ta = this.b;
       if (ta != null) {
          ta.countDown();
       }
       return;
    }
}
