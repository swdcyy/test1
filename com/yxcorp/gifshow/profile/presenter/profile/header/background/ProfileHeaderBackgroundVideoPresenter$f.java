package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class ProfileHeaderBackgroundVideoPresenter$f implements g	// class@0014c9
{
    public final ProfileHeaderBackgroundVideoPresenter b;

    public void ProfileHeaderBackgroundVideoPresenter$f(ProfileHeaderBackgroundVideoPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str;
       IWaynePlayer iWaynePlayer;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$f.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          ProfileHeaderBackgroundVideoPresenter profileHeade = ProfileHeaderBackgroundVideoPresenter.class;
          if (!PatchProxy.applyVoid(null, p0, profileHeade, "7")) {
             ProfileHeaderBackgroundVideoPresenter r = p0.r;
             if (r == null || (r.getVisibility() || (p0.X8() != null && p0.I != null))) {
                int[] ointArray = new int[2];
                ProfileHeaderBackgroundVideoPresenter r1 = p0.r;
                if (r1 != null) {
                   r1.getLocationInWindow(ointArray);
                }
                r1 = p0.y;
                if (r1 == null) {
                   a.S("mFragment");
                }
                if (r1.Vg().a()) {
                   r1 = p0.r;
                   a.m(r1);
                   if ((ointArray[1] + r1.getMeasuredHeight()) > 0) {
                      str = 1;
                   label_0065 :
                      if (str) {
                         if (!PatchProxy.applyVoid(null, p0, profileHeade, "17")) {
                            iWaynePlayer = p0.X8();
                            if (iWaynePlayer != null && iWaynePlayer.isPaused() == true) {
                               p0 = p0.X8();
                               if (p0 != null) {
                                  p0.start();
                               }
                            }
                         }
                      }else if(PatchProxy.applyVoid(null, p0, profileHeade, "18")){
                         iWaynePlayer = p0.X8();
                         if (iWaynePlayer != null && iWaynePlayer.isPlaying() == true) {
                            p0 = p0.X8();
                            if (p0 != null) {
                               p0.pause();
                            }
                         }
                      }
                   }
                }
                str = null;
                goto label_0065 ;
             }
          }
       }
    label_00a4 :
       return;
    }
}
