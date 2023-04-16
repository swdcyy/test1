package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$c;
import t2c.f;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class ProfileHeaderBackgroundVideoPresenter$c implements f	// class@0014c6
{
    public final ProfileHeaderBackgroundVideoPresenter a;

    public void ProfileHeaderBackgroundVideoPresenter$c(ProfileHeaderBackgroundVideoPresenter p0){
       this.a = p0;
       super();
    }
    public Object getValue(){
       Long longx = PatchProxy.apply(null, this, ProfileHeaderBackgroundVideoPresenter$c.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          IWaynePlayer iWaynePlayer = this.a.X8();
          long currentPosit = (iWaynePlayer != null)? iWaynePlayer.getCurrentPosition(): 0;
          longx = Long.valueOf(currentPosit);
       }
       return longx;
    }
}
