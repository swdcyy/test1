package androidx.transition.ChangeTransform$c;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.ChangeTransform;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform$f;
import androidx.transition.ChangeTransform$e;
import java.lang.Object;
import android.animation.Animator;
import e3.w;

public class ChangeTransform$c extends AnimatorListenerAdapter	// class@0009b8
{
    public boolean a;
    public Matrix b;
    public final boolean c;
    public final Matrix d;
    public final View e;
    public final ChangeTransform$f f;
    public final ChangeTransform$e g;
    public final ChangeTransform h;

    public void ChangeTransform$c(ChangeTransform p0,boolean p1,Matrix p2,View p3,ChangeTransform$f p4,ChangeTransform$e p5){
       this.h = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
       this.b = new Matrix();
    }
    public final void a(Matrix p0){
       this.b.set(p0);
       this.e.setTag(R.id.transition_transform, this.b);
       this.f.a(this.e);
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       Matrix matrix = null;
       if (this.a == null) {
          if (this.c != null && this.h.L != null) {
             this.a(this.d);
          }else {
             this.e.setTag(R.id.transition_transform, matrix);
             this.e.setTag(R.id.parent_matrix, matrix);
          }
       }
       w.g(this.e, matrix);
       this.f.a(this.e);
       return;
    }
    public void onAnimationPause(Animator p0){
       this.a(this.g.a());
    }
    public void onAnimationResume(Animator p0){
       ChangeTransform.n0(this.e);
    }
}
