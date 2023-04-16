package androidx.transition.Fade$b;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import e3.w;
import android.graphics.Paint;
import a2.i0;

public class Fade$b extends AnimatorListenerAdapter	// class@0009bf
{
    public final View a;
    public boolean b;

    public void Fade$b(View p0){
       super();
       this.b = false;
       this.a = p0;
    }
    public void onAnimationEnd(Animator p0){
       w.i(this.a, 0x3f800000);
       if (this.b != null) {
          this.a.setLayerType(0, null);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (i0.U(this.a) && !this.a.getLayerType()) {
          this.b = true;
          this.a.setLayerType(2, null);
       }
       return;
    }
}
