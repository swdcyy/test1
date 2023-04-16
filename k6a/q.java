package k6a.q;
import android.animation.AnimatorListenerAdapter;
import k6a.n;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import java.util.Objects;

public class q extends AnimatorListenerAdapter	// class@002bfd
{
    public final RecyclerView$ViewHolder a;
    public final int b;
    public final View c;
    public final int d;
    public final ViewPropertyAnimator e;
    public final n f;

    public void q(n p0,RecyclerView$ViewHolder p1,int p2,View p3,int p4,ViewPropertyAnimator p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "2")) {
          return;
       }
       if (this.b != null) {
          this.c.setTranslationX(0);
       }
       if (this.d != null) {
          this.c.setTranslationY(0);
       }
       PatchProxy.onMethodExit(q.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "3")) {
          return;
       }
       this.e.setListener(null);
       this.f.H(this.a);
       this.f.p.remove(this.a);
       this.f.M();
       PatchProxy.onMethodExit(q.class, "3");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.f);
       PatchProxy.onMethodExit(q.class, "1");
       return;
    }
}
