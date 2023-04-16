package androidx.appcompat.widget.ActionBarOverlayLayout$c;
import java.lang.Runnable;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.animation.Animator$AnimatorListener;

public class ActionBarOverlayLayout$c implements Runnable	// class@0005c3
{
    public final ActionBarOverlayLayout b;

    public void ActionBarOverlayLayout$c(ActionBarOverlayLayout p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.s();
       ActionBarOverlayLayout$c tb = this.b;
       tb.B = tb.e.animate().translationY((float)(- this.b.e.getHeight())).setListener(this.b.C);
    }
}
