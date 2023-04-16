package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideUnFollowPresenter$h;
import erd.o;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class FollowSlideUnFollowPresenter$h implements o	// class@00113c
{
    public static final FollowSlideUnFollowPresenter$h b;

    static {
       FollowSlideUnFollowPresenter$h.b = new FollowSlideUnFollowPresenter$h();
    }
    public void FollowSlideUnFollowPresenter$h(){
       super();
    }
    public Object apply(Object p0){
       n on = PatchProxy.applyOneRefs(p0, this, FollowSlideUnFollowPresenter$h.class, "1");
       if (on != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          on = p0.b;
       }
       return on;
    }
}
