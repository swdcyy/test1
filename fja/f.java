package fja.f;
import y0b.i;
import y0b.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hja.b;
import a7c.h;
import com.kwai.framework.model.user.RecoUser;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import java.lang.Integer;
import java.lang.Number;
import y0b.j;
import a9c.e;
import fja.f$a;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;
import x0b.d;
import com.yxcorp.gifshow.listcomponent.event.a;
import y0b.h;
import fja.e;
import erd.g;
import crd.b;
import qvb.n0;
import o0b.a;
import java.lang.Long;
import com.yxcorp.gifshow.pymk.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lja.k;
import lja.v;
import lja.x;
import lja.p;
import lja.a;

public class f extends i	// class@002951
{
    public h C;

    public void f(){
       super();
    }
    public m C(){
       Object obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this.C);
    }
    public String D(Object p0){
       p0 = p0.mBizId;
       if (p0 == null) {
       }else {
          p0 = "homefollowpymk";
       }
       return p0;
    }
    public int J(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       RecoUser recoUser = this.H().u(p0);
       if (recoUser != null) {
          return recoUser.mViewType;
       }else {
          return 10;
       }
    }
    public e L(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(this);
    }
    public a M(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.r();
       this.H().e().c("kscc.event.component.arch.load_more.FinishLoading", new e(this));
       return;
    }
    public n0 v(){
       h obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.H().c().a(this.H().k().l(), "PymkParams", h.class);
       this.C = obj;
       return obj.s();
    }
    public PresenterV2 w(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.w();
       obj.U7(new k());
       obj.U7(new v());
       obj.U7(new x());
       obj.U7(new p());
       obj.U7(new a());
       PatchProxy.onMethodExit(f.class, "2");
       return obj;
    }
}
