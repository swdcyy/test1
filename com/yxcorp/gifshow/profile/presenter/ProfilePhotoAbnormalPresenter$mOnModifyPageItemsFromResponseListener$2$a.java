package com.yxcorp.gifshow.profile.presenter.ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2$a;
import qvb.f$c;
import com.yxcorp.gifshow.profile.presenter.ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.ProfilePhotoAbnormalPresenter;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import z5c.d3;

public final class ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2$a implements f$c	// class@00143d
{
    public final ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2 a;

    public void ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2$a(ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2 p0){
       this.a = p0;
       super();
    }
    public final void a(List p0,boolean p1){
       ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2$a omOnModifyPa = ProfilePhotoAbnormalPresenter$mOnModifyPageItemsFromResponseListener$2$a.class;
       if (PatchProxy.isSupport(omOnModifyPa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, omOnModifyPa, "1")) {
          return;
       }
       if (d3.d(ProfilePhotoAbnormalPresenter.P8(this.a.this$0).mUser, ProfilePhotoAbnormalPresenter.P8(this.a.this$0).mUserProfile)) {
          p0.clear();
       }
       return;
    }
}
