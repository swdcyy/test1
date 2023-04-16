package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import java.lang.Object;
import i3c.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class UserProfileFollowGuidePresenter$g implements g	// class@001550
{
    public final UserProfileFollowGuidePresenter b;

    public void UserProfileFollowGuidePresenter$g(UserProfileFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$g.class, "1")) {
       }else {
          p0 = this.b.y;
          if (p0 != null) {
             p0.setVisibility(8);
          }
       }
       return;
    }
}
