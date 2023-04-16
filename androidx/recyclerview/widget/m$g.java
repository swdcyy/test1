package androidx.recyclerview.widget.m$g;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.m$g$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.animation.Animator;

public class m$g implements Animator$AnimatorListener	// class@000927
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final RecyclerView$ViewHolder e;
    public final int f;
    public final ValueAnimator g;
    public final int h;
    public boolean i;
    public float j;
    public float k;
    public boolean l;
    public boolean m;
    public float n;

    public void m$g(RecyclerView$ViewHolder p0,int p1,int p2,float p3,float p4,float p5,float p6){
       super();
       this.l = false;
       this.m = false;
       this.f = p2;
       this.h = p1;
       this.e = p0;
       this.a = p3;
       this.b = p4;
       this.c = p5;
       this.d = p6;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.g = valueAnimato;
       valueAnimato.addUpdateListener(new m$g$a(this));
       valueAnimato.setTarget(p0.itemView);
       valueAnimato.addListener(this);
       this.c(0);
    }
    public void a(){
       this.g.cancel();
    }
    public void b(long p0){
       this.g.setDuration(p0);
    }
    public void c(float p0){
       this.n = p0;
    }
    public void d(){
       this.e.setIsRecyclable(false);
       this.g.start();
    }
    public void e(){
       m$g ta = this.a;
       m$g tc = this.c;
       this.j = (!ta - tc)? this.e.itemView.getTranslationX(): ta + (this.n * (tc - ta));
       ta = this.b;
       tc = this.d;
       this.k = (!ta - tc)? this.e.itemView.getTranslationY(): ta + (this.n * (tc - ta));
       return;
    }
    public void onAnimationCancel(Animator p0){
       this.c(0x3f800000);
    }
    public void onAnimationEnd(Animator p0){
       if (this.m == null) {
          this.e.setIsRecyclable(true);
       }
       this.m = true;
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
