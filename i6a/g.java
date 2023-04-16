package i6a.g;
import android.animation.AnimatorListenerAdapter;
import i6a.f;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import i6a.g$a;
import android.animation.Animator$AnimatorListener;

public final class g extends AnimatorListenerAdapter	// class@002798
{
    public final f a;

    public void g(f p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "2")) {
          return;
       }
       f.P8(this.a).setClickable(true);
       PatchProxy.onMethodExit(g.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "1")) {
          return;
       }
       g ta = this.a;
       ta.G = ta.Y8(ta.G);
       ta = this.a;
       ta.H = ta.Y8(ta.H);
       ta = this.a;
       ta.I = ta.I + 1;
       ta.c9();
       this.a.e9();
       f p = this.a.p;
       if (p == null) {
          a.S("cardsContainer");
       }
       p.animate().setDuration(300).scaleX(0x3f800000).scaleY(0x3f800000).setListener(new g$a(this));
       PatchProxy.onMethodExit(g.class, "1");
       return;
    }
}
