package androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;

public class CoordinatorLayout$e implements ViewTreeObserver$OnPreDrawListener	// class@0006cc
{
    public final CoordinatorLayout b;

    public void CoordinatorLayout$e(CoordinatorLayout p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       this.b.I(0);
       return true;
    }
}
