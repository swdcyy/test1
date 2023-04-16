package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$g;
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
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class FollowSlideUnFollowPresenter$g implements r	// class@00113b
{
    public final FollowSlideUnFollowPresenter b;

    public void FollowSlideUnFollowPresenter$g(FollowSlideUnFollowPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideUnFollowPresenter$g.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          p0 = this.b.P8().O();
          b = (p0 != null && p0.C() == true)? true: false;
       }
       return b;
    }
}
