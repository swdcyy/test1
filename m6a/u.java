package m6a.u;
import android.animation.AnimatorListenerAdapter;
import m6a.p;
import android.view.View;
import m6a.p$d;
import android.view.ViewPropertyAnimator;
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

public class u extends AnimatorListenerAdapter	// class@002f62
{
    public final View a;
    public final p$d b;
    public final ViewPropertyAnimator c;
    public final p d;

    public void u(p p0,View p1,p$d p2,ViewPropertyAnimator p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, u.class, "2")) {
          return;
       }
       this.c.setListener(null);
       this.a.setAlpha(0x3f800000);
       this.a.setTranslationX(0);
       this.a.setTranslationY(0);
       this.a.setScaleX(0x3f800000);
       this.a.setScaleY(0x3f800000);
       this.d.G(this.b.b, false);
       this.d.r.remove(this.b.b);
       this.d.M();
       PatchProxy.onMethodExit(u.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, u.class, "1")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       Objects.requireNonNull(this.d);
       PatchProxy.onMethodExit(u.class, "1");
       return;
    }
}
