package com.kuaishou.live.longconnection.connector.b;
import java.util.Vector;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kuaishou.live.longconnection.connector.k;
import if3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.longconnection.connector.RunnablePipeline;
import java.util.Objects;
import java.util.concurrent.Future;
import com.kuaishou.live.longconnection.connector.RunnablePipeline$Status;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import java.util.List;
import mf3.b;
import com.kuaishou.socket.nano.SocketMessages$SCError;
import lf3.g;
import java.lang.IllegalStateException;
import lf3.d;
import lf3.e;
import w00.a;
import w00.d;
import x00.a;
import z00.b;
import com.kuaishou.live.longconnection.connector.g;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.os.Handler;
import java.util.Queue;
import nf3.f;
import java.lang.StringBuilder;
import of3.b;
import of3.d;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CSUserExit;
import java.lang.System;
import of3.j;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.socket.nano.SocketMessages$SocketMessage;
import v00.g;
import if3.b;
import com.kuaishou.live.longconnection.connector.l$c;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Number;
import java.util.Random;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CSAuthorPushTrafficZero;
import of3.a;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CSUserPause;
import of3.k;
import lf3.a;

public class b	// class@000c5d
{
    public int a;
    public Future b;
    public final RunnablePipeline c;
    public Handler d;
    public final k e;
    public final k f;
    public static List g;
    public static int h;

    static {
       b.g = new Vector();
       b.h = 0;
    }
    public void b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       k ok = new k();
       this.e = ok;
       a uoa = new a(this);
       this.f = uoa;
       Object[] objArray = null;
       RunnablePipeline runnablePipe = PatchProxy.apply(objArray, objArray, b.class, "2");
       if (runnablePipe != patchProxyRe) {
       }else {
          runnablePipe = new RunnablePipeline();
       }
       this.c = runnablePipe;
       Objects.requireNonNull(runnablePipe);
       Future uFuture = PatchProxy.apply(objArray, runnablePipe, RunnablePipeline.class, "1");
       if (uFuture != patchProxyRe) {
       }else if(runnablePipe.d == null && runnablePipe.c == RunnablePipeline$Status.IDLE){
          runnablePipe.c = RunnablePipeline$Status.WAIT;
          uFuture = RunnablePipeline.f.submit(runnablePipe.e);
       }else {
          throw new IllegalStateException("Should not start a RunnablePipeline twice");
       }
       this.b = uFuture;
       ok.k = runnablePipe;
       b.g.add(this);
       int h = b.h;
       b.h = h + 1;
       this.a = h;
       Object[] objArray1 = new Object[0];
       b.a(this.i(), "new LiveFeedConnection", objArray1);
       ok.o(103, SocketMessages$SCError.class, uoa);
       return;
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       b te = this.e;
       Objects.requireNonNull(te);
       k ok = k.class;
       if (!PatchProxy.applyVoidOneRefs(p0, te, ok, "3")) {
          k q = te.q;
          Objects.requireNonNull(q);
          if (PatchProxy.applyVoidOneRefs(p0, q, e.class, "2") || (p0 != null && !q.a.contains(p0))) {
             q.a.add(p0);
          }
       label_003b :
          _monitor_enter(te);
          if (PatchProxy.applyVoid(null, te, ok, "27")) {
             _monitor_exit(te);
          }else {
             k i = te.i;
             if (i == null || i.a() == null) {
                _monitor_exit(te);
             }else {
                a uoa = te.i.a().q();
                if (uoa.d() == null) {
                   uoa.b = new g(te);
                }
                _monitor_exit(te);
             }
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.a(this.i(), "clearSCMessageListener", objArray);
       b te = this.e;
       _monitor_enter(te);
       if (PatchProxy.applyVoid(null, te, k.class, "7")) {
          _monitor_exit(te);
       }else {
          Object[] objArray1 = new Object[i];
          b.a(te.g(), "clearSCMessageListener", objArray1);
          te.o.clear();
          te.p.clear();
          k q = te.q;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoid(null, q, e.class, "4")) {
             q.a.clear();
          }
          te.w.clear();
          te.l.removeCallbacksAndMessages(null);
          q = te.i;
          if (q != null && q.a() != null) {
             te.i.a().q().b();
          }
          q = te.k;
          if (q != null && !PatchProxy.applyVoid(null, q, RunnablePipeline.class, "6")) {
             q.a.clear();
             q.b.clear();
          }
          q = te.s;
          if (q != null) {
             q.b();
             te.s = null;
          }
          _monitor_exit(te);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.i(), "disconnect, liveStreamId: "+this.h(), objArray);
       b te = this.e;
       te.u(new b(te));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "12")) {
          return;
       }
       Object[] objArray = new Object[]{"liveStreamId: "+this.h()};
       b.a(this.i(), "enterRoom", objArray);
       b te = this.e;
       te.u(new d(te));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.i(), "exit, liveStreamId: "+this.h(), objArray);
       LiveStreamMessages$CSUserExit uCSUserExit = new LiveStreamMessages$CSUserExit();
       uCSUserExit.time = System.currentTimeMillis();
       b te = this.e;
       te.u(new j(te, g.a(uCSUserExit, 202)));
       this.f();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.i(), "exitQuietly, liveStreamId: "+this.h(), objArray);
       this.c();
       b.g.remove(this);
       this.e.v(103, this.f);
       this.e.u(new b(this));
       return;
    }
    public l$c g(){
       Object obj = PatchProxy.apply(null, this, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.m;
    }
    public String h(){
       String obj = PatchProxy.apply(null, this, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.j() != null)? this.j().f(): "";
       return obj;
    }
    public String i(){
       Object obj = PatchProxy.apply(null, this, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFeedConnection-index-"+this.a;
    }
    public l j(){
       Object obj = PatchProxy.apply(null, this, b.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.i();
    }
    public long k(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "28");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = this.e;
       Objects.requireNonNull(obj);
       k obj1 = PatchProxy.apply(objArray, obj, k.class, "8");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          obj1 = obj.a;
          l = (long)((float)(obj.b - obj1) * k.y.nextFloat()) + obj1;
       }
       return l;
    }
    public boolean l(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.c.c == RunnablePipeline$Status.RUNNING && this.e.d() != null)? true: false;
       return b;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "18")) {
          return;
       }
       LiveStreamMessages$CSAuthorPushTrafficZero uCSAuthorPus = new LiveStreamMessages$CSAuthorPushTrafficZero();
       uCSAuthorPus.time = System.currentTimeMillis();
       b te = this.e;
       te.u(new j(te, g.a(uCSAuthorPus, 203)));
       return;
    }
    public void n(l p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "3")) {
          return;
       }
       b te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, k.class, "13")) {
          te.g = p0;
          te.v = p0.Q;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uob, "26")) {
          uob = this.d;
          if (uob != null) {
             uob.removeCallbacksAndMessages(objArray);
          }
       }
       b te1 = this.e;
       te1.u(new a(te1));
       Object[] objArray1 = new Object[0];
       b.a(this.i(), "open, liveStreamId: "+this.h()+", ServerUriInfo: "+this.g(), objArray1);
       return;
    }
    public void o(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.i(), "pause, liveStreamId: "+this.h(), objArray);
       LiveStreamMessages$CSUserPause uCSUserPause = new LiveStreamMessages$CSUserPause();
       uCSUserPause.pauseType = p0;
       uCSUserPause.time = System.currentTimeMillis();
       b te = this.e;
       te.u(new j(te, g.a(uCSUserPause, 201)));
       return;
    }
    public void p(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, b.class, "4")) {
          return;
       }
       this.e.p(p0, p1, p2, p3);
       return;
    }
    public void q(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       b te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(p0, te, k.class, "4")) {
          k q = te.q;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoidOneRefs(p0, q, e.class, "3") && p0 != null) {
             q.a.remove(p0);
          }
       }
       return;
    }
    public void r(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       b te = this.e;
       te.u(new k(te, p0));
       return;
    }
    public void s(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       this.e.r = p0;
       return;
    }
    public void t(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "14")) {
          return;
       }
       uob = this.e;
       Objects.requireNonNull(uob);
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, ok, "6")) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0)};
          b.a(uob.g(), "setEnableCacheMessage", objArray);
          uob.t = p0;
          k s = uob.s;
          if (s != null) {
             s.d(uob.t);
          }
       }
       return;
    }
    public void u(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "25")) {
          return;
       }
       this.e.j = p0;
       return;
    }
    public void v(int p0,g p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "7")) {
          return;
       }
       this.e.v(p0, p1);
       return;
    }
}
