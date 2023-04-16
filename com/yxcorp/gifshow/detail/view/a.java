package com.yxcorp.gifshow.detail.view.a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TableLayout;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import l2.b;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public final class a implements PopupInterface$c	// class@001a70
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       float[] uofloatArray = new float[]{(float)p0.getHeight(),0};
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setInterpolator(new b());
       uAnimatorSet.setDuration(200);
       uAnimatorSet.addListener(p1);
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, TableLayout.TRANSLATION_Y, uofloatArray),ObjectAnimator.ofFloat(p0, TableLayout.ALPHA, new float[2]{0,0x3f800000})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
}
