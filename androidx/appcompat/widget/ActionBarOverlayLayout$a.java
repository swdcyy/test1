package androidx.appcompat.widget.ActionBarOverlayLayout$a;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import android.animation.Animator;

public class ActionBarOverlayLayout$a extends AnimatorListenerAdapter	// class@0005c1
{
    public final ActionBarOverlayLayout a;

    public void ActionBarOverlayLayout$a(ActionBarOverlayLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       ActionBarOverlayLayout$a ta = this.a;
       ta.B = null;
       ta.l = false;
    }
    public void onAnimationEnd(Animator p0){
       ActionBarOverlayLayout$a ta = this.a;
       ta.B = null;
       ta.l = false;
    }
}
