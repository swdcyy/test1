package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$a;
import erd.g;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import java.lang.Object;
import g50.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ff6.d;

public final class HomeHotRankPresenter$a implements g	// class@0018c8
{
    public final HomeHotRankPresenter b;

    public void HomeHotRankPresenter$a(HomeHotRankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotRankPresenter$a.class, "1")) {
       }else {
          HomeHotRankPresenter$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, HomeHotRankPresenter.class, "16") && p0 != null) {
             tb.P8();
             tb.x.i(p0.a());
          }
       }
       return;
    }
}
