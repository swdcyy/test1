package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$b;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class ProfileHeaderBackgroundLivePresenter$b implements NetworkState$a	// class@0014ba
{
    public final ProfileHeaderBackgroundLivePresenter a;

    public void ProfileHeaderBackgroundLivePresenter$b(ProfileHeaderBackgroundLivePresenter p0){
       this.a = p0;
       super();
    }
    public final void b(int p0){
       ProfileHeaderBackgroundLivePresenter$b uob = ProfileHeaderBackgroundLivePresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0 != 1) {
          this.a.a9("network_mobile");
       }
       return;
    }
}
