package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$k$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;

public final class ProfileHeaderStatusPresenter$k$a implements Runnable	// class@0014dd
{
    public final ProfileHeaderStatusPresenter$k b;

    public void ProfileHeaderStatusPresenter$k$a(ProfileHeaderStatusPresenter$k p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, ProfileHeaderStatusPresenter$k$a.class, "1")) {
          return;
       }
       ProfileHeaderStatusPresenter.P8(this.b.a).w5(ProfileRefreshStatus.PROFILE);
       PatchProxy.onMethodExit(ProfileHeaderStatusPresenter$k$a.class, "1");
       return;
    }
}
