package com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter$b;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.background.ProfileHeaderBackgroundImagePresenter;
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
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import rkd.b;
import lnc.a1;
import m4c.d;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;

public final class ProfileHeaderBackgroundImagePresenter$b implements g	// class@00149f
{
    public final ProfileHeaderBackgroundImagePresenter b;

    public void ProfileHeaderBackgroundImagePresenter$b(ProfileHeaderBackgroundImagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderBackgroundImagePresenter$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ProfileHeaderBackgroundImagePresenter.class, "8")) {
             ProfileHeaderBackgroundImagePresenter w = p0.w;
             if (w == null) {
                a.S("mBackgroundStatus");
             }
             if (!w.a().d()) {
                w = p0.q;
                String str = "mHeaderImage";
                if (w == null) {
                   a.S(str);
                }
                ViewGroup$LayoutParams layoutParams = w.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                if (b.g()) {
                   p0.W8();
                   layoutParams.width = p0.z;
                }else {
                   layoutParams.width = p0.V8();
                }
                layoutParams.height = ((layoutParams.width * 136) / 375) + a1.e(24.00f);
                ProfileHeaderBackgroundImagePresenter q = p0.q;
                if (q == null) {
                   a.S(str);
                }
                q.setTranslationY((- (float)a1.e(12.00f)));
                q = p0.q;
                if (q == null) {
                   a.S(str);
                }
                q.setLayoutParams(layoutParams);
                a = d.a;
                q = p0.r;
                if (q == null) {
                   a.S("mAppBarLayout");
                }
                p0 = p0.q;
                if (p0 == null) {
                   a.S(str);
                }
                a.f(q, p0, a1.d(R.dimen.arg_RES_7f0702a5));
             }
          }
       }
       return;
    }
}
