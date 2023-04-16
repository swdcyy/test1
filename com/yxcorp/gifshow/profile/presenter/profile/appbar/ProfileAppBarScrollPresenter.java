package com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.google.android.material.appbar.ProfileReboundBehavior;
import z5c.h3;
import java.lang.Number;
import j5c.a;
import im8.f;
import a3c.e;
import lnc.a1;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$a;

public final class ProfileAppBarScrollPresenter extends PresenterV2	// class@001485
{
    public AppBarLayout p;
    public View q;
    public ProfileReboundBehavior r;
    public a s;
    public int t;
    public final p u;

    public void ProfileAppBarScrollPresenter(){
       super();
       this.t = 5;
       this.u = s.c(new ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileAppBarScrollPresenter.class, "4")) {
          return;
       }
       ProfileAppBarScrollPresenter tp = this.p;
       if (tp == null) {
          a.S("mAppBarLayout");
       }
       tp.c(this.P8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileAppBarScrollPresenter.class, "5")) {
          return;
       }
       ProfileAppBarScrollPresenter tp = this.p;
       if (tp == null) {
          a.S("mAppBarLayout");
       }
       tp.o(this.P8());
       return;
    }
    public final AppBarLayout$c P8(){
       Object obj = PatchProxy.apply(null, this, ProfileAppBarScrollPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileAppBarScrollPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.title_root);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.title_root\)");
       this.q = view;
       p0 = m1.f(p0, R.id.app_bar_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.app_bar_layout\)");
       this.p = p0;
       if (p0 == null) {
          a.S("mAppBarLayout");
       }
       this.r = h3.a(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileAppBarScrollPresenter.class, "3")) {
          return;
       }
       f obj = this.r8("PROFILE_STYLE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.t = obj.intValue();
       obj = this.r8("PROFILE_APP_BAR_SCROLL_STATE");
       a.o(obj, "inject\(ProfileCommonAcce¡­ILE_APP_BAR_SCROLL_STATE\)");
       this.s = obj;
       obj = this.x8("PROFILE_HEADER_TOP");
       a.o(obj, "injectRef\(ProfileCommonA¡­     .PROFILE_HEADER_TOP\)");
       int i = (e.a(this.t))? a1.d(R.dimen.arg_RES_7f070316): a1.d(R.dimen.arg_RES_7f070310);
       obj.set(new ProfileAppBarScrollPresenter$a(this, i));
       return;
    }
}
