package asa.f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.home.block.topbar.view.TabGuideMaskView;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import android.view.ViewGroup;
import o79.i;
import android.animation.AnimatorSet;
import android.animation.Animator;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.view.ViewGroup$MarginLayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.NullPointerException;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Integer;
import o07.o;

public final class f implements PopupInterface$h	// class@0002e9
{
    public final KCubeBlockTabGuidePresenter b;

    public void f(KCubeBlockTabGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       View view = p0.z();
       Object[] objArray = null;
       TabGuideMaskView tabGuideMask = (view != null)? view.findViewById(R.id.bgMask): objArray;
       int i = 0;
       if (tabGuideMask != null) {
          tabGuideMask.setMaskHeight(((KCubeBlockTabGuidePresenter.R8(this.b).getHeight() - KCubeBlockTabGuidePresenter.P8(this.b).getHeight()) - i.c(R.dimen.arg_RES_7f0702e3)));
          tabGuideMask.setTransparentHeight(KCubeBlockTabGuidePresenter.P8(this.b).getHeight());
          tabGuideMask.setTransparentWidth(KCubeBlockTabGuidePresenter.P8(this.b).getWidth());
          AnimatorSet uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{this.b.Y8(tabGuideMask, 0x3f800000, 0x3f851eb8, 400),this.b.Y8(tabGuideMask, 0x3f851eb8, 0x3f851eb8, 1450),this.b.Y8(tabGuideMask, 0x3f851eb8, 0x3f800000, 400)};
          uAnimatorSet.playSequentially(uAnimatorArr);
          uAnimatorSet.start();
       }
       View view1 = p0.z();
       KwaiLottieAnimationView kwaiLottieAn = (view1 != null)? view1.findViewById(R.id.xtab_guide_anim_view): objArray;
       if (kwaiLottieAn != null) {
          ViewGroup$LayoutParams layoutParams = kwaiLottieAn.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.topMargin = KCubeBlockTabGuidePresenter.R8(this.b).getHeight() - i.c(0x7f070356);
             kwaiLottieAn.D(R.string.arg_RES_7f100ee1);
             kwaiLottieAn.setVisibility(i);
             kwaiLottieAn.s();
          }else {
             PatchProxy.onMethodExit(f.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          }
       }
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, KCubeBlockTabGuidePresenter.class, "8")) {
          g.a(tb.u.edit().putInt("TAB_GUIDE_COUNT", (tb.W8() + 1)));
       }
       PatchProxy.onMethodExit(f.class, "1");
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport2(f.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, f.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       p0.v = false;
       PatchProxy.onMethodExit(f.class, "2");
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
