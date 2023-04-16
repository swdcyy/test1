package androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.t$a;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Math;
import android.graphics.PointF;

public class t extends z	// class@000936
{
    public s d;
    public s e;

    public void t(){
       super();
    }
    private s o(RecyclerView$LayoutManager p0){
       t te = this.e;
       if (te == null || te.a != p0) {
          this.e = s.a(p0);
       }
       return this.e;
    }
    private s q(RecyclerView$LayoutManager p0){
       t td = this.d;
       if (td == null || td.a != p0) {
          this.d = s.c(p0);
       }
       return this.d;
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] ointArray = new int[2];
       ointArray[0] = (p0.canScrollHorizontally())? this.m(p1, this.o(p0)): 0;
       ointArray[1] = (p0.canScrollVertically())? this.m(p1, this.q(p0)): 0;
       return ointArray;
    }
    public RecyclerView$x e(RecyclerView$LayoutManager p0){
       if (!p0 instanceof RecyclerView$x$b) {
          return null;
       }
       return new t$a(this, this.a.getContext());
    }
    public View h(RecyclerView$LayoutManager p0){
       if (p0.canScrollVertically()) {
          return this.n(p0, this.q(p0));
       }
       if (p0.canScrollHorizontally()) {
          return this.n(p0, this.o(p0));
       }
       return null;
    }
    public int i(RecyclerView$LayoutManager p0,int p1,int p2){
       int itemCount = p0.getItemCount();
       if (!itemCount) {
          return -1;
       }
       s os = this.p(p0);
       if (os == null) {
          return -1;
       }
       int i = Integer.MIN_VALUE;
       int i1 = Integer.MAX_VALUE;
       int childCount = p0.getChildCount();
       int i2 = 0;
       View view = null;
       View view1 = view;
       while (i2 < childCount) {
          View childAt = p0.getChildAt(i2);
          if (childAt != null) {
             int i3 = this.m(childAt, os);
             if (i3 <= 0 && i3 > i) {
                view1 = childAt;
                i = i3;
             }
             if (i3 >= 0 && i3 < i1) {
                view = childAt;
                i1 = i3;
             }
          }
       label_0034 :
          i2 = i2 + 1;
       }
       boolean b = this.r(p0, p1, p2);
       if (b && view != null) {
          return p0.getPosition(view);
       }
       if (!b && view1 != null) {
          return p0.getPosition(view1);
       }
       if (b) {
          view = view1;
       }
       if (view == null) {
          return -1;
       }else {
          p2 = p0.getPosition(view);
          int i4 = (this.s(p0) == b)? -1: 1;
          p2 = p2 + i4;
          if (p2 < 0 || p2 >= itemCount) {
             return -1;
          }else {
             return p2;
          }
       }
    }
    public final int m(View p0,s p1){
       return ((p1.g(p0) + (p1.e(p0) / 2)) - (p1.n() + (p1.o() / 2)));
    }
    public final View n(RecyclerView$LayoutManager p0,s p1){
       int childCount = p0.getChildCount();
       View view = null;
       if (!childCount) {
          return view;
       }
       int i = p1.n() + (p1.o() / 2);
       int i1 = Integer.MAX_VALUE;
       int i2 = 0;
       while (i2 < childCount) {
          View childAt = p0.getChildAt(i2);
          int i3 = p1.e(childAt) / 2;
          int i4 = p1.g(childAt) + i3;
          i4 = i4 - i;
          i4 = Math.abs(i4);
          if (i4 < i1) {
             view = childAt;
             i1 = i4;
          }
          i2 = i2 + 1;
       }
       return view;
    }
    public final s p(RecyclerView$LayoutManager p0){
       if (p0.canScrollVertically()) {
          return this.q(p0);
       }
       if (p0.canScrollHorizontally()) {
          return this.o(p0);
       }
       return null;
    }
    public final boolean r(RecyclerView$LayoutManager p0,int p1,int p2){
       boolean b = false;
       if (p0.canScrollHorizontally()) {
          if (p1 > 0) {
             b = true;
          }
          return b;
       }else if(p2 > 0){
          b = true;
       }
       return b;
    }
    public final boolean s(RecyclerView$LayoutManager p0){
       int itemCount = p0.getItemCount();
       int i = 1;
       if (p0 instanceof RecyclerView$x$b) {
          PointF pointF = p0.computeScrollVectorForPosition((itemCount - i));
          if (pointF != null && (pointF.x < 0 || pointF.y < 0)) {
          label_0021 :
             return i;
          }
       }
       i = false;
       goto label_0021 ;
    }
}
