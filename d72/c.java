package d72.c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.divertpush.view.LiveDivertPushView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.LinearLayout;

public class c extends AnimatorListenerAdapter	// class@002481
{
    public final LiveDivertPushView a;

    public void c(LiveDivertPushView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       c ta = this.a;
       ta.postDelayed(ta.u, ta.s);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       return;
    }
}