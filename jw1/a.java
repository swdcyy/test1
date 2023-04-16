package jw1.a;
import java.lang.Runnable;
import jw1.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import va1.n0;
import android.view.ViewGroup;
import android.animation.AnimatorSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.animation.ObjectAnimator;
import th0.d;
import android.animation.TimeInterpolator;

public final class a implements Runnable	// class@002c16
{
    public final b b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;

    public void a(b p0,ConstraintLayout p1,ConstraintLayout p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       Animator[] uAnimatorArr1;
       int i;
       AnimatorSet uAnimatorSet1;
       AnimatorSet uAnimatorSet2;
       Animator[] uAnimatorArr2;
       int i1;
       float[] uofloatArray;
       float f;
       a uoa = this;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       n0.m(b.a);
       int measuredWidt = c.getMeasuredWidth();
       int measuredHeig = c.getMeasuredHeight();
       int measuredWidt1 = d.getMeasuredWidth();
       int measuredHeig1 = d.getMeasuredHeight();
       AnimatorSet uAnimatorSet = new AnimatorSet();
       b.a = uAnimatorSet;
       Animator[] uAnimatorArr = new Animator[2];
       if (PatchProxy.isSupport(b.class)) {
          uAnimatorArr1 = uAnimatorArr;
          i = 2;
          uAnimatorSet1 = uAnimatorSet;
          uAnimatorSet2 = PatchProxy.applyThreeRefs(c, Integer.valueOf(measuredWidt), Integer.valueOf(measuredHeig), b, b.class, "3");
          if (uAnimatorSet2 != PatchProxyResult.class) {
             uAnimatorArr2 = uAnimatorArr1;
             i1 = 3;
          label_00af :
             uAnimatorArr2[0] = uAnimatorSet2;
             if (PatchProxy.isSupport(b.class)) {
                uAnimatorSet2 = PatchProxy.applyThreeRefs(d, Integer.valueOf(measuredWidt1), Integer.valueOf(measuredHeig1), b, b.class, "4");
                if (uAnimatorSet2 != PatchProxyResult.class) {
                label_0119 :
                   uAnimatorArr2[1] = uAnimatorSet2;
                   uAnimatorSet1.playTogether(uAnimatorArr2);
                   return;
                }
             }
             uAnimatorSet2 = new AnimatorSet();
             b.d(d);
             uofloatArray = new float[i];
             uofloatArray[0] = 0;
             f = (float)measuredWidt1;
             float f1 = (- b.b) - f;
             uofloatArray[1] = f1;
             float[] uofloatArray1 = new float[i];
             uofloatArray1[0] = f1;
             uofloatArray1[1] = f1;
             b.e(d, f, (float)measuredHeig1);
             float[] uofloatArray2 = new float[i];
             uofloatArray2[0] = f1;
             uofloatArray2[1] = (float)(- measuredWidt1) - b.c;
             uAnimatorArr = new Animator[i1];
             uAnimatorArr[0] = b.b(d, uofloatArray);
             uAnimatorArr[1] = b.c(d, uofloatArray1);
             uAnimatorArr[i] = b.a(d, uofloatArray2);
             uAnimatorSet2.playSequentially(uAnimatorArr);
             uAnimatorSet2.setInterpolator(new d());
             uAnimatorSet2.start();
             goto label_0119 ;
          }
       }else {
          uAnimatorArr1 = uAnimatorArr;
          uAnimatorSet1 = uAnimatorSet;
          i = 2;
       }
       uAnimatorSet2 = new AnimatorSet();
       b.d(c);
       uofloatArray = new float[i];
       uofloatArray[0] = 0;
       float f2 = (float)measuredWidt;
       f = b.b + f2;
       uofloatArray[1] = f;
       float[] uofloatArray3 = new float[i];
       uofloatArray3[0] = f;
       uofloatArray3[1] = f;
       b.e(c, 0, (float)measuredHeig);
       float[] uofloatArray4 = new float[i];
       uofloatArray4[0] = f;
       uofloatArray4[1] = f2 + b.c;
       i1 = 3;
       uAnimatorArr = new Animator[i1];
       uAnimatorArr[0] = b.b(c, uofloatArray);
       uAnimatorArr[1] = b.c(c, uofloatArray3);
       uAnimatorArr[i] = b.a(c, uofloatArray4);
       uAnimatorSet2.playSequentially(uAnimatorArr);
       uAnimatorSet2.setInterpolator(new d());
       uAnimatorSet2.start();
       uAnimatorArr2 = uAnimatorArr1;
       goto label_00af ;
    }
}
