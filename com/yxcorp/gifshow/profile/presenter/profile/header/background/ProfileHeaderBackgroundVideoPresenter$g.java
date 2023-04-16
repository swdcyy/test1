package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter$g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundVideoPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import xl8.b;
import m4c.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import m4c.d;
import com.google.android.material.appbar.AppBarLayout;

public final class ProfileHeaderBackgroundVideoPresenter$g implements g	// class@0014ca
{
    public final ProfileHeaderBackgroundVideoPresenter b;

    public void ProfileHeaderBackgroundVideoPresenter$g(ProfileHeaderBackgroundVideoPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       d a1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundVideoPresenter$g.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ProfileHeaderBackgroundVideoPresenter.class, "22")) {
             ProfileHeaderBackgroundVideoPresenter a = p0.A;
             if (a == null) {
                a.S("mBackgroundStatus");
             }
             if (a.a().d() == 3) {
                a = p0.r;
                if (a != null) {
                   a.getLayoutParams().width = n.z(a.getContext());
                   a.getLayoutParams().height = ((a.getLayoutParams().width * 150) / 414) + a1.e(24.00f);
                   p0.L = a.getLayoutParams().height;
                   p0.Y8();
                   a1 = d.a;
                   p0 = p0.p;
                   if (p0 == null) {
                      a.S("mAppBarLayout");
                   }
                   a1.f(p0, a, (a.getLayoutParams().height + a1.d(R.dimen.arg_RES_7f0702e8)));
                }
             }
          }
       }
       return;
    }
}
