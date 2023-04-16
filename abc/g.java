package abc.g;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g extends AnimatorListenerAdapter	// class@0000d1
{
    public final e a;

    public void g(e p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.t();
       return;
    }
}
