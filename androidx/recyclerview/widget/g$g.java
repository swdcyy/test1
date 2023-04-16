package androidx.recyclerview.widget.g$g;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.g$i;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.y;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Objects;

public class g$g extends AnimatorListenerAdapter	// class@000904
{
    public final g$i a;
    public final ViewPropertyAnimator b;
    public final View c;
    public final g d;

    public void g$g(g p0,g$i p1,ViewPropertyAnimator p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.b.setListener(null);
       this.c.setAlpha(0x3f800000);
       this.c.setTranslationX(0);
       this.c.setTranslationY(0);
       this.d.G(this.a.a, true);
       this.d.r.remove(this.a.a);
       this.d.Q();
    }
    public void onAnimationStart(Animator p0){
       Objects.requireNonNull(this.d);
    }
}
