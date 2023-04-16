package androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import java.util.Comparator;
import java.lang.Object;
import android.view.View;
import a2.i0;

public class CoordinatorLayout$f implements Comparator	// class@0006cd
{

    public void CoordinatorLayout$f(){
       super();
    }
    public int a(View p0,View p1){
       float f = i0.R(p0);
       float f1 = i0.R(p1);
       if (f - f1 > 0) {
          return -1;
       }
       if (f - f1 < 0) {
          return 1;
       }
       return 0;
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
