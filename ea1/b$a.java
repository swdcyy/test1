package ea1.b$a;
import java.lang.Object;
import nsd.u;
import android.view.View;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.animation.ValueAnimator;
import ea1.b$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.p;
import android.animation.TimeInterpolator;

public final class b$a	// class@0020c5
{

    public void b$a(){
       super();
    }
    public void b$a(u p0){
       super();
    }
    public final void a(View p0,ViewElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "viewElement");
       p0.setVisibility(0);
       if (p1.shouldForbiddenGradientAnim()) {
          return;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato.addUpdateListener(new b$a$a(p0));
       valueAnimato.setInterpolator(new p());
       valueAnimato.setDuration(300);
       valueAnimato.start();
       return;
    }
}
