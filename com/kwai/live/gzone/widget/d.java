package com.kwai.live.gzone.widget.d;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.live.gzone.widget.e;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.l1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;

public class d implements PopupInterface$c	// class@000e8d
{
    public final e a;

    public void d(e p0){
       this.a = p0;
       super();
    }
    public void a(View p0,Animator$AnimatorListener p1){
       float[] uofloatArray;
       ObjectAnimator objectAnimat;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       int i = 0;
       int i1 = 2;
       int i2 = 1;
       if (l1.a()) {
          uofloatArray = new float[i1];
          uofloatArray[0] = i;
          uofloatArray[i2] = (float)p0.getWidth();
          objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray);
       }else {
          uofloatArray = new float[i1];
          uofloatArray[0] = i;
          uofloatArray[i2] = (float)p0.getHeight();
          objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       }
       Animator[] uAnimatorArr = new Animator[i2];
       uAnimatorArr[0] = objectAnimat;
       this.a.g0(250, p1, uAnimatorArr);
       return;
    }
}