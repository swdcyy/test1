package androidx.transition.ChangeClipBounds$a;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.ChangeClipBounds;
import android.view.View;
import android.animation.Animator;
import android.graphics.Rect;
import a2.i0;

public class ChangeClipBounds$a extends AnimatorListenerAdapter	// class@0009af
{
    public final View a;
    public final ChangeClipBounds b;

    public void ChangeClipBounds$a(ChangeClipBounds p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       i0.z0(this.a, null);
    }
}
