package androidx.appcompat.widget.ActionBarOverlayLayout$b;
import java.lang.Runnable;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.animation.Animator$AnimatorListener;

public class ActionBarOverlayLayout$b implements Runnable	// class@0005c2
{
    public final ActionBarOverlayLayout b;

    public void ActionBarOverlayLayout$b(ActionBarOverlayLayout p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.s();
       ActionBarOverlayLayout$b tb = this.b;
       tb.B = tb.e.animate().translationY(0).setListener(this.b.C);
    }
}
