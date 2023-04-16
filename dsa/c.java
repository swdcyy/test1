package dsa.c;
import da5.d;
import da5.e$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yta.w0;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.kwai.component.feedstaggercard.model.CardStyle;
import zta.h;
import zta.g;
import java.lang.Integer;
import zta.c;
import zta.i;
import com.kwai.component.feedstaggercard.presenter.e;
import zta.e;
import com.kwai.component.feedstaggercard.presenter.d;
import ja5.j;
import rz6.a;
import rz6.a$a;
import ja5.o;
import wa5.e;
import java.lang.CharSequence;
import ja5.n;
import android.view.View;
import com.yxcorp.gifshow.homepage.presenter.j;
import xf6.i;
import yta.d0;
import com.yxcorp.gifshow.homepage.presenter.z;
import com.kwai.component.feedstaggercard.presenter.b;
import com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter;
import yta.z;
import ja5.d;
import yta.q0;

public class c implements d, e$a	// class@002511
{
    public PhotoItemViewParam a;
    public CardStyle b;

    public void c(){
       super();
    }
    public d a(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new w0(this.b, this.a.mPage, false));
       p0.U7(new h(this.b));
       p0.U7(new g(Integer.valueOf(this.a.getFeedMode())));
       p0.U7(new c(this.b));
       p0.U7(new i(this.b));
       p0.U7(new e(this.a));
       PatchProxy.onMethodExit(c.class, "4");
       return this;
    }
    public d b(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new e(this.b));
       p0.U7(new d());
       PatchProxy.onMethodExit(c.class, "3");
       return this;
    }
    public d c(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new j());
       if (a.e.a().b()) {
          p0.U7(new o());
       }else if((e.a()).contains("TOP_CARD")){
          p0.U7(new n());
       }
       PatchProxy.onMethodExit(c.class, "2");
       return this;
    }
    public d d(PhotoItemViewParam p0,View p1,CardStyle p2){
       this.a = p0;
       this.b = p2;
       return this;
    }
    public d e(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new j(this.a.mPage));
       if (i.c("KEY_FEEDS_DEBUG_LOG_OPEN")) {
          p0.U7(new d0());
       }
       p0.U7(new z(this.a.mPage));
       p0.U7(new b());
       p0.U7(new PhotoCoverSurveyPresenter(this.b));
       PatchProxy.onMethodExit(c.class, "6");
       return this;
    }
    public d f(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.U7(new z(this.b, this.a.mPage, false));
       p0.U7(new d());
       p0.U7(new q0());
       PatchProxy.onMethodExit(c.class, "5");
       return this;
    }
}
