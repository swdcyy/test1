package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$d;
import sj.k;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.FrameLayout;

public final class ProfileHeaderBackgroundLivePresenter$d implements k	// class@0014bc
{
    public final ProfileHeaderBackgroundLivePresenter a;

    public void ProfileHeaderBackgroundLivePresenter$d(ProfileHeaderBackgroundLivePresenter p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,float p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundLivePresenter$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundLivePresenter$d.class, "1")) {
          return;
       }
       ProfileHeaderBackgroundLivePresenter$d ta = this.a;
       if (ta.H != null) {
          ProfileHeaderBackgroundLivePresenter w = ta.w;
          if (w != null && !w.getVisibility()) {
             if (p2 > 0) {
                ta = this.a;
                ProfileHeaderBackgroundLivePresenter l = ta.L;
                float f = (float)(l + p2) / (float)l;
                w = ta.B;
                if (w != null) {
                   w.height = this.a.L + p2;
                }
                w = this.a.C;
                if (w != null) {
                   w.height = this.a.L + p2;
                }
                w = this.a.C;
                if (w != null) {
                   w.setScaleX(f);
                }
                w = this.a.C;
                if (w != null) {
                   w.setScaleY(f);
                }
                w = this.a.A;
                if (w != null) {
                   w.setScaleX(f);
                }
                w = this.a.A;
                if (w != null) {
                   w.setScaleY(f);
                }
             }else {
                w = this.a.B;
                if (w != null) {
                   w.height = this.a.L;
                }
                w = this.a.C;
                if (w != null) {
                   w.height = this.a.L;
                }
                w = this.a.C;
                if (w != null) {
                   w.setScaleX(0x3f800000);
                }
                w = this.a.C;
                if (w != null) {
                   w.setScaleY(0x3f800000);
                }
                w = this.a.A;
                if (w != null) {
                   w.setScaleX(0x3f800000);
                }
                w = this.a.A;
                if (w != null) {
                   w.setScaleY(0x3f800000);
                }
             }
          }
       }
       return;
    }
}
