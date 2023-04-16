package com.kuaishou.tk.api.a;
import rx4.a;
import rx4.b;
import java.lang.Object;
import com.kuaishou.tk.api.b;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import rx4.c;
import rx4.j;
import tx4.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import rx4.d;
import tkd.b;
import tkd.d;
import rx4.i;
import java.util.List;
import rx4.e;
import com.kwai.robust.PatchProxyResult;
import tx4.r;
import java.lang.Throwable;
import tx4.w;
import tx4.o;
import tx4.n;
import java.lang.Long;
import android.os.SystemClock;
import rx4.f;
import java.lang.Runnable;
import ekd.k1;
import java.util.Map;
import sx4.e$a;
import sx4.e;
import java.io.Serializable;
import com.tkruntime.v8.V8JsonProxyObject;
import tx4.q;
import tx4.l;
import android.app.Activity;
import android.view.ViewGroup;
import java.util.Iterator;
import tx4.d;
import tx4.p;
import rx4.g;
import com.tkruntime.v8.V8ObjectProxy;
import rx4.h;
import com.google.gson.JsonObject;

public class a implements a	// class@000f8c
{
    public a b;
    public b c;
    public boolean d;
    public boolean e;
    public long f;
    public boolean g;
    public n h;
    public long i;
    public boolean j;
    public long k;
    public e$a l;
    public o m;
    public String n;
    public Object[] o;
    public long p;
    public boolean q;
    public r r;

    public void a(b p0){
       super();
       this.c = p0;
       if (!b.b().d()) {
          Log.g("TKContainerHolder", "TKContainerHolder: TKPlugin is not available "+this.c.c);
          b.b().a(new c(this));
       }else {
          this.m();
       }
       return;
    }
    public static void a(String p0,int p1,boolean p2,f p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, null, a.class, "8")) {
          return;
       }
       if (!b.b().d()) {
          Log.g("TKContainerHolder", "asyncCompileBundle: TKPlugin is not available "+p0);
          b.b().a(new d(p0, p1, p2, p3));
       }else {
          d.a(0x256720e1).wZ(p0, p1, p2, p3);
       }
       return;
    }
    public static void b(List p0,boolean p1,f p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, a.class, "7")) {
          return;
       }
       if (p0 != null && p0.size() > 0) {
          if (!b.b().d()) {
             Log.g("TKContainerHolder", "asyncCompileBundleList: TKPlugin is not available "+p0);
             b.b().a(new e(p0, p1, p2));
          }else {
             d.a(0x256720e1).Oz(p0, p1, p2);
          }
       }
       return;
    }
    public boolean A(){
       a obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == null) {
          this.G();
       }
       obj = this.b;
       boolean b = (obj != null && obj.A())? true: false;
       return b;
    }
    public void B(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.B(p0);
       }else {
          Log.d("TKContainerHolder", "syncRender TK Plugin not ready");
          if (p0 != null) {
             p0.a(4001, new Throwable("syncRender TK Plugin not ready"));
          }
          this.G();
       }
       return;
    }
    public void C(boolean p0,r p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "21")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.C(p0, p1);
       }else {
          Log.d("TKContainerHolder", "render TK Plugin not ready");
          if (p1 != null) {
             p1.a(4001, new Throwable("render TK Plugin not ready"));
          }
          this.G();
       }
       return;
    }
    public final void D(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tm = this.m;
       if (tm != null) {
          tm.b(6002, new Throwable("asyncCreateView time out"), null);
       }
       this.m = null;
       this.H();
       return;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a th = this.h;
       if (th != null) {
          th.b(6002, new Throwable("asyncInitContext time out"));
       }
       this.h = null;
       this.H();
       return;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tr = this.r;
       if (tr != null) {
          tr.a(6002, new Throwable("asyncRender time out"));
       }
       this.r = null;
       this.H();
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tc = this.c;
       b.b().f(tc.d, tc.c, 0, 6001, "TK Plugin not ready");
       return;
    }
    public final void H(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a tc = this.c;
       b.b().f(tc.d, tc.c, 0, 6002, "TK Plugin time out");
       return;
    }
    public void c(String p0){
    }
    public void d(long p0,n p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoa, "11")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.d(p0, p1);
       }else {
          this.f = SystemClock.elapsedRealtime();
          this.g = true;
          this.k = p0;
          this.h = p1;
          k1.r(new f(this), p0);
       }
       return;
    }
    public void e(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "16")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.e(p0, p1);
       }else {
          Log.d("TKContainerHolder", "runApplication failed: "+p0);
          this.G();
       }
       return;
    }
    public e f(e$a p0,o p1,String p2,Object[] p3){
       a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.G();
       }
       obj = this.b;
       e uoe = (obj != null)? obj.f(p0, p1, p2, p3): null;
       return uoe;
    }
    public void g(int p0){
    }
    public V8JsonProxyObject h(Serializable p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.b;
          if (obj != null) {
             return obj.h(p0);
          }
       }
       return null;
    }
    public void i(w p0,boolean p1,r p2,String p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, a.class, "20")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.i(p0, p1, p2, p3);
       }else {
          Log.d("TKContainerHolder", "renderWithoutLoadBundle TK Plugin not ready");
          if (p2 != null) {
             p2.a(4001, new Throwable("renderWithoutLoadBundle TK Plugin not ready"));
          }
          this.G();
       }
       return;
    }
    public boolean isDestroyed(){
       a obj = PatchProxy.apply(null, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       boolean b = (obj != null && obj.isDestroyed())? true: false;
       return b;
    }
    public void j(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.j(p0);
       }
       return;
    }
    public void k(e$a p0,o p1,String p2,Object[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "15")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.k(p0, p1, p2, p3);
       }else {
          p2 = "createView TK Plugin not ready";
          Log.d("TKContainerHolder", p2);
          if (p1 != null) {
             p1.b(4002, new Throwable(p2), null);
          }
          this.G();
       }
       return;
    }
    public void l(l p0){
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tc = this.c;
       this.b = d.a(0x256720e1).x40(tc.a, tc.b, tc.c, tc.d);
       String str = "doCreateTKContainer: ";
       String str1 = "TKContainerHolder";
       Log.g(str1, str+this.c.c+", "+this.b);
       a tb = this.b;
       if (tb == null) {
          return;
       }
       tb.q(this.c.e);
       this.b.c(this.c.j);
       this.b.u(this.c.k);
       b l = this.c.l;
       if (l != -1) {
          this.b.g(l);
       }
       this.b.w(this.c.m);
       l = this.c.f;
       if (l != null && !l.isEmpty()) {
          Iterator iterator = this.c.f.iterator();
          while (iterator.hasNext()) {
             this.b.t(iterator.next());
          }
       }
       l = this.c.g;
       if (l != null) {
          this.b.p(l);
       }
       l = this.c.h;
       if (l != null) {
          this.b.z(l);
       }
       l = this.c.i;
       if (l != null) {
          this.b.j(l);
       }
       a uoa = null;
       boolean b = false;
       if (this.d != null) {
          Log.g(str1, str+this.c.c+", mPreInit");
          this.d = b;
          this.b.y(this.e);
       }else if(this.g != null){
          Log.g(str1, str+this.c.c+", mAsyncInitContext");
          this.g = b;
          long l3 = this.k - (SystemClock.elapsedRealtime() - this.f);
          if (l3 - uoa <= 0) {
             this.E();
             return;
          }else {
             this.b.d(l3, this.h);
          }
       }
       if (this.j != null) {
          Log.g(str1, str+this.c.c+", mAsyncCreateView");
          this.j = b;
          long l1 = this.k - (SystemClock.elapsedRealtime() - this.i);
          if (l1 - uoa <= 0) {
             this.D();
             return;
          }else {
             this.b.n(l1, this.l, this.m, this.n, this.o);
          }
       }else if(this.q != null){
          Log.g(str1, str+this.c.c+", mAsyncRender");
          this.q = b;
          long l2 = this.k - (SystemClock.elapsedRealtime() - this.p);
          if (l2 - uoa <= 0) {
             this.F();
             return;
          }else {
             this.b.r(l2, this.r);
          }
       }
       return;
    }
    public void n(long p0,e$a p1,o p2,String p3,Object[] p4){
       a uoa = this;
       long l = p0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),oobject,oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "14")) {
             return;
          }
       }
       uoa1 = uoa.b;
       if (uoa1 != null) {
          uoa1.n(p0, p1, p2, p3, p4);
       }else {
          uoa.i = SystemClock.elapsedRealtime();
          uoa.j = true;
          uoa.k = l;
          uoa.l = oobject;
          uoa.m = oobject1;
          uoa.n = oobject2;
          uoa.o = oobject3;
          k1.r(new g(this), p0);
       }
       return;
    }
    public V8ObjectProxy o(Object p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.b;
          if (obj != null) {
             return obj.o(p0);
          }
       }
       return null;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       this.g = false;
       this.j = false;
       this.q = false;
       this.h = null;
       this.m = null;
       this.l = null;
       this.r = null;
       a tb = this.b;
       if (tb != null) {
          tb.onDestroy();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.onPause();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, a.class, "25")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.onResume();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       a tb = this.b;
       if (tb != null) {
          tb.onStop();
       }
       return;
    }
    public void p(d p0){
    }
    public void q(boolean p0){
    }
    public void r(long p0,r p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoa, "19")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.r(p0, p1);
       }else {
          this.p = SystemClock.elapsedRealtime();
          this.q = true;
          this.k = p0;
          this.r = p1;
          k1.r(new h(this), p0);
       }
       return;
    }
    public V8JsonProxyObject s(JsonObject p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.b;
          if (obj != null) {
             return obj.s(p0);
          }
       }
       return null;
    }
    public void t(l p0){
    }
    public void u(boolean p0){
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "29")) {
          return;
       }
       a tb = this.b;
       if (tb == null) {
          return;
       }
       tb.v();
       return;
    }
    public void w(boolean p0){
    }
    public w x(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null) {
          objArray = obj.x();
       }
       return objArray;
    }
    public void y(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.y(p0);
       }else {
          this.d = true;
          this.e = p0;
       }
       return;
    }
    public void z(p p0){
    }
}
