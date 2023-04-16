package m6a.q;
import android.animation.AnimatorListenerAdapter;
import m6a.p;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import java.util.Objects;

public class q extends AnimatorListenerAdapter	// class@002f5e
{
    public final RecyclerView$ViewHolder a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final p d;

    public void q(p p0,RecyclerView$ViewHolder p1,ViewPropertyAnimator p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "2")) {
          return;
       }
       this.b.setListener(null);
       this.c.setAlpha(0x3f800000);
       this.c.setScaleX(0x3f800000);
       this.c.setScaleY(0x3f800000);
       this.d.I(this.a);
       this.d.q.remove(this.a);
       this.d.M();
       PatchProxy.onMethodExit(q.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.d);
       PatchProxy.onMethodExit(q.class, "1");
       return;
    }
}
