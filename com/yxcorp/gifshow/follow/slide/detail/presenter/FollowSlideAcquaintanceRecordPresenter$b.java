package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$b;
import erd.r;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowSlideAcquaintanceRecordPresenter$b implements r	// class@00110e
{
    public static final FollowSlideAcquaintanceRecordPresenter$b b;

    static {
       FollowSlideAcquaintanceRecordPresenter$b.b = new FollowSlideAcquaintanceRecordPresenter$b();
    }
    public void FollowSlideAcquaintanceRecordPresenter$b(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideAcquaintanceRecordPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "e");
          p0 = p0.c;
       }
       return b;
    }
}
