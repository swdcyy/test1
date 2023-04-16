package eja.n0;
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
import eja.d1;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowSummaryPresenter;
import zta.a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import wja.b;
import aua.r;
import aua.j;
import tkd.b;
import tkd.d;
import tm5.a;
import aua.q;
import aua.f;
import com.kwai.component.feedstaggercard.presenter.e;
import ja5.h;
import eja.a0;
import com.kwai.component.feedstaggercard.presenter.d;
import com.yxcorp.gifshow.follow.stagger.presenter.PlcCoverPresenter;
import ja5.j;
import android.view.View;
import yta.m1;
import com.yxcorp.gifshow.homepage.presenter.v;
import nl9.h0;
import xf6.i;
import yta.d0;
import com.yxcorp.gifshow.homepage.presenter.r;
import com.yxcorp.gifshow.homepage.presenter.h;
import com.kwai.component.feedstaggercard.presenter.b;
import ja5.g;
import yta.z;
import nsd.u;
import com.yxcorp.gifshow.homepage.presenter.u;
import ja5.d;
import yta.v1;
import com.kwai.component.feedstaggercard.presenter.f;
import yta.x;

public final class n0 implements d, e$a	// class@0026e0
{
    public PhotoItemViewParam a;
    public CardStyle b;

    public void n0(){
       super();
    }
    public d a(PresenterV2 p0){
       n0 tb;
       n0 ta;
       n0 obj = PatchProxy.applyOneRefsWithListener(p0, this, n0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.b;
       String str = "mCardStyle";
       if (obj == null) {
          a.S(str);
       }
       if (obj.mBottomType == 4) {
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          p0.U7(new d1(tb));
          p0.U7(new HomeFollowSummaryPresenter());
       }else {
          obj = this.b;
          if (obj == null) {
             a.S(str);
          }
          if (obj.mBottomType == 5) {
             tb = this.b;
             if (tb == null) {
                a.S(str);
             }
             n0 ta1 = this.a;
             if (ta1 == null) {
                a.S("mParam");
             }
             p0.U7(new a(tb, ta1.mDescLinesLimit));
             ta1 = this.b;
             if (ta1 == null) {
                a.S(str);
             }
             p0.U7(new b(false, ta1));
          }else {
             obj = this.a;
             if (obj == null) {
                a.S("mParam");
             }
             if (obj.mUseCustomRelation == null) {
                tb = this.a;
                if (tb == null) {
                   a.S("mParam");
                }
                p0.U7(new r(tb.mEnableFavorite));
             }
             tb = this.b;
             if (tb == null) {
                a.S(str);
             }
             p0.U7(new j(tb));
             a uoa = d.a(0x2bcad739);
             ta = this.a;
             if (ta == null) {
                a.S("mParam");
             }
             p0.U7(uoa.bB(ta.mFeedMode));
             obj = this.a;
             if (obj == null) {
                a.S("mParam");
             }
             if (obj.mEnableFavorite != null) {
                p0.U7(new q());
             }
             p0.U7(new f());
          }
       }
       ta = this.a;
       if (ta == null) {
          a.S("mParam");
       }
       p0.U7(new e(ta));
       PatchProxy.onMethodExit(n0.class, "4");
       return this;
    }
    public d b(PresenterV2 p0){
       n0 obj = PatchProxy.applyOneRefsWithListener(p0, this, n0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.b;
       String str = "mCardStyle";
       if (obj == null) {
          a.S(str);
       }
       if (obj.mBottomType == 5) {
          n0 tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          p0.U7(new h(tb));
       }else {
          obj = this.b;
          if (obj == null) {
             a.S(str);
          }
          if (obj.mBottomType == 4) {
             p0.U7(new a0());
          }else {
             obj = this.a;
             if (obj == null) {
                a.S("mParam");
             }
             if (obj.mDisablePhotoAvatarWithLive != null) {
                p0.U7(new h());
             }else {
                p0.U7(d.a(0x2bcad739).Ga());
             }
          }
       }
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       if (obj.mEnablePlayCoverGif != null) {
          p0.U7(new d());
       }
       PatchProxy.onMethodExit(n0.class, "3");
       return this;
    }
    public d c(PresenterV2 p0){
       n0 obj = PatchProxy.applyOneRefsWithListener(p0, this, n0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       if (obj.mEnableCoverPlc != null) {
          p0.U7(new PlcCoverPresenter());
       }
       p0.U7(new j());
       PatchProxy.onMethodExit(n0.class, "2");
       return this;
    }
    public d d(PhotoItemViewParam p0,View p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, n0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       a.p(p1, "itemView");
       a.p(p2, "cardStyle");
       this.a = p0;
       this.b = p2;
       return this;
    }
    public d e(PresenterV2 p0){
       n0 tb;
       a uoa;
       n0 obj = PatchProxy.applyOneRefsWithListener(p0, this, n0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       PhotoItemViewParam mPage = obj.mPage;
       n0 ta = this.a;
       if (ta == null) {
          a.S("mParam");
       }
       if (ta.mCustomClick == null) {
          tb = this.b;
          if (tb == null) {
             a.S("mCardStyle");
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
          a.S("mParam");
       }
       if (obj.mShowFansTopMask != null) {
          p0.U7(new r());
       }
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       if (obj.mEnablePhotoReduce != null) {
          uoa = d.a(0x2bcad739);
          tb = this.a;
          if (tb == null) {
             a.S("mParam");
          }
          p0.U7(uoa.Rv(tb.mPage));
       }
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       if (obj.mEnableUploadProgress != null) {
          obj = this.a;
          if (obj == null) {
             a.S("mParam");
          }
          if (obj.mEnableFlowFeedback != null) {
             tb = this.b;
             if (tb == null) {
                a.S("mCardStyle");
             }
             p0.U7(new h(tb));
          }
          obj = this.a;
          if (obj == null) {
             a.S("mParam");
          }
          if (obj.mEnableFansTopPromote != null) {
             uoa = d.a(0x2bcad739);
             tb = this.b;
             if (tb == null) {
                a.S("mCardStyle");
             }
             p0.U7(uoa.eP(tb));
          }
          uoa = d.a(0x2bcad739);
          tb = this.b;
          if (tb == null) {
             a.S("mCardStyle");
          }
          p0.U7(uoa.PF(tb));
          p0.U7(d.a(0x2bcad739).Sc());
       }
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       if (obj.mEnableCoverPrefetch != null) {
          p0.U7(new b());
       }
       PatchProxy.onMethodExit(n0.class, "6");
       return this;
    }
    public d f(PresenterV2 p0){
       n0 obj = PatchProxy.applyOneRefsWithListener(p0, this, n0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       obj = this.a;
       String str = "mParam";
       if (obj == null) {
          a.S(str);
       }
       PhotoItemViewParam mPage = obj.mPage;
       p0.U7(new g());
       n0 tb = this.b;
       if (tb == null) {
          a.S("mCardStyle");
       }
       z oz = new z(tb, mPage, false, 4, null);
       p0.U7(obj);
       p0.U7(new u());
       p0.U7(new d());
       n0 tb1 = this.b;
       if (tb1 == null) {
          a.S("mCardStyle");
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
       PatchProxy.onMethodExit(n0.class, "5");
       return this;
    }
}
