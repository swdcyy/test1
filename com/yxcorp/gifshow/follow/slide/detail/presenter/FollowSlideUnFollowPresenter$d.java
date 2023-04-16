package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$d;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class FollowSlideUnFollowPresenter$d implements g	// class@001138
{
    public final FollowSlideUnFollowPresenter b;

    public void FollowSlideUnFollowPresenter$d(FollowSlideUnFollowPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideUnFollowPresenter$d.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.onEventMainThread(p0);
       }
       return;
    }
}
