package ko8.d$c;
import android.animation.Animator$AnimatorListener;
import ko8.d;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;

public class d$c implements Animator$AnimatorListener	// class@002bd7
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.removeAllListeners();
          if (p0 instanceof ValueAnimator) {
             p0.removeAllUpdateListeners();
          }
       }
       d$c ta = this.a;
       if (ta.b == null) {
          d c = ta.c;
          if (c != null) {
             c.b();
          }
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.removeAllListeners();
          if (p0 instanceof ValueAnimator) {
             p0.removeAllUpdateListeners();
          }
       }
       d$c ta = this.a;
       if (ta.b == null) {
          d c = ta.c;
          if (c != null) {
             c.b();
          }
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       d$c ta = this.a;
       if (ta.b == null) {
          d c = ta.c;
          if (c != null) {
             c.a();
          }
       }
       return;
    }
}
