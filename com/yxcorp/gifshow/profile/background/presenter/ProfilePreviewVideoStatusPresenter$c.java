package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class ProfilePreviewVideoStatusPresenter$c extends m	// class@00126b
{
    public final ProfilePreviewVideoStatusPresenter c;

    public void ProfilePreviewVideoStatusPresenter$c(ProfilePreviewVideoStatusPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewVideoStatusPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       ProfilePreviewVideoStatusPresenter$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, ProfilePreviewVideoStatusPresenter.class, "9")) {
          ProfilePreviewVideoStatusPresenter c = tc.C;
          if (c == null) {
             a.S("mPlayerControllerPanel");
          }
          ProfilePreviewVideoStatusPresenter c1 = tc.C;
          if (c1 == null) {
             a.S("mPlayerControllerPanel");
          }
          int i = (!c1.getVisibility())? 8: 0;
          c.setVisibility(i);
          tc.j9();
          c = tc.D;
          if (c == null) {
             a.S("mBottomShadowView");
          }
          ProfilePreviewVideoStatusPresenter c2 = tc.C;
          if (c2 == null) {
             a.S("mPlayerControllerPanel");
          }
          c.setVisibility(c2.getVisibility());
       }
       return;
    }
}
