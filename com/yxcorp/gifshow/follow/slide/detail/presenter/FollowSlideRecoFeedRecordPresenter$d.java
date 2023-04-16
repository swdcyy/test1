package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$d;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowSlideRecoFeedRecordPresenter$d implements r	// class@001130
{
    public static final FollowSlideRecoFeedRecordPresenter$d b;

    static {
       FollowSlideRecoFeedRecordPresenter$d.b = new FollowSlideRecoFeedRecordPresenter$d();
    }
    public void FollowSlideRecoFeedRecordPresenter$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideRecoFeedRecordPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (p0.mActionType == 9)? true: false;
       }
       return b;
    }
}
