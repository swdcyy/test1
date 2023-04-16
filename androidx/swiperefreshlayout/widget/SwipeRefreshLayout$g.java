package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Transformation;

public class SwipeRefreshLayout$g extends Animation	// class@00099c
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$g(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       this.b.i(p0);
    }
}
