package com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter$a;
import com.google.android.material.appbar.AppBarLayout$c;
import com.kuaishou.live.core.show.profilecard.lefttoparea.LiveProfileLeftTopAreaPresenter;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Math;
import usd.q;
import bf2.a;

public final class LiveProfileLeftTopAreaPresenter$a implements AppBarLayout$c	// class@000dd6
{
    public final LiveProfileLeftTopAreaPresenter b;

    public void LiveProfileLeftTopAreaPresenter$a(LiveProfileLeftTopAreaPresenter p0){
       this.b = p0;
       super();
    }
    public void Y0(AppBarLayout p0,int p1){
       LiveProfileLeftTopAreaPresenter v;
       if (PatchProxy.isSupport(LiveProfileLeftTopAreaPresenter$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveProfileLeftTopAreaPresenter$a.class, "1")) {
          return;
       }
       if (!q.u(Math.abs(p1), 1)) {
          v = this.b.v;
          if (v != null) {
             v.resume();
          }
       }else {
          v = this.b.v;
          if (v != null) {
             v.hide();
          }
       }
       return;
    }
}
