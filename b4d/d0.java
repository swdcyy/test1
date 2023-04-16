package b4d.d0;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import b4d.a0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;

public final class d0 extends AnimatorListenerAdapter	// class@00035e
{
    public final ViewGroup a;
    public final a0 b;

    public void d0(ViewGroup p0,a0 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d0.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       a0.R8(this.b).Ri(false);
       d0 tb = this.b;
       tb.B = false;
       tb.j9();
       PatchProxy.onMethodExit(d0.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d0.class, "1")) {
          return;
       }
       this.b.k9(true);
       PatchProxy.onMethodExit(d0.class, "1");
       return;
    }
}
