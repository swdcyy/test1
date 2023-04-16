package com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import on5.b;
import ro5.c0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pr6.d;
import com.kwai.kcube.TabIdentifier;
import zq6.r;
import bo5.a;
import zq6.p;
import co5.p;
import com.google.common.base.Optional;
import ro5.k;
import ok.h;
import co5.p$b;
import wq6.h;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import lnc.a1;

public class HomeLocalTopTabDisplayPresenter$b extends AnimatorListenerAdapter	// class@000feb
{
    public final boolean a;
    public final HomeLocalTopTabDisplayPresenter b;

    public void HomeLocalTopTabDisplayPresenter$b(HomeLocalTopTabDisplayPresenter p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalTopTabDisplayPresenter$b.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       if (this.a == null) {
          HomeLocalTopTabDisplayPresenter y = this.b.y;
          TabIdentifier d = b.d;
          Object obj = PatchProxy.applyTwoRefs(y, d, null, c0.class, "23");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             r or = c0.a(y, d);
             b = (or == null)? false: Optional.fromNullable(or.d(a.B)).transform(k.b).or(Boolean.FALSE).booleanValue();
          }
          if (b) {
             c0.x(this.b.y, d);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalTopTabDisplayPresenter$b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       if (this.a != null) {
          TabIdentifier d = b.d;
          p$b uob = p.c();
          uob.b(HomeActionBarSkinHelper.l(this.b.y.f(d), this.b.getContext()));
          uob.a(0x3f800000);
          uob.d((float)a1.e(0x3f800000));
          c0.J(this.b.y, d, uob);
       }
       return;
    }
}
