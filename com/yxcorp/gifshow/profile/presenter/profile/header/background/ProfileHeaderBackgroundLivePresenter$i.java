package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter$i;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundLivePresenter;
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
import m4c.d;
import lnc.a1;
import com.google.android.material.appbar.AppBarLayout;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;

public final class ProfileHeaderBackgroundLivePresenter$i implements g	// class@0014c1
{
    public final ProfileHeaderBackgroundLivePresenter b;

    public void ProfileHeaderBackgroundLivePresenter$i(ProfileHeaderBackgroundLivePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundLivePresenter$i.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ProfileHeaderBackgroundLivePresenter.class, "26")) {
             ProfileHeaderBackgroundLivePresenter p = p0.p;
             if (p == null) {
                a.S("mBackgroundStatus");
             }
             if (p.a().d() == 2) {
                p = p0.w;
                if (p != null) {
                   p.getLayoutParams().width = n.z(p.getContext());
                   p.getLayoutParams().height = p0.S8(p.getLayoutParams().width, p0.G);
                   p.requestLayout();
                   p0.L = p.getLayoutParams().height;
                   a = d.a;
                   ProfileHeaderBackgroundLivePresenter r = p0.r;
                   if (r == null) {
                      a.S("mAppBarLayout");
                   }
                   a.f(r, p, (p.getLayoutParams().height + a1.d(R.dimen.arg_RES_7f0702e8)));
                   p = p0.O;
                   if (p > null) {
                      r = p0.z;
                      a.m(r);
                      p0.W8(p0.N, p, r, p0.A);
                   }
                }
             }
          }
       }
       return;
    }
}
