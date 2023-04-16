package androidx.transition.g$a;
import androidx.transition.Transition$f;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.Math;
import java.lang.Object;
import androidx.transition.Transition;
import android.animation.Animator;

public class g$a extends AnimatorListenerAdapter implements Transition$f	// class@0009f9
{
    public final View a;
    public final View b;
    public final int c;
    public final int d;
    public int[] e;
    public float f;
    public float g;
    public final float h;
    public final float i;

    public void g$a(View p0,View p1,int p2,int p3,float p4,float p5){
       super();
       this.b = p0;
       this.a = p1;
       this.c = p2 - Math.round(p0.getTranslationX());
       this.d = p3 - Math.round(p0.getTranslationY());
       this.h = p4;
       this.i = p5;
       int[] tag = p1.getTag(R.id.transition_position);
       this.e = tag;
       if (tag != null) {
          p1.setTag(R.id.transition_position, null);
       }
       return;
    }
    public void a(Transition p0){
    }
    public void b(Transition p0){
       this.b.setTranslationX(this.h);
       this.b.setTranslationY(this.i);
       p0.T(this);
    }
    public void c(Transition p0){
    }
    public void d(Transition p0){
    }
    public void e(Transition p0){
    }
    public void onAnimationCancel(Animator p0){
       int[] ointArray;
       if (this.e == null) {
          ointArray = new int[2];
          this.e = ointArray;
       }
       ointArray[0] = Math.round(((float)this.c + this.b.getTranslationX()));
       ointArray[1] = Math.round(((float)this.d + this.b.getTranslationY()));
       this.a.setTag(R.id.transition_position, this.e);
       return;
    }
    public void onAnimationPause(Animator p0){
       this.f = this.b.getTranslationX();
       this.g = this.b.getTranslationY();
       this.b.setTranslationX(this.h);
       this.b.setTranslationY(this.i);
    }
    public void onAnimationResume(Animator p0){
       this.b.setTranslationX(this.f);
       this.b.setTranslationY(this.g);
    }
}
