package com.yxcorp.gifshow.profile.http.c;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import o3c.p;
import java.lang.String;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import o3c.l;
import pe6.a;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import cjd.e;
import erd.o;
import o3c.c;
import erd.g;
import o3c.d;
import com.yxcorp.gifshow.profile.http.b;
import qvb.n0$a;
import java.util.List;
import la6.b;
import qvb.f;
import qk.g0;
import b06.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import jsa.c;

public class c extends p implements ListReqLifecycle	// class@00134f
{
    public final String p;
    public final String q;
    public final ListReqLifecycle$a r;
    public static final int s;

    public void c(String p0){
       super();
       this.r = new ListReqLifecycle$a();
       this.p = p0;
       this.q = "3";
    }
    public t I1(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.r.c();
       Object obj1 = b.a(0x37313f08);
       long l = a.a();
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj1.g(l, 30, objArray, this.p, this.q).map(new e()).doOnNext(new c(this)).doOnError(new d(this)).doOnNext(b.b);
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       super.K1(p0);
       this.r.a();
       return;
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          if (list != null) {
             d.f(list);
          }
       }
       return list;
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public boolean i(){
       return false;
    }
    public void i2(ProfileFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       super.d2(p0, p1);
       RxBus.f.b(new c(p0.getItems(), p1, 8, 3));
       return;
    }
    public t m(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.m();
    }
}
