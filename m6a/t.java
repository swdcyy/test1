package m6a.t;
import android.animation.AnimatorListenerAdapter;
import m6a.p;
import m6a.p$d;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.y;
import java.util.ArrayList;
import java.util.Objects;

public class t extends AnimatorListenerAdapter	// class@002f61
{
    public final p$d a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final p d;

    public void t(p p0,p$d p1,ViewPropertyAnimator p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t.class, "2")) {
          return;
       }
       this.b.setListener(null);
       this.c.setAlpha(0);
       this.c.setTranslationX(0);
       this.c.setTranslationY(0);
       this.c.setScaleX(0x3f800000);
       this.c.setScaleY(0x3f800000);
       this.d.G(this.a.a, true);
       this.d.r.remove(this.a.a);
       this.d.M();
       PatchProxy.onMethodExit(t.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, t.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.d);
       PatchProxy.onMethodExit(t.class, "1");
       return;
    }
}
