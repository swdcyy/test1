package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$i;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class UserProfileFollowGuidePresenter$i implements g	// class@001552
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$i(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$i.class, "1")) {
       }else {
          p0 = this.b.y;
          if (p0 != null) {
             p0.setVisibility(8);
          }
       }
       return;
    }
}
