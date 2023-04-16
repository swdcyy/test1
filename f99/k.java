package f99.k;
import android.animation.AnimatorListenerAdapter;
import f99.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k extends AnimatorListenerAdapter	// class@0022ed
{
    public final h a;

    public void k(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.W8(0);
       this.a.X8();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.e9(false);
       return;
    }
}
