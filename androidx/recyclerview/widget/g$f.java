package androidx.recyclerview.widget.g$f;
import android.animation.AnimatorListenerAdapter;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.y;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Objects;

public class g$f extends AnimatorListenerAdapter	// class@000903
{
    public final RecyclerView$ViewHolder a;
    public final int b;
    public final View c;
    public final int d;
    public final ViewPropertyAnimator e;
    public final g f;

    public void g$f(g p0,RecyclerView$ViewHolder p1,int p2,View p3,int p4,ViewPropertyAnimator p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (this.b != null) {
          this.c.setTranslationX(0);
       }
       if (this.d != null) {
          this.c.setTranslationY(0);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       this.e.setListener(null);
       this.f.H(this.a);
       this.f.p.remove(this.a);
       this.f.Q();
    }
    public void onAnimationStart(Animator p0){
       Objects.requireNonNull(this.f);
    }
}
