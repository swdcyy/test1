package ky8.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.award.ui.ShineView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.view.View;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@002c54
{
    public final ShineView a;

    public void b(ShineView p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       ShineView f1 = ta.f;
       if (f1 > null) {
          float f2 = ((float)(ta.d + (f1 * 2)) * f) - (float)f1;
          ta.g = f2;
          ShineView b = ta.b;
          if (b != null) {
             b.setTranslate(f2, 0);
          }
          b = ta.m;
          if (b != null) {
             b.setLocalMatrix(ta.b);
          }
          ta.invalidate();
       }
       return;
    }
}
