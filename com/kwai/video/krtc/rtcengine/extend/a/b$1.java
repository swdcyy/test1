package com.kwai.video.krtc.rtcengine.extend.a.b$1;
import com.kwai.video.krtc.observers.AudioMixerObserver;
import com.kwai.video.krtc.rtcengine.extend.a.b;
import java.lang.Object;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.internal.o;
import rv7.b;
import com.kwai.video.krtc.rtcengine.internal.z$a;

public class b$1 implements AudioMixerObserver	// class@000857
{
    public final b a;

    public void b$1(b p0){
       this.a = p0;
       super();
    }
    public static void a(ByteBuffer p0,int p1,int p2,long p3,IRtcEngineEventHandler p4){
       p4.onMixRemoteAndLocalAudioPcmData(p0, p1, p2, p3);
    }
    public void onAudioMixPcmData(ByteBuffer p0,int p1,int p2,long p3){
       if (PatchProxy.isSupport(b$1.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), this, b$1.class, "1")) {
          return;
       }
       b uob = new b(p0, p1, p2, p3);
       b.a(this.a).a(v7);
       return;
    }
}
