package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$f;
import erd.r;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowSlideUnFollowPresenter$f implements r	// class@00113a
{
    public static final FollowSlideUnFollowPresenter$f b;

    static {
       FollowSlideUnFollowPresenter$f.b = new FollowSlideUnFollowPresenter$f();
    }
    public void FollowSlideUnFollowPresenter$f(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideUnFollowPresenter$f.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "event");
          b = (p0.d == null && p0.c == null)? true: false;
       }
       return b;
    }
}
