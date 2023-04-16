package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mPlayListener$2$a;
import mx6.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$mPlayListener$2;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import mx6.b;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import android.widget.ImageView;

public final class ProfileHeaderBackgroundVideoPresenter$mPlayListener$2$a implements c	// class@0014cb
{
    public final ProfileHeaderBackgroundVideoPresenter$mPlayListener$2 b;

    public void ProfileHeaderBackgroundVideoPresenter$mPlayListener$2$a(ProfileHeaderBackgroundVideoPresenter$mPlayListener$2 p0){
       this.b = p0;
       super();
    }
    public void onInfo(IMediaPlayer p0,int p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public void r0(PlayerState p0){
       IWaynePlayer iWaynePlayer;
       ProfileHeaderBackgroundVideoPresenter t;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$mPlayListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "state");
       b.c(this, p0);
       if (p0 == PlayerState.Prepared) {
          iWaynePlayer = this.b.this$0.X8();
          if (iWaynePlayer != null) {
             iWaynePlayer.start();
          }
          t = this.b.this$0.t;
          if (t != null) {
             t.setVisibility(8);
          }
          this.b.this$0.S8();
          this.b.this$0.Y8();
       }else if(p0 == PlayerState.Error){
          t = this.b.this$0.t;
          if (t != null) {
             t.setVisibility(8);
          }
          iWaynePlayer = this.b.this$0.X8();
          if (iWaynePlayer != null) {
             iWaynePlayer.start();
          }
       }
       return;
    }
    public void w(boolean p0){
       b.b(this, p0);
    }
}
