package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Transformation;

public class SwipeRefreshLayout$c extends Animation	// class@000998
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$c(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       this.b.setAnimationProgress((0x3f800000 - p0));
    }
}
