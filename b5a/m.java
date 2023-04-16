package b5a.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b5a.q;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import java.lang.Float;
import android.widget.ImageView;
import android.view.ViewGroup;

public final class m implements ValueAnimator$AnimatorUpdateListener	// class@000372
{
    public final q a;

    public void m(q p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       m ta = this.a;
       q l = ta.l;
       if (l == null || !l.isValid()) {
          ta.h.setAlpha(p0.getAnimatedValue().floatValue());
       }else {
          ta.d.setAlpha(p0.getAnimatedValue().floatValue());
       }
       return;
    }
}
