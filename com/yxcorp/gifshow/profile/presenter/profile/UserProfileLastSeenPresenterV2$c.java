package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import android.view.View;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenterV2$c$a;
import ekd.k1;

public final class UserProfileLastSeenPresenterV2$c implements Runnable	// class@001476
{
    public final UserProfileLastSeenPresenterV2 b;

    public void UserProfileLastSeenPresenterV2$c(UserProfileLastSeenPresenterV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, UserProfileLastSeenPresenterV2$c.class, "1")) {
          return;
       }
       UserProfileLastSeenPresenterV2$c tb = this.b;
       tb.H9(tb.B9(), true);
       this.b.Z9();
       tb = this.b;
       tb.X0 = false;
       tb.J9(3);
       View view = this.b.m9();
       if (view != null) {
          view.setVisibility(8);
       }
       k1.s(new UserProfileLastSeenPresenterV2$c$a(this), "ZoomAnimation", 300);
       return;
    }
}
