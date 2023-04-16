package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$f;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$b;
import android.animation.ValueAnimator;

public final class FollowSlidePymiUserItemPresenter$f implements g	// class@001129
{
    public final FollowSlidePymiUserItemPresenter b;

    public void FollowSlidePymiUserItemPresenter$f(FollowSlidePymiUserItemPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlidePymiUserItemPresenter$f.class, "1")) {
       }else {
          a.p(p0, "userBannerInfo");
          FollowingUserBannerFeed$UserBannerInfo mAvatarInfo = p0.mAvatarInfo;
          if (mAvatarInfo != null && (mAvatarInfo.mStatus != 1 && (p0.mShowFeedTopTitle == null && this.b.Y8().isRunning()))) {
             this.b.Y8().cancel();
          }
       }
       return;
    }
}
