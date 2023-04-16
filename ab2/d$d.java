package ab2.d$d;
import android.animation.AnimatorListenerAdapter;
import ab2.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class d$d extends AnimatorListenerAdapter	// class@00009d
{
    public final d a;

    public void d$d(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.p.setVisibility(0);
       return;
    }
}
