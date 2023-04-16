package com.kwai.video.krtc.rtcengine.extend.a.d$1;
import com.kwai.video.krtc.observers.AryaWebsocketObserver;
import com.kwai.video.krtc.rtcengine.extend.a.d;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.video.krtc.rtcengine.internal.z;
import rv7.f;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import rv7.e;
import com.kwai.video.krtc.rtcengine.extend.a.f;
import com.kwai.video.krtc.rtcengine.extend.a.e;
import rv7.g;
import rv7.d;

public class d$1 extends AryaWebsocketObserver	// class@00085b
{
    public final d a;

    public void d$1(d p0){
       this.a = p0;
       super();
    }
    public static void a(IRtcEngineEventHandler p0){
       p0.onWebsocketReconnecting();
    }
    public static void a(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onWebsocketRecvMessage(p0, p1);
    }
    public static void a(byte[] p0,int p1,IRtcEngineEventHandler p2){
       p2.onWebsocketRecvData(p0, p1);
    }
    public static void b(IRtcEngineEventHandler p0){
       p0.onWebsocketOpen();
    }
    public static void b(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onWebsocketFail(p0, p1);
    }
    public static void c(String p0,int p1,IRtcEngineEventHandler p2){
       p2.onWebsocketClose(p0, p1);
    }
    public void onWebsocketClose(String p0,int p1){
       d$1 u1 = d$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1, "3")) {
          return;
       }
       if (d.a(this.a) != null) {
          d.a(this.a).a(new f(p0, p1));
       }
       return;
    }
    public void onWebsocketFail(String p0,int p1){
       d$1 u1 = d$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1, "4")) {
          return;
       }
       if (d.a(this.a) != null) {
          d.a(this.a).a(new e(p0, p1));
       }
       return;
    }
    public void onWebsocketOpen(){
       if (PatchProxy.applyVoid(null, this, d$1.class, "1")) {
          return;
       }
       if (d.a(this.a) != null) {
          d.a(this.a).a(f.a);
       }
       return;
    }
    public void onWebsocketReconnecting(){
       if (PatchProxy.applyVoid(null, this, d$1.class, "2")) {
          return;
       }
       if (d.a(this.a) != null) {
          d.a(this.a).a(e.a);
       }
       return;
    }
    public void onWebsocketRecvData(byte[] p0,int p1){
       d$1 u1 = d$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1, "6")) {
          return;
       }
       if (d.a(this.a) != null) {
          d.a(this.a).a(new g(p0, p1));
       }
       return;
    }
    public void onWebsocketRecvMessage(String p0,int p1){
       d$1 u1 = d$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, u1, "5")) {
          return;
       }
       if (d.a(this.a) != null) {
          d.a(this.a).a(new d(p0, p1));
       }
       return;
    }
}
