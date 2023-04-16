package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$d;
import df5.e;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class FeaturedRankPrefetchPresenter$d implements e	// class@000f27
{
    public final FeaturedRankPrefetchPresenter a;

    public void FeaturedRankPrefetchPresenter$d(FeaturedRankPrefetchPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0){
       FeaturedRankPrefetchPresenter$d uod = FeaturedRankPrefetchPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       uod = this.a;
       uod.A = p0;
       if (p0) {
          uod.S8();
       }else {
          uod.V8();
       }
       return;
    }
}
