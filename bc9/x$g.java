package bc9.x$g;
import android.animation.AnimatorListenerAdapter;
import bc9.x;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class x$g extends AnimatorListenerAdapter	// class@00040f
{
    public final x a;
    public final float b;

    public void x$g(x p0,float p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$g.class, "1")) {
          return;
       }
       x$g tb = this.b;
       x$g ta = this.a;
       if (!tb - ta.r) {
          ta.m2(0);
       }else if(!tb - ta.s){
          ta.m2(4);
       }
       return;
    }
}
