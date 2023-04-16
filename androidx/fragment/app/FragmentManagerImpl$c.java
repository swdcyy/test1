package androidx.fragment.app.FragmentManagerImpl$c;
import android.view.animation.Animation$AnimationListener;
import androidx.fragment.app.FragmentManagerImpl;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentManagerImpl$c$a;
import java.lang.Runnable;

public class FragmentManagerImpl$c implements Animation$AnimationListener	// class@000786
{
    public final ViewGroup b;
    public final Fragment c;
    public final FragmentManagerImpl d;

    public void FragmentManagerImpl$c(FragmentManagerImpl p0,ViewGroup p1,Fragment p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animation p0){
       this.b.post(new FragmentManagerImpl$c$a(this));
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
