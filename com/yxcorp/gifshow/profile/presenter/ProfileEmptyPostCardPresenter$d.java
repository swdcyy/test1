package com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import z5c.l3;
import java.lang.ref.WeakReference;
import nsd.u;

public final class ProfileEmptyPostCardPresenter$d implements g	// class@001438
{
    public final ProfileEmptyPostCardPresenter b;

    public void ProfileEmptyPostCardPresenter$d(ProfileEmptyPostCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ProfileEmptyPostCardPresenter$d.class, "1")) {
       }else {
          ProfilePostEmptyCardUtils.e.i("ProfileEmptyPostCardPresenter", "USER_PROFILE_RESPONSE_REFRESH");
          l3 ol3 = new l3(2, obj, null, false, false, 28, null);
          this.b.V8(v8);
       }
       return;
    }
}
