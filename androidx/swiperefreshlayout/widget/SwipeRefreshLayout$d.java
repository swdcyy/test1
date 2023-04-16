package androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.animation.Transformation;
import c3.a;

public class SwipeRefreshLayout$d extends Animation	// class@000999
{
    public final int b;
    public final int c;
    public final SwipeRefreshLayout d;

    public void SwipeRefreshLayout$d(SwipeRefreshLayout p0,int p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void applyTransformation(float p0,Transformation p1){
       SwipeRefreshLayout$d tb = this.b;
       float f = (float)tb;
       this.d.C.setAlpha((int)(f + ((float)(this.c - tb) * p0)));
    }
}
