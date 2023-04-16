package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$b;
import erd.g;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kp.r1;
import ff6.d;
import brd.t;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class HomeHotRankPresenter$b implements g	// class@0018c9
{
    public final HomeHotRankPresenter b;

    public void HomeHotRankPresenter$b(HomeHotRankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotRankPresenter$b.class, "1")) {
       }else {
          r1.V4(p0, true);
          this.b.x.j(p0);
          this.b.x.a(0).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
}
