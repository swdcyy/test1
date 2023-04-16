package dsa.g;
import da5.d;
import da5.e$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.component.feedstaggercard.model.CardStyle;
import zta.h;
import zta.g;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Integer;
import zta.c;
import aua.r;
import aua.j;
import aua.e;
import aua.h;
import aua.q;
import aua.f;
import com.kwai.component.feedstaggercard.presenter.e;
import wh5.c;
import lua.d;
import com.yxcorp.gifshow.homepage.serchcard.e;
import zta.e;
import ja5.h;
import aua.n;
import com.kwai.component.feedstaggercard.presenter.d;
import ja5.j;
import android.view.View;
import yta.m1;
import com.yxcorp.gifshow.homepage.presenter.v;
import tkd.b;
import tkd.d;
import nl9.h0;
import xf6.i;
import yta.d0;
import com.yxcorp.gifshow.homepage.presenter.r;
import com.yxcorp.gifshow.homepage.presenter.z;
import com.yxcorp.gifshow.homepage.presenter.h;
import com.yxcorp.gifshow.homepage.presenter.t;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import yta.m3;
import com.kwai.component.feedstaggercard.presenter.b;
import com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter;
import ja5.g;
import yta.z;
import nsd.u;
import com.yxcorp.gifshow.homepage.presenter.u;
import ja5.d;
import yta.v1;
import com.kwai.component.feedstaggercard.presenter.f;
import yta.x;

public final class g implements d, e$a	// class@002519
{
    public PhotoItemViewParam a;
    public CardStyle b;

    public void g(){
       super();
    }
    public d a(PresenterV2 p0){
       g tb;
       g obj = PatchProxy.applyOneRefsWithListener(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.b;
       if (obj == null) {
          a.S("cardStyle");
       }
       if (obj.mBottomType == 8) {
          tb = this.b;
          if (tb == null) {
             a.S("cardStyle");
          }
          p0.U7(new h(tb));
          tb = this.a;
          if (tb == null) {
             a.S("param");
          }
          p0.U7(new g(Integer.valueOf(tb.getFeedMode())));
          tb = this.b;
          if (tb == null) {
             a.S("cardStyle");
          }
          p0.U7(new c(tb));
       }else {
          obj = this.a;
          if (obj == null) {
             a.S("param");
          }
          if (obj.mUseCustomRelation == null) {
             tb = this.a;
             if (tb == null) {
                a.S("param");
             }
             p0.U7(new r(tb.mEnableFavorite));
          }
          tb = this.b;
          if (tb == null) {
             a.S("cardStyle");
          }
          p0.U7(new j(tb));
          tb = this.a;
          if (tb == null) {
             a.S("param");
          }
          p0.U7(new e(tb.mFeedMode));
          h oh = 1;
          tb = this.a;
          if (tb == null) {
             a.S("param");
          }
          if (oh == tb.mFeedMode) {
             p0.U7(new h());
          }
          obj = this.a;
          if (obj == null) {
             a.S("param");
          }
          if (obj.mEnableFavorite != null) {
             p0.U7(new q());
          }
          p0.U7(new f());
       }
       tb = this.a;
       if (tb == null) {
          a.S("param");
       }
       p0.U7(new e(tb));
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mEnableFeedSearchCard != null && (!c.b() && d.b())) {
          tb = this.b;
          if (tb == null) {
             a.S("cardStyle");
          }
          p0.U7(new e(tb));
       }
    label_00fb :
       PatchProxy.onMethodExit(g.class, "4");
       return this;
    }
    public d b(PresenterV2 p0){
       g obj = PatchProxy.applyOneRefsWithListener(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.b;
       if (obj == null) {
          a.S("cardStyle");
       }
       if (obj.mBottomType == 8) {
          g tb = this.b;
          if (tb == null) {
             a.S("cardStyle");
          }
          p0.U7(new e(tb));
       }else {
          obj = this.a;
          if (obj == null) {
             a.S("param");
          }
          if (obj.mDisablePhotoAvatarWithLive != null) {
             p0.U7(new h());
          }else {
             p0.U7(new n());
          }
       }
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mEnablePlayCoverGif != null) {
          p0.U7(new d());
       }
       PatchProxy.onMethodExit(g.class, "3");
       return this;
    }
    public d c(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       p0.U7(new j());
       PatchProxy.onMethodExit(g.class, "2");
       return this;
    }
    public d d(PhotoItemViewParam p0,View p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "xparam");
       a.p(p1, "itemView");
       a.p(p2, "xcardStyle");
       this.a = p0;
       this.b = p2;
       return this;
    }
    public d e(PresenterV2 p0){
       g obj = PatchProxy.applyOneRefsWithListener(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.a;
       String str = "param";
       if (obj == null) {
          a.S(str);
       }
       PhotoItemViewParam mPage = obj.mPage;
       g ta = this.a;
       if (ta == null) {
          a.S(str);
       }
       if (ta.mCustomClick == null) {
          g tb = this.b;
          if (tb == null) {
             a.S("cardStyle");
          }
          p0.U7(new m1(mPage, tb));
       }
       p0.U7(new v());
       p0.U7(d.a(-536296199).yj());
       if (i.c("KEY_FEEDS_DEBUG_LOG_OPEN")) {
          p0.U7(new d0());
       }
       obj = this.a;
       if (obj == null) {
          a.S(str);
       }
       if (obj.mShowFansTopMask != null) {
          p0.U7(new r());
       }
       obj = this.a;
       if (obj == null) {
          a.S(str);
       }
       if (obj.mEnablePhotoReduce != null) {
          ta = this.a;
          if (ta == null) {
             a.S(str);
          }
          p0.U7(new z(ta.mPage));
       }
       obj = this.a;
       if (obj == null) {
          a.S(str);
       }
       if (obj.mEnableUploadProgress != null) {
          obj = this.a;
          if (obj == null) {
             a.S(str);
          }
          if (obj.mEnableFlowFeedback != null) {
             ta = this.b;
             if (ta == null) {
                a.S("cardStyle");
             }
             p0.U7(new h(ta));
          }
          obj = this.a;
          if (obj == null) {
             a.S(str);
          }
          if (obj.mEnableFansTopPromote != null) {
             ta = this.b;
             if (ta == null) {
                a.S("cardStyle");
             }
             p0.U7(new t(ta));
          }
          ta = this.b;
          if (ta == null) {
             a.S("cardStyle");
          }
          p0.U7(new PhotoSharePresenter(ta));
          p0.U7(new m3());
       }
       obj = this.a;
       if (obj == null) {
          a.S(str);
       }
       if (obj.mEnableCoverPrefetch != null) {
          p0.U7(new b());
       }
       obj = this.a;
       if (obj == null) {
          a.S(str);
       }
       if (obj.mEnablePhotoRate != null) {
          g tb1 = this.b;
          if (tb1 == null) {
             a.S("cardStyle");
          }
          p0.U7(new PhotoCoverSurveyPresenter(tb1));
       }
       PatchProxy.onMethodExit(g.class, "6");
       return this;
    }
    public d f(PresenterV2 p0){
       g obj = PatchProxy.applyOneRefsWithListener(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.a;
       String str = "param";
       if (obj == null) {
          a.S(str);
       }
       PhotoItemViewParam mPage = obj.mPage;
       p0.U7(new g());
       g tb = this.b;
       if (tb == null) {
          a.S("cardStyle");
       }
       z oz = new z(tb, mPage, false, 4, null);
       p0.U7(obj);
       p0.U7(new u());
       p0.U7(new d());
       g tb1 = this.b;
       if (tb1 == null) {
          a.S("cardStyle");
       }
       p0.U7(new v1(tb1));
       obj = this.a;
       if (obj == null) {
          a.S(str);
       }
       if (obj.mShowStoryTag != null) {
          p0.U7(new f(true));
       }
       p0.U7(new x());
       PatchProxy.onMethodExit(g.class, "5");
       return this;
    }
}
