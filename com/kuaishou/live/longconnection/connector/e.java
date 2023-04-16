package com.kuaishou.live.longconnection.connector.e;
import com.kuaishou.live.longconnection.connector.c;
import com.kuaishou.android.live.model.Race;
import java.lang.Object;
import com.kuaishou.live.longconnection.connector.b;
import java.util.ArrayList;
import java.lang.String;
import mf3.b;
import java.lang.Class;
import lf3.g;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import lf3.i;
import java.util.List;
import java.lang.StringBuilder;
import kf3.a;
import crd.b;
import lf3.a;
import com.kuaishou.live.longconnection.connector.e$d;
import lf3.d;
import com.kuaishou.live.longconnection.connector.e$c;
import com.kuaishou.live.longconnection.connector.e$f;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.longconnection.connector.l$c;
import com.kuaishou.live.longconnection.connector.l;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.android.schedulers.a;
import brd.t;
import com.kuaishou.live.longconnection.connector.e$e;
import erd.g;
import com.kuaishou.live.longconnection.connector.e$h;
import java.lang.IllegalStateException;
import com.kuaishou.live.longconnection.connector.e$b;
import com.kuaishou.android.live.model.Round;
import brd.a0;
import kf3.b;
import com.kuaishou.live.longconnection.horserace.b;
import com.kuaishou.live.longconnection.horserace.a;
import com.kuaishou.live.longconnection.connector.e$a;
import com.kuaishou.live.longconnection.connector.e$j;
import com.kuaishou.live.longconnection.connector.e$i;
import erd.o;
import java.lang.System;
import android.os.SystemClock;
import com.kuaishou.live.longconnection.connector.e$g;
import brd.d0;

public class e implements c	// class@000c6a
{
    public final int a;
    public Race b;
    public b c;
    public List d;
    public boolean e;
    public a f;
    public boolean g;
    public b h;
    public b i;
    public b j;
    public a k;
    public final List l;
    public final List m;
    public boolean n;
    public boolean o;
    public List p;
    public boolean q;
    public static int r;

    public void e(Race p0,boolean p1,boolean p2){
       super();
       this.c = new b();
       this.d = new ArrayList();
       this.l = new ArrayList();
       this.m = new ArrayList();
       this.b = p0;
       this.n = p1;
       this.q = p2;
       int r = e.r;
       e.r = r + 1;
       this.a = r;
       Object[] objArray = new Object[0];
       b.a(this.s(), "new LiveFeedConnectorHorseRaceImpl", objArray);
    }
    public void J(int p0,Class p1,g p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, Boolean.valueOf(p3), this, e.class, "11")) {
          return;
       }
       e tc = this.c;
       if (tc != null) {
          tc.p(p0, p1, p2, p3);
       }
       this.l.add(new i(p0, p1, p2, p3));
       return;
    }
    public void a(){
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, this, uoe, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "forceExit, liveStreamId: "+this.c.h(), objArray);
       e tk = this.k;
       if (tk != null) {
          tk.b();
       }
       if (!PatchProxy.applyVoid(null, this, uoe, "5")) {
          this.r(this.h);
          this.h = null;
          this.r(this.j);
          this.r(this.i);
          this.e = false;
       }
       this.g = true;
       this.u();
       uoe = this.f;
       if (uoe != null) {
          uoe.i();
       }
       this.f = null;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "exit, liveStreamId: "+this.c.h()+", mIsRacing:"+this.e, objArray);
       e th = this.h;
       if (th != null) {
          th.dispose();
       }
       this.g = true;
       if (this.e != null) {
          this.d.add(new e$d(this));
       }else {
          this.u();
       }
       th = this.f;
       if (th != null) {
          th.i();
       }
       this.f = null;
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "13")) {
          return;
       }
       e tc = this.c;
       if (tc != null) {
          tc.a(p0);
       }
       this.m.add(p0);
       return;
    }
    public void clearAllListener(){
       if (PatchProxy.applyVoid(null, this, e.class, "15")) {
          return;
       }
       this.c.b();
       return;
    }
    public void d(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "22")) {
          return;
       }
       this.o = p0;
       if (this.e == null) {
          uoe = this.c;
          if (uoe != null) {
             uoe.t(p0);
          }
       }
       return;
    }
    public void disconnect(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "disconnect, liveStreamId: "+this.c.h()+", mIsRacing:"+this.e, objArray);
       if (this.e != null) {
          this.d.add(new e$c(this));
       }else {
          this.c.c();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "16")) {
          return;
       }
       if (this.b.mSuccess == null) {
          this.d.add(new e$f(this));
       }else {
          this.c.m();
       }
       return;
    }
    public void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "23")) {
          return;
       }
       this.p = p0;
       if (this.e == null) {
          e tc = this.c;
          if (tc != null) {
             tc.s(p0);
          }
       }
       return;
    }
    public void g(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "14")) {
          return;
       }
       if (this.q != null && this.g != null) {
          return;
       }
       this.m.remove(p0);
       this.c.q(p0);
       return;
    }
    public Race h(){
       return this.b;
    }
    public void i(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "18")) {
          return;
       }
       this.c.r(p0);
       return;
    }
    public boolean isConnected(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.l();
    }
    public l$c j(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.g();
    }
    public void k(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       this.p();
       if (this.h == null) {
          long l = this.c.k();
          Object[] objArray = new Object[0];
          b.a(this.s(), "reconnect, liveStreamId: "+p0.f()+", delayTimeMs: "+l, objArray);
          this.h = t.timer(l, TimeUnit.MILLISECONDS, a.c()).subscribe(new e$e(this, p0));
       }
       return;
    }
    public void l(l p0,Race p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "21")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "retryHorseRace, liveStreamId: "+p0.f()+", mIsRacing: "+this.e, objArray);
       this.b = p1;
       if (this.e != null) {
          this.d.add(new e$h(this, p0));
       }else {
          this.n(p0);
       }
       return;
    }
    public void m(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "10")) {
          return;
       }
       this.f = p0;
       this.c.u(p0);
       return;
    }
    public void n(l p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "connect, liveStreamId: "+p0.f(), objArray);
       this.p();
       this.d(p0.k());
       this.f(p0.j);
       if (this.b.mSuccess == null) {
          if (this.e == null) {
             this.t(p0);
          }
       }else if(this.c.j() != null){
          p0.l(this.c.j().i());
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "19")) {
          Object[] objArray1 = new Object[0];
          b.a(this.s(), "connectWithoutRace, liveStreamId: "+p0.f(), objArray1);
          this.c.n(p0);
          this.c.d();
       }
       return;
    }
    public void o(int p0,g p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "12")) {
          return;
       }
       if (this.q != null && this.g != null) {
          return;
       }
       i oi = i.a(p0, p1, this.l);
       if (oi != null) {
          this.l.remove(oi);
       }
       this.c.v(p0, p1);
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, e.class, "25")) {
          return;
       }
       if (this.g == null) {
          return;
       }
       throw new IllegalStateException("Connector has been stopped");
    }
    public void pause(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "2")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "pause, pauseType: "+p0+", liveStreamId: "+this.c.h()+", mIsRacing:"+this.e, objArray);
       if (this.e != null) {
          this.d.add(new e$b(this, p0));
       }else {
          this.c.o(p0);
       }
       return;
    }
    public a0 q(Round p0,l p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "24");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = new Object[0];
       b.a(this.s(), "createRaceObservable, liveStreamId: "+p1.f()+", currentRound: "+p0.toString(), objArray);
       obj = this.n;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uob = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(obj), null, uob, "1");
          if (uob != patchProxyRe) {
          }else if(p0.mPolicy != 2){
             uob = new b(p0.mTimeout, obj);
          }else {
             a uoa = new a(p0.mBarriers, p0.mTimeout, obj);
          }
       }else {
          goto label_0054 ;
       }
       this.k = uob;
       return uob.a(p0.mHorses, p1).r(new e$a(this, p0)).q(new e$j(this, p0, p1)).H(new e$i(this, p0, p1));
    }
    public final void r(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "26")) {
          return;
       }
       if (p0 != null && !p0.isDisposed()) {
          p0.dispose();
       }
       return;
    }
    public String s(){
       Object obj = PatchProxy.apply(null, this, e.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFeedConnectorHorseRaceImpl-index-"+this.a;
    }
    public void t(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "20")) {
          return;
       }
       Object[] objArray = new Object[]{p0};
       b.a(this.s(), "raceAndConnect, liveStreamId: "+p0.f(), objArray);
       Object[] objArray1 = new Object[0];
       b.a(this.s(), "raceAndConnect, liveStreamId: "+p0.f()+", mAttach: "+p0.c()+", Race: "+this.b, objArray1);
       if (this.b.mRounds.isEmpty()) {
          objArray1 = new Object[]{p0};
          b.a(this.s(), "raceAndConnect failed, round is empty, liveStreamId: "+p0.f(), objArray1);
          return;
       }else {
          this.b.clearState();
          this.e = true;
          if (this.g == null) {
             this.b.mStartTime = System.currentTimeMillis();
             this.b.mStartRealTime = SystemClock.elapsedRealtime();
          }
          e tf = this.f;
          if (tf != null) {
             tf.g();
          }
          this.q(this.b.mRounds.get(0), p0).G(a.c()).b(new e$g(this));
          return;
       }
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       if (this.q != null) {
          this.l.clear();
          this.m.clear();
       }
       this.c.u(null);
       this.c.b();
       this.c.e();
       e tb = this.b;
       if (tb != null) {
          tb.clearState();
       }
       return;
    }
}
