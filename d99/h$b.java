package d99.h$b;
import android.animation.AnimatorListenerAdapter;
import d99.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$b extends AnimatorListenerAdapter	// class@00209f
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       this.a.S8(false);
       return;
    }
}
