package mr1.f;
import android.animation.AnimatorListenerAdapter;
import mr1.l;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import kr1.b;

public final class f extends AnimatorListenerAdapter	// class@0031f7
{
    public final l a;

    public void f(l p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       l a = this.a.a;
       if (a == null) {
          a.S("followLottie");
       }
       a.setVisibility(8);
       this.a.c.c();
       return;
    }
}
