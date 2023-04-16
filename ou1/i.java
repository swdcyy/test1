package ou1.i;
import androidx.lifecycle.Observer;
import ou1.o;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ou1.f;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ub.a;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;

public final class i implements Observer	// class@00359e
{
    public final o b;

    public void i(o p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          o v = this.b.v;
          if (v != null) {
             a.o(p0, "it");
             i = p0.intValue();
             f uof = f.class;
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), v, uof, "2")) {
                KwaiCDNImageView.q0(v.a, i, 0, null, 6, null);
                if (i == 0x7f1025c0) {
                   v.a(v.g);
                   i = v.a;
                   AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(i, v, uof, "6");
                   if (uAnimatorSet != PatchProxyResult.class) {
                   }else {
                      PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x40000000,0x3f4ccccd}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x40000000,0x3f4ccccd})};
                      ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(i, propertyValu);
                      objectAnimat.setDuration(140);
                      a.o(objectAnimat, "ObjectAnimator.ofPropert¡­     duration = 140\n    }");
                      PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000})};
                      ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(i, propertyValu1);
                      objectAnimat1.setDuration(160);
                      a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­     duration = 160\n    }");
                      AnimatorSet uAnimatorSet1 = new AnimatorSet();
                      Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                      uAnimatorSet1.playSequentially(uAnimatorArr);
                      i = ObjectAnimator.ofFloat(i, View.ALPHA, new float[2]{0,0x3f800000});
                      i.setDuration(160);
                      AnimatorSet uAnimatorSet2 = new AnimatorSet();
                      Animator[] uAnimatorArr1 = new Animator[]{uAnimatorSet1,i};
                      uAnimatorSet2.playTogether(uAnimatorArr1);
                      uAnimatorSet = uAnimatorSet2;
                   }
                   v.g = uAnimatorSet;
                   if (uAnimatorSet != null) {
                      uAnimatorSet.start();
                   }
                }
             }
          }
       }
       return;
    }
}
