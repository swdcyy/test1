package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$e;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.events.realaction.RealAction;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Set;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;

public final class FollowSlideRecoFeedRecordPresenter$e implements g	// class@001131
{
    public final FollowSlideRecoFeedRecordPresenter b;

    public void FollowSlideRecoFeedRecordPresenter$e(FollowSlideRecoFeedRecordPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideRecoFeedRecordPresenter$e.class, "1")) {
       }else {
          FollowSlideRecoFeedRecordPresenter$e tb = this.b;
          if (tb.q.contains(r1.t1(p0.mFeed))) {
             User user = r1.T1(p0.mFeed);
             if (user != null) {
                p0 = p0.mFeed;
                a.o(p0, "it.mFeed");
                PymkLogSender.reportUserRemove(12, null, user, tb.R8(p0));
             }
          }
       }
       return;
    }
}
