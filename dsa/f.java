package dsa.f;
import da5.d;
import da5.e$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import yta.w0;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import com.kwai.component.feedstaggercard.model.CardStyle;
import zta.h;
import zta.g;
import java.lang.Integer;
import zta.c;
import aua.j;
import aua.e;
import aua.h;
import aua.i;
import aua.r;
import aua.q;
import aua.f;
import com.kwai.component.feedstaggercard.presenter.e;
import zta.e;
import ja5.h;
import com.kwai.component.feedstaggercard.presenter.d;
import ja5.j;
import android.view.View;
import com.yxcorp.gifshow.homepage.presenter.j;
import xf6.i;
import yta.d0;
import com.kwai.component.feedstaggercard.presenter.b;
import com.yxcorp.gifshow.homepage.presenter.PhotoCoverSurveyPresenter;
import bua.c;
import com.yxcorp.gifshow.homepage.presenter.z;
import yta.z;
import ja5.d;
import yta.q0;
import bua.d;

public final class f implements d, e$a	// class@002517
{
    public PhotoItemViewParam a;
    public CardStyle b;

    public void f(){
       super();
    }
    public d a(PresenterV2 p0){
       f obj = PatchProxy.applyOneRefsWithListener(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       f tb = this.b;
       if (tb == null) {
          a.S("cardStyle");
       }
       f ta = this.a;
       if (ta == null) {
          a.S("param");
       }
       PhotoItemViewParam mPage = ta.mPage;
       f ta1 = this.a;
       if (ta1 == null) {
          a.S("param");
       }
       p0.U7(new w0(tb, mPage, ta1.mEnableLocalNewV4UI));
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
          }else {
             i oi = 2;
             tb = this.a;
             if (tb == null) {
                a.S("param");
             }
             if (oi == tb.mFeedMode) {
                p0.U7(new i());
             }
          }
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
       PatchProxy.onMethodExit(f.class, "4");
       return this;
    }
    public d b(PresenterV2 p0){
       f tb;
       f obj = PatchProxy.applyOneRefsWithListener(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.b;
       String str = "cardStyle";
       if (obj == null) {
          a.S(str);
       }
       if (obj.mBottomType == 8) {
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          p0.U7(new e(tb));
       }
       obj = this.b;
       if (obj == null) {
          a.S(str);
       }
       if (!CardStyle.isV1Bottom(obj.mBottomType)) {
          obj = this.b;
          if (obj == null) {
             a.S(str);
          }
          if (!CardStyle.isV4Bottom(obj.mBottomType)) {
             obj = this.b;
             if (obj == null) {
                a.S(str);
             }
             if (!CardStyle.isV6Bottom(obj.mBottomType)) {
                tb = this.b;
                if (tb == null) {
                   a.S(str);
                }
                p0.U7(new h(tb));
             }
          }
       }
    label_006e :
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mEnablePlayCoverGif != null) {
          p0.U7(new d());
       }
       PatchProxy.onMethodExit(f.class, "3");
       return this;
    }
    public d c(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       p0.U7(new j());
       PatchProxy.onMethodExit(f.class, "2");
       return this;
    }
    public d d(PhotoItemViewParam p0,View p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
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
       f tb;
       f obj = PatchProxy.applyOneRefsWithListener(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       f ta = this.a;
       if (ta == null) {
          a.S("param");
       }
       p0.U7(new j(ta.mPage));
       if (i.c("KEY_FEEDS_DEBUG_LOG_OPEN")) {
          p0.U7(new d0());
       }
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mEnableCoverPrefetch != null) {
          p0.U7(new b());
       }
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       String str = "cardStyle";
       if (obj.mEnablePhotoRate != null) {
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          p0.U7(new PhotoCoverSurveyPresenter(tb));
       }
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mPage == 8) {
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          p0.U7(new c(tb));
       }
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mEnablePhotoReduce != null) {
          ta = this.a;
          if (ta == null) {
             a.S("param");
          }
          p0.U7(new z(ta.mPage));
       }
       PatchProxy.onMethodExit(f.class, "6");
       return this;
    }
    public d f(PresenterV2 p0){
       f obj = PatchProxy.applyOneRefsWithListener(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       f tb = this.b;
       if (tb == null) {
          a.S("cardStyle");
       }
       f ta = this.a;
       if (ta == null) {
          a.S("param");
       }
       PhotoItemViewParam mPage = ta.mPage;
       f ta1 = this.a;
       if (ta1 == null) {
          a.S("param");
       }
       boolean b = true;
       boolean b1 = (ta1.mPage == 9)? true: false;
       p0.U7(new z(tb, mPage, b1));
       p0.U7(new d());
       p0.U7(new q0());
       obj = this.a;
       if (obj == null) {
          a.S("param");
       }
       if (obj.mIsPymiLiving != null) {
          obj = this.b;
          if (obj == null) {
             a.S("cardStyle");
          }
          if (!CardStyle.isV4Bottom(obj.mBottomType)) {
             obj = this.b;
             if (obj == null) {
                a.S("cardStyle");
             }
             if (!CardStyle.isV6Bottom(obj.mBottomType)) {
             label_0089 :
                b = false;
             label_008a :
                tb = this.b;
                if (tb == null) {
                   a.S("cardStyle");
                }
                p0.U7(new d(b, tb));
             }
          }
          obj = this.a;
          if (obj == null) {
             a.S("param");
          }
          if (obj.mPage == 8) {
             goto label_008a ;
          }else {
             goto label_0089 ;
          }
       }
       PatchProxy.onMethodExit(f.class, "5");
       return this;
    }
}
