package eja.p;
import da5.d;
import da5.e$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import eja.v;
import com.kwai.component.feedstaggercard.model.CardStyle;
import zta.a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import wja.b;
import eja.d1;
import aua.j;
import tkd.b;
import tkd.d;
import tm5.a;
import aua.r;
import aua.q;
import aua.f;
import com.kwai.component.feedstaggercard.presenter.e;
import eja.a0;
import ja5.h;
import com.kwai.component.feedstaggercard.presenter.d;
import ja5.j;
import android.view.View;
import xf6.i;
import yta.d0;
import com.kwai.component.feedstaggercard.presenter.b;
import yta.z;
import ja5.d;
import yta.q0;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import os5.l;
import eja.q;

public final class p implements d, e$a	// class@0026eb
{
    public PhotoItemViewParam a;
    public CardStyle b;

    public void p(){
       super();
    }
    public d a(PresenterV2 p0){
       p obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       p tb = this.b;
       if (tb == null) {
          a.S("mCardStyle");
       }
       p0.U7(new v(tb));
       obj = this.b;
       if (obj == null) {
          a.S("mCardStyle");
       }
       if (obj.mBottomType == 5) {
          tb = this.b;
          if (tb == null) {
             a.S("mCardStyle");
          }
          p ta = this.a;
          if (ta == null) {
             a.S("mParam");
          }
          p0.U7(new a(tb, ta.mDescLinesLimit));
          boolean b = true;
          ta = this.b;
          if (ta == null) {
             a.S("mCardStyle");
          }
          p0.U7(new b(b, ta));
       }else {
          obj = this.b;
          if (obj == null) {
             a.S("mCardStyle");
          }
          if (obj.mBottomType == 4) {
             tb = this.b;
             if (tb == null) {
                a.S("mCardStyle");
             }
             p0.U7(new d1(tb));
          }else {
             tb = this.b;
             if (tb == null) {
                a.S("mCardStyle");
             }
             p0.U7(new j(tb));
             a uoa = d.a(0x2bcad739);
             tb = this.a;
             if (tb == null) {
                a.S("mParam");
             }
             p0.U7(uoa.bB(tb.mFeedMode));
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
       tb = this.a;
       if (tb == null) {
          a.S("mParam");
       }
       p0.U7(new e(tb));
       PatchProxy.onMethodExit(p.class, "4");
       return this;
    }
    public d b(PresenterV2 p0){
       p obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "3");
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
          p0.U7(new a0());
       }else {
          p tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          p0.U7(new h(tb));
       }
       obj = this.a;
       if (obj == null) {
          a.S("mParam");
       }
       if (obj.mEnablePlayCoverGif != null) {
          p0.U7(new d());
       }
       PatchProxy.onMethodExit(p.class, "3");
       return this;
    }
    public d c(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       p0.U7(new j());
       PatchProxy.onMethodExit(p.class, "2");
       return this;
    }
    public d d(PhotoItemViewParam p0,View p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, p.class, "1");
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
       a obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       int i = 0x2bcad739;
       a uoa = d.a(i);
       p ta = this.a;
       if (ta == null) {
          a.S("mParam");
       }
       p0.U7(uoa.to(ta.mPage));
       if (i.c("KEY_FEEDS_DEBUG_LOG_OPEN")) {
          p0.U7(new d0());
       }
       p ta1 = this.a;
       if (ta1 == null) {
          a.S("mParam");
       }
       if (ta1.mEnableCoverPrefetch != null) {
          p0.U7(new b());
       }
       ta1 = this.a;
       if (ta1 == null) {
          a.S("mParam");
       }
       if (ta1.mEnablePhotoReduce != null) {
          obj = d.a(i);
          ta1 = this.a;
          if (ta1 == null) {
             a.S("mParam");
          }
          p0.U7(obj.Rv(ta1.mPage));
       }
       PatchProxy.onMethodExit(p.class, "6");
       return this;
    }
    public d f(PresenterV2 p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "presenter");
       p tb = this.b;
       if (tb == null) {
          a.S("mCardStyle");
       }
       p ta = this.a;
       String str = "mParam";
       if (ta == null) {
          a.S(str);
       }
       PhotoItemViewParam mPage = ta.mPage;
       p ta1 = this.a;
       if (ta1 == null) {
          a.S(str);
       }
       boolean b = (ta1.mPage == 9)? true: false;
       p0.U7(new z(tb, mPage, b));
       p0.U7(new d());
       p0.U7(new q0());
       if (LivePluginManager.c()) {
          p0.U7(LivePluginManager.b(l.class).BU());
       }
       tb = this.b;
       if (tb == null) {
          a.S("mCardStyle");
       }
       p0.U7(new q(tb));
       PatchProxy.onMethodExit(p.class, "5");
       return this;
    }
}
