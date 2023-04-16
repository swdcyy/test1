package com.kwai.video.krtc.rtcengine.internal.e;
import com.kwai.video.krtc.Arya;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.video.krtc.rtcengine.internal.e$1;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.rtcengine.internal.e$2;
import java.lang.Runnable;
import com.kwai.video.krtc.rtcengine.internal.e$3;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.rtcengine.internal.e$6;
import com.kwai.video.krtc.observers.AudioRecordingObserver;
import com.kwai.video.krtc.rtcengine.internal.e$4;
import sv7.l;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import sv7.k;
import java.util.Iterator;
import com.kwai.video.krtc.rtcengine.internal.e$a;
import sv7.j;
import com.kwai.video.krtc.rtcengine.internal.e$5;
import sv7.m;
import sv7.i;

public class e	// class@000874
{
    public Arya a;
    public z b;
    public final String c;
    public HandlerThread d;
    public Handler e;
    public boolean f;
    public List g;
    public AudioSceneObserver h;

    public void e(Arya p0,z p1){
       super();
       this.c = "RtcEngineAudioRecord";
       this.f = false;
       this.g = new ArrayList();
       this.h = new e$1(this);
       this.a = p0;
       this.b = p1;
       HandlerThread handlerThrea = new HandlerThread("RtcAudioRecord");
       this.d = handlerThrea;
       handlerThrea.start();
       this.e = new Handler(this.d.getLooper());
       e th = this.h;
       if (th != null) {
          e ta = this.a;
          if (ta != null) {
             ta.addAudioSceneObserver(th);
          }
       }
       return;
    }
    public static void a(int p0,int p1,IRtcEngineEventHandler p2){
       p2.onAudioRecordFinished(0, p0, p1);
    }
    public static void a(int p0,IRtcEngineEventHandler p1){
       p1.onAudioRecordStateChange(2, 0, p0);
    }
    public static void a(e p0,int p1,int p2){
       p0.a(p1, p2);
    }
    public static void a(e p0,int p1,int p2,int p3){
       p0.c(p1, p2, p3);
    }
    public static boolean a(e p0){
       return p0.f;
    }
    public static List b(e p0){
       return p0.g;
    }
    public static void b(int p0,IRtcEngineEventHandler p1){
       p1.onAudioRecordStateChange(3, 1, p0);
    }
    public static void b(e p0,int p1,int p2,int p3){
       p0.b(p1, p2, p3);
    }
    public static Handler c(e p0){
       return p0.e;
    }
    public static void c(int p0,IRtcEngineEventHandler p1){
       p1.onAudioRecordStateChange(3, 1, p0);
    }
    public static void c(e p0,int p1,int p2,int p3){
       p0.d(p1, p2, p3);
    }
    public static z d(e p0){
       return p0.b;
    }
    public static void d(int p0,IRtcEngineEventHandler p1){
       p1.onAudioRecordStateChange(3, 4, p0);
    }
    public int a(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.post(new e$2(this, p0));
       return 0;
    }
    public int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.post(new e$3(this, p0, p1, p2));
       return 0;
    }
    public int a(String p0){
       return -1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e th = this.h;
       if (th != null) {
          e ta = this.a;
          if (ta != null) {
             ta.removeAudioSceneObserver(th);
          }
       }
       th = this.d;
       if (th != null) {
          th.getLooper().quit();
       }
       return;
    }
    public final void a(int p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "7")) {
          return;
       }
       Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] doStopAudioRecording recordId:"+p0+", audioScene:"+p1+", this:"+this);
       this.a.stopAudioRecording(new e$6(this, p0));
       if (this.c(p1)) {
          Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] doStopAudioRecording reset aec mode, this:"+this);
          this.a.setEnableSpeakerInputAEC(false);
          this.a.setSoftAecMode(false);
       }
       return;
    }
    public int b(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.e.post(new e$4(this, p0));
       return 0;
    }
    public final void b(int p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "4")) {
          return;
       }
       int i = (!p2)? 1792: 2816;
       String str = "RtcEngineAudioRecord";
       Log.i(str, "[RtcEngineAudioRecord] startAudioRecordingInner type:"+p1+", mode:"+p2+", audioScene:"+i);
       p2 = this.a.getCurrentAudioScene();
       boolean b = this.a.checkAudioSceneExclusive(p2, i);
       StringBuilder str1 = "[RtcEngineAudioRecord] startAudioRecordingInner currentAudioScene:"+p2;
       Log.i(str, str1+", requestAudioScene:"+i+", isExclusive:"+b);
       if (b) {
          this.b.b(new l(p0));
          return;
       }else if(this.g.size() >= 2){
          Log.i(str, "[RtcEngineAudioRecord] startAudioRecordingInner only support max instance:2");
          this.b.b(new k(p0));
          return;
       }else {
          Iterator iterator = this.g.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().c == p0) {
                   Log.i(str, "[RtcEngineAudioRecord] startAudioRecordingInner recordId:"+p0+", is running");
                   this.b.b(new j(p0));
                   return;
                }
             }else if(this.g.size() > 0){
                this.f = true;
                Log.i(str, "[RtcEngineAudioRecord] startAudioRecordingInner ignoreAudioScene");
                e$a uoa = this.g.get((this.g.size() - true));
                this.a(uoa.c, uoa.b);
                break ;
             }
             break ;
          }
          this.g.add(new e$a(p1, i, p0));
          this.c(p0, p1, i);
          return;
       }
    }
    public final void c(int p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "6")) {
          return;
       }
       Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] doStartAudioRecording recordId:"+p0+", type:"+p1+", audioScene:"+p2+", this:"+this);
       if (this.c(p2)) {
          Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] doStartAudioRecording setEnableSpeakerInputAEC true, this:"+this);
          this.a.setEnableSpeakerInputAEC(true);
       }
       this.a.startAudioRecording(new e$5(this, p0), p1, p2);
       if (this.c(p2)) {
          Log.i("RtcEngineAudioRecord", "[RtcEngineAudioRecord] doStartAudioRecording setSoftAecMode:KWAryaSoftAecLight, this:"+this);
          this.a.setSoftAecMode(4);
       }
       return;
    }
    public final boolean c(int p0){
       boolean b = (p0 == 1792)? true: false;
       return b;
    }
    public final void d(int p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "8")) {
          return;
       }
       if (!p1) {
          this.b.a(new m(p2, p0));
       }
       this.b.a(new i(p0));
       return;
    }
}
