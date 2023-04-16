package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$e;
import erd.r;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import cia.w;

public final class FollowSlideUnFollowPresenter$e implements r	// class@001139
{
    public final FollowSlideUnFollowPresenter b;

    public void FollowSlideUnFollowPresenter$e(FollowSlideUnFollowPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideUnFollowPresenter$e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = this.b.P8().P();
       }
       return b;
    }
}
