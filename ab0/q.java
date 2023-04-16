package ab0.q;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.gifshow.smartalbum.ui.grid.b;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import lnc.a1;

public class q implements Animator$AnimatorListener	// class@000047
{
    public final b a;

    public void q(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "3")) {
          return;
       }
       this.a.w.setVisibility(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.a.w.setVisibility(0);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.a.w.setVisibility(0);
       this.a.w.setAlpha(0);
       this.a.x.setTranslationY((float)a1.d(R.dimen.arg_RES_7f070eea));
       return;
    }
}
