package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$b;
import erd.r;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;

public final class FollowSlideUnFollowPresenter$b implements r	// class@001136
{
    public final FollowSlideUnFollowPresenter b;

    public void FollowSlideUnFollowPresenter$b(FollowSlideUnFollowPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideUnFollowPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = this.b.q.isEmpty() ^ 0x01;
       }
       return b;
    }
}
