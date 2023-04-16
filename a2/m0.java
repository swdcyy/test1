package a2.m0;
import android.view.View;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.animation.TimeInterpolator;
import a2.n0;
import a2.m0$a;
import android.animation.Animator$AnimatorListener;
import a2.p0;
import a2.m0$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Runnable;

public final class m0	// class@00008d
{
    public WeakReference a;
    public Runnable b;
    public Runnable c;
    public int d;

    public void m0(View p0){
       super();
       this.b = null;
       this.c = null;
       this.d = -1;
       this.a = new WeakReference(p0);
    }
    public m0 a(float p0){
       View view = this.a.get();
       if (view != null) {
          view.animate().alpha(p0);
       }
       return this;
    }
    public void b(){
       View view = this.a.get();
       if (view != null) {
          view.animate().cancel();
       }
       return;
    }
    public long c(){
       View view = this.a.get();
       if (view != null) {
          return view.animate().getDuration();
       }
       return 0;
    }
    public m0 d(long p0){
       View view = this.a.get();
       if (view != null) {
          view.animate().setDuration(p0);
       }
       return this;
    }
    public m0 e(Interpolator p0){
       View view = this.a.get();
       if (view != null) {
          view.animate().setInterpolator(p0);
       }
       return this;
    }
    public m0 f(n0 p0){
       View view = this.a.get();
       if (view != null) {
          this.g(view, p0);
       }
       return this;
    }
    public final void g(View p0,n0 p1){
       if (p1 != null) {
          p0.animate().setListener(new m0$a(this, p1, p0));
       }else {
          p0.animate().setListener(null);
       }
       return;
    }
    public m0 h(long p0){
       View view = this.a.get();
       if (view != null) {
          view.animate().setStartDelay(p0);
       }
       return this;
    }
    public m0 i(p0 p0){
       View view = this.a.get();
       if (view != null) {
          m0$b uob = null;
          if (p0 != null) {
             uob = new m0$b(this, p0, view);
          }
          view.animate().setUpdateListener(uob);
       }
       return this;
    }
    public void j(){
       View view = this.a.get();
       if (view != null) {
          view.animate().start();
       }
       return;
    }
    public m0 k(float p0){
       View view = this.a.get();
       if (view != null) {
          view.animate().translationY(p0);
       }
       return this;
    }
    public m0 l(Runnable p0){
       View view = this.a.get();
       if (view != null) {
          view.animate().withEndAction(p0);
       }
       return this;
    }
}
