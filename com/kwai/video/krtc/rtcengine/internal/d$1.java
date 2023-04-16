package com.kwai.video.krtc.rtcengine.internal.d$1;
import com.kwai.video.krtc.observers.BgmObserver;
import com.kwai.video.krtc.rtcengine.internal.d;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import com.kwai.video.krtc.observers.BgmObserver$BgmErrorType;
import java.lang.Enum;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.internal.z;
import sv7.h;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import sv7.c;
import sv7.d;
import sv7.g;
import java.lang.Float;
import sv7.f;
import java.util.concurrent.atomic.AtomicInteger;
import sv7.e;

public class d$1 extends BgmObserver	// class@000868
{
    public final String a;
    public final d b;

    public void d$1(d p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public static void a(d$1 p0,String p1,IRtcEngineEventHandler p2){
       p0.b(p1, p2);
    }
    private void a(String p0,float p1,float p2,IRtcEngineEventHandler p3){
       d$1 tb = this.b;
       p3.onLocalAudioMixingProgress(p0, d.a(tb, d.d(tb)), p1, p2);
    }
    public static void a(String p0,int p1,IRtcEngineEventHandler p2){
       p2.bgmOffsetInLiveStream(p0, p1);
    }
    private void a(String p0,BgmObserver$BgmErrorType p1,IRtcEngineEventHandler p2){
       d$1 tb = this.b;
       p2.onLocalAudioMixingStateChanged(p0, d.a(tb, d.d(tb)), 3, p1.ordinal());
    }
    private void a(String p0,IRtcEngineEventHandler p1){
       d$1 tb = this.b;
       p1.onLocalAudioMixingStateChanged(p0, d.a(tb, d.d(tb)), 2, 0);
    }
    public static void b(d$1 p0,String p1,IRtcEngineEventHandler p2){
       p0.a(p1, p2);
    }
    private void b(String p0,IRtcEngineEventHandler p1){
       d$1 tb = this.b;
       p1.onLocalAudioMixingFinished(p0, d.a(tb, d.d(tb)));
    }
    public static void c(d$1 p0,String p1,float p2,float p3,IRtcEngineEventHandler p4){
       p0.a(p1, p2, p3, p4);
    }
    private void c(String p0,IRtcEngineEventHandler p1){
       d$1 tb = this.b;
       p1.onLocalAudioMixingStateChanged(p0, d.a(tb, d.d(tb)), 0, 0);
    }
    public static void d(d$1 p0,String p1,IRtcEngineEventHandler p2){
       p0.c(p1, p2);
    }
    public static void e(d$1 p0,String p1,BgmObserver$BgmErrorType p2,IRtcEngineEventHandler p3){
       p0.a(p1, p2, p3);
    }
    public void offsetInLiveStream(int p0){
       d$1 u1 = d$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, u1, "5")) {
          return;
       }
       d.a(this.b).a(new h(this.a, p0));
       return;
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$1.class, "3")) {
          return;
       }
       d.a(this.b).a(new c(this, this.a));
       d.a(this.b).a(new d(this, this.a));
       return;
    }
    public void onError(String p0,BgmObserver$BgmErrorType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$1.class, "4")) {
          return;
       }
       d.a(this.b).a(new g(this, this.a, p1));
       return;
    }
    public void onProgressed(String p0,float p1,float p2){
       if (PatchProxy.isSupport(d$1.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, d$1.class, "2")) {
          return;
       }
       d.a(this.b).a(new f(this, this.a, p1, p2));
       d.b(this.b).set((int)p2);
       d.c(this.b).set((int)p1);
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$1.class, "1")) {
          return;
       }
       d.a(this.b).a(new e(this, this.a));
       return;
    }
}
