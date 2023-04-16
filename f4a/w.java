package f4a.w;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import f4a.y;

public final class w implements Runnable	// class@0022bb
{
    public final View b;
    public final long c;

    public void w(View p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       w tb = this.b;
       tb.setPivotX(0);
       tb.setPivotY((float)tb.getMeasuredHeight());
       tb.animate().setListener(null).cancel();
       tb.animate().setInterpolator(new DecelerateInterpolator()).alpha(0).setDuration(this.c).scaleX(0x3f333333).scaleY(0x3f333333).setListener(new y(tb));
    }
}
