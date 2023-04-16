package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mHideRunnable$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mHideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import c2c.f;
import kotlin.jvm.internal.a;
import android.view.View;

public final class ProfilePreviewVideoStatusPresenter$mHideRunnable$2$a implements Runnable	// class@00126f
{
    public final ProfilePreviewVideoStatusPresenter$mHideRunnable$2 b;

    public void ProfilePreviewVideoStatusPresenter$mHideRunnable$2$a(ProfilePreviewVideoStatusPresenter$mHideRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfilePreviewVideoStatusPresenter$mHideRunnable$2$a.class, "1")) {
          return;
       }
       ProfilePreviewVideoStatusPresenter$mHideRunnable$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, ProfilePreviewVideoStatusPresenter.class, "17")) {
          IWaynePlayer iWaynePlayer = this$0.V8();
          if (iWaynePlayer != null && iWaynePlayer.isPlaying() == true) {
             ProfilePreviewVideoStatusPresenter c = this$0.C;
             if (c == null) {
                a.S("mPlayerControllerPanel");
             }
             c.setVisibility(8);
             c = this$0.x;
             if (c == null) {
                a.S("mPlayBtn");
             }
             c.setVisibility(8);
             ProfilePreviewVideoStatusPresenter d = this$0.D;
             if (d == null) {
                a.S("mBottomShadowView");
             }
             d.setVisibility(8);
          }
       }
       return;
    }
}
