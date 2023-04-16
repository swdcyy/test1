package androidx.fragment.app.FragmentManagerImpl$e;
import android.animation.AnimatorListenerAdapter;
import androidx.fragment.app.FragmentManagerImpl;
import android.view.ViewGroup;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

public class FragmentManagerImpl$e extends AnimatorListenerAdapter	// class@000788
{
    public final ViewGroup a;
    public final View b;
    public final Fragment c;
    public final FragmentManagerImpl d;

    public void FragmentManagerImpl$e(FragmentManagerImpl p0,ViewGroup p1,View p2,Fragment p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.endViewTransition(this.b);
       p0.removeListener(this);
       FragmentManagerImpl$e tc = this.c;
       Fragment mView = tc.mView;
       if (mView != null && tc.mHidden != null) {
          mView.setVisibility(8);
       }
       return;
    }
}
