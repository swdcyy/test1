package com.kuaishou.merchant.home2.dynamic.feed.LiveSlidePlayPagePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.feed.LiveSlidePlayPagePresenter$multiTabSelectCallback$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.home2.dynamic.feed.LiveSlidePlayPagePresenter$mLiveSlidePlayService$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import lx3.n;
import lx3.k;
import java.lang.Number;

public final class LiveSlidePlayPagePresenter extends PresenterV2	// class@001749
{
    public int p;
    public k q;
    public final p r;
    public final p s;
    public View t;

    public void LiveSlidePlayPagePresenter(){
       super();
       this.r = s.c(new LiveSlidePlayPagePresenter$multiTabSelectCallback$2(this));
       this.s = s.c(new LiveSlidePlayPagePresenter$mLiveSlidePlayService$2(this));
    }
    public void E8(){
       LiveSlidePlayPagePresenter liveSlidePla = LiveSlidePlayPagePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveSlidePla, "4")) {
          return;
       }
       LiveSlidePlayPagePresenter tq = this.q;
       if (tq == null) {
          a.S("multiTabService");
       }
       n on = PatchProxy.apply(objArray, this, liveSlidePla, "1");
       if (on == PatchProxyResult.class) {
          on = this.r.getValue();
       }
       tq.c(on);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveSlidePlayPagePresenter.class, "3")) {
          return;
       }
       this.p = this.r8("MERCHANT_HOME_LIVE_SOURCE_TYPE").intValue();
       this.q = this.r8("MERCHANT_HOME_MULTI_TAB_SERVICE");
       return;
    }
}
