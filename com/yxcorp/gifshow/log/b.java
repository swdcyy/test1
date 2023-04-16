package com.yxcorp.gifshow.log.b;
import com.yxcorp.gifshow.log.t$a;
import k2b.k2;
import android.app.Activity;
import m2b.h;
import m2b.d;
import k2b.b3;
import android.util.LruCache;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q2b.i;
import q2b.i$a;
import java.lang.System;
import java.lang.Long;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import f3b.b;
import android.content.ComponentName;
import com.yxcorp.gifshow.log.t;
import f3b.v;
import java.lang.Boolean;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import k2b.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.util.Objects;
import com.google.common.base.Optional;
import java.lang.Iterable;
import qk.y;
import com.yxcorp.gifshow.log.a;
import ok.h;
import com.google.common.collect.ImmutableList;
import k2b.e0;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import k2b.z;
import java.lang.Number;
import java.lang.Integer;
import java.util.LinkedHashMap;
import f3b.p;
import java.util.List;
import java.util.Collection;
import f3b.p$a;
import java.util.AbstractCollection;
import k2b.i;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import k2b.k3;
import com.yxcorp.utility.Log;

public class b extends k2 implements t$a	// class@001af5
{
    public final t P;
    public final b3 Q;
    public final LruCache R;
    public final LruCache S;
    public final LruCache T;
    public k2 U;
    public Long V;
    public boolean W;
    public int X;
    public final int Y;
    public final ComponentName Z;
    public b a0;
    public h b0;
    public d c0;
    public HashMap d0;
    public v e0;
    public final boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public final HashMap j0;
    public final HashMap k0;
    public final ConcurrentHashMap l0;
    public static final int m0;

    public void b(Activity p0,k2 p1,h p2,d p3,b3 p4,LruCache p5,LruCache p6,LruCache p7){
       boolean b;
       Object[] objArray = null;
       i oi = PatchProxy.apply(objArray, objArray, b.class, "1");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = i.a().s("UNKNOWN2").e(false).b();
       }
       super(objArray, oi, p1, Long.valueOf(System.currentTimeMillis()));
       this.d0 = new HashMap();
       this.i0 = false;
       this.j0 = new HashMap();
       this.k0 = new HashMap();
       this.l0 = new ConcurrentHashMap();
       this.b0 = p2;
       this.c0 = p3;
       this.Q = p4;
       this.R = p5;
       this.S = p6;
       this.T = p7;
       this.X = p0.hashCode();
       this.Y = b.a(p0);
       this.Z = p0.getComponentName();
       this.J = this;
       this.U = this;
       this.V = Long.valueOf(System.currentTimeMillis());
       this.P = new t(this);
       if (p1 != null) {
          objArray = p1.p();
       }
       this.e0 = objArray;
       p1 = PatchProxy.applyOneRefs(p0, this, b.class, "27");
       if (p1 != PatchProxyResult.class) {
          b = p1.booleanValue();
       }else {
          int[] ointArray = new int[true];
          ointArray[0] = 0x1010058;
          TypedArray typedArray = p0.getTheme().obtainStyledAttributes(ointArray);
          typedArray.recycle();
          b = typedArray.getBoolean(false, false);
       }
       this.f0 = b;
       this.i0 = (p0 instanceof c0)? true: false;
       return;
    }
    public ClientEvent$UrlPackage C(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ClientEvent$UrlPackage obj = PatchProxy.apply(objArray, this, b.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientEvent$UrlPackage();
       obj.page = 0;
       b tP = this.P;
       Objects.requireNonNull(tP);
       Optional optional = PatchProxy.apply(objArray, tP, t.class, "8");
       if (optional != patchProxyRe) {
       }else {
          optional = Optional.fromNullable(y.l(tP.d, objArray));
       }
       return Optional.fromNullable(optional.or(this.U)).transform(a.b).or(obj);
    }
    public k2 D(){
       return this.U;
    }
    public int E(){
       return this.X;
    }
    public int F(){
       return this.Y;
    }
    public v G(){
       return this.e0;
    }
    public ComponentName H(){
       return this.Z;
    }
    public ImmutableList I(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.d;
    }
    public ConcurrentHashMap J(){
       return this.l0;
    }
    public k2 K(e0 p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.P;
       Objects.requireNonNull(obj);
       Optional optional = PatchProxy.applyOneRefs(p0, obj, t.class, "7");
       if (optional != patchProxyRe) {
       }else {
          k2 ok2 = obj.e.get(t.f(p0));
          if (ok2 == null && (n.A1().C() && (p0.D4() == 1 || p0.D4() == 2))) {
             ok2 = obj.f.get(p0.o());
          }
       label_0054 :
          optional = Optional.fromNullable(ok2);
       }
       return optional.orNull();
    }
    public ImmutableList L(){
       Object obj = PatchProxy.apply(null, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P.c;
    }
    public boolean M(Activity p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.X == p0.hashCode())? true: false;
       return b;
    }
    public boolean N(){
       return this.f0;
    }
    public final void O(){
       int i;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "12")) {
          return;
       }
       b tU = this.U;
       Objects.requireNonNull(tU);
       if (!PatchProxy.applyVoid(objArray, tU, k2.class, "2")) {
          z o = k2.O;
          if (o != null) {
             tU.B = o.I1();
          }
       }
       this.U.o = this.W ^ 1;
       if (this.Q()) {
          return;
       }else if(this.U.o != null && this.i0 == null){
          return;
       }else {
          Object obj = PatchProxy.apply(objArray, this, uob, "22");
          k2 ok2 = 3;
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(this.U.r()){
             i = 3;
          }else {
             i = 1;
          }
          if (i == ok2 && this.U.s()) {
             return;
          }else {
             b tU1 = this.U;
             if (tU1.j == null) {
                this.c0.a(tU1);
             }
             tU1 = this.U;
             long l = System.currentTimeMillis();
             tU1.F = l;
             if (tU1.H < 0) {
                tU1.H = l - tU1.G;
             }
             tU1.I = -1;
             this.b0.a(this.U, i);
             this.U.v(0);
             this.T(1);
             return;
          }
       }
    }
    public final void P(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       if (this.Q()) {
          return;
       }
       if (this.U.r() && this.W != null) {
          this.U.I = System.currentTimeMillis();
          this.b0.a(this.U, 2);
          this.U.w(Integer.valueOf(1));
          this.T(false);
       }
       return;
    }
    public final boolean Q(){
       return this.U instanceof b;
    }
    public void R(i p0,boolean p1){
       boolean b;
       k2 tt;
       b tP1;
       t ot = t.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b tU = this.U;
       if (!tU instanceof b && tU.s()) {
          this.U.w(Integer.valueOf(p0.t()));
       }
       tU = this.P;
       Objects.requireNonNull(tU);
       Object obj = PatchProxy.applyOneRefs(p0, tU, ot, "4");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): tU.a.containsKey(t.h(p0));
       long l = 1;
       if (!b) {
          p op = p.class;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "15")) {
             uob = null;
             if (!this.Q()) {
                tU = this.U;
                if (tU.b != null && !(tU.d).equals("UNKNOWN2")) {
                   tt = this.U;
                   l = System.currentTimeMillis();
                label_008b :
                   k2 ok2 = new k2(this, p0, tt, Long.valueOf(l));
                   if (uob != null) {
                      ok2.w(Integer.valueOf(this.k()));
                      ok2.x(this.l());
                      ok2.y(this.o());
                      ok2.z(this.e0);
                      ok2.m().d(this.m().a);
                      p op1 = ok2.m();
                      p c = this.m().c;
                      Objects.requireNonNull(op1);
                      if (!PatchProxy.applyVoidOneRefs(c, op1, op, "1")) {
                         op1.c.addAll(c);
                      }
                      op1 = ok2.m();
                      Objects.requireNonNull(op1);
                      if (!PatchProxy.applyVoid(null, op1, op, "11")) {
                         op1.d.b(op1.b());
                      }
                   }else {
                      ok2.z(tt.p());
                   }
                   this.P();
                   b tP = this.P;
                   Objects.requireNonNull(tP);
                   if (!PatchProxy.applyVoidTwoRefs(p0, ok2, tP, ot, "1")) {
                      tP.a.put(t.h(p0), ok2);
                      tP.e.put(t.h(p0), ok2);
                      tP.b(p0.p(), ok2);
                      tP.d = ImmutableList.copyOf(tP.a.values());
                      tP.a(ok2);
                   }
                   this.U = ok2;
                   if (ok2.j == null) {
                      this.c0.a(ok2);
                   }
                   this.O();
                }
             }
             tt = this.t;
             l = this.V.longValue();
             uob = 1;
             goto label_008b ;
          }
       }else if(PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "16")){
          if (this.P.d(p0).isPresent()) {
             k2 ok21 = this.P.d(p0).get();
             if (p1 && n.A1().I()) {
                int i = this.I().indexOf(ok21);
                if (i >= 0 && i < (this.I().size() - 1)) {
                   k2 ok22 = this.I().get((i + l));
                   if (ok22.j == null || i.a().contains(ok22.d)) {
                   }
                }else {
                }
             }else {
             }
          }else {
             throw new IllegalArgumentException("Page : "+p0+" not exists. Shouldn\'t happen.");
          }
       }
       return;
    }
    public void S(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       this.e0 = v.h(this.e0, p0);
       return;
    }
    public final void T(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "14")) {
          return;
       }
       uob = this.U;
       k2 a = uob.a;
       String str = t.g(uob);
       if (this.j0.get(str) != null) {
          this.U.u(this.j0.get(str));
          this.j0.remove(str);
       }
       if (this.k0.get(str) != null) {
          this.U.t(this.k0.get(str));
          this.k0.remove(str);
       }
       k3 ok3 = this.Q.r();
       String str1 = (p0)? "Enter": "Leave";
       if (!ok3.a.isEmpty()) {
          Log.g("ActivityRecord", str1+" "+str+" \("+a+"\) -> ks_list "+ok3.a);
       }
       if (!ok3.b.isEmpty()) {
          Log.g("ActivityRecord", str1+" "+str+" \("+a+"\) -> entry_tag "+ok3.b);
       }
       k3 c = ok3.c;
       if (c != null) {
          this.T.put(a, c);
       }
       this.R.put(a, ok3.a);
       this.S.put(a, ok3.b);
       return;
    }
    public void c(k2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "26")) {
          return;
       }
       p0.z(null);
       return;
    }
}
