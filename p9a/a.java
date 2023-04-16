package p9a.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class a implements ValueAnimator$AnimatorUpdateListener	// class@0034ab
{
    public int a;
    public int b;

    public void a(int p0){
       super();
       this.b = p0;
    }
    public abstract void a(ValueAnimator p0);
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       int i = this.a + 1;
       this.a = i;
       i = i % this.b;
       this.a = i;
       if (!i) {
          this.a(p0);
       }
       return;
    }
}
