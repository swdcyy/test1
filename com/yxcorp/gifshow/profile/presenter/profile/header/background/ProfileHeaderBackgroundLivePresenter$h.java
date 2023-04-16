package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$h;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;

public final class ProfileHeaderBackgroundLivePresenter$h implements g	// class@0014c0
{
    public final ProfileHeaderBackgroundLivePresenter b;

    public void ProfileHeaderBackgroundLivePresenter$h(ProfileHeaderBackgroundLivePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter$h.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ProfileHeaderBackgroundLivePresenter.class, "5")) {
             ProfileHeaderBackgroundLivePresenter w = p0.w;
             if (w == null || (w.getVisibility() || (p0.J != null && p0.M != null))) {
                int[] ointArray = new int[2];
                ProfileHeaderBackgroundLivePresenter w1 = p0.w;
                a.m(w1);
                w1.getLocationInWindow(ointArray);
                w1 = p0.t;
                if (w1 == null) {
                   a.S("mFragment");
                }
                if (w1.Vg().a()) {
                   w1 = p0.w;
                   a.m(w1);
                   if ((ointArray[1] + w1.getMeasuredHeight()) > 0) {
                      w = 1;
                   label_0063 :
                      if (w) {
                         w1 = p0.J;
                         if (w1 == null || w1.t() != true) {
                            p0.Y8();
                            w = p0.J;
                            if (w != null) {
                               w.startPlay();
                            }
                            p0 = p0.J;
                            if (p0 != null) {
                               p0.mute();
                            }
                         }
                      }
                      if (w == null) {
                         w = p0.J;
                         if (w == null || w.t()) {
                            p0.a9("page_paused");
                         }
                      }
                   }
                }
                w = null;
                goto label_0063 ;
             }
          }
       }
    label_0092 :
       return;
    }
}
