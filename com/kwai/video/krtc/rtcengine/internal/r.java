package com.kwai.video.krtc.rtcengine.internal.r;
import com.kwai.video.krtc.rtcengine.internal.z;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantLock;
import com.kwai.video.krtc.Arya;
import java.util.Map;
import java.util.Set;
import java.lang.String;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import com.kwai.video.krtc.rtcengine.IMediaFrameObserver;
import com.kwai.video.krtc.observers.CustomVideoDataObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.krtc.rtcengine.internal.r$a;
import com.kwai.video.krtc.rtcengine.internal.r$1;
import com.kwai.video.krtc.observers.MediaFrameObserver;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.lang.Boolean;
import com.kwai.video.krtc.rtcengine.RtcEngineVideoFrame;
import java.lang.StringBuilder;
import sv7.b2;
import com.kwai.video.krtc.rtcengine.internal.z$a;
import java.nio.ByteBuffer;
import java.lang.Long;

public class r	// class@000896
{
    public z a;
    public Arya b;
    public IMediaFrameObserver c;
    public ReentrantLock d;
    public int e;
    public Map f;
    public Set g;
    public Map h;
    public CustomVideoDataObserver i;

    public void r(z p0){
       super();
       this.d = new ReentrantLock();
       this.b = p0.a();
       this.f = p0.b();
       this.g = p0.c();
       this.a = p0;
       this.h = p0.d();
    }
    public static ReentrantLock a(r p0){
       return p0.d;
    }
    public static void a(r p0,String p1,String p2,int p3,int p4,int p5,int p6){
       p0.a(p1, p2, p3, p4, p5, p6);
    }
    public static void a(String p0,String p1,int p2,int p3,int p4,IRtcEngineEventHandler p5){
       p5.onFirstRemoteVideoFrame(p0, p1, p2, p3, p4);
    }
    public static boolean a(r p0,int p1){
       return p0.a(p1);
    }
    public static IMediaFrameObserver b(r p0){
       return p0.c;
    }
    public static z c(r p0){
       return p0.a;
    }
    public static CustomVideoDataObserver d(r p0){
       return p0.i;
    }
    public static Arya e(r p0){
       return p0.b;
    }
    public static Map f(r p0){
       return p0.h;
    }
    public int a(IMediaFrameObserver p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, or, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.d.lock();
       this.c = p0;
       this.d.unlock();
       this.e = p1;
       return 0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.b.setMediaFrameObserver(new r$a(this, null), 776);
       return;
    }
    public void a(TextureBuffer p0,boolean p1){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, or, "7")) {
          return;
       }
       this.d.lock();
       or = this.c;
       this.d.unlock();
       if (or != null && this.a(4096)) {
          int width = p0.getWidth();
          int height = p0.getHeight();
          int rotation = p0.getRotation();
          int i = (rotation == 90 || rotation == 270)? 1: 0;
          int i1 = (i)? height: width;
          int i2 = (i)? width: height;
          RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(i1, i2, 0, rotation, p0, p1);
          or.onLocalVideoAfterPreProcessed(v11);
          v11.release();
       }
       return;
    }
    public void a(CustomVideoDataObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.d.lock();
       this.i = p0;
       this.d.unlock();
       return;
    }
    public final void a(String p0,String p1,int p2,int p3,int p4,int p5){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, or, "5")) {
             return;
          }
       }
       String str = "_";
       String str1 = p0+str+p1+str+p2;
       or = this.g;
       if (or == null) {
          return;
       }else if(or.contains(str1)){
          return;
       }else {
          this.g.add(str1);
          b2 uob2 = new b2(p0, p1, p3, p4, p5);
          this.a.a(v6);
          return;
       }
    }
    public void a(ByteBuffer p0,int p1,int p2,int p3,int p4,int p5,long p6,boolean p7){
       Object[] objArray;
       Object obj = this;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Long.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, obj, or, "6")) {
             return;
          }
       }
       obj.d.lock();
       or = obj.c;
       obj.d.unlock();
       if (or != null && obj.a(4096)) {
          RtcEngineVideoFrame rtcEngineVid = new RtcEngineVideoFrame(p3, p0, p1, p2, p6, p4, p5, false, true, p7);
          or.onLocalVideoAfterPreProcessed(objArray);
       }
       return;
    }
    public final boolean a(int p0){
       boolean b = (p0 & this.e)? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       this.b.setMediaFrameObserver(null, -1);
       this.d.lock();
       this.c = null;
       this.d.unlock();
       return;
    }
}
