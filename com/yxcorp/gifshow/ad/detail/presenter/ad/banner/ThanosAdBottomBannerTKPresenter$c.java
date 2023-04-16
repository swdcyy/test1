package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$c;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import java.util.Objects;
import qz8.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import com.yxcorp.gifshow.ad.tachikoma.a;

public final class ThanosAdBottomBannerTKPresenter$c extends a	// class@00159a
{
    public final ThanosAdBottomBannerTKPresenter b;

    public void ThanosAdBottomBannerTKPresenter$c(ThanosAdBottomBannerTKPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, ThanosAdBottomBannerTKPresenter$c.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("TachikomaSurvey", "becomesDetachedOnPageSelected: --", objArray);
       ThanosAdBottomBannerTKPresenter$c tb = this.b;
       tb.B = true;
       if (tb.S8().isRunning()) {
          this.b.S8().end();
       }
       this.b.S8().removeAllUpdateListeners();
       this.b.S8().removeAllListeners();
       ThanosAdBottomBannerTKPresenter q = this.b.q;
       if (q != null) {
          ViewGroup$LayoutParams layoutParams = q.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = i;
          }
       }
       ThanosAdBottomBannerTKPresenter q1 = this.b.q;
       if (q1 != null) {
          q1.requestLayout();
       }
       q1 = this.b.w;
       if (q1 != null) {
          q1.g();
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosAdBottomBannerTKPresenter$c.class, "1")) {
          return;
       }
       if (!this.b.R8()) {
          return;
       }
       ThanosAdBottomBannerTKPresenter$c tb = this.b;
       boolean b = false;
       tb.A = b;
       tb.B = b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ThanosAdBottomBannerTKPresenter.class, "4")) {
          objArray = new Object[b];
          j0.f("TachikomaSurvey", "initAndLoadSurvey: --", objArray);
          ThanosAdBottomBannerTKPresenter v = tb.v;
          if (v != null) {
             tb.x.b(v, new a(tb));
             ThanosAdBottomBannerTKPresenter w = tb.w;
             if (w != null) {
                w.h();
             }
          }
       }
       return;
    }
}
