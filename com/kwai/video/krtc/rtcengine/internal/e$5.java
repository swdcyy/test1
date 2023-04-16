package com.kwai.video.krtc.rtcengine.internal.e$5;
import com.kwai.video.krtc.observers.AudioRecordingObserver;
import com.kwai.video.krtc.rtcengine.internal.e;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.nio.ByteBuffer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.p;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import sv7.o;
import sv7.n;

public class e$5 implements AudioRecordingObserver	// class@000871
{
    public final int a;
    public final e b;

    public void e$5(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public static void a(int p0,IRtcEngineEventHandler p1){
       p1.onAudioRecordStateChange(3, 1, p0);
    }
    public static void a(ByteBuffer p0,int p1,int p2,IRtcEngineEventHandler p3){
       p3.onAudioRecorded(p0, p1, p2);
    }
    public static void b(int p0,IRtcEngineEventHandler p1){
       p1.onAudioRecordStateChange(0, 0, p0);
    }
    public void onAudioEncoded(ByteBuffer p0,int p1){
       e$5 u5 = e$5.class;
       if (PatchProxy.isSupport(u5) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u5, "1")) {
          return;
       }
       e.d(this.b).a(new p(p0, p1, this.a));
       return;
    }
    public void onAudioRecordFinished(int p0,int p1){
       e$5 u5 = e$5.class;
       if (PatchProxy.isSupport(u5) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, u5, "3")) {
          return;
       }
       e.c(this.b, this.a, p0, p1);
       return;
    }
    public void onAudioRecordStart(int p0){
       e$5 u5 = e$5.class;
       if (PatchProxy.isSupport(u5) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u5, "2")) {
          return;
       }
       if (!p0) {
          e.d(this.b).a(new o(this.a));
       }else {
          e.d(this.b).a(new n(this.a));
       }
       return;
    }
}
