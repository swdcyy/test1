package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.View;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kzc.d;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.c$b;
import asa.d;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import asa.e;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import asa.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class KCubeBlockTabGuidePresenter$b implements Runnable	// class@001661
{
    public final KCubeBlockTabGuidePresenter b;

    public void KCubeBlockTabGuidePresenter$b(KCubeBlockTabGuidePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KCubeBlockTabGuidePresenter$b.class, "1")) {
          return;
       }
       KCubeBlockTabGuidePresenter$b tb = this.b;
       if (tb.x != null) {
          return;
       }
       Objects.requireNonNull(tb);
       KCubeBlockTabGuidePresenter kCubeBlockTa = KCubeBlockTabGuidePresenter.class;
       if (!PatchProxy.applyVoid(objArray, tb, kCubeBlockTa, "7")) {
          boolean b = true;
          tb.v = b;
          if (!PatchProxy.applyVoid(objArray, tb, kCubeBlockTa, "6")) {
             KCubeBlockTabGuidePresenter p = tb.p;
             String str = "mTabLayout";
             if (p == null) {
                a.S(str);
             }
             float f = 0x3f800000;
             float f1 = 0x3f851eb8;
             AnimatorSet uAnimatorSet = tb.S8(p, f, f1, 400);
             KCubeBlockTabGuidePresenter p1 = tb.p;
             if (p1 == null) {
                a.S(str);
             }
             AnimatorSet uAnimatorSet1 = tb.S8(p1, f1, f1, 1450);
             KCubeBlockTabGuidePresenter p2 = tb.p;
             if (p2 == null) {
                a.S(str);
             }
             AnimatorSet uAnimatorSet2 = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{uAnimatorSet,uAnimatorSet1,tb.S8(p2, f1, f, 400)};
             uAnimatorSet2.playSequentially(uAnimatorArr);
             uAnimatorSet2.start();
          }
          Activity activity = tb.getActivity();
          if (activity != null) {
             d uod = new d(activity);
             uod.w(new ColorDrawable(0));
             uod.G(new d(tb));
             uod.O(new e(tb));
             uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d0109));
             uod.T(1450);
             uod.W(0);
             uod.A(0);
             uod.Y(new f(tb));
          }
       }
       return;
    }
}
