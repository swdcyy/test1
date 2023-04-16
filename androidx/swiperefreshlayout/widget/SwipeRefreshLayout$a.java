package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a;
import android.view.animation.Animation$AnimationListener;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.lang.Object;
import android.view.animation.Animation;
import c3.a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j;
import android.widget.ImageView;

public class SwipeRefreshLayout$a implements Animation$AnimationListener	// class@000996
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$a(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       SwipeRefreshLayout$a tb = this.b;
       if (tb.d != null) {
          tb.C.setAlpha(255);
          this.b.C.start();
          tb = this.b;
          if (tb.I != null) {
             SwipeRefreshLayout c = tb.c;
             if (c != null) {
                c.onRefresh();
             }
          }
          tb = this.b;
          tb.n = tb.v.getTop();
       }else {
          tb.k();
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
