package gc9.b$a;
import android.animation.AnimatorListenerAdapter;
import gc9.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import gc9.a;

public final class b$a extends AnimatorListenerAdapter	// class@002470
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "1")) {
          return;
       }
       this.a.b.setVisibility(4);
       a p = this.a.c.p;
       if (p != null) {
          p.setVisibility(0);
       }
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
    }
}
