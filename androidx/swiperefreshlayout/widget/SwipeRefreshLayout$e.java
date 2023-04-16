package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e;
import android.view.animation.Animation$AnimationListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.lang.Object;
import android.view.animation.Animation;

public class SwipeRefreshLayout$e implements Animation$AnimationListener	// class@00099a
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$e(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       SwipeRefreshLayout$e tb = this.b;
       if (tb.s == null) {
          tb.r(null);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
