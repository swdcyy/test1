package ik.a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.Object;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;
import ik.f;
import ik.f$b;

public class a	// class@0021f1
{
    public f$b a;

    public void a(SwipeDismissBehavior p0){
       super();
       p0.j(0.10f);
       p0.i(0x3f19999a);
       p0.k(0);
    }
    public boolean a(View p0){
       return p0 instanceof BaseTransientBottomBar$SnackbarBaseLayout;
    }
    public void onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int actionMasked = p2.getActionMasked();
       if (actionMasked) {
          if (actionMasked == 1 || actionMasked == 3) {
             f.b().f(this.a);
          }
       }else if(p0.C(p1, (int)p2.getX(), (int)p2.getY())){
          f.b().e(this.a);
       }
       return;
    }
}
