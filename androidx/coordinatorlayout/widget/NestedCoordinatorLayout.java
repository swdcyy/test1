package androidx.coordinatorlayout.widget.NestedCoordinatorLayout;
import a2.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import a2.u;
import android.view.View;
import androidx.coordinatorlayout.widget.NestedCoordinatorLayout$a;

public class NestedCoordinatorLayout extends CoordinatorLayout implements r	// class@0006d0
{
    public NestedCoordinatorLayout$a A;
    public final u z;

    public void NestedCoordinatorLayout(Context p0){
       super(p0, null);
    }
    public void NestedCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NestedCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       u ou = new u(this);
       this.z = ou;
       ou.n(true);
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       return this.z.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       return this.z.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4){
       return this.z.d(p0, p1, p2, p3, p4);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5){
       return this.z.g(p0, p1, p2, p3, p4, p5);
    }
    public boolean hasNestedScrollingParent(int p0){
       return this.z.l(p0);
    }
    public boolean isNestedScrollingEnabled(){
       return this.z.m();
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       boolean b = super.onNestedFling(p0, p1, p2, p3);
       b = (this.dispatchNestedFling(p1, p2, p3) || b)? true: false;
       return b;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       boolean b = super.onNestedPreFling(p0, p1, p2);
       b = (this.dispatchNestedPreFling(p1, p2) || b)? true: false;
       return b;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       int this;
       NestedCoordinatorLayout tA = this.A;
       int i = (tA != null)? tA.a(this, p0, p1, p2): 0;
       if (!i) {
          super.onNestedPreScroll(p0, p1, p2, p3, p4);
          return;
       }else if(i == 1){
          this.dispatchNestedPreScroll(p1, p2, p3, null, p4);
          i = p3[0];
          this = p3[1];
          if (i != p1 || this != p2) {
             super.onNestedPreScroll(p0, (p1 - i), (p2 - this), p3, p4);
             p3[0] = p3[0] + i;
             p3[1] = p3[1] + this;
          }
          return;
       }else if(i == 2){
          super.onNestedPreScroll(p0, p1, p2, p3, p4);
          int i1 = p3[0];
          i = p3[1];
          if (i1 != p1 || i != p2) {
             this.dispatchNestedPreScroll((p1 - i1), (p2 - i), p3, null, p4);
             p3[0] = p3[0] + i1;
             p3[1] = p3[1] + i;
          }
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       super.onNestedScroll(p0, p1, p2, p3, p4, p5);
       this.dispatchNestedScroll(p1, p2, p3, p4, null, p5);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = super.onStartNestedScroll(p0, p1, p2, p3);
       b = (this.startNestedScroll(p2, p3) || b)? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0,int p1){
       super.onStopNestedScroll(p0, p1);
       this.stopNestedScroll(p1);
    }
    public void setBubbleScrollOrderSupplier(NestedCoordinatorLayout$a p0){
       this.A = p0;
    }
    public boolean startNestedScroll(int p0,int p1){
       return this.z.q(p0, p1);
    }
    public void stopNestedScroll(int p0){
       this.z.s(p0);
    }
}
