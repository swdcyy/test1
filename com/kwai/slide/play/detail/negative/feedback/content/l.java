package com.kwai.slide.play.detail.negative.feedback.content.l;
import lnc.a1;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;
import java.lang.String;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;

public final class l	// class@001841
{
    public final ViewGroup a;
    public final ViewGroup b;
    public final RecyclerView c;
    public float d;
    public AnimatorSet e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;

    static {
       l.f = (float)a1.d(0x7f0703aa);
       l.g = (float)a1.d(0x7f0703ac);
       l.h = (float)a1.d(0x7f0703ab);
       l.i = (float)a1.d(0x7f0702b8);
    }
    public void l(ViewGroup p0){
       super();
       this.a = p0;
       this.b = p0.findViewById(0x7f0a2c14);
       this.c = p0.findViewById(0x7f0a2c16);
    }
    public final void a(float p0,float p1,Animator$AnimatorListener p2,TimeInterpolator p3,long p4){
       l ol = l.class;
       int i = 3;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,p3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ol, "4")) {
             return;
          }
       }
       ol = this.e;
       if (ol != null) {
          ol.cancel();
          this.e.removeAllListeners();
       }else {
          this.e = new AnimatorSet();
       }
       ol = this.b;
       float[] uofloatArray = new float[]{ol.getTranslationY(),p0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(ol, "translationY", uofloatArray);
       ol = this.b;
       uofloatArray = new float[]{ol.getAlpha(),p1};
       l ta = this.a;
       float[] uofloatArray1 = new float[]{ta.getAlpha(),p1};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(ta, "alpha", uofloatArray1);
       Animator[] uAnimatorArr = new Animator[i];
       uAnimatorArr[0] = objectAnimat;
       uAnimatorArr[1] = ObjectAnimator.ofFloat(ol, "alpha", uofloatArray);
       uAnimatorArr[2] = objectAnimat1;
       this.e.playTogether(uAnimatorArr);
       this.e.setDuration(p4);
       this.e.setInterpolator(p3);
       this.e.addListener(p2);
       this.e.start();
       return;
    }
}
