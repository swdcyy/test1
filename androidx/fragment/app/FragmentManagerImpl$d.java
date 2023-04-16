package androidx.fragment.app.FragmentManagerImpl$d;
import android.animation.AnimatorListenerAdapter;
import androidx.fragment.app.FragmentManagerImpl;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.animation.Animator;

public class FragmentManagerImpl$d extends AnimatorListenerAdapter	// class@000787
{
    public final ViewGroup a;
    public final View b;
    public final Fragment c;
    public final FragmentManagerImpl d;

    public void FragmentManagerImpl$d(FragmentManagerImpl p0,ViewGroup p1,View p2,Fragment p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.endViewTransition(this.b);
       this.c.setAnimator(null);
       if (this.c.getAnimator() != null && this.a.indexOfChild(this.b) < 0) {
          FragmentManagerImpl$d tc = this.c;
          this.d.moveToState(tc, tc.getStateAfterAnimating(), 0, 0, false);
       }
       return;
    }
}
