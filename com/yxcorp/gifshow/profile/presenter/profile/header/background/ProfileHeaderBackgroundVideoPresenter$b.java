package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$b;
import sj.k;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import android.view.View;
import android.widget.FrameLayout;

public final class ProfileHeaderBackgroundVideoPresenter$b implements k	// class@0014c5
{
    public final ProfileHeaderBackgroundVideoPresenter a;

    public void ProfileHeaderBackgroundVideoPresenter$b(ProfileHeaderBackgroundVideoPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,float p1,int p2){
       if (PatchProxy.isSupport(ProfileHeaderBackgroundVideoPresenter$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, ProfileHeaderBackgroundVideoPresenter$b.class, "1")) {
          return;
       }
       ProfileHeaderBackgroundVideoPresenter r = this.a.r;
       if (r != null && !r.getVisibility()) {
          if (p2 > 0) {
             r = this.a.L;
             if (r != null) {
                p1 = (float)(p2 + r) / (float)r;
             label_003c :
                r = this.a.s;
                if (r != null) {
                   r.setScaleX(p1);
                   r.setScaleY(p1);
                }
             }
          }
          p1 = 0x3f800000;
          goto label_003c ;
       }
    label_0048 :
       return;
    }
}
