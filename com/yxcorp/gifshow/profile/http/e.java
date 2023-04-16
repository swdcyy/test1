package com.yxcorp.gifshow.profile.http.e;
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
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import cjd.e;
import erd.o;
import o3c.e;
import erd.g;
import o3c.f;
import com.yxcorp.gifshow.profile.http.d;
import qvb.n0$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.a;
import java.util.List;
import la6.b;
import qvb.f;
import qk.g0;
import b06.d;
import jsa.c;

public class e extends p implements ListReqLifecycle	// class@001351
{
    public final ListReqLifecycle$a p;
    public String q;
    public static final int r;

    public void e(String p0){
       super();
       this.p = new ListReqLifecycle$a();
       this.q = p0;
    }
    public t I1(){
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.p.c();
       obj = b.a(0x37313f08);
       e tq = this.q;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.q(tq, 20, objArray).map(new e()).doOnNext(new e(this)).doOnError(new f(this)).doOnNext(d.b);
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       super.K1(p0);
       RxBus.f.b(new a());
       this.p.a();
       return;
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "3");
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       super.d2(p0, p1);
       RxBus.f.b(new c(p0.getItems(), p1, 102, 8));
       return;
    }
    public t m(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.m();
    }
}
