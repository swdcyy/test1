package androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s;
import android.view.View;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$x$b;
import android.graphics.PointF;

public class p extends z	// class@00092c
{
    public s d;
    public s e;

    public void p(){
       super();
    }
    private View p(RecyclerView$LayoutManager p0,s p1){
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
    private s q(RecyclerView$LayoutManager p0){
       p te = this.e;
       if (te == null || te.a != p0) {
          this.e = s.a(p0);
       }
       return this.e;
    }
    private s r(RecyclerView$LayoutManager p0){
       p td = this.d;
       if (td == null || td.a != p0) {
          this.d = s.c(p0);
       }
       return this.d;
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] ointArray = new int[2];
       ointArray[0] = (p0.canScrollHorizontally())? this.n(p1, this.q(p0)): 0;
       ointArray[1] = (p0.canScrollVertically())? this.n(p1, this.r(p0)): 0;
       return ointArray;
    }
    public View h(RecyclerView$LayoutManager p0){
       if (p0.canScrollVertically()) {
          return this.p(p0, this.r(p0));
       }
       if (p0.canScrollHorizontally()) {
          return this.p(p0, this.q(p0));
       }
       return null;
    }
    public int i(RecyclerView$LayoutManager p0,int p1,int p2){
       if (!p0 instanceof RecyclerView$x$b) {
          return -1;
       }
       int itemCount = p0.getItemCount();
       if (!itemCount) {
          return -1;
       }
       View view = this.h(p0);
       if (view == null) {
          return -1;
       }
       int position = p0.getPosition(view);
       if (position == -1) {
          return -1;
       }
       int i = itemCount - 1;
       PointF pointF = p0.computeScrollVectorForPosition(i);
       if (pointF == null) {
          return -1;
       }
       int i1 = 0;
       if (p0.canScrollHorizontally()) {
          p1 = this.o(p0, this.q(p0), p1, i1);
          if (pointF.x < 0) {
             p1 = - p1;
          }
       }else {
          p1 = 0;
       }
       if (p0.canScrollVertically()) {
          p2 = this.o(p0, this.r(p0), i1, p2);
          if (pointF.y < 0) {
             p2 = - p2;
          }
       }else {
          p2 = 0;
       }
       if (p0.canScrollVertically()) {
          p1 = p2;
       }
       if (!p1) {
          return -1;
       }else {
          position = position + p1;
          if (position >= 0) {
             i1 = position;
          }
          if (i1 < itemCount) {
             i = i1;
          }
          return i;
       }
    }
    public final float m(RecyclerView$LayoutManager p0,s p1){
       int childCount = p0.getChildCount();
       if (!childCount) {
          return 0x3f800000;
       }
       int i = 0;
       View view = null;
       View view1 = view;
       int i1 = Integer.MAX_VALUE;
       int i2 = Integer.MIN_VALUE;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          int position = p0.getPosition(childAt);
          if (position != -1) {
             if (position < i1) {
                view = childAt;
                i1 = position;
             }
             if (position > i2) {
                view1 = childAt;
                i2 = position;
             }
          }
          i = i + 1;
       }
       if (view == null || view1 == null) {
          return 0x3f800000;
       }
       int i3 = Math.max(p1.d(view), p1.d(view1)) - Math.min(p1.g(view), p1.g(view1));
       if (!i3) {
          return 0x3f800000;
       }
       return (((float)i3 * 0x3f800000) / (float)((i2 - i1) + 1));
    }
    public final int n(View p0,s p1){
       return ((p1.g(p0) + (p1.e(p0) / 2)) - (p1.n() + (p1.o() / 2)));
    }
    public final int o(RecyclerView$LayoutManager p0,s p1,int p2,int p3){
       int[] ointArray = this.d(p2, p3);
       float f = this.m(p0, p1);
       int i = 0;
       if (f <= 0) {
          return i;
       }
       i = (Math.abs(ointArray[i]) > Math.abs(ointArray[1]))? ointArray[i]: ointArray[1];
       return Math.round(((float)i / f));
    }
}
