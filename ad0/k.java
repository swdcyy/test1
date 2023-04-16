package ad0.k;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class k implements Animator$AnimatorListener	// class@00006a
{
    public final View a;

    public void k(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       if ((double)this.a.getScaleX() - 0x3ff0000000000000 < 0) {
          this.a.setScaleX(0x3f800000);
       }
       if ((double)this.a.getScaleY() - 0x3ff0000000000000 < 0) {
          this.a.setScaleY(0x3f800000);
       }
       return;
    }
}
