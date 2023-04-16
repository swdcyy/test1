package lx1.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import lnc.a1;
import android.widget.LinearLayout;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@00306f
{
    public final a a;
    public final ViewGroup$LayoutParams b;

    public void d(a p0,ViewGroup$LayoutParams p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       d tb = this.b;
       Objects.requireNonNull(ta);
       tb.height = a1.e((float)p0.getAnimatedValue().intValue());
       ta.d.setLayoutParams(tb);
    }
}
