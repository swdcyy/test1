package com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter$a;
import t2c.f;
import com.yxcorp.gifshow.profile.presenter.profile.appbar.ProfileAppBarScrollPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.android.material.appbar.ViewOffsetBehavior;
import java.lang.Math;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import android.view.View;

public final class ProfileAppBarScrollPresenter$a implements f	// class@001482
{
    public final ProfileAppBarScrollPresenter a;
    public final int b;

    public void ProfileAppBarScrollPresenter$a(ProfileAppBarScrollPresenter p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object getValue(){
       Boolean uBoolean = PatchProxy.apply(null, this, ProfileAppBarScrollPresenter$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          ProfileAppBarScrollPresenter r = this.a.r;
          boolean b = false;
          int topAndBottom = (r != null)? r.getTopAndBottomOffset(): 0;
          topAndBottom = Math.abs(topAndBottom);
          ProfileAppBarScrollPresenter p = this.a.p;
          if (p == null) {
             a.S("mAppBarLayout");
          }
          int height = p.getHeight();
          ProfileAppBarScrollPresenter q = this.a.q;
          if (q == null) {
             a.S("mActionBar");
          }
          if (topAndBottom >= (height - (q.getHeight() + this.b))) {
             b = true;
          }
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
