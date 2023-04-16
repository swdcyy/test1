package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$c;
import df5.b;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import df5.a;

public final class FeaturedRankPrefetchPresenter$c implements b	// class@000f26
{
    public final FeaturedRankPrefetchPresenter a;

    public void FeaturedRankPrefetchPresenter$c(FeaturedRankPrefetchPresenter p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedRankPrefetchPresenter$c.class, "1")) {
          return;
       }
       FeaturedRankPrefetchPresenter$c ta = this.a;
       if (ta.B == null) {
          ta.A = true;
       }
       ta.B = true;
       ta.C = 0;
       ta.v = p0;
       ta.S8();
       return;
    }
    public void c(QPhoto p0){
       a.c(this, p0);
    }
}
