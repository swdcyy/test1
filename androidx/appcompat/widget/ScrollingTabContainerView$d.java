package androidx.appcompat.widget.ScrollingTabContainerView$d;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView;
import android.animation.Animator;
import android.widget.HorizontalScrollView;

public class ScrollingTabContainerView$d extends AnimatorListenerAdapter	// class@000613
{
    public boolean a;
    public int b;
    public final ScrollingTabContainerView c;

    public void ScrollingTabContainerView$d(ScrollingTabContainerView p0){
       this.c = p0;
       super();
       this.a = false;
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       if (this.a != null) {
          return;
       }
       ScrollingTabContainerView$d tc = this.c;
       tc.k = null;
       tc.setVisibility(this.b);
       return;
    }
    public void onAnimationStart(Animator p0){
       this.c.setVisibility(0);
       this.a = false;
    }
}
