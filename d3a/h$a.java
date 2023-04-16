package d3a.h$a;
import ohc.g;
import d3a.h;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uo7.k;
import rq4.d;
import ohc.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Throwable;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ohc.a;
import yhc.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;
import uo7.h0;
import uhc.a;
import zhc.f;
import zhc.b;

public class h$a extends g	// class@001e6c
{
    public final g c;
    public final boolean d;
    public final PhotoDetailParam e;
    public final h f;

    public void h$a(h p0,g p1,boolean p2,PhotoDetailParam p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void f(k p0,d p1){
       this.r(p0, p1);
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       this.t(p0, p1);
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       this.u(p0, p1, p2);
    }
    public void o(k p0,ShareInitResponse$SharePanelElement p1){
       this.v(p0, p1);
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       this.w(p0, p1);
    }
    public void q(Map p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "2")) {
          return;
       }
       super.q(p0, p1);
       this.c.q(p0, p1);
       return;
    }
    public void r(k p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "1")) {
          return;
       }
       super.r(p0, p1);
       return;
    }
    public void t(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "6")) {
          return;
       }
       super.t(p0, p1);
       this.c.t(p0, p1);
       a.a.a(p0, this.f.c, p1);
       return;
    }
    public void u(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h$a.class, "5")) {
          return;
       }
       super.u(p0, p1, p2);
       this.c.u(p0, p1, p2);
       a.a.b(p0, this.e, p1, p2);
       return;
    }
    public void v(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "3")) {
          return;
       }
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mSharePanelElement = p1;
       c.b(10, p0.K().mEntity, uExtParams);
       this.c.v(p0, p1);
       return;
    }
    public void w(k p0,ShareInitResponse$SharePanelElement p1){
       h a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "4")) {
          return;
       }
       super.w(p0, p1);
       if (new h0(p1.mActionUrl).f()) {
          a = this.f.a;
          a.setNumberOfShares((a.numberOfShare() + 1));
       }
       this.c.w(p0, p1);
       if (this.d != null) {
          a.f(p0.K().getPhotoId(), p1);
       }
       b uob = f.a.a(p0, this.e, p1);
       if (uob != null) {
          uob.f();
       }
       return;
    }
}
