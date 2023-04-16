package a63.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import a63.d;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.graphics.Rect;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@000055
{
    public final n a;
    public final d b;
    public final View c;

    public void e(n p0,d p1,View p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       e ta = this.a;
       e tb = this.b;
       Objects.requireNonNull(ta);
       ta.b9(ta.R8(tb.a, tb.b, p0.getAnimatedValue().floatValue()), this.c, 0x3f800000, 0, 0);
    }
}
