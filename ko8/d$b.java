package ko8.d$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ko8.d;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.viewpager2.widget.ViewPager2;

public class d$b implements ValueAnimator$AnimatorUpdateListener	// class@002bd6
{
    public int a;
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       if (this.b.b != null) {
          return;
       }
       int i = p0.getAnimatedValue().intValue();
       float f = (float)(i - this.a);
       d c = this.b.c;
       if (c != null) {
          c.d((- f));
       }
       this.a = i;
       return;
    }
}
