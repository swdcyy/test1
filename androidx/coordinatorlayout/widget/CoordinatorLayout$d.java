package androidx.coordinatorlayout.widget.CoordinatorLayout$d;
import android.view.ViewGroup$OnHierarchyChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;
import android.view.View;

public class CoordinatorLayout$d implements ViewGroup$OnHierarchyChangeListener	// class@0006cb
{
    public final CoordinatorLayout b;

    public void CoordinatorLayout$d(CoordinatorLayout p0){
       this.b = p0;
       super();
    }
    public void onChildViewAdded(View p0,View p1){
       CoordinatorLayout r = this.b.r;
       if (r != null) {
          r.onChildViewAdded(p0, p1);
       }
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       this.b.I(2);
       CoordinatorLayout r = this.b.r;
       if (r != null) {
          r.onChildViewRemoved(p0, p1);
       }
       return;
    }
}
