package f4a.x;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class x implements Runnable	// class@0022bc
{
    public final View b;
    public final long c;
    public final float d;
    public final long e;

    public void x(View p0,long p1,float p2,long p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       x tb = this.b;
       tb.setScaleY(0x3f333333);
       tb.setScaleX(0x3f333333);
       tb.setAlpha(0);
       tb.setVisibility(0);
       tb.setPivotX(0);
       tb.setPivotY((float)tb.getMeasuredHeight());
       tb.animate().setListener(null).cancel();
       tb.animate().setInterpolator(new DecelerateInterpolator()).setStartDelay(this.c).alpha(this.d).setDuration(this.e).scaleY(0x3f800000).scaleX(0x3f800000).start();
    }
}
