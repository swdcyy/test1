package androidx.recyclerview.widget.j$c;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.j;
import android.animation.Animator;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public class j$c extends AnimatorListenerAdapter	// class@000916
{
    public boolean a;
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       j$c tb;
       boolean b = false;
       if (this.a != null) {
          this.a = b;
          return;
       }else if(!this.b.A.getAnimatedValue().floatValue()){
          tb = this.b;
          tb.B = b;
          tb.u(b);
       }else {
          tb = this.b;
          tb.B = 2;
          tb.r();
       }
       return;
    }
}
