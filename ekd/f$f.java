package ekd.f$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.TextView;
import ekd.f$h;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.content.Context;
import java.lang.Float;
import android.text.Spannable;
import java.lang.CharSequence;

public final class f$f implements ValueAnimator$AnimatorUpdateListener	// class@000d3d
{
    public final TextView a;
    public final f$h b;

    public void f$f(TextView p0,f$h p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (this.a.getContext() == null) {
          p0.cancel();
          return;
       }else if(p0.getAnimatedValue() != null){
          this.a.setText(this.b.a(p0.getAnimatedValue().floatValue()));
       }
       return;
    }
}
