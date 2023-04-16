package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Transformation;

public class SwipeRefreshLayout$b extends Animation	// class@000997
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$b(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       this.b.setAnimationProgress(p0);
    }
}
