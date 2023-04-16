package androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.RecyclerView$x;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView$x$a;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.View;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class o extends RecyclerView$x	// class@00092b
{
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public void o(Context p0){
       super();
       this.i = new LinearInterpolator();
       this.j = new DecelerateInterpolator();
       this.m = false;
       this.o = 0;
       this.p = 0;
       this.l = c.c(p0.getResources());
    }
    public final float A(){
       if (this.m == null) {
          this.n = this.v(this.l);
          this.m = true;
       }
       return this.n;
    }
    public int B(){
       int i;
       o tk = this.k;
       if (tk != null) {
          PointF y = tk.y;
          if (!y) {
          label_0014 :
             i = 0;
          }else if(y > 0){
             i = 1;
          }else {
             i = -1;
          }
       }else {
          goto label_0014 ;
       }
       return i;
    }
    public void C(RecyclerView$x$a p0){
       PointF pointF = this.a(this.f());
       if (pointF != null) {
          int i = 0;
          if (pointF.x - i || pointF.y - i) {
             this.i(pointF);
             this.k = pointF;
             this.o = (int)(pointF.x * 10000.00f);
             this.p = (int)(pointF.y * 10000.00f);
             p0.f((int)((float)this.o * 0x3f99999a), (int)((float)this.p * 0x3f99999a), (int)((float)this.x(0x2710) * 0x3f99999a), this.i);
             return;
          }
       }
       p0.c(this.f());
       this.r();
       return;
    }
    public void l(int p0,int p1,RecyclerView$y p2,RecyclerView$x$a p3){
       if (!this.c()) {
          this.r();
          return;
       }else {
          this.o = this.y(this.o, p0);
          p0 = this.y(this.p, p1);
          this.p = p0;
          if (this.o == null && !p0) {
             this.C(p3);
          }
          return;
       }
    }
    public void m(){
    }
    public void n(){
       this.p = 0;
       this.o = 0;
       this.k = null;
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       int i = this.t(p0, this.z());
       int i1 = this.u(p0, this.B());
       int i2 = this.w((int)Math.sqrt((double)((i * i) + (i1 * i1))));
       if (i2 > 0) {
          p2.f((- i), (- i1), i2, this.j);
       }
       return;
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       if (p4 == -1) {
          return (p2 - p0);
       }
       if (p4) {
          if (p4 == 1) {
             return (p3 - p1);
          }
          throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
       }else {
          p2 = p2 - p0;
          if (p2 > 0) {
             return p2;
          }
          p3 = p3 - p1;
          if (p3 < 0) {
             return p3;
          }
          return 0;
       }
    }
    public int t(View p0,int p1){
       RecyclerView$LayoutManager layoutManage = this.e();
       if (layoutManage == null || !layoutManage.canScrollHorizontally()) {
          return 0;
       }
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       return this.s((layoutManage.getDecoratedLeft(p0) - layoutParams.leftMargin), (layoutManage.getDecoratedRight(p0) + layoutParams.rightMargin), layoutManage.getPaddingLeft(), (layoutManage.getWidth() - layoutManage.getPaddingRight()), p1);
    }
    public int u(View p0,int p1){
       RecyclerView$LayoutManager layoutManage = this.e();
       if (layoutManage == null || !layoutManage.canScrollVertically()) {
          return 0;
       }
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       return this.s((layoutManage.getDecoratedTop(p0) - layoutParams.topMargin), (layoutManage.getDecoratedBottom(p0) + layoutParams.bottomMargin), layoutManage.getPaddingTop(), (layoutManage.getHeight() - layoutManage.getPaddingBottom()), p1);
    }
    public float v(DisplayMetrics p0){
       return (25.00f / (float)p0.densityDpi);
    }
    public int w(int p0){
       return (int)Math.ceil(((double)this.x(p0) / 0x3fd57a786c22680a));
    }
    public int x(int p0){
       return (int)Math.ceil((double)((float)Math.abs(p0) * this.A()));
    }
    public final int y(int p0,int p1){
       p1 = p0 - p1;
       if ((p0 * p1) <= 0) {
          return 0;
       }
       return p1;
    }
    public int z(){
       int i;
       o tk = this.k;
       if (tk != null) {
          PointF x = tk.x;
          if (!x) {
          label_0014 :
             i = 0;
          }else if(x > 0){
             i = 1;
          }else {
             i = -1;
          }
       }else {
          goto label_0014 ;
       }
       return i;
    }
}
