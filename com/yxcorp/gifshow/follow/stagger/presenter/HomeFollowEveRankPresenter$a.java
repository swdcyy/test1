package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$a;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter;
import java.lang.Object;
import g50.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e50.g;
import e50.o;

public final class HomeFollowEveRankPresenter$a implements g	// class@0011e9
{
    public final HomeFollowEveRankPresenter b;

    public void HomeFollowEveRankPresenter$a(HomeFollowEveRankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowEveRankPresenter$a.class, "1")) {
       }else {
          HomeFollowEveRankPresenter$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, HomeFollowEveRankPresenter.class, "10") && p0 != null) {
             tb.v.j(p0.a());
             tb.v.g(tb.W8());
          }
       }
       return;
    }
}
