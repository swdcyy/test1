package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;

public final class ProfileFollowElement$b implements IMediaPlayer$OnInfoListener	// class@001433
{
    public final ProfileFollowElement b;

    public void ProfileFollowElement$b(ProfileFollowElement p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(ProfileFollowElement$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ProfileFollowElement$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          ProfileFollowElement.n0(this.b).b();
       }
       return false;
    }
}
