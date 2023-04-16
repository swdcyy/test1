package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideAcquaintanceRecordPresenter$d;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowSlideAcquaintanceRecordPresenter$d implements r	// class@001110
{
    public static final FollowSlideAcquaintanceRecordPresenter$d b;

    static {
       FollowSlideAcquaintanceRecordPresenter$d.b = new FollowSlideAcquaintanceRecordPresenter$d();
    }
    public void FollowSlideAcquaintanceRecordPresenter$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideAcquaintanceRecordPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "action");
          p0 = p0.mActionType;
          b = (p0 == 7 || p0 == 9)? true: false;
       }
       return b;
    }
}
