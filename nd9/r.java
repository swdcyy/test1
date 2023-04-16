package nd9.r;
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
import q5b.f;
import lnc.a1;

public class r extends AnimatorListenerAdapter	// class@003156
{
    public final l$d a;

    public void r(l$d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       r ta = this.a;
       if (ta.g != null) {
          ta.h.v.y();
          this.a.h.v.setAlpha(0);
          l v = this.a.h.v;
          int i = (f.a())? 0x7f104a51: 0x7f100485;
          v.w(a1.p(i), false, 17);
       }
       return;
    }
}
