package com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ik.a;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.MotionEvent;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior	// class@0016aa
{
    public final a k;

    public void BaseTransientBottomBar$Behavior(){
       super();
       this.k = new a(this);
    }
    public boolean c(View p0){
       return this.k.a(p0);
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       this.k.onInterceptTouchEvent(p0, p1, p2);
       return super.onInterceptTouchEvent(p0, p1, p2);
    }
}
