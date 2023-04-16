package g59.i0;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.Iterator;
import android.animation.Animator;

public class i0	// class@002404
{

    public void i0(){
       super();
    }
    public static void a(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i0.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.cancel();
       p0.removeAllUpdateListeners();
       p0.removeAllListeners();
       return;
    }
    public static void b(AnimatorSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i0.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.getChildAnimations().iterator();
       while (iterator.hasNext()) {
          Animator uAnimator = iterator.next();
          if (uAnimator instanceof ValueAnimator) {
             i0.a(uAnimator);
          }
       }
       return;
    }
}
