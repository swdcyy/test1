package cn9.b;
import da5.d;
import da5.e$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zta.h;
import com.kwai.component.feedstaggercard.model.CardStyle;
import zta.g;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Integer;
import zta.c;
import zta.i;
import com.kwai.component.feedstaggercard.presenter.e;
import wh5.c;
import lua.d;
import com.yxcorp.gifshow.commontab.util.UniversalTabExperimentManager;
import com.yxcorp.gifshow.homepage.serchcard.e;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import jua.b;
import ok.x;
import com.yxcorp.gifshow.homepage.recommendedPopup.model.RecommendedConfig;
import hua.a;
import zta.e;
import com.kwai.component.feedstaggercard.presenter.d;
import ja5.j;
import android.view.View;
import yta.m1;
import com.yxcorp.gifshow.homepage.presenter.v;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kwai.component.feedstaggercard.presenter.b;
import com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter;
import oxc.i;
import com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil;
import fua.k;
import fua.c;
import yta.z;
import com.yxcorp.gifshow.homepage.presenter.u;
import ja5.d;
import yta.v1;
import yta.x;

public class b implements d, e$a	// class@000696
{
    public PhotoItemViewParam a;
    public CardStyle b;

    public void b(){
       super();
    }
    public d a(PresenterV2 p0){
       x obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new h(this.b));
       p0.U7(new g(Integer.valueOf(this.a.getFeedMode())));
       p0.U7(new c(this.b));
       p0.U7(new i(this.b));
       p0.U7(new e(this.a));
       if (!c.b() && (d.b() && UniversalTabExperimentManager.a())) {
          p0.U7(new e(this.b));
       }
    label_0065 :
       if (HomeCardExperimentUtil.d()) {
          obj = b.a;
          if (obj.get() != null && (obj.get().mHotFeedCard != null && UniversalTabExperimentManager.a())) {
             p0.U7(new a());
          }
       }
       PatchProxy.onMethodExit(b.class, "4");
       return this;
    }
    public d b(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new e(this.b));
       p0.U7(new d());
       PatchProxy.onMethodExit(b.class, "3");
       return this;
    }
    public d c(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new j());
       PatchProxy.onMethodExit(b.class, "2");
       return this;
    }
    public d d(PhotoItemViewParam p0,View p1,CardStyle p2){
       this.a = p0;
       this.b = p2;
       return this;
    }
    public d e(PresenterV2 p0){
       HomeCardExperimentUtil obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new m1(this.a.mPage, this.b));
       p0.U7(new v());
       p0.U7(d.a(-536296199).yj());
       p0.U7(new b());
       p0.U7(new PhotoCoverSurveyPresenter(this.b));
       p0.U7(new i());
       if (UniversalTabExperimentManager.a()) {
          obj = HomeCardExperimentUtil.e;
          if (obj.a() == 1) {
             p0.U7(new k());
             p0.U7(new c());
          }else if(obj.a() == 2){
             p0.U7(new c());
          }
       }
       PatchProxy.onMethodExit(b.class, "6");
       return this;
    }
    public d f(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new z(this.b, this.a.mPage, false));
       p0.U7(new u());
       p0.U7(new d());
       p0.U7(new v1(this.b));
       p0.U7(new x());
       PatchProxy.onMethodExit(b.class, "5");
       return this;
    }
}
