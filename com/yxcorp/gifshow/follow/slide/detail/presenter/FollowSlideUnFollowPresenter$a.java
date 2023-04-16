package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$a;
import erd.r;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowSlideUnFollowPresenter$a implements r	// class@001135
{
    public static final FollowSlideUnFollowPresenter$a b;

    static {
       FollowSlideUnFollowPresenter$a.b = new FollowSlideUnFollowPresenter$a();
    }
    public void FollowSlideUnFollowPresenter$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideUnFollowPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "event");
          b = (p0 == FragmentEvent.RESUME)? true: false;
       }
       return b;
    }
}
