package b4d.k;
import android.animation.Animator$AnimatorListener;
import b4d.j;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public class k implements Animator$AnimatorListener	// class@00037a
{
    public final j a;

    public void k(j p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.p = false;
    }
    public void onAnimationEnd(Animator p0){
       p0.p = false;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       p0.p = true;
       Log.g("FinishButtonAnimPr", "show anim start...");
       return;
    }
}
