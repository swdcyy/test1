package cb2.h$d;
import ekd.f$j;
import cb2.h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import cb2.f;
import java.lang.Runnable;
import ekd.k1;
import cb2.c;
import cb2.g;
import cb2.d;

public class h$d extends f$j	// class@00050a
{
    public final h a;

    public void h$d(h p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "2")) {
          return;
       }
       this.a.a9();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "3")) {
          return;
       }
       h$d ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, h.class, "7")) {
          k1.s(new f(ta), ta, 600);
          k1.s(new c(ta), ta, 2300);
          k1.s(new g(ta), ta, 3200);
          k1.s(new d(ta), ta, 4900);
       }
       return;
    }
}
