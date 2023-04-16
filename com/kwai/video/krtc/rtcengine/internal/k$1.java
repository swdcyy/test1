package com.kwai.video.krtc.rtcengine.internal.k$1;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.k;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.RtcEngineAudioVolumeInfo;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.v;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import android.os.Handler;

public class k$1 implements Runnable	// class@00087e
{
    public final int a;
    public final k b;

    public void k$1(k p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public static void a(RtcEngineAudioVolumeInfo[] p0,IRtcEngineEventHandler p1){
       p1.onAudioVolumeIndication(p0, 0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, k$1.class, "1")) {
          return;
       }
       k.b(this.b).a(new v(k.a(this.b)));
       k.d(this.b).postDelayed(k.c(this.b), (long)this.a);
       return;
    }
}
