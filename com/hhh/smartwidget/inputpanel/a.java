package com.hhh.smartwidget.inputpanel.a;
import com.hhh.smartwidget.popup.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import com.hhh.smartwidget.inputpanel.InputPanel;
import com.hhh.smartwidget.a;
import android.app.Activity;
import hm.a;
import android.os.IBinder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class a implements PopupInterface$b	// class@000583
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       Activity uActivity = a.c();
       if (uActivity != null) {
          View currentFocus = uActivity.getCurrentFocus();
          if (currentFocus != null) {
             a.f(currentFocus.getWindowToken());
          }
       }
       float[] uofloatArray = new float[]{p0.getTranslationY(),0};
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(280);
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       uAnimatorSet.start();
       return;
    }
}
