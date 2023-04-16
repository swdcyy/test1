package f73.a;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a extends AnimatorListenerAdapter	// class@0028e3
{
    public boolean a;
    public final AnimatorSet b;
    public final View c;

    public void a(AnimatorSet p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
       this.a = true;
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       this.c.setScaleX(0x3f800000);
       this.c.setScaleY(0x3f800000);
       this.a = false;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       if (this.a != null) {
          this.b.start();
          this.a = false;
       }
       return;
    }
}
