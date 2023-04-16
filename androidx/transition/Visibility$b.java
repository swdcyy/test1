package androidx.transition.Visibility$b;
import androidx.transition.Transition$f;
import androidx.transition.a$a;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import androidx.transition.Transition;
import e3.w;
import e3.s;
import android.animation.Animator;

public class Visibility$b extends AnimatorListenerAdapter implements Transition$f, a$a	// class@0009dd
{
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public void Visibility$b(View p0,int p1,boolean p2){
       super();
       this.f = false;
       this.a = p0;
       this.b = p1;
       this.c = p0.getParent();
       this.d = p2;
       this.g(true);
    }
    public void a(Transition p0){
    }
    public void b(Transition p0){
       this.f();
       p0.T(this);
    }
    public void c(Transition p0){
    }
    public void d(Transition p0){
       this.g(true);
    }
    public void e(Transition p0){
       this.g(false);
    }
    public final void f(){
       if (this.f == null) {
          w.j(this.a, this.b);
          Visibility$b tc = this.c;
          if (tc != null) {
             tc.invalidate();
          }
       }
       this.g(false);
       return;
    }
    public final void g(boolean p0){
       if (this.d != null && this.e != p0) {
          Visibility$b tc = this.c;
          if (tc != null) {
             this.e = p0;
             s.c(tc, p0);
          }
       }
       return;
    }
    public void onAnimationCancel(Animator p0){
       this.f = true;
    }
    public void onAnimationEnd(Animator p0){
       this.f();
    }
    public void onAnimationPause(Animator p0){
       if (this.f == null) {
          w.j(this.a, this.b);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationResume(Animator p0){
       if (this.f == null) {
          w.j(this.a, 0);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
    }
}
