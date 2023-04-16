package d22.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.basic.widget.LiveOverVerticalScrollViewGroup;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;

public final class i implements ValueAnimator$AnimatorUpdateListener	// class@00242c
{
    public final LiveOverVerticalScrollViewGroup a;
    public final View b;
    public final boolean c;

    public void i(LiveOverVerticalScrollViewGroup p0,View p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       i ta = this.a;
       i tb = this.b;
       Objects.requireNonNull(ta);
       int i = ta.c(tb, p0.getAnimatedValue().floatValue());
       int i1 = (this.c != null)? -1: 1;
       ta.d(tb, (i * i1));
       return;
    }
}
