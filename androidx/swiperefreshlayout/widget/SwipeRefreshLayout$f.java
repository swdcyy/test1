package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Transformation;
import java.lang.Math;
import android.widget.ImageView;
import c3.a;

public class SwipeRefreshLayout$f extends Animation	// class@00099b
{
    public final SwipeRefreshLayout b;

    public void SwipeRefreshLayout$f(SwipeRefreshLayout p0){
       this.b = p0;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       SwipeRefreshLayout$f tb = this.b;
       int i = (tb.K == null)? tb.A - Math.abs(tb.z): tb.A;
       tb = this.b;
       SwipeRefreshLayout x = tb.x;
       this.b.setTargetOffsetTopAndBottom(((x + (int)((float)(i - x) * p0)) - tb.v.getTop()));
       this.b.C.h((0x3f800000 - p0));
       return;
    }
}
