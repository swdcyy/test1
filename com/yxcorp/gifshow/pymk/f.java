package com.yxcorp.gifshow.pymk.f;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import qvb.n0;
import com.kwai.soc.arch.rubas.base.Rubas;
import java.util.List;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import la6.b;
import java.lang.Boolean;
import java.lang.Integer;
import k2b.k2;
import k2b.u1;
import mrd.a;
import x6c.r;
import erd.g;
import com.yxcorp.gifshow.pymk.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import wkd.b;
import i7c.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import cjd.e;
import erd.o;
import a7c.d;
import i7c.e;
import com.yxcorp.gifshow.pymk.net.a;
import ok.x;
import i7c.f;
import java.lang.StringBuilder;
import g7c.e;
import i7c.d;

public class f extends f	// class@0016c2
{
    public int A;
    public Integer B;
    public boolean C;
    public d p;
    public d q;
    public int r;
    public RecommendUserResponseV2 s;
    public RecommendUserResponseV2 t;
    public a u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;
    public static final String D = "f";

    public void f(int p0){
       super(p0, null);
    }
    public void f(int p0,String p1){
       super();
       this.z = 0;
       this.A = 0;
       this.C = false;
       this.r = p0;
       this.w = p1;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h2(true, false);
    }
    public void J1(Throwable p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "11")) {
          return;
       }
       super.J1(p0);
       if (!PatchProxy.applyVoid(null, this, uof, "12") && this.C == null) {
          this.C = true;
          Rubas.g("pymk_portal", String.valueOf(this.r));
          Rubas.c("pymk_network_error");
       }
       return;
    }
    public void M1(Object p0,List p1){
       this.o2(p0, p1);
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.C == null) {
          Rubas.c("pymk_network_start");
       }
       return;
    }
    public void d2(b p0,List p1){
       this.o2(p0, p1);
    }
    public final t h2(boolean p0,boolean p1){
       RecommendUserResponseV2 obj;
       f t;
       Integer integer = this;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), integer, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RecommendUserResponseV2 recommendUse = null;
       obj = (!this.K())? this.L0(): recommendUse;
       integer.B = (integer.r == 29)? Integer.valueOf(5): Integer.valueOf(0);
       k2 ok2 = u1.n();
       if (ok2 != null) {
          integer.y = ok2.d;
       }
       if (p0) {
          t = integer.t;
          if (t != null) {
             integer.t = recommendUse;
             integer.u = recommendUse;
             return t.just(t);
          }else {
             t = integer.u;
             if (t != null && (!t.c() && !integer.u.e())) {
                return integer.u.hide().doOnNext(new r(integer));
             }
          }
       }
       if (p1 && integer.r == null) {
          return t.fromCallable(e.b).subscribeOn(d.c).observeOn(d.a);
       }else {
          Object obj1 = b.a(-1302358859);
          f r = integer.r;
          f w = integer.w;
          String str = (obj != null)? obj.getCursor(): recommendUse;
          String str1 = integer.n2(obj);
          if (obj == null) {
             recommendUse = integer.v;
          }
          return obj1.g(r, w, str, str1, recommendUse, integer.B, integer.x, integer.y, RequestTiming.DEFAULT, integer.z, integer.A).map(new e());
       }
    }
    public RecommendUserResponseV2 i2(){
       return this.s;
    }
    public String j2(){
       RecommendUserResponseV2 obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i2();
       String str = (obj == null)? "": obj.mFriendUserPrsid;
       return str;
    }
    public String k2(){
       return this.w;
    }
    public int l2(){
       return this.r;
    }
    public String m2(){
       RecommendUserResponseV2 obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i2();
       String str = (obj == null)? "": obj.mPrsid;
       return str;
    }
    public String n2(RecommendUserResponseV2 p0){
       String str;
       p0 = (p0 != null)? p0.mPrsid: null;
       return p0;
    }
    public void o2(RecommendUserResponseV2 p0,List p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, "5")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uof, "10") && this.C == null) {
          this.C = true;
          Rubas.g("pymk_portal", String.valueOf(this.r));
          Rubas.c("pymk_network_end");
       }
       super.d2(p0, p1);
       boolean b = this.K();
       if (b) {
          this.s = p0;
          f tq = this.q;
          if (tq != null) {
             tq.b = this.l2();
          }
       }
       if (this.p == null) {
          this.p = new e(new a(false, objArray));
          e.a(f.D, "mModelProcess is Null , portal is "+this.l2());
       }
       this.p.a(p0, p1, b, this.l2());
       return;
    }
    public void p2(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "6")) {
          return;
       }
       if (this.r != p0) {
          this.r = p0;
       }
       this.release();
       this.T1(false);
       this.a();
       return;
    }
    public void q2(int p0){
       this.A = p0;
    }
    public void r2(int p0){
       this.z = p0;
    }
    public void s2(String p0){
       this.v = p0;
    }
}
