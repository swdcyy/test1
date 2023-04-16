package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$bindFollowStateObservable$3$infoList$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class FollowSlideInternalPymiListPresenter$bindFollowStateObservable$3$infoList$1 extends Lambda implements l	// class@001117
{
    public final String $unFollowUserId;

    public void FollowSlideInternalPymiListPresenter$bindFollowStateObservable$3$infoList$1(String p0){
       this.$unFollowUserId = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(FollowingUserBannerFeed$UserBannerInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideInternalPymiListPresenter$bindFollowStateObservable$3$infoList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = p0.mUser;
       User mId = (p0 != null)? p0.mId: null;
       return (TextUtils.n(mId, this.$unFollowUserId) ^ 0x01);
    }
}
