package ekd.f$b;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import ekd.f$h;
import java.lang.Object;
import android.animation.Animator;
import android.content.Context;
import android.text.Spannable;
import java.lang.CharSequence;

public final class f$b implements Animator$AnimatorListener	// class@000d37
{
    public final TextView a;
    public final f$h b;
    public final long c;

    public void f$b(TextView p0,f$h p1,long p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (this.a.getContext() == null) {
          p0.cancel();
          return;
       }else {
          this.a.setText(this.b.b((float)this.c));
          return;
       }
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
