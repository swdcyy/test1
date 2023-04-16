package cl9.i2$h;
import android.animation.AnimatorListenerAdapter;
import cl9.i2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class i2$h extends AnimatorListenerAdapter	// class@000635
{
    public final i2 a;

    public void i2$h(i2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i2$h.class, "1")) {
          return;
       }
       this.a.r.setVisibility(8);
       return;
    }
}
