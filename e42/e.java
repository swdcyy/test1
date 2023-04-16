package e42.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.clearscreen.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import java.util.Iterator;
import java.util.Set;
import dt5.b;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@002617
{
    public final c a;

    public void e(c p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ta.h(f);
       Iterator iterator = ta.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(f);
       }
       return;
    }
}
