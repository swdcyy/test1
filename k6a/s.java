package k6a.s;
import android.animation.AnimatorListenerAdapter;
import k6a.n;
import android.view.View;
import k6a.n$d;
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

public class s extends AnimatorListenerAdapter	// class@002bff
{
    public final View a;
    public final n$d b;
    public final ViewPropertyAnimator c;
    public final n d;

    public void s(n p0,View p1,n$d p2,ViewPropertyAnimator p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "2")) {
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
       PatchProxy.onMethodExit(s.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, s.class, "1")) {
          return;
       }
       this.a.setAlpha(0x3f800000);
       Objects.requireNonNull(this.d);
       PatchProxy.onMethodExit(s.class, "1");
       return;
    }
}
