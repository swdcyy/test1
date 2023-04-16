package fa.g;
import android.view.View;
import android.animation.ValueAnimator;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import fa.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class g	// class@001fe0
{

    public static ValueAnimator a(View p0,boolean p1){
       ValueAnimator valueAnimato = null;
       if (p0.getParent() instanceof View) {
          Drawable background = p0.getParent().getBackground();
          if (background == null) {
             return valueAnimato;
          }else {
             background = background.mutate();
             if (background != null) {
                ValueAnimator valueAnimato1 = (p1)? ValueAnimator.ofInt(new int[2]{'L',0}): ValueAnimator.ofInt(new int[2]{0,'L'});
                valueAnimato = valueAnimato1;
                valueAnimato.addUpdateListener(new f(background));
             }
          }
       }
       return valueAnimato;
    }
    public static int b(int p0,boolean p1){
       if (p0 != 80) {
          return -1;
       }
       p0 = (p1)? 0x7f0100e3: 0x7f0100e4;
       return p0;
    }
}
