package nd9.q;
import android.animation.AnimatorListenerAdapter;
import nd9.l$d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nd9.l;
import com.kwai.library.widget.textview.KwaiMarqueeTextView;
import android.widget.TextView;

public class q extends AnimatorListenerAdapter	// class@003155
{
    public final l$d a;

    public void q(l$d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       q ta = this.a;
       if (ta.g != null) {
          ta.h.v.setDuration(4000);
          this.a.h.v.setAlpha(0x3f800000);
          this.a.h.v.setAnimStartDelayMs(0);
          this.a.h.v.setEndStartPadding(0);
          ta = this.a;
          ta.h.v.setMaxRepeatCount(ta.e);
          ta = this.a;
          ta.h.v.w(ta.f, true, 0x800003);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       q ta = this.a;
       if (ta.g != null) {
          ta.h.v.setAlpha(0);
          ta = this.a;
          ta.h.v.w(ta.f, false, 0x800003);
       }
       return;
    }
}
