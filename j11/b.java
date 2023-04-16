package j11.b;
import android.view.View;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import j11.a;
import android.animation.Animator$AnimatorListener;

public class b	// class@002a36
{
    public final Animator a;

    public void b(View p0){
       super();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(p0, this, uob, "2");
       if (uAnimatorSet != patchProxyRe) {
       }else {
          uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[3];
          ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(p0, this, uob, "3");
          if (objectAnimat != patchProxyRe) {
          }else {
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3fa66666,0x3f666666}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3fa66666,0x3f666666})};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu2);
             objectAnimat.setDuration(150);
          }
          uAnimatorArr[0] = objectAnimat;
          objectAnimat = PatchProxy.applyOneRefs(p0, this, uob, "4");
          if (objectAnimat != patchProxyRe) {
          }else {
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f666666,0x3f866666}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f666666,0x3f866666})};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu1);
             objectAnimat.setStartDelay(150);
             objectAnimat.setDuration(100);
          }
          uAnimatorArr[1] = objectAnimat;
          ObjectAnimator objectAnimat1 = PatchProxy.applyOneRefs(p0, this, uob, "5");
          if (objectAnimat1 != patchProxyRe) {
          }else {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f866666,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f866666,0x3f800000})};
             objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
             objectAnimat1.setStartDelay(250);
             objectAnimat1.setDuration(100);
          }
          uAnimatorArr[2] = objectAnimat1;
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.addListener(new a(this, p0));
       }
       this.a = uAnimatorSet;
       return;
    }
}
