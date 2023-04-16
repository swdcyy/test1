package androidx.recyclerview.widget.g$e;
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

public class g$e extends AnimatorListenerAdapter	// class@000902
{
    public final RecyclerView$ViewHolder a;
    public final View b;
    public final ViewPropertyAnimator c;
    public final g d;

    public void g$e(g p0,RecyclerView$ViewHolder p1,View p2,ViewPropertyAnimator p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.b.setAlpha(0x3f800000);
    }
    public void onAnimationEnd(Animator p0){
       this.c.setListener(null);
       this.d.F(this.a);
       this.d.o.remove(this.a);
       this.d.Q();
    }
    public void onAnimationStart(Animator p0){
       Objects.requireNonNull(this.d);
    }
}
