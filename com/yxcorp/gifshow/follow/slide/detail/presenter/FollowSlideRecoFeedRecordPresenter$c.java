package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$c;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.framework.model.feed.BaseFeed;
import g7c.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;

public final class FollowSlideRecoFeedRecordPresenter$c implements g	// class@00112f
{
    public final FollowSlideRecoFeedRecordPresenter b;

    public void FollowSlideRecoFeedRecordPresenter$c(FollowSlideRecoFeedRecordPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideRecoFeedRecordPresenter$c.class, "1")) {
       }else {
          FollowSlideRecoFeedRecordPresenter$c tb = this.b;
          if (tb.r.containsKey(p0.b)) {
             n a = p0.a;
             p0 = tb.r.get(p0.b);
             p0 = (p0 != null)? tb.R8(p0): null;
             PymkLogSender.reportClickFollow(12, null, a, p0);
          }
       }
       return;
    }
}
