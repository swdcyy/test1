package androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.graphics.Rect;
import a2.u0;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$BaseSavedState;

public abstract class CoordinatorLayout$Behavior	// class@0006c4
{

    public void CoordinatorLayout$Behavior(){
       super();
    }
    public void CoordinatorLayout$Behavior(Context p0,AttributeSet p1){
       super();
    }
    public static Object getTag(View p0){
       return p0.getLayoutParams().r;
    }
    public static void setTag(View p0,Object p1){
       p0.r = p1;
    }
    public boolean blocksInteractionBelow(CoordinatorLayout p0,View p1){
       boolean b = (this.getScrimOpacity(p0, p1) > 0)? true: false;
       return b;
    }
    public boolean getInsetDodgeRect(CoordinatorLayout p0,View p1,Rect p2){
       return false;
    }
    public int getScrimColor(CoordinatorLayout p0,View p1){
       return 0xff000000;
    }
    public float getScrimOpacity(CoordinatorLayout p0,View p1){
       return 0;
    }
    public boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2){
       return false;
    }
    public u0 onApplyWindowInsets(CoordinatorLayout p0,View p1,u0 p2){
       return p2;
    }
    public void onAttachedToLayoutParams(CoordinatorLayout$LayoutParams p0){
    }
    public boolean onDependentViewChanged(CoordinatorLayout p0,View p1,View p2){
       return false;
    }
    public void onDependentViewRemoved(CoordinatorLayout p0,View p1,View p2){
    }
    public void onDetachedFromLayoutParams(){
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return false;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       return false;
    }
    public boolean onMeasureChild(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       return false;
    }
    public boolean onNestedFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4,boolean p5){
       return false;
    }
    public boolean onNestedPreFling(CoordinatorLayout p0,View p1,View p2,float p3,float p4){
       return false;
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5){
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       if (!p6) {
          this.onNestedPreScroll(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6){
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (!p7) {
          this.onNestedScroll(p0, p1, p2, p3, p4, p5, p6);
       }
       return;
    }
    public void onNestedScrollAccepted(CoordinatorLayout p0,View p1,View p2,View p3,int p4){
    }
    public void onNestedScrollAccepted(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       if (!p5) {
          this.onNestedScrollAccepted(p0, p1, p2, p3, p4);
       }
       return;
    }
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout p0,View p1,Rect p2,boolean p3){
       return false;
    }
    public void onRestoreInstanceState(CoordinatorLayout p0,View p1,Parcelable p2){
    }
    public Parcelable onSaveInstanceState(CoordinatorLayout p0,View p1){
       return View$BaseSavedState.EMPTY_STATE;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4){
       return false;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       if (!p5) {
          return this.onStartNestedScroll(p0, p1, p2, p3, p4);
       }
       return false;
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2){
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       if (!p3) {
          this.onStopNestedScroll(p0, p1, p2);
       }
       return;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return false;
    }
}
