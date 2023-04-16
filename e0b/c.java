package e0b.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import e0b.c$a;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e0b.b;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import e0b.a;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.app.Activity;
import com.kwai.library.widget.popup.common.f;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.util.Objects;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public abstract class c extends c implements PopupInterface$f, d	// class@0025b2
{
    public ViewGroup p;
    public static final int q;

    static {
       c.q = a1.e(0x43cf0000);
    }
    public void c(c$a p0){
       c uoc = c.class;
       super(p0);
       p0.P(false);
       p0.z(true);
       p0.A(true);
       p0.L(this);
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "5")) {
       }else {
          p0.F(new b(this));
          p0.N(new a(this));
       }
       Drawable uDrawable = PatchProxy.apply(null, this, uoc, "1");
       if (uDrawable != PatchProxyResult.class) {
       }else {
          uDrawable = a1.f(R.color.arg_RES_7f0601b6);
       }
       if (uDrawable != null) {
          p0.w(uDrawable);
          this.d.setBackground(uDrawable);
       }
       p0.H(f.r(this.u()));
       return;
    }
    public static void b0(c p0,View p1,Animator$AnimatorListener p2){
       Objects.requireNonNull(p0);
       float[] uofloatArray = new float[]{0,(float)p1.getHeight()};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p1, View.TRANSLATION_Y, uofloatArray)};
       p0.e0(250, p2, uAnimatorArr);
    }
    public static void c0(c p0,View p1,Animator$AnimatorListener p2){
       Objects.requireNonNull(p0);
       float[] uofloatArray = new float[]{(float)p1.getHeight(),0};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p1, View.TRANSLATION_Y, uofloatArray)};
       p0.e0(250, p2, uAnimatorArr);
    }
    private void e0(long p0,Animator$AnimatorListener p1,Animator[] p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, c.class, "6")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.playTogether(p2);
       uAnimatorSet.setDuration(p0);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       uAnimatorSet.start();
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.doBindView(this.p);
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, c.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.p = p2;
       return a.g(p1, this.d0(), p2, false);
    }
    public void b(c p0){
    }
    public abstract int d0();
    public void doBindView(View p0){
    }
    public c f0(PopupInterface$h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.M(p0);
       return this;
    }
}
