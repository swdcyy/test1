package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$e;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class FollowSlidePymiUserItemPresenter$e implements o	// class@001128
{
    public static final FollowSlidePymiUserItemPresenter$e b;

    static {
       FollowSlidePymiUserItemPresenter$e.b = new FollowSlidePymiUserItemPresenter$e();
    }
    public void FollowSlidePymiUserItemPresenter$e(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, FollowSlidePymiUserItemPresenter$e.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "userBannerInfo");
          uBoolean = Boolean.valueOf(p0.mShowFeedTopTitle);
       }
       return uBoolean;
    }
}