package bb0.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w69.e;
import android.view.View;

public class e extends AnimatorListenerAdapter	// class@00025b
{
    public final int a;
    public final c b;

    public void e(c p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       e tb = this.b;
       tb.D = false;
       c z = tb.z;
       if (z != null) {
          z.g(this.a);
       }
       this.b.q.setVisibility(8);
       return;
    }
}
