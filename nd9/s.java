package nd9.s;
import android.animation.AnimatorListenerAdapter;
import nd9.l$d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s extends AnimatorListenerAdapter	// class@003157
{
    public final l$d a;

    public void s(l$d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.g = null;
       return;
    }
}
