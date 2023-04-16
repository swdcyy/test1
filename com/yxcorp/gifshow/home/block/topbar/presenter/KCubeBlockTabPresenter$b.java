package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$b;
import com.google.android.material.appbar.AppBarLayout$c;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wra.b;
import java.lang.Math;
import kotlin.jvm.internal.a;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.f;
import androidx.core.view.ScrollStrategy;
import java.util.Objects;
import ln5.c;
import mrd.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class KCubeBlockTabPresenter$b implements AppBarLayout$c	// class@001669
{
    public final KCubeBlockTabPresenter b;

    public void KCubeBlockTabPresenter$b(KCubeBlockTabPresenter p0){
       this.b = p0;
       super();
    }
    public final void Y0(AppBarLayout p0,int p1){
       View view;
       KCubeBlockTabPresenter$b uob = KCubeBlockTabPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       b uob1 = KCubeBlockTabPresenter.R8(this.b);
       int i = Math.abs(p1);
       String str = "appBarLayout";
       if (!i) {
          i = 0;
       }else {
          a.o(p0, str);
          i = (i == p0.getTotalScrollRange())? 2: 1;
       }
       uob1.f(i);
       if (a.g(this.b.z, "Block_Decorator")) {
          KCubeBlockTabPresenter.P8(this.b).c().I0(ScrollStrategy.DISABLE_ALL_TOUCH);
       }
       KCubeBlockTabPresenter u = this.b.u;
       a.o(p0, str);
       i = p0.getTotalScrollRange();
       int i1 = p0.getTotalScrollRange() - Math.abs(p1);
       Objects.requireNonNull(u);
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), u, uoc, "1")) {
          u.a = i;
          u.c = i1;
          u.b.onNext(Integer.valueOf(i1));
       }
       String str1 = "rootView";
       if (KCubeBlockTabPresenter.R8(this.b).c() == 2) {
          view = this.b.m8();
          a.o(view, str1);
          view.setVisibility(8);
       }else {
          view = this.b.m8();
          a.o(view, str1);
          view.setVisibility(0);
       }
       return;
    }
}
