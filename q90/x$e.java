package q90.x$e;
import x80.c;
import q90.x;
import java.lang.Object;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import x80.b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import q90.x$e$b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q90.x$e$a;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import android.content.Context;
import u80.i;
import ekd.p0;
import e17.i;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import android.view.View;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import t36.f;
import q87.c;
import h90.d;
import q90.x$e$c;

public final class x$e implements c	// class@0029ae
{
    public final x a;

    public void x$e(x p0){
       this.a = p0;
       super();
    }
    public void R(KSTemplateDetailInfo p0,int p1){
       b.i(this, p0, p1);
    }
    public void S(){
       b.j(this);
    }
    public void T(List p0,int p1){
       b.b(this, p0, p1);
    }
    public void U(List p0,List p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public void V(KSTemplateDetailInfo p0,int p1){
       x a;
       x$e uoe = x$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       a.p(p0, "templateInfo");
       Object[] objArray = new Object[0];
       e.D().t("KSPreviewFragmentVertical", "onKuaiShanProjectPrepareFailed: error="+p1, objArray);
       p0 = p0.mTemplateId;
       x z = this.a.z;
       KSTemplateDetailInfo mTemplateId = (z != null)? z.mTemplateId: null;
       if (a.g(p0, mTemplateId) ^ 0x01) {
          return;
       }else if(2 == p1){
          x$e$b uoe$b = new x$e$b(this);
          x$e ta = this.a;
          if (ta.y == null) {
             e.D(ta.getActivity(), uoe$b, x$e$a.b);
          }else {
             PostWorkErrorTips.b(R.string.arg_RES_7f1043cd);
          }
       }else if(!p0.C(i.a())){
          a.o(i.a(R.style.arg_RES_7f11066a, 0x7f101be4), "KSToast.applyStyle\(R.sty¡­an_template_fetch_failed\)");
       }else {
          a = this.a.A;
          a.m(a);
          Activity activity = this.a.getActivity();
          a.m(activity);
          z = this.a.p;
          if (z == null) {
             a.S("mRootItemView");
          }
          KSPostPreviewActivity.J3(a, activity, 0, z);
       }
       this.a.E.y0(null);
       this.a.E.c(this);
       return;
    }
    public void W(){
       b.h(this);
    }
    public void X(KSTemplateDetailInfo p0){
       b.g(this, p0);
    }
    public void Y(o1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$e.class, "1")) {
          return;
       }
       a.p(p0, "project");
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onKuaiShanProjectPrepareSuccess: ", objArray);
       String templateId = p0.getTemplateId();
       x z = this.a.z;
       KSTemplateDetailInfo mTemplateId = (z != null)? z.mTemplateId: null;
       if (a.g(templateId, mTemplateId) ^ 0x01) {
          return;
       }else {
          this.a.E.y0(p0);
          p0.F0(p0.C0().a);
          KSTemplateDetailInfo kSTemplateDe = p0.k0();
          a.o(kSTemplateDe, "project.templateInfo");
          if (!e.q(kSTemplateDe) && (p0.c0() && e.A())) {
             Activity activity = this.a.getActivity();
             a.m(activity);
             e.E(activity, new x$e$c(this, p0), null);
             return;
          }else {
             this.a.P8(p0);
             this.a.E.c(this);
             return;
          }
       }
    }
    public void Z(KSTemplateDetailInfo p0,int p1){
       b.e(this, p0, p1);
    }
    public void a0(){
       b.f(this);
    }
}
