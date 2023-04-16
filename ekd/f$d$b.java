package ekd.f$d$b;
import android.animation.AnimatorListenerAdapter;
import ekd.f$d;
import android.animation.Animator;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.animation.Animator$AnimatorListener;

public class f$d$b extends AnimatorListenerAdapter	// class@000d3a
{
    public final int a;
    public final f$d b;

    public void f$d$b(f$d p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       f$d e;
       f$d$b tb = this.b;
       if (tb.g != null) {
          e = tb.e;
          if (e != null) {
             ViewGroup$LayoutParams layoutParams = e.getLayoutParams();
             layoutParams.height = layoutParams.height - this.a;
             e = this.b.e;
             e.setPadding(e.getPaddingLeft(), this.b.e.getPaddingTop(), this.b.e.getPaddingRight(), (this.b.e.getPaddingBottom() - this.a));
          }
          this.b.b.setTranslationY(0);
       }
       e = this.b.f;
       if (e != null) {
          e.onAnimationEnd(p0);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       f$d f = this.b.f;
       if (f != null) {
          f.onAnimationStart(p0);
       }
       return;
    }
}
