package com.kwai.video.krtc.rtcengine.internal.t$1;
import com.kwai.video.krtc.observers.a;
import com.kwai.video.krtc.rtcengine.internal.t;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.observers.a$a;
import com.kwai.video.krtc.observers.a$b;
import java.lang.Enum;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.d2;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import java.lang.Float;
import sv7.e2;
import sv7.f2;
import sv7.c2;

public class t$1 extends a	// class@000898
{
    public final String a;
    public final t b;

    public void t$1(t p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public static void a(String p0,String p1,float p2,float p3,IRtcEngineEventHandler p4){
       p4.onAudioEffectProgressed(p0, p1, p2, p3);
    }
    public static void a(String p0,String p1,a$a p2,IRtcEngineEventHandler p3){
       p3.onAudioEffectStateChanged(p0, p1, a$b.c.ordinal(), p2.ordinal());
    }
    public static void a(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onAudioEffectStateChanged(p0, p1, a$b.b.ordinal(), a$a.a.ordinal());
    }
    public static void b(String p0,String p1,IRtcEngineEventHandler p2){
       p2.onAudioEffectStateChanged(p0, p1, a$b.a.ordinal(), a$a.a.ordinal());
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$1.class, "1")) {
          return;
       }
       t.a(this.b).a(new d2(this.a, p0));
       return;
    }
    public void a(String p0,float p1,float p2){
       if (PatchProxy.isSupport(t$1.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, t$1.class, "2")) {
          return;
       }
       t.a(this.b).a(new e2(this.a, p0, p1, p2));
       return;
    }
    public void a(String p0,a$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t$1.class, "4")) {
          return;
       }
       t.a(this.b).a(new f2(this.a, p0, p1));
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$1.class, "3")) {
          return;
       }
       t.a(this.b).a(new c2(this.a, p0));
       return;
    }
}
