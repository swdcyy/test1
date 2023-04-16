package b4d.l;
import android.animation.Animator$AnimatorListener;
import b4d.j;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.CharSequence;
import ky5.n;
import com.yxcorp.utility.Log;

public class l implements Animator$AnimatorListener	// class@00037c
{
    public final j a;

    public void l(j p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.p = false;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       l ta = this.a;
       ta.p = false;
       n.a(ta.r, ta.C, false);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       p0.p = true;
       Log.g("FinishButtonAnimPr", "hide anim start...");
       return;
    }
}
