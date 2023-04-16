package qvb.n0;
import qvb.a;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.x;
import erd.o;
import j90.a;
import java.lang.Integer;
import java.util.List;
import qvb.o;
import brd.w;
import brd.x;
import qvb.h0;
import erd.g;
import qvb.l0;
import qvb.m0;
import crd.b;
import qvb.i0;
import qvb.f0;
import qvb.g0;
import qvb.y;
import erd.r;
import brd.a0;
import brd.f0;
import qvb.e0;
import qvb.j0;
import qvb.w;
import qvb.k0;
import qvb.u;
import qvb.v;
import java.lang.Boolean;
import qvb.t;
import java.lang.Throwable;
import qvb.c0;
import java.lang.Runnable;
import ekd.k1;
import qvb.n0$a;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import k2b.u1;
import qvb.b0;
import tz4.c;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Collection;
import ekd.q;
import java.util.Queue;
import omc.b;
import com.kuaishou.tuna_core.boot.a;
import t45.d;
import qvb.d0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public abstract class n0 extends a	// class@00379a
{
    public boolean d;
    public boolean e;
    public boolean f;
    public Object g;
    public t h;
    public b i;
    public boolean j;
    public boolean k;
    public static final z l;

    static {
       n0.l = b.b(c.f("retrofit-page-list"));
    }
    public void n0(){
       super();
       this.d = true;
    }
    private t Q1(){
       Object obj = PatchProxy.apply(null, this, n0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I1().flatMap(x.b);
    }
    public String A1(){
       return "";
    }
    public abstract boolean B1(Object p0);
    public int C1(){
       return 0;
    }
    public boolean D1(){
       return this.j;
    }
    public boolean E1(){
       return this instanceof a;
    }
    public void F(int p0,Object p1){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, on0, "15")) {
          return;
       }
       if (p0 >= 0 && this.getCount() > p0) {
          this.d1().remove(p0);
          this.d1().add(p0, p1);
       }
       return;
    }
    public Object F1(){
       return null;
    }
    public final void G1(){
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "2")) {
          return;
       }
       boolean b = true;
       this.e = b;
       if (this.K() && this.E1()) {
          this.k = b;
          this.c.N0(this.K(), b);
          if (this.P1()) {
             if (this.z1()) {
                this.i = t.mergeDelayError(t.concat(this.y1(), this.x1()), this.Q1()).compose(this.H1(b)).doOnSubscribe(new h0(this)).subscribe(new l0(this), new m0(this));
             }else {
                w[] owArray = new w[]{this.w1(),this.Q1()};
                this.i = t.concatArrayEager(owArray).compose(this.H1(0)).doOnSubscribe(new i0(this)).subscribe(new f0(this), new g0(this));
             }
          }else {
             a0 uoa0 = t.concat(this.w1(), this.Q1()).filter(y.b).firstOrError();
             e0 uoe0 = PatchProxy.apply(objArray, this, on0, "17");
             if (uoe0 != PatchProxyResult.class) {
             }else {
                uoe0 = new e0(this);
             }
             this.i = uoa0.g(uoe0).q(new j0(this)).R(new f0(this), new g0(this));
          }
       }else {
          t ot = this.I1();
          this.h = ot;
          if (ot == null) {
             this.d = false;
             this.e = false;
             this.f = false;
             return;
          }else {
             this.k = false;
             this.c.N0(this.K(), 0);
             this.i = ot.map(w.b).doOnSubscribe(new k0(this)).subscribe(new u(this), new v(this));
          }
       }
       return;
    }
    public final x H1(boolean p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, on0, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new t(this, p0);
    }
    public abstract t I1();
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "13")) {
          return;
       }
       this.L1(p0);
       this.e = false;
       this.f = false;
       this.h = null;
       k1.o(new c0(this, this.K(), p0));
       return;
    }
    public boolean K(){
       boolean b = (this.g == null || this.f != null)? true: false;
       return b;
    }
    public void K1(n0$a p0){
       n0 on0 = n0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on0, "11")) {
          return;
       }
       boolean b = false;
       String str = (p0.b == null || (!this.P1() && p0.a != null))? 1: null;
       boolean b1 = this.K();
       n0$a a = p0.a;
       if (a != null) {
          this.d = this.B1(a);
          this.M1(p0.a, this.b);
          this.j = p0.b;
          this.g = p0.a;
          this.O1(p0.b);
          if (!PatchProxy.applyVoidOneRefs(p0, this, on0, "12") && a.t().d("page_list_cache_monitor", true)) {
             String str1 = this.A1();
             if (!TextUtils.x(str1)) {
                i3 oi3 = i3.f();
                oi3.d("pageList", str1);
                oi3.a("isCache", Boolean.valueOf(p0.b));
                oi3.a("isFirstPage", Boolean.valueOf(this.K()));
                oi3.a("isUsingCache", Boolean.valueOf(this.E1()));
                oi3.a("requestAfterLoadCache", Boolean.valueOf(this.P1()));
                str1 = oi3.e();
                u1.R("PageListLoadComplete", str1, 5);
             }
          }
          k1.o(new b0(this, b1, p0));
       }
       t ot = null;
       if (str) {
          this.e = b;
          this.f = b;
          this.h = ot;
       }
       if (!PatchProxy.applyVoid(ot, this, on0, "18")) {
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(this, ot, uoc, "3") && !c.a) {
             HomeFeedResponse obj = this.L0();
             if (obj instanceof HomeFeedResponse) {
                c.a = true;
                obj = obj.mQPhotos;
                if (!q.f(obj) && !PatchProxy.applyVoidOneRefs(obj, ot, uoc, "4")) {
                   while (!c.b.isEmpty()) {
                      b uob = c.b.poll();
                      if (uob != null) {
                         a uoa = new a(uob, obj);
                         if (uob.a()) {
                            k1.o(uoa);
                         }else if(k1.g()){
                            c.a(uoa);
                         }else {
                            uoa.run();
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public Object L0(){
       return this.g;
    }
    public void L1(Throwable p0){
    }
    public abstract void M1(Object p0,List p1);
    public void N1(){
    }
    public void O1(boolean p0){
    }
    public boolean P1(){
       return false;
    }
    public void R1(boolean p0){
       this.d = p0;
    }
    public final void S1(Object p0){
       this.g = p0;
    }
    public void T1(boolean p0){
       this.e = p0;
    }
    public boolean U1(n0$a p0){
       boolean b = (p0.b == null && p0.c == null)? true: false;
       return b;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, n0.class, "8")) {
          return;
       }
       if (this.e != null && this.f != null) {
          return;
       }
       if (this.e != null) {
          this.p0();
       }
       this.invalidate();
       this.G1();
       return;
    }
    public List d1(){
       return this.b;
    }
    public final boolean g(){
       return this.f;
    }
    public Object getItem(int p0){
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, on0, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.get(p0);
    }
    public boolean hasMore(){
       return this.d;
    }
    public void invalidate(){
       this.f = true;
    }
    public boolean isLoading(){
       return this.e;
    }
    public void load(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       if (this.e == null && (this.d != null || this.f != null)) {
          this.G1();
       }
       return;
    }
    public void onCompletedEvent(Object p0){
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, n0.class, "3")) {
          return;
       }
       n0 ti = this.i;
       if (ti != null && !ti.isDisposed()) {
          this.i.dispose();
          this.e = false;
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, n0.class, "9")) {
          return;
       }
       n0 th = this.h;
       if (th != null && this.i != null) {
          th.unsubscribeOn(d.a);
          this.i.dispose();
          this.e = false;
       }
       return;
    }
    public final void u1(){
       if (PatchProxy.applyVoid(null, this, n0.class, "10")) {
          return;
       }
       this.c.u1();
       n0 th = this.h;
       if (th != null && this.i != null) {
          th.unsubscribeOn(d.a);
          this.i.dispose();
       }
       return;
    }
    public t w1(){
       Object obj = PatchProxy.apply(null, this, n0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new d0(this)).subscribeOn(n0.l);
    }
    public t x1(){
       Object obj = PatchProxy.apply(null, this, n0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w1().delay(2, TimeUnit.SECONDS);
    }
    public t y1(){
       Object obj = PatchProxy.apply(null, this, n0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.empty();
    }
    public boolean z1(){
       return false;
    }
}
