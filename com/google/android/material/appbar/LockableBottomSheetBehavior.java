package com.google.android.material.appbar.LockableBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;

public class LockableBottomSheetBehavior extends BottomSheetBehavior	// class@00162b
{
    public boolean a;

    public void LockableBottomSheetBehavior(){
       super();
       this.a = true;
    }
    public void LockableBottomSheetBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = true;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b = (this.a == null)? super.onInterceptTouchEvent(p0, p1, p2): false;
       return b;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       boolean b = (this.a == null)? super.onNestedPreFling(p0, p1, p2, p3, p4): false;
       return b;
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5){
       if (this.a == null) {
          super.onNestedPreScroll(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4){
       boolean b = (this.a == null)? super.onStartNestedScroll(p0, p1, p2, p3, p4): false;
       return b;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2){
       if (this.a == null) {
          super.onStopNestedScroll(p0, p1, p2);
       }
       return;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean b = (this.a == null)? super.onTouchEvent(p0, p1, p2): false;
       return b;
    }
}
