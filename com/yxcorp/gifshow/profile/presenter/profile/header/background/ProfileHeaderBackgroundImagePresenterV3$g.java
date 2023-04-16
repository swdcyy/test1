package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3$g;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenterV3;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import xl8.b;
import m4c.a;
import m4c.d;
import lnc.a1;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;

public final class ProfileHeaderBackgroundImagePresenterV3$g implements g	// class@0014aa
{
    public final ProfileHeaderBackgroundImagePresenterV3 b;

    public void ProfileHeaderBackgroundImagePresenterV3$g(ProfileHeaderBackgroundImagePresenterV3 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenterV3$g.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          ProfileHeaderBackgroundImagePresenterV3 profileHeade = ProfileHeaderBackgroundImagePresenterV3.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, profileHeade, "15")) {
             ProfileHeaderBackgroundImagePresenterV3 d = p0.D;
             if (d == null) {
                a.S("mBackgroundStatus");
             }
             if (!d.a().d()) {
                if (!PatchProxy.applyVoid(objArray, p0, profileHeade, "16")) {
                   p0.k9();
                }
                a = d.a;
                ProfileHeaderBackgroundImagePresenterV3 u = p0.u;
                if (u == null) {
                   a.S("mAppBarLayout");
                }
                p0 = p0.s;
                if (p0 == null) {
                   a.S("mHeaderImage");
                }
                a.f(u, p0, a1.d(R.dimen.arg_RES_7f0702a5));
             }
          }
       }
       return;
    }
}
