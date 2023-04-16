package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Transformation;

public class SwipeRefreshLayout$h extends Animation	// class@00099d
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$h(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       SwipeRefreshLayout$h tb = this.b;
       SwipeRefreshLayout y = tb.y;
       tb.setAnimationProgress((y + ((- y) * p0)));
       this.b.i(p0);
    }
}
