package cb2.t;
import android.view.View$OnTouchListener;
import cb2.w;
import ekd.f$j;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.animation.Animator;

public final class t implements View$OnTouchListener	// class@000519
{
    public final w b;
    public final f$j c;

    public void t(w p0,f$j p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       t tb = this.b;
       Objects.requireNonNull(tb);
       this.c.onAnimationCancel(null);
       tb.c();
       return true;
    }
}
