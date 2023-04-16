package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$h;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;

public final class UserProfileFollowGuidePresenter$h implements g	// class@001551
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$h(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$h.class, "1")) {
       }else if(!TextUtils.x(p0.b)){
          p0 = this.b;
          p0.F = true;
          p0 = p0.y;
          if (p0 != null) {
             p0.setVisibility(8);
          }
       }
       return;
    }
}
