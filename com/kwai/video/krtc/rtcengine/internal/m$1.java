package com.kwai.video.krtc.rtcengine.internal.m$1;
import com.kwai.video.krtc.observers.FileStreamingObserver;
import com.kwai.video.krtc.rtcengine.internal.m;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.w;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import java.lang.Long;
import sv7.x;
import java.nio.ByteBuffer;
import sv7.y;

public class m$1 extends FileStreamingObserver	// class@000881
{
    public final m a;

    public void m$1(m p0){
       this.a = p0;
       super();
    }
    private void a(int p0,IRtcEngineEventHandler p1){
       p1.onFileStreamStatus(m.b(this.a), p0);
    }
    private void a(long p0,long p1,IRtcEngineEventHandler p2){
       p2.onFileStreamPosition(m.b(this.a), p0, p1);
    }
    private void a(RtcEngineVideoFrame p0,IRtcEngineEventHandler p1){
       p1.onFileStreamVideoDecoded(m.b(this.a), p0);
    }
    public static void a(m$1 p0,RtcEngineVideoFrame p1,IRtcEngineEventHandler p2){
       p0.a(p1, p2);
    }
    public static void b(m$1 p0,int p1,IRtcEngineEventHandler p2){
       p0.a(p1, p2);
    }
    public static void c(m$1 p0,long p1,long p2,IRtcEngineEventHandler p3){
       p0.a(p1, p2, p3);
    }
    public void onFileStreamFinished(int p0){
       m$1 u1 = m$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "2")) {
          return;
       }
       m.a(this.a).a(new w(this, p0));
       return;
    }
    public void onFileStreamPositionUpdate(long p0,long p1){
       m$1 u1 = m$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, u1, "3")) {
          return;
       }
       x ox = new x(this, p1, p0);
       m.a(this.a).a(v7);
       return;
    }
    public void onVideoDecoded(ByteBuffer p0,int p1,int p2,long p3,int p4,int p5){
       m$1 u1 = this;
       m$1 u11 = m$1.class;
       if (PatchProxy.isSupport(u11)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Long.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, u11, "1")) {
             return;
          }
       }
       RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(p4, p0, p1, p2, p3, 0, p5);
       m.a(u1.a).a(new y(this, u11));
       return;
    }
}
