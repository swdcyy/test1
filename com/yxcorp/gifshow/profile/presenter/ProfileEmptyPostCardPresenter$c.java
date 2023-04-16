package com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter$c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.ProfileEmptyPostCardPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5c.l3;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;

public final class ProfileEmptyPostCardPresenter$c implements g	// class@001437
{
    public final ProfileEmptyPostCardPresenter b;

    public void ProfileEmptyPostCardPresenter$c(ProfileEmptyPostCardPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileEmptyPostCardPresenter$c.class, "1")) {
       }else {
          Object obj = null;
          p0 = (p0 != null)? p0.get("MAIN_KEY"): obj;
          if (p0 instanceof l3) {
             obj = p0;
          }
          if (obj != null) {
             ProfilePostEmptyCardUtils.e.i("ProfileEmptyPostCardPresenter", "receive PROFILE_USER_INFO_CARD_SHOW_POST_CARD "+"event: "+obj);
             this.b.V8(obj);
          }
       }
       return;
    }
}
