package fgd.r$a$a;
import u07.u;
import fgd.r$a;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import fgd.r;
import android.widget.Button;
import android.view.ViewPropertyAnimator;
import com.kwai.library.widget.specific.misc.CleanUpView;
import fgd.q;
import android.animation.Animator$AnimatorListener;
import fgd.r$a$a$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class r$a$a implements u	// class@000e35
{
    public final r$a b;
    public final Ref$BooleanRef c;

    public void r$a$a(r$a p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r$a$a.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       p0.element = true;
       r$a b = this.b.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, r.class, "5")) {
          r t = b.t;
          String str = "mClearCacheBtn";
          if (t == null) {
             a.S(str);
          }
          if (t.getAlpha() - 0x3f800000 >= 0) {
             t = b.t;
             if (t == null) {
                a.S(str);
             }
             t.animate().cancel();
             t = b.u;
             if (t == null) {
                a.S("mCleanUpView");
             }
             t.c();
             t = b.t;
             if (t == null) {
                a.S(str);
             }
             t.setClickable(false);
             t = b.t;
             if (t == null) {
                a.S(str);
             }
             t.animate().alpha(0).setDuration(300).setListener(new q(b)).start();
          }
       }
       c.k(new r$a$a$a(this));
       return;
    }
}
