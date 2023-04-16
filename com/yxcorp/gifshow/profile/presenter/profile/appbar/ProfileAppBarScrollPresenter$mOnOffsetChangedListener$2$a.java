package com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a;
import com.google.android.material.appbar.AppBarLayout$c;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter;
import kotlin.jvm.internal.a;
import j5c.d;
import j5c.a;

public final class ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a implements AppBarLayout$c	// class@001483
{
    public final ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2 b;

    public void ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a(ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void Y0(AppBarLayout p0,int p1){
       ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a omOnOffsetCh = ProfileAppBarScrollPresenter$mOnOffsetChangedListener$2$a.class;
       if (PatchProxy.isSupport(omOnOffsetCh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, omOnOffsetCh, "1")) {
          return;
       }
       ProfileAppBarScrollPresenter s = this.b.this$0.s;
       if (s == null) {
          a.S("mAppBarScrollState");
       }
       s.a(new d((- p1)));
       return;
    }
}
