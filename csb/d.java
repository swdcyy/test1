package csb.d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.Animator;

public class d extends AnimatorListenerAdapter	// class@0023a9
{
    public final ViewGroup$MarginLayoutParams a;
    public final ViewGroup$MarginLayoutParams b;
    public final TipRefreshView c;

    public void d(TipRefreshView p0,ViewGroup$MarginLayoutParams p1,ViewGroup$MarginLayoutParams p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.topMargin = 0;
       p0.topMargin = 0;
    }
    public void onAnimationStart(Animator p0){
       p0.topMargin = 0;
       p0.topMargin = 0;
    }
}
