package androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.p;
import android.view.animation.Interpolator;
import c2.a;
import androidx.recyclerview.widget.x$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.Exception;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$x;
import androidx.recyclerview.widget.x$b;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Math;

public class x extends p	// class@00093d
{
    public boolean f;
    public x$c g;
    public s h;
    public s i;
    public RecyclerView j;
    public int k;
    public boolean l;
    public float m;
    public Interpolator n;
    public RecyclerView$r o;

    public void x(){
       super();
       this.m = 0x3f000000;
       this.n = a.b(0.41f, 0, 0x3f1eb852, 0x3f6b851f);
       this.o = new x$a(this);
    }
    public static void x(RecyclerView p0,int p1){
       try{
          Field declaredFiel = p0.getClass().getDeclaredField("mMaxFlingVelocity");
          declaredFiel.setAccessible(true);
          declaredFiel.set(p0, Integer.valueOf(p1));
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public void b(RecyclerView p0){
       super.b(p0);
       this.j = p0;
       if (p0 != null) {
          p0.removeOnScrollListener(this.o);
          this.j.addOnScrollListener(this.o);
       }
       return;
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] ointArray = new int[2]{0,0};
       if (p0.canScrollHorizontally()) {
          ointArray[0] = this.s(p1, this.q(p0)) + this.k;
       }
       if (p0.canScrollVertically()) {
          ointArray[1] = this.s(p1, this.r(p0));
       }
       return ointArray;
    }
    public RecyclerView$x e(RecyclerView$LayoutManager p0){
       return new x$b(this, this.j.getContext());
    }
    public View h(RecyclerView$LayoutManager p0){
       View view = (p0.canScrollHorizontally())? this.v(p0, this.q(p0)): this.v(p0, this.r(p0));
       boolean b = (view != null)? true: false;
       this.f = b;
       return view;
    }
    public void l(){
       x tj = this.j;
       if (tj == null) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = tj.getLayoutManager();
       if (layoutManage != null) {
          View view = this.h(layoutManage);
          if (view == null) {
             return;
          }else {
             int[] ointArray = this.c(layoutManage, view);
             int i = 0;
             int i1 = 1;
             if (ointArray[i] || ointArray[i1]) {
                this.j.smoothScrollBy(ointArray[i], ointArray[i1], this.n);
             }
          }
       }
       return;
    }
    public s q(RecyclerView$LayoutManager p0){
       if (this.i == null) {
          this.i = s.a(p0);
       }
       return this.i;
    }
    public s r(RecyclerView$LayoutManager p0){
       if (this.h == null) {
          this.h = s.c(p0);
       }
       return this.h;
    }
    public final int s(View p0,s p1){
       return (p1.g(p0) - p1.n());
    }
    public View t(RecyclerView$LayoutManager p0,s p1){
       View childAt;
       int i = p1.n();
       int i1 = p1.i();
       int i2 = 0;
       while (true) {
          if (i2 >= p0.getChildCount()) {
             return null;
          }
          childAt = p0.getChildAt(i2);
          int i3 = p1.d(childAt);
          if (p1.g(childAt) < i1 && i3 > i) {
             break ;
          }else {
             i2 = i2 + 1;
          }
       }
       return childAt;
    }
    public final View u(RecyclerView$LayoutManager p0,s p1,View p2){
       View childAt;
       int i = p1.d(p2);
       int i1 = 0;
       while (true) {
          if (i1 >= p0.getChildCount()) {
             return null;
          }
          childAt = p0.getChildAt(i1);
          if (i <= p1.g(childAt)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return childAt;
    }
    public final View v(RecyclerView$LayoutManager p0,s p1){
       View view = null;
       if (!p0.getChildCount()) {
          return view;
       }
       View view1 = this.t(p0, p1);
       if (view1 == null) {
          return view;
       }
       float f = (float)p1.g(view1) / (float)p1.e(view1);
       float f1 = (float)p1.d(view1) / (float)p1.e(view1);
       if (this.l != null && (Math.abs(f) - this.m > 0 && (this.l != null || f1 - this.m < 0))) {
          view1 = this.u(p0, p1, view1);
       }
       return view1;
    }
    public void w(int p0){
       this.k = p0;
    }
    public void y(float p0){
       this.m = p0;
    }
}
