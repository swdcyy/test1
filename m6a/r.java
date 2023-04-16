package m6a.r;
import android.animation.AnimatorListenerAdapter;
import m6a.p;
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

public class r extends AnimatorListenerAdapter	// class@002f5f
{
    public final RecyclerView$ViewHolder a;
    public final View b;
    public final ViewPropertyAnimator c;
    public final p d;

    public void r(p p0,RecyclerView$ViewHolder p1,View p2,ViewPropertyAnimator p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r.class, "2")) {
          return;
       }
       this.b.setAlpha(0x3f800000);
       this.b.setScaleX(0x3f800000);
       this.b.setScaleY(0x3f800000);
       PatchProxy.onMethodExit(r.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r.class, "3")) {
          return;
       }
       this.c.setListener(null);
       this.d.F(this.a);
       this.d.o.remove(this.a);
       this.d.M();
       PatchProxy.onMethodExit(r.class, "3");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.d);
       PatchProxy.onMethodExit(r.class, "1");
       return;
    }
}
