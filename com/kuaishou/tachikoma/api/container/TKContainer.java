package com.kuaishou.tachikoma.api.container.TKContainer;
import rx4.a;
import ex4.b;
import ww4.c;
import androidx.lifecycle.LifecycleObserver;
import tx4.p;
import android.app.Activity;
import android.view.ViewGroup;
import java.lang.String;
import bx4.h;
import java.lang.Object;
import crd.a;
import yw4.c;
import java.util.ArrayList;
import java.util.UUID;
import tw4.a;
import java.lang.Boolean;
import qp8.d;
import java.lang.StringBuilder;
import zp8.a;
import iq8.x;
import java.lang.Throwable;
import com.tachikoma.core.bridge.d;
import wp8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import no8.e;
import oo8.s;
import android.view.Choreographer;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.lang.System;
import bx4.c;
import np8.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import ax4.a;
import com.tkruntime.v8.V8Trace;
import tx4.w;
import cx4.d;
import ww4.a;
import dx4.a;
import tw4.t;
import lp8.b;
import lp8.c;
import android.util.Log;
import tx4.n;
import tx4.r;
import bx4.i;
import zw4.a;
import vw4.a;
import zw4.a$a;
import com.tachikoma.core.debug.c;
import java.lang.reflect.Method;
import com.kuaishou.tachikoma.api.g;
import com.kuaishou.tachikoma.api.container.TKContainer$j;
import android.content.Context;
import fx4.b;
import brd.a0;
import vw4.g;
import vw4.h;
import erd.g;
import crd.b;
import java.lang.Long;
import com.kuaishou.tachikoma.api.container.TKContainer$i;
import ww4.b;
import tx4.c;
import vw4.c;
import com.kuaishou.tachikoma.api.container.TKContainer$m;
import tx4.d;
import com.kuaishou.tachikoma.api.container.TKContainer$v;
import com.kuaishou.tachikoma.api.container.TKContainer$w;
import com.kuaishou.tachikoma.api.container.TKContainer$g;
import com.tkruntime.v8.V8;
import com.tachikoma.core.bridge.a$b;
import tx4.f;
import com.kuaishou.tachikoma.api.d;
import com.kuaishou.tachikoma.api.container.TKContainer$h;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;
import vw4.k;
import java.lang.Runnable;
import sx4.e$a;
import tx4.o;
import com.tachikoma.core.bridge.d$b;
import com.tachikoma.core.component.e$e;
import com.tachikoma.core.bridge.d$b$a;
import vw4.f;
import com.kuaishou.tachikoma.api.TKViewContainer;
import java.io.PrintStream;
import com.tachikoma.core.component.e;
import sx4.e;
import android.widget.FrameLayout;
import java.lang.Number;
import com.tachikoma.core.exception.CreateViewFailException;
import java.util.Stack;
import com.kuaishou.tachikoma.api.container.TKContainer$r;
import tx4.h;
import java.util.List;
import java.util.Iterator;
import tx4.l;
import java.lang.Integer;
import vw4.b;
import oo8.j;
import com.kuaishou.tachikoma.api.container.TKContainer$q;
import com.kuaishou.tachikoma.api.container.TKContainer$n;
import tx4.v;
import vw4.e;
import com.kuaishou.tachikoma.api.container.a;
import vw4.j;
import com.kuaishou.tachikoma.api.container.TKContainer$o;
import oo8.k;
import np8.a;
import java.util.LinkedList;
import com.kuaishou.tachikoma.api.container.TKContainer$t;
import com.kuaishou.tachikoma.api.container.TKContainer$u;
import cx4.c;
import java.util.concurrent.ConcurrentHashMap;
import aq8.f;
import com.tachikoma.core.bridge.c;
import tw4.r;
import ex4.c;
import java.util.HashMap;
import tw4.q;
import tx4.j;
import com.tachikoma.core.component.network.Network;
import tw4.p;
import oo8.m;
import java.util.Map$Entry;
import com.kuaishou.tachikoma.api.CustomEnv;
import com.tachikoma.core.bridge.CustomEnv;
import java.io.Serializable;
import com.tkruntime.v8.V8JsonProxyObject;
import android.os.Handler;
import aq8.a;
import android.os.HandlerThread;
import android.os.Looper;
import com.tkruntime.v8.V8JSONProxy;
import com.kuaishou.tachikoma.TKViewContainerWrapView;
import com.kuaishou.tachikoma.TKViewContainerWrapView$a;
import com.kuaishou.tachikoma.api.container.TKContainer$d;
import com.kuaishou.tachikoma.api.container.TKContainer$e;
import java.lang.Exception;
import com.kuaishou.tachikoma.api.container.TKContainer$f;
import com.kuaishou.tachikoma.api.container.TKContainer$l;
import vw4.d;
import tx4.q;
import com.kuaishou.tachikoma.api.container.TKContainer$s;
import bx4.e;
import t45.c;
import com.kuaishou.tachikoma.api.container.TKContainer$a;
import com.kuaishou.tachikoma.api.container.TKContainer$b;
import com.kuaishou.tachikoma.api.container.TKContainer$c;
import com.tkruntime.v8.V8ObjectProxy;
import vw4.i;
import com.google.gson.JsonObject;
import np8.d;
import android.view.View;
import np8.c;
import java.util.Collection;
import com.kuaishou.tachikoma.api.container.TKContainer$k;
import com.kuaishou.tachikoma.api.container.TKContainer$p;

public abstract class TKContainer implements a, b, c, LifecycleObserver, p	// class@000f7b
{
    public boolean A;
    public boolean B;
    public n C;
    public c D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public int I;
    public final List J;
    public final List K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public Choreographer P;
    public WeakReference Q;
    public a R;
    public w b;
    public t c;
    public final a d;
    public b e;
    public WeakReference f;
    public ViewGroup g;
    public final String h;
    public final String i;
    public q j;
    public h k;
    public a l;
    public a m;
    public a n;
    public d o;
    public c p;
    public Map q;
    public m r;
    public List s;
    public String t;
    public p u;
    public boolean v;
    public boolean w;
    public int x;
    public String y;
    public int z;
    public static Boolean S;
    public static Boolean T;

    public void TKContainer(Activity p0,ViewGroup p1,String p2,String p3,h p4){
       TKContainer tKContainer = TKContainer.class;
       super();
       this.d = new a();
       this.e = null;
       this.o = new c();
       boolean b = false;
       this.v = b;
       this.w = b;
       this.x = -1;
       this.y = "";
       this.z = -1;
       this.C = null;
       this.D = null;
       this.E = b;
       this.F = b;
       this.G = b;
       this.J = new ArrayList();
       this.K = new ArrayList();
       this.L = b;
       this.M = b;
       this.N = b;
       this.O = true;
       this.P = null;
       this.h = p2;
       this.y = UUID.randomUUID().toString();
       Boolean c = a.c;
       if (c.booleanValue()) {
          d.p().i(p2, this.y, "createContainer");
       }
       a.i("TKContainer", "container init, bundleId: "+p2);
       if (!x.c()) {
          a.d(null, new Throwable("create TKContainer in subThread, bundleId: "+p2));
       }else {
          Boolean obj = PatchProxy.apply(null, this, tKContainer, "71");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(TKContainer.S == null && e.b().d() != null){
             TKContainer.S = Boolean.valueOf(e.b().d().d("isTKUseChoreographer", b));
          }
          obj = TKContainer.S;
          if (obj != null && obj.booleanValue()) {
             b = true;
          }
          if (b) {
             this.P = Choreographer.getInstance();
          }
       }
       if (p0 != null) {
          this.f = new WeakReference(p0);
       }
       this.g = p1;
       this.i = p3;
       this.k = p4;
       String str = "2";
       if (p4 != null) {
          p4.f = this.y;
          p4.m(p3);
          TKContainer tk = this.k;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(null, tk, h.class, str)) {
             tk.a = System.currentTimeMillis();
          }
       }
       if (!PatchProxy.applyVoid(null, this, tKContainer, "31") && TKContainer.L()) {
          if (this.Q == null) {
             this.Q = new WeakReference(this);
          }
          b uob = b.a();
          tKContainer = this.Q;
          Objects.requireNonNull(uob);
          if (PatchProxy.applyVoidTwoRefs(p2, tKContainer, uob, b.class, str) || (!TextUtils.isEmpty(p2) && tKContainer != null)) {
             Set set = uob.a.get(p2);
             if (set == null) {
                set = new HashSet();
             }
             set.add(tKContainer);
             uob.a.put(p2, set);
          }
       label_015f :
          this.R = new a(this);
       }
       if (c.booleanValue()) {
          str = V8Trace.createTraceTag(p3, p2, this.y, null, null);
          this.H = str;
          V8Trace.traceLog(str, "construct: activity= "+p0);
          d.p().l(p2, this.y, "createContainer");
       }
       return;
    }
    public static void D(TKContainer p0){
       w d;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, TKContainer.class, "42")) {
       }else if(p0.b != null){
          d = p0.b.d;
       }else {
          d = -1;
       }
       a.i("TKContainer", "onDestroy, bundleId: "+p0.h+", versionCode: "+d+", sessionId: "+p0.y);
       d.e(p0);
       TKContainer m = p0.m;
       if (m != null) {
          m.b(p0.h);
       }
       p0.d.dispose();
       if (p0.c != null) {
          a.e().a(p0.x, true);
          m = p0.k;
          if (m != null) {
             m.k(false);
          }
          p0.c.h();
       }
       p0.g = null;
       p0.P = null;
       return;
    }
    public static boolean L(){
       Object obj = PatchProxy.apply(null, null, TKContainer.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!e.b().e()) {
          return b;
       }
       if (!e.b().f() && c.a().u3()) {
          b = true;
       }
       return b;
    }
    public static String R(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TKContainer.class, "66");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String stackTraceSt = Log.getStackTraceString(p0);
       if (!TextUtils.isEmpty(stackTraceSt)) {
          stackTraceSt = ((stackTraceSt.trim()).replaceAll("\t", "")).replaceAll("\n", "#");
       }
       return stackTraceSt;
    }
    public static boolean X(){
       Boolean obj = PatchProxy.apply(null, null, TKContainer.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (TKContainer.T == null && e.b().d() != null) {
          TKContainer.T = Boolean.valueOf(e.b().d().d("isSupportConstructorBridge", b));
          a.i("TKContainer", "isSupportConstructorBridge "+TKContainer.T);
       }
       obj = TKContainer.T;
       if (obj != null && !obj.booleanValue()) {
          b = false;
       }
       return b;
    }
    public boolean A(){
       Object obj = PatchProxy.apply(null, this, TKContainer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.U(null);
    }
    public void B(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer.class, "3")) {
          return;
       }
       a.i("TKContainer", "syncRender, bundleId: "+this.h);
       if (a.c.booleanValue()) {
          V8Trace.traceLog(this.H, "syncRender");
       }
       String str = UUID.randomUUID().toString();
       TKContainer tk = this.k;
       if (tk != null) {
          tk.n(false);
          this.k.s(true);
          i oi = new i();
          oi.e();
          this.k.z.put(str, oi);
       }
       this.j0(false, p0, str);
       return;
    }
    public void C(boolean p0,r p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, tKContainer, "22")) {
          return;
       }
       UUID uUID = null;
       if (!p0) {
          uUID = UUID.randomUUID().toString();
          if (this.k != null) {
             i oi = new i();
             oi.e();
             this.k.z.put(uUID, oi);
          }
       }
       UUID uUID1 = uUID;
       if (TextUtils.isEmpty(this.h)) {
          if (p1 != null) {
             p1.a(3005, new Throwable("empty bundleId"));
             TKContainer tk = this.k;
             if (tk != null) {
                tk.j(this.h, 0, 3005, "empty bundleId", uUID1);
             }
          }
          return;
       }else if(a.c.booleanValue()){
          V8Trace.traceLog(this.H, "render: isNeedCreateView = "+p0);
       }
       if (this.c == null) {
          TKContainer tm = this.m;
          if (tm != null) {
             tm.a(this.h, this.b, this.i);
          }
          if (p1 != null) {
             p1.a(2003, new Throwable("context is null"));
          }
          return;
       }else {
          tKContainer = this.n;
          if (tKContainer != null && tKContainer.e(this.h)) {
             this.n.c(this.t, this.h, new a(this, p1, p0, uUID1));
             return;
          }else {
             this.c0(this.c, p1, p0, uUID1);
             return;
          }
       }
    }
    public void E(ViewGroup p0,w p1,String p2){
       c this;
       Class[] uClassArray;
       Object[] objArray1;
       w ow = p1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKContainer.class, "67")) {
          return;
       }
       if (c.a().B3()) {
          Activity uActivity = this.P();
          w b = ow.b;
          String str = String.valueOf(ow.d);
          boolean b1 = c.a().E3();
          this = c.class;
          String str1 = String.class;
          if (PatchProxy.isSupport(this)) {
             Object[] objArray = new Object[]{uActivity,p0,b,p2,str,Boolean.valueOf(b1)};
             if (!PatchProxy.applyVoid(objArray, null, this, "11")) {
             }
          }else {
          }
       }
    label_009a :
       return;
    }
    public void G(n p0,boolean p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKContainer, "21")) {
          return;
       }
       if (!g.b().c()) {
          int i = (this.W())? 2001: 2000;
          this.Y(p0, i, new Throwable("v8 has not init success"), p1);
          return;
       }else if(a.c.booleanValue()){
          V8Trace.traceLog(this.H, "asyncInit");
          d.p().i(this.h, this.y, "asyncInitContext");
       }
       tKContainer = this.k;
       if (tKContainer != null) {
          tKContainer.a();
          this.k.u(this.B);
          this.k.q(false);
       }
       this.d.c(g.b().a(this.H, this.P(), this.B, this.h, null, new TKContainer$j(this, p0, p1)).R(new g(this, p0), new h(this, p0, p1)));
       return;
    }
    public void H(long p0,n p1,boolean p2){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), this, TKContainer.class, "20")) {
          return;
       }
       if (a.c.booleanValue()) {
          V8Trace.traceLog(this.H, "asyncInitContext: waitTKInitTime = "+p0);
       }
       TKContainer tk = this.k;
       if (tk != null && !p2) {
          tk.v(p0);
       }
       if (!p0 - null || g.b().c()) {
          this.G(p1, p2);
          return;
       }else {
          b uob = this.b0(p0, new TKContainer$i(this, p1, p2));
          this.e = uob;
          if (uob != null) {
             this.d.c(uob);
          }
          return;
       }
    }
    public final void I(boolean p0,c p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, tKContainer, "15")) {
          return;
       }
       if (this.o == null) {
          if (p1 != null) {
             p1.b(3016, new Throwable("Bundle Provider is null"));
          }
          return;
       }else {
          tKContainer = this.k;
          if (tKContainer != null) {
             tKContainer.b();
          }
          tKContainer = this.n;
          if (tKContainer != null && tKContainer.e(this.h)) {
             this.n.c(this.t, this.h, new c(this, p0, p1));
             return;
          }else {
             this.J(p0, p1);
             return;
          }
       }
    }
    public final void J(boolean p0,c p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, tKContainer, "55")) {
          return;
       }
       b uob = this.o.b(this.h, this.z, new TKContainer$m(this, p1, p0));
       if (uob != null) {
          this.d.c(uob);
       }
    label_0034 :
       return;
    }
    public final void K(boolean p0,long p1,r p2,String p3){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Long.valueOf(p1), p2, p3, this, TKContainer.class, "7")) {
          return;
       }
       TKContainer tk = this.k;
       if (tk != null) {
          tk.v(p1);
       }
       if (this.c == null) {
          TKContainer$v ov = new TKContainer$v(this, p0, p2, p3);
          if (this.E != null) {
             this.C = ov;
             if (this.c != null) {
                this.D = null;
                this.M(p0, p2, p3);
             }
          }else if(this.c != null){
             this.M(p0, p2, p3);
          }else {
             this.d(p1, ov);
          }
       }
       if (this.b == null) {
          TKContainer$w ow = new TKContainer$w(this, p0, p2, p3);
          if (this.F != null) {
             this.D = ow;
             if (this.b != null) {
                this.D = null;
                this.M(p0, p2, p3);
             }
          }else if(this.b != null){
             this.M(p0, p2, p3);
          }else if(PatchProxy.applyVoidOneRefs(ow, this, TKContainer.class, "14")){
             this.I(false, ow);
          }
       }
       this.M(p0, p2, p3);
       return;
    }
    public void M(boolean p0,r p1,String p2){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, TKContainer.class, "11")) {
          return;
       }
       if (this.c == null || (this.b != null && !this.isDestroyed())) {
          if (this.G == null && this.w != null) {
             return;
          }else if(this.G != null){
             this.N(p0, p1, p2);
          }else {
             boolean[] uobooleanArr = new boolean[]{false};
             TKContainer$g og = new TKContainer$g(this, uobooleanArr, p0, p1, p2);
             if (this.B != null) {
                d.b(this.c.g(), this.c.c(), this.b, false, v7);
             }else {
                d.c(this.c.g(), this.c.c(), this.b, false, v7);
             }
          }
       }
       return;
    }
    public void N(boolean p0,r p1,String p2){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, TKContainer.class, "12")) {
          return;
       }
       if (this.isDestroyed()) {
          return;
       }
       TKContainer$h oh = new TKContainer$h(this, p1, p0);
       if (this.G != null) {
          a.b(false, this.c.c()).execute(new k(this, p0, oh, p2));
       }else {
          this.i(this.b, p0, oh, p2);
       }
       return;
    }
    public void O(e$a p0,o p1,String p2,String p3,Object[] p4){
       int i;
       TKContainer h;
       String str;
       object oobject5;
       i oi1;
       Throwable throwable1;
       String str1;
       int i4;
       boolean b = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       i oi = i.class;
       TKContainer tKContainer = TKContainer.class;
       i = 4;
       int i1 = 3;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(tKContainer)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, b, tKContainer, "26")) {
             return;
          }
       }
       if (this.isDestroyed()) {
          return;
       }else {
          Boolean c = a.c;
          if (c.booleanValue()) {
             h = b.H;
             str = "createView: key = "+oobject3+", args[0] = ";
             oobject5 = (oobject4 != null && oobject4.length > 0)? oobject4[i3]: "null";
             V8Trace.traceLog(h, str+oobject5);
          }
          if (TextUtils.isEmpty(p2)) {
             oobject2 = UUID.randomUUID().toString();
             oi1 = new i();
             h = b.k;
             if (h != null) {
                h.z.put(oobject2, oi1);
             }
          }else {
             oi1 = b.T(oobject2);
          }
          oobject5 = oobject2;
          i oi2 = oi1;
          str = "3";
          Object[] objArray1 = null;
          if (b.k != null && oi2 != null) {
             if (!PatchProxy.applyVoid(objArray1, oi2, oi, str)) {
                oi2.d = System.currentTimeMillis();
             }
             oi2.f(oobject3);
             oi2.f = b.O;
             b.k.o(oobject3);
          }
          b.O = i3;
          if (b.u != null) {
             d.e(this);
          }
          Throwable throwable = new Throwable("createView fail, viewKey: "+oobject3);
          d uod = b.c.e();
          long l = 0;
          if (c.booleanValue()) {
             if (c.a().t3()) {
                b.c.g().currentState = 3;
                throwable1 = throwable;
                str1 = str;
                d.p().h(b.c.g(), oobject3, "createView_"+b.I);
             }else {
                throwable1 = throwable;
                str1 = str;
                l = System.nanoTime();
             }
          }else {
             throwable1 = throwable;
             str1 = str;
          }
          if (TKContainer.X()) {
             uod.h().b(null);
             d$b$a uob$a = uod.h().a();
             if (PatchProxy.applyVoidTwoRefs(uob$a, oobject, b, tKContainer, "25") || (oobject != null && uob$a != null)) {
                uob$a.b = new f(b, oobject);
             }
          }
          TKViewContainer tKViewContai = b.c.a(oobject3, oobject4);
          tKViewContai.setViewSessionID(oobject5);
          tKViewContai.setTraceReporter(b.k);
          if (c.booleanValue()) {
             if (c.a().t3()) {
                tKViewContai.setViewContainerIndex(b.I);
                b.I = b.I + 1;
                d.p().k(b.c.g());
                b.c.g().currentState = 4;
             }else {
                System.out.println("V8Trace createView ["+b.h+"]["+oobject3+"] cost "+((float)((System.nanoTime() - l) / 1000) / 1000.00f));
             }
          }
          if (b.k == null || (oi2 && !PatchProxy.applyVoid(null, oi2, oi, "4"))) {
             oi2.e = System.currentTimeMillis();
          }
       label_01da :
          throwable = throwable1;
          if (tKViewContai != null) {
             if (b.u != null) {
                d.c(this);
             }
             if (TKContainer.X()) {
                try{
                   d$b$a b1 = uod.h().a().b;
                   if (PatchProxy.applyVoidTwoRefs(oobject, b1, tKViewContai, TKViewContainer.class, "7") || (oobject != null && b1 != null)) {
                      tKViewContai.k = oobject;
                      TKViewContainer j = tKViewContai.j;
                      if (j != null) {
                         j.setIJS2NativeInvoker(b1);
                      }
                      tKViewContai.g(oobject);
                   }
                }catch(java.lang.Exception e0){
                   a.e(uod, e0, "create view set invoker fail");
                }
             }else {
                tKViewContai.setIJS2NativeInvoker(oobject);
             }
          }else if(oobject1 != null){
             oobject1.b(-1, throwable, b.b);
          }
          TKContainer k = b.k;
          if (k != null) {
             TKContainer h1 = b.h;
             Object obj = PatchProxy.applyOneRefs(throwable, b, tKContainer, "29");
             if (obj != PatchProxyResult.class) {
                i4 = obj.intValue();
             }else {
                oobject3 = 4002;
                if (throwable instanceof CreateViewFailException && !throwable.getErrorType()) {
                   oobject3 = 4003;
                }
                i4 = oobject3;
             }
             k.j(h1, 0, i4, TKContainer.R(throwable), oobject5);
          }
          if (TKContainer.X()) {
             d$b uob = uod.h();
             Objects.requireNonNull(uob);
             if (PatchProxy.apply(null, uob, d$b.class, str1) != PatchProxyResult.class) {
             }else {
                uob.b.pop();
             }
          }
          return;
       }
    }
    public Activity P(){
       TKContainer obj = PatchProxy.apply(null, this, TKContainer.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          return obj.get();
       }
       return null;
    }
    public String Q(){
       return this.h;
    }
    public String S(){
       Object obj = PatchProxy.apply(null, this, TKContainer.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TKContainer:->"+this.i;
    }
    public final i T(String p0){
       TKContainer obj = PatchProxy.applyOneRefs(p0, this, TKContainer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          obj = this.k;
          if (obj != null) {
             return obj.z.get(p0);
          }
       }
       return null;
    }
    public boolean U(n p0){
       TKContainer k;
       TKContainer h;
       TKContainer tKContainer;
       t ot1;
       d uod;
       t ot = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj1 = PatchProxy.applyOneRefs(obj, ot, TKContainer.class, "17");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (!g.b().c()) {
          int i = (this.W())? 2001: 2000;
          Throwable throwable = new Throwable("v8 has not init success");
          if (obj != null) {
             obj.b(i, throwable);
          }
          k = ot.k;
          if (k != null) {
             k.j(ot.h, 0, i, Log.getStackTraceString(throwable), null);
          }
          return b;
       }else {
          obj1 = a.c;
          String str = "initContext";
          if (obj1.booleanValue()) {
             V8Trace.traceLog(ot.H, str);
             d.p().i(ot.h, ot.y, str);
          }
          k = ot.k;
          boolean b1 = true;
          if (k != null) {
             k.a();
             ot.k.u(ot.B);
             ot.k.q(b1);
          }
          if (ot.g == null) {
             g og = g.b();
             Activity uActivity = this.P();
             TKContainer b2 = ot.B;
             h = ot.h;
             Objects.requireNonNull(og);
             if (PatchProxy.isSupport(g.class)) {
                tKContainer = h;
                ot1 = PatchProxy.applyThreeRefs(uActivity, Boolean.valueOf(b2), h, og, g.class, "11");
                if (ot1 != patchProxyRe) {
                }else if(!og.c()){
                   ot1 = null;
                }else if(uActivity == null){
                   uod = e.b().j(b2, a.a(b2, tKContainer), tKContainer);
                }else {
                   uod = e.b().i(uActivity, b2, a.a(b2, tKContainer), tKContainer);
                }
                ot1 = new t(uod);
             }else {
                tKContainer = h;
                goto label_00b0 ;
             }
             ot.c = ot1;
          }else {
             ot.c = g.b().e(this.P(), ot.B, ot.h, ot.g);
          }
          boolean b3 = (ot.c != null)? true: false;
          if (b3) {
             ot.f0(ot.c);
             ot.x = ot.c.hashCode();
             a.e().f(ot.x, ot.h, b1);
             tKContainer = ot.k;
             if (tKContainer != null) {
                tKContainer.c();
                ot.k.t(ot.c.f());
                ot.k.k(b1);
                ot.k.p(h.B);
             }
          }
          if (obj1.booleanValue()) {
             d.p().l(ot.h, ot.y, str);
          }
          if (h.B && b3) {
             h.B = false;
          }
          if (!b3) {
             Throwable throwable1 = new Throwable("context init fail");
             if (obj != null) {
                obj.b(2003, throwable1);
             }
             k = ot.k;
             if (k != null) {
                k.j(ot.h, 0, 2003, Log.getStackTraceString(throwable1), null);
             }
          }
          return b3;
       }
    }
    public final Object V(boolean p0,String p1,String p2,String p3,h p4){
       Iterator obj;
       Object obj3;
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, tKContainer, "46");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (a.c.booleanValue()) {
          tKContainer = this.H;
          StringBuilder str = "invokeNative: ";
          String str1 = (p0)? p1: "";
          V8Trace.traceLog(tKContainer, str+str1+"_"+p2+", jsonData = "+p3);
       }
       tKContainer = this.l;
       if (tKContainer != null) {
          Object obj1 = (p0)? tKContainer.b(p1, p2, p3, p4): tKContainer.a(p2, p3, p4);
          return obj1;
       }else {
          tKContainer = this.s;
          Object obj2 = null;
          if (tKContainer != null && !tKContainer.isEmpty()) {
             obj = this.s.iterator();
             while (obj.hasNext()) {
                l ol = obj.next();
                if (ol == null) {
                   continue ;
                }else if(p0){
                   obj3 = ol.b(p1, p2, p3, p4);
                }else {
                   obj3 = ol.a(p2, p3, p4);
                }
                if (obj3 != null) {
                   obj2 = obj3;
                   break ;
                }
             }
          }
          return obj2;
       }
    }
    public abstract boolean W();
    public void Y(n p0,int p1,Throwable p2,boolean p3){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, TKContainer.class, "56")) {
          return;
       }
       if (this.isDestroyed()) {
          return;
       }
       if (p0 != null) {
          p0.b(p1, p2);
       }
       if (!p3) {
          TKContainer tk = this.k;
          if (tk != null) {
             tk.j(this.h, 0, p1, TKContainer.R(p2), null);
          }
       }
       return;
    }
    public void Z(Throwable p0,int p1,r p2){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, TKContainer.class, "64")) {
          return;
       }
       if (p2 != null) {
          x.b(new b(p2, p0));
       }
       j oj = e.b().g();
       if (oj != null) {
          oj.e(this.S(), p0.getMessage(), p0);
       }
       return;
    }
    public final Object a(String p0,String p1,h p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TKContainer.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V(false, null, p0, p1, p2);
    }
    public void a0(boolean p0){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKContainer, "2")) {
          return;
       }
       if (this.b != null && this.c != null) {
          TKContainer$q oq = new TKContainer$q(this);
          if (this.B != null) {
             d.b(this.c.g(), this.c.c(), this.b, p0, oq);
          }else {
             d.c(this.c.g(), this.c.c(), this.b, p0, oq);
          }
       }
       return;
    }
    public Object b(String p0,String p1,String p2,h p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TKContainer.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V(true, p0, p1, p2, p3);
    }
    public abstract b b0(long p0,b p1);
    public void c(String p0){
       this.t = p0;
    }
    public final void c0(t p0,r p1,boolean p2,String p3){
       TKContainer tk1;
       String str1;
       v b1;
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, TKContainer.class, "57")) {
          return;
       }
       TKContainer$n on = new TKContainer$n(this, p2, p1, p3);
       if (!PatchProxy.applyVoidTwoRefs(p0, on, this, tKContainer, "59")) {
          String str = "load bundle fail";
          boolean b = true;
          if (this.v != null) {
             if (!PatchProxy.applyVoidTwoRefs(p0, on, this, tKContainer, "62")) {
                Throwable throwable = new Throwable(str);
                TKContainer tk = this.k;
                if (tk != null) {
                   tk.b();
                }
                v ov = new v();
                tKContainer = this.o;
                if (tKContainer != null) {
                   this.b = tKContainer.a(this.h, this.z, b, new e(ov));
                }
                if (this.b != null && !TextUtils.isEmpty(this.b.a)) {
                   tk1 = this.k;
                   if (tk1 != null) {
                      tk1.d();
                      this.k.l(this.b);
                   }
                   this.d0(p0, on);
                }else if(TextUtils.isEmpty(ov.c)){
                   str1 = "bundle is null";
                }else {
                   b1 = ov.c;
                }
                Throwable throwable1 = new Throwable(str1);
                b1 = ov.b;
                if (b1 == null) {
                   b1 = 3010;
                }
                this.Z(throwable1, b1, on);
             }
          }else if(PatchProxy.applyVoidTwoRefs(p0, on, this, tKContainer, "60")){
             Throwable[] throwableArr = new Throwable[b];
             int i = 0;
             throwableArr[i] = new Throwable(str);
             tk1 = this.k;
             if (tk1 != null) {
                tk1.b();
             }
             tk1 = this.o;
             if (tk1 != null) {
                this.d.c(tk1.b(this.h, this.z, new a(this, p0, throwableArr, on)));
             }else {
                this.Z(throwableArr[i], 3016, on);
             }
          }
       }
       return;
    }
    public void d(long p0,n p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, tKContainer, "19")) {
          return;
       }
       this.H(p0, p1, false);
       return;
    }
    public final void d0(t p0,r p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer.class, "63")) {
          return;
       }
       String str = "0.9.26";
       String str1 = "bundleId:"+this.b.b+", bundleVersionCode:"+this.b.d+", engineVersion:"+str;
       if (a.c.booleanValue()) {
          V8Trace.traceLog(this.H, "runJS: bundleVersionCode = "+this.b.d+", engineVersion = "+str);
       }
       p0.j(this.b, this.i);
       TKContainer tm = this.m;
       if (tm != null) {
          tm.a(this.h, this.b, this.i);
       }
       tm = this.n;
       if (tm != null && tm.e(this.h)) {
          x.b(new j(this, str1));
       }
       TKContainer tk = this.k;
       if (tk != null) {
          tk.y = h.D;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(null, tk, h.class, "7")) {
             tk.a.j = System.currentTimeMillis();
          }
       }
       p0.b(this.H, this.b.b, this.b.d, this.b.a, this.b.b, this.b.e, new TKContainer$o(this, p1));
       return;
    }
    public void e(String p0,Map p1){
    }
    public void e0(e$a p0,String p1,Object[] p2,e p3,e p4){
       Object[] objArray;
       a obj;
       TKContainer tKContainer = this;
       object oobject = p4;
       TKContainer tKContainer1 = TKContainer.class;
       boolean i = 4;
       boolean i1 = 3;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(tKContainer1)) {
          objArray = new Object[i3];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[i2] = p2;
          objArray[i1] = p3;
          objArray[i] = oobject;
          if (PatchProxy.applyVoid(objArray, this, tKContainer1, "36")) {
             return;
          }
       }
       TKContainer r = tKContainer.R;
       if (r == null) {
          return;
       }else {
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             objArray = new Object[i3];
             objArray[0] = p0;
             objArray[1] = p1;
             objArray[i2] = p2;
             objArray[i1] = p3;
             objArray[i] = oobject;
             if (!PatchProxy.applyVoid(objArray, r, uoa, "8")) {
             label_004d :
                if (r.a() && !TextUtils.isEmpty(p1)) {
                   uoa = (oobject == null)? new a(p1, p2, p0, p3, false): new a(p1, p2, p0, p3, p4);
                   if (r.a == null) {
                      r.a = new LinkedList();
                   }
                   if (r.c != null && r.b == null) {
                      r.b = new LinkedList();
                   }
                   uoa = r.c;
                   a b = (uoa != null)? r.b: r.a;
                   if (uoa == null && oobject != null) {
                      Iterator iterator = b.iterator();
                      while (iterator.hasNext()) {
                         a uoa1 = iterator.next();
                         if (uoa1 != null) {
                            obj = PatchProxy.applyOneRefs(oobject, uoa1, a.class, "2");
                            if (obj != PatchProxyResult.class) {
                               i1 = obj.booleanValue();
                            }else {
                               obj = uoa1.d;
                               i1 = (obj == null || (obj.get() != null && oobject == uoa1.d.get()))? true: false;
                            }
                            if (i1) {
                            label_0107 :
                               iterator.remove();
                            }
                         }
                         Objects.requireNonNull(uoa1);
                         obj = PatchProxy.apply(null, uoa1, a.class, "3");
                         if (obj != PatchProxyResult.class) {
                            i = obj.booleanValue();
                         }else {
                            obj = uoa1.c;
                            if (obj == null || obj.get() == null) {
                               uoa1 = uoa1.d;
                               if (uoa1 == null || uoa1.get() == null) {
                                  i = false;
                               }
                            }
                            i = true;
                         }
                         if (!i) {
                            goto label_0107 ;
                         }
                      }
                   }
                   b.add(v13);
                }
             }
          }else {
             goto label_004d ;
          }
          return;
       }
    }
    public e f(e$a p0,o p1,String p2,Object[] p3){
       TKContainer tKContainer = this;
       String str = p2;
       TKContainer obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, TKContainer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.i("TKContainer", "syncCreateView, bundleId: "+tKContainer.h+", viewKey: "+str);
       if (a.c.booleanValue()) {
          V8Trace.traceLog(tKContainer.H, "syncCreateView: key = "+str);
       }
       String str1 = UUID.randomUUID().toString();
       obj = tKContainer.k;
       if (obj != null) {
          obj.n(true);
          tKContainer.k.s(true);
          tKContainer.k.o(str);
          i oi = new i();
          oi.e();
          oi.f(str);
          tKContainer.k.z.put(str1, oi);
       }
       e[] uoeArray = new e[true];
       uoeArray[0] = null;
       TKContainer$t ot = new TKContainer$t(this, uoeArray, p1, str);
       if (tKContainer.w != null) {
          this.O(p0, ot, str1, p2, p3);
       }else {
          TKContainer$u ou = new TKContainer$u(this, p0, ot, str1, p2, p3, p1);
          this.j0(true, v14, str1);
       }
       this.e0(p0, p2, p3, uoeArray[0], null);
       return uoeArray[0];
    }
    public void f0(t p0){
       CustomEnv value;
       c uoc;
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer.class, "65")) {
          return;
       }
       TKContainer ty = this.y;
       Objects.requireNonNull(p0);
       String str = "1";
       if (!PatchProxy.applyVoidOneRefs(ty, p0, ot, "3")) {
          t a = p0.a;
          if (a != null) {
             int i = a.hashCode();
             uoc = c.class;
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), ty, null, uoc, str)) {
                if (ty == null) {
                   ty = "";
                }
                c.a.put(Integer.valueOf(i), ty);
             }
          }
       }
       p0.i(this.h);
       p0.k(this);
       ty = this.p;
       if (ty != null && !PatchProxy.applyVoidOneRefs(ty, p0, ot, "5")) {
          f uof = f.a();
          uoc = p0.a.b();
          r or = new r(p0, ty);
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoidTwoRefs(uoc, or, uof, f.class, "2") && uoc != null) {
             uof.a.put(uoc, or);
          }
       }
       ty = this.j;
       if (ty != null && (!PatchProxy.applyVoidOneRefs(ty, p0, ot, "4") && ty != null)) {
          Network.setRequestDelegate(p0.a, new q(p0, ty));
       }
    label_009b :
       ty = this.r;
       if (ty != null && (!PatchProxy.applyVoidOneRefs(ty, p0, ot, str) && ty != null)) {
          Network.registerTKEventListener(p0.a, new p(p0, ty));
       }
    label_00b3 :
       ty = this.G;
       if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ty), p0, ot, "17")) {
          p0.h = ty;
       }
       if (this.q != null) {
          TKContainer tc = this.c;
          ty = this.q;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(ty, tc, ot, "22") && ty != null) {
             HashMap hashMap = new HashMap();
             if (!ty.isEmpty()) {
                Iterator iterator = ty.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (uEntry != null) {
                      str = uEntry.getKey();
                      value = uEntry.getValue();
                      if (TextUtils.isEmpty(str) || value == null) {
                         continue ;
                      }
                   }
                   hashMap.put(str, new CustomEnv(value.value, value.isMutable));
                }
             }
             tc.k = hashMap;
          }
       }
       return;
    }
    public void g(int p0){
       this.z = p0;
    }
    public void g0(a p0){
       this.n = p0;
    }
    public V8JsonProxyObject h(Serializable p0){
       V8JsonProxyObject obj = PatchProxy.applyOneRefs(p0, this, TKContainer.class, "68");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (this.c.g() == null) {
          return obj;
       }
       if (V8.getHandler() == null) {
          V8.setLooper(a.b().a().getLooper());
       }
       return V8JSONProxy.composeJsonObjectForSerializable(this.c.g(), p0);
    }
    public TKViewContainerWrapView h0(long p0,TKViewContainerWrapView p1,e$a p2,TKViewContainerWrapView$a p3,String p4,Object[] p5){
       i obj;
       String str2;
       boolean b;
       w ow = this;
       object oobject = p4;
       TKContainer tKContainer = TKContainer.class;
       int i = 1;
       if (PatchProxy.isSupport(tKContainer)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,oobject,p5};
          obj = PatchProxy.apply(objArray, ow, tKContainer, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.i("TKContainer", "syncCreateViewWithAsyncTry, bundleId: "+ow.h+", viewKey: "+oobject);
       if (a.c.booleanValue()) {
          V8Trace.traceLog(ow.H, "syncCreateViewWithAsyncTry: waitTKInitTime = "+p0+", key = "+oobject);
       }else {
          int i1 = p0;
       }
       String str = UUID.randomUUID().toString();
       tKContainer = ow.k;
       if (tKContainer != null) {
          tKContainer.n(i);
          ow.k.o(oobject);
          ow.k.s(0);
          obj = new i();
          obj.e();
          obj.f(oobject);
          ow.k.z.put(str, obj);
       }
       TKContainer$d uod = new TKContainer$d(this, p1, p3, p2, p4, p5);
       if (ow.w != null) {
          this.O(p2, v8, str, p4, p5);
       }else {
          TKContainer$e uoe = v7;
          TKContainer$e uoe1 = v7;
          TKContainer$e uoe2 = uoe1;
          String str1 = str;
          uoe = new TKContainer$e(this, p2, v8, str, p4, p5, p3, p1);
          if (ow.M == null && ow.b == null) {
             c uoc = null;
             try{
                ow.b = ow.i0(0, uoc);
             }catch(java.lang.Exception e0){
                a.i("TKContainer", "syncCreateViewWithAsyncTry: sync load error bundle id "+ow.h+"exception "+e0.getMessage());
             }
          }
       }
    label_014c :
       return p1;
    }
    public void i(w p0,boolean p1,r p2,String p3){
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, TKContainer.class, "23")) {
          return;
       }
       if (p0 != null) {
          this.b = p0;
       }
       if (this.b == null) {
          if (p2 != null) {
             p2.a(3001, new Throwable("bundle is null"));
             TKContainer tk = this.k;
             if (tk != null) {
                tk.j(this.h, 0, 3001, "bundle is null", p3);
             }
          }
          return;
       }else if(a.c.booleanValue()){
          V8Trace.traceLog(this.H, "renderWithoutLoadBundle: isNeedCreateView = "+p1);
       }
       TKContainer tk1 = this.k;
       if (tk1 != null) {
          tk1.l(this.b);
       }
       if (this.c == null) {
          tk1 = this.m;
          if (tk1 != null) {
             tk1.a(this.h, this.b, this.i);
          }
          if (p2 != null) {
             p2.a(2003, new Throwable("context is null"));
          }
          return;
       }else {
          this.d0(this.c, new TKContainer$l(this, p1, p3, p2));
          return;
       }
    }
    public w i0(boolean p0,c p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, tKContainer, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.o == null) {
          if (p1 != null) {
             p1.b(3010, new Throwable("bundle service is null"));
          }
          return null;
       }else {
          tKContainer = this.k;
          if (tKContainer != null) {
             tKContainer.b();
          }
          w ow = this.o.a(this.h, this.z, p0, p1);
          if (ow == null) {
             return null;
          }else {
             this.b = ow;
             TKContainer tk = this.k;
             if (tk != null) {
                tk.d();
                this.k.l(this.b);
             }
             return this.b;
          }
       }
    }
    public boolean isDestroyed(){
       Object obj = PatchProxy.apply(null, this, TKContainer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.A != null) {
          a.i("TKContainer", "container is destroyed");
       }
       return this.A;
    }
    public void j(q p0){
       this.j = p0;
    }
    public final void j0(boolean p0,r p1,String p2){
       int this;
       if (PatchProxy.isSupport(TKContainer.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, TKContainer.class, "4")) {
          return;
       }
       if (this.b == null) {
          v ov = new v();
          this.b = this.i0(true, new d(ov));
          if (this.b == null) {
             String str = (TextUtils.isEmpty(ov.c))? "bundle is null": ov.c;
             String str1 = str;
             Throwable throwable = new Throwable(str1);
             ov = ov.b;
             this = (ov == null)? 3010: ov;
             a.i("TKContainer", "sync load bundle fail, error code is "+this+", error msg is "+str1);
             if (p1 != null) {
                p1.a(this, throwable);
             }
             TKContainer tk = this.k;
             if (tk != null) {
                tk.j(this.h, 0, this, str1, p2);
             }
             return;
          }
       }
       if (this.c == null) {
          TKContainer te = this.e;
          if (te != null && !te.isDisposed()) {
             this.e.dispose();
          }
          this.E = false;
          this.U(new TKContainer$r(this, p1));
          if (this.c == null) {
             return;
          }
       }
       this.i(this.b, p0, new TKContainer$s(this, p1, p0), p2);
       return;
    }
    public void k(e$a p0,o p1,String p2,Object[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TKContainer.class, "24")) {
          return;
       }
       this.O(p0, p1, null, p2, p3);
       return;
    }
    public void k0(h p0,String p1){
       int i;
       c l1;
       h oh = h.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer.class, "58")) {
          return;
       }
       V8 v8 = this.c.g();
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(v8, p0, oh, "16") && v8 != null) {
          p0.p = v8.getJsonNotLoadNum();
          p0.q = v8.getPropCallCostTime();
          v8.clearJsonNotLoadNum();
          v8.clearPropCallCostTime();
       }
       i oi = this.T(p1);
       Object[] objArray = null;
       if (oi != null && !PatchProxy.applyVoid(objArray, oi, i.class, "2")) {
          oi.c = System.currentTimeMillis();
       }
       TKContainer tc = this.c;
       Objects.requireNonNull(tc);
       Object obj = PatchProxy.apply(objArray, tc, ot, "20");
       int b = (obj != patchProxyRe)? obj.booleanValue(): tc.a.b().i;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), p0, oh, "1")) {
          p0.s = Boolean.valueOf(b);
       }
       p0.t = this.c.d();
       tc = this.c;
       Objects.requireNonNull(tc);
       obj = PatchProxy.apply(objArray, tc, ot, "23");
       b = (obj != patchProxyRe)? obj.intValue(): tc.a.b().k;
       p0.u = b;
       tc = this.c;
       Objects.requireNonNull(tc);
       obj = PatchProxy.apply(objArray, tc, ot, "24");
       b = (obj != patchProxyRe)? obj.intValue(): tc.a.b().l;
       p0.v = b;
       tc = this.c;
       Objects.requireNonNull(tc);
       obj = PatchProxy.apply(objArray, tc, ot, "25");
       long l = (obj != patchProxyRe)? obj.longValue(): tc.a.b().m;
       p0.w = l;
       tc = this.c;
       Objects.requireNonNull(tc);
       Object obj1 = PatchProxy.apply(objArray, tc, ot, "26");
       i = (obj1 != patchProxyRe)? obj1.intValue(): tc.a.b().n;
       p0.x = i;
       p0.j(this.h, 1, -1, "", p1);
       if (!PatchProxy.applyVoidOneRefs(p1, p0, oh, "19") && p0.k != null) {
          c.a(new e(p0, p1));
       }
       return;
    }
    public void l(l p0){
       this.t(p0);
    }
    public void m(Throwable p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKContainer.class, "47")) {
          return;
       }
       if (this.u != null && (!TextUtils.isEmpty(this.h) && (p1 != null && (this.h).equals(p1.b)))) {
          this.u.m(p0, p1);
       }
    label_0028 :
       return;
    }
    public void n(long p0,e$a p1,o p2,String p3,Object[] p4){
       TKContainer tKContainer = this;
       object oobject = p3;
       TKContainer tKContainer1 = TKContainer.class;
       int i = 0;
       if (PatchProxy.isSupport(tKContainer1)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,oobject,p4};
          if (PatchProxy.applyVoid(objArray, this, tKContainer1, "8")) {
             return;
          }
       }
       a.i("TKContainer", "asyncCreateView, bundleId: "+tKContainer.h+", viewKey: "+oobject);
       if (a.c.booleanValue()) {
          V8Trace.traceLog(tKContainer.H, "asyncCreateView: key = "+oobject+", waitTKInitTime = "+p0);
       }else {
          int i1 = p0;
       }
       String str = UUID.randomUUID().toString();
       tKContainer1 = tKContainer.k;
       if (tKContainer1 != null) {
          tKContainer1.n(1);
          tKContainer.k.s(i);
          tKContainer.k.o(oobject);
          i oi = new i();
          oi.e();
          oi.f(oobject);
          tKContainer.k.z.put(str, oi);
       }
       TKContainer$a uoa = new TKContainer$a(this, p2, p1, p3, p4);
       if (tKContainer.w != null) {
          this.O(p1, v7, str, p3, p4);
          return;
       }else {
          TKContainer$b uob = new TKContainer$b(this, p1, v7, str, p3, p4, p2);
          tKContainer.J.add(v13);
          if (tKContainer.L == null) {
             tKContainer.L = true;
             this.K(true, p0, new TKContainer$c(this), str);
          }
          return;
       }
    }
    public V8ObjectProxy o(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKContainer.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || this.c.g() == null) {
          return null;
       }
       return V8JSONProxy.createProxyForNativeObject(this.c.g(), p0);
    }
    public void onCreate(){
    }
    public void onDestroy(){
       boolean b;
       a a;
       TKContainer tKContainer = TKContainer.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, tKContainer, "41")) {
          return;
       }
       if (this.A != null) {
          a.d(objArray, new Throwable("context is already destroy: "+this.h));
          return;
       }else if(a.c.booleanValue()){
          V8Trace.traceLog(this.H, "onDestroy "+this.G);
          d.p().i(this.h, this.y, "destroyContainer");
       }
       this.A = true;
       if (!PatchProxy.applyVoid(objArray, this, tKContainer, "32") && TKContainer.L()) {
          b uob = b.a();
          TKContainer th = this.h;
          TKContainer tQ = this.Q;
          Objects.requireNonNull(uob);
          if (PatchProxy.applyVoidTwoRefs(th, tQ, uob, b.class, "4") || (!TextUtils.isEmpty(th) && tQ != null)) {
             Set set = uob.a.get(th);
             if (set != null && set.contains(tQ)) {
                set.remove(tQ);
                tQ.clear();
             }
          }
       label_00a2 :
          tKContainer = this.R;
          if (tKContainer != null && !PatchProxy.applyVoid(objArray, tKContainer, a.class, "9")) {
             a = tKContainer.a;
             if (a != null) {
                a.clear();
             }
             a b1 = tKContainer.b;
             if (b1 != null) {
                b1.clear();
             }
          }
       label_00bf :
          this.R = objArray;
          this.Q = objArray;
       }
       b = false;
       if (this.G != null) {
          a.b(b, this.c.c()).execute(new i(this));
       }else {
          x.b(new i(this));
       }
       if (c.a().E3() && !PatchProxy.applyVoid(objArray, objArray, c.class, "14")) {
          Method e = c.e;
          if (e != null) {
             Object[] objArray1 = new Object[b];
             e.invoke(objArray, objArray1);
          }
       }
       if (a.c.booleanValue()) {
          d.p().l(this.h, this.y, "destroyContainer");
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, TKContainer.class, "40")) {
          return;
       }
       TKContainer tm = this.m;
       if (tm != null) {
          tm.b(this.h);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, TKContainer.class, "39")) {
          return;
       }
       TKContainer tm = this.m;
       if (tm != null) {
          tm.a(this.h, this.b, this.i);
       }
       return;
    }
    public void onStop(){
    }
    public void p(d p0){
       this.o = p0;
    }
    public void q(boolean p0){
       this.v = p0;
    }
    public void r(long p0,r p1){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, tKContainer, "6")) {
          return;
       }
       a.i("TKContainer", "asyncRender bundleId: "+this.h);
       if (a.c.booleanValue()) {
          V8Trace.traceLog(this.H, "asyncRender: waitTKInitTime = "+p0);
       }
       String str = UUID.randomUUID().toString();
       tKContainer = this.k;
       if (tKContainer != null) {
          tKContainer.n(false);
          this.k.s(false);
          i oi = new i();
          oi.e();
          this.k.z.put(str, oi);
       }
       this.K(false, p0, p1, str);
       return;
    }
    public V8JsonProxyObject s(JsonObject p0){
       V8JsonProxyObject obj = PatchProxy.applyOneRefs(p0, this, TKContainer.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       if (this.c.g() == null) {
          return obj;
       }
       return V8JSONProxy.composeJsObjectForJSON(this.c.g(), p0);
    }
    public void t(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKContainer.class, "52")) {
          return;
       }
       if (this.s == null) {
          this.s = new ArrayList();
       }
       this.s.add(p0);
       return;
    }
    public void u(boolean p0){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKContainer, "53")) {
          return;
       }
       if (a.c.booleanValue() && c.c(this.h)) {
          return;
       }
       this.B = p0;
       return;
    }
    public void v(){
       a a;
       a d;
       TKContainer obj1;
       Object obj = this;
       TKContainer tKContainer = TKContainer.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, tKContainer, "33")) {
          return;
       }
       TKContainer r = obj.R;
       if (r == null) {
          return;
       }
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoid(objArray, r, a.class, "3") && r.a()) {
          a = r.a;
          if (a != null && r.d != null) {
             r.c = true;
             Iterator iterator = a.iterator();
             boolean b = true;
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                String str = "4";
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(uoa, Boolean.valueOf(b), r, a.class, str)) {
                   Objects.requireNonNull(uoa);
                   e uoe = PatchProxy.apply(objArray, uoa, a.class, str);
                   if (uoe != patchProxyRe) {
                   }else {
                      a c = uoa.c;
                      uoe = (c != null && c.get() != null)? uoa.c.get(): objArray;
                   }
                   if (uoe != null) {
                      uoe.close();
                      if (b) {
                         d = r.d;
                         Objects.requireNonNull(d);
                         if (!PatchProxy.applyVoid(objArray, d, tKContainer, "34")) {
                            if (!PatchProxy.applyVoid(objArray, d, tKContainer, "35")) {
                               d.d.dispose();
                               if (d.c != null) {
                                  a.e().a(d.x, true);
                                  obj1 = d.k;
                                  if (obj1 != null) {
                                     obj1.k(false);
                                  }
                                  d.c.h();
                               }
                            }
                            d.c = objArray;
                            d.w = false;
                            d.b = objArray;
                         }
                      }
                      String str1 = "5";
                      obj1 = PatchProxy.apply(objArray, uoa, a.class, str1);
                      if (obj1 != patchProxyRe) {
                      }else {
                         a d1 = uoa.d;
                         obj1 = (d1 != null && d1.get() != null)? uoa.d.get(): objArray;
                      }
                      if (obj1 != null) {
                         obj1.d = false;
                         obj1.b = objArray;
                      }
                      if (obj1 == null) {
                         e uoe1 = r.d.f(uoa.b(), objArray, uoa.c(), uoa.a());
                         if (PatchProxy.applyVoidTwoRefs(uoe, uoe1, r, a.class, "6") || (uoe1 == null || (uoe1 instanceof d && uoe instanceof d))) {
                            Object obj2 = uoe;
                            uoe1 = uoe1.getBaseView();
                            if (uoe1 != null) {
                               obj2.a(uoe1);
                               d = r.b.getLast();
                               if (d != null && !PatchProxy.applyVoidOneRefs(uoe, d, a.class, "1")) {
                                  uoa = d.c;
                                  if (uoa != null) {
                                     uoa.clear();
                                     d.c = objArray;
                                  }
                                  d.c = new WeakReference(uoe);
                               }
                            }
                         }
                      }else if(PatchProxy.applyVoidTwoRefs(obj1, uoe, r, a.class, str1)){
                         obj1.removeView(uoe.getView());
                      }
                      r.d.h0(1000, obj1, uoa.b(), null, uoa.c(), uoa.a());
                      if (!PatchProxy.applyVoidTwoRefs(uoe, obj1, r, a.class, "7") && uoe instanceof d) {
                         c param = uoe.getParam();
                         if (param != null) {
                            if (param.a() != null) {
                               obj1.setData(param.a());
                            }
                            if (param.b() != null) {
                               obj1.setIJS2NativeInvoker(param.b());
                            }
                         }
                      }
                   }
                }
             label_019e :
                b = false;
             }
             r.c = false;
             if (!PatchProxy.applyVoid(objArray, r, a.class, "2")) {
                a a1 = r.a;
                if (a1 != null && r.b != null) {
                   a1.clear();
                   r.a.addAll(r.b);
                   r.b.clear();
                }
             }
             a.j("HotReload", "hotreload success");
          }
       }
       return;
    }
    public void w(boolean p0){
       this.G = p0;
    }
    public w x(){
       return this.b;
    }
    public void y(boolean p0){
       TKContainer tKContainer = TKContainer.class;
       if (PatchProxy.isSupport(tKContainer) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKContainer, "1")) {
          return;
       }
       a.i("TKContainer", "preInit, bundleId: "+this.h);
       if (this.N != null) {
          return;
       }
       this.N = true;
       if (a.c.booleanValue()) {
          V8Trace.traceLog(this.H, "preInit: isFullCompile = "+p0);
       }
       TKContainer tk = this.k;
       if (tk != null) {
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(null, tk, h.class, "9")) {
             tk.a.b = System.currentTimeMillis();
          }
       }
       if (this.c != null && this.b != null) {
          this.a0(p0);
          return;
       }else if(this.c == null){
          this.E = true;
          this.H(0x2710, new TKContainer$k(this, p0), true);
       }
       if (this.b == null) {
          this.F = true;
          this.I(true, new TKContainer$p(this, p0));
       }
       return;
    }
    public void z(p p0){
       this.u = p0;
    }
}
