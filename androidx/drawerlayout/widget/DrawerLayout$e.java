package androidx.drawerlayout.widget.DrawerLayout$e;
import androidx.customview.widget.ViewDragHelper$c;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$e$a;
import android.view.View;
import java.lang.Math;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper;
import java.lang.Runnable;
import android.view.ViewGroup$LayoutParams;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;

public class DrawerLayout$e extends ViewDragHelper$c	// class@000741
{
    public final int a;
    public ViewDragHelper b;
    public final Runnable c;
    public final DrawerLayout d;

    public void DrawerLayout$e(DrawerLayout p0,int p1){
       this.d = p0;
       super();
       this.c = new DrawerLayout$e$a(this);
       this.a = p1;
    }
    public int a(View p0,int p1,int p2){
       if (this.d.c(p0, 3)) {
          return Math.max((- p0.getWidth()), Math.min(p1, 0));
       }
       p2 = this.d.getWidth();
       return Math.max((p2 - p0.getWidth()), Math.min(p1, p2));
    }
    public int b(View p0,int p1,int p2){
       return p0.getTop();
    }
    public int d(View p0){
       int width = (this.d.D(p0))? p0.getWidth(): 0;
       return width;
    }
    public void f(int p0,int p1){
       int i = 1;
       View view = ((p0 & i) == i)? this.d.n(3): this.d.n(5);
       if (view != null && !this.d.r(view)) {
          this.b.captureChildView(view, p1);
       }
       return;
    }
    public void h(int p0,int p1){
       this.d.postDelayed(this.c, 160);
    }
    public void i(View p0,int p1){
       p0.c = false;
       this.n();
    }
    public void j(int p0){
       this.d.U(this.a, p0, this.b.getCapturedView());
    }
    public void k(View p0,int p1,int p2,int p3,int p4){
       p2 = p0.getWidth();
       float f = (this.d.c(p0, 3))? (float)(p1 + p2): (float)(this.d.getWidth() - p1);
       f = f / (float)p2;
       this.d.S(p0, f);
       f = (!f)? 4: 0;
       p0.setVisibility(f);
       this.d.invalidate();
       return;
    }
    public void l(View p0,float p1,float p2){
       int i;
       p2 = this.d.u(p0);
       int width = p0.getWidth();
       if (this.d.c(p0, 3)) {
          p1 = p1;
          if (p1 > 0 || (!p1 && p2 - 0x3f000000 > 0)) {
             i = 0;
          }else {
             i = - width;
          }
       }else {
          int width1 = this.d.getWidth();
          if (p1 < 0 || (!p1 && p2 - 0x3f000000 > 0)) {
             width1 = width1 - width;
          }
          i = width1;
       }
       this.b.settleCapturedViewAt(i, p0.getTop());
       this.d.invalidate();
       return;
    }
    public boolean m(View p0,int p1){
       boolean b = (this.d.D(p0) && (this.d.c(p0, this.a) && !this.d.r(p0)))? true: false;
       return b;
    }
    public final void n(){
       int i = 3;
       if (this.a == i) {
          i = 5;
       }
       View view = this.d.n(i);
       if (view != null) {
          this.d.f(view);
       }
       return;
    }
    public void o(){
       View view;
       int edgeSize = this.b.getEdgeSize();
       int i = 0;
       int i1 = 3;
       DrawerLayout$e uoe = (this.a == i1)? 1: null;
       if (uoe) {
          view = this.d.n(i1);
          if (view != null) {
             i = - view.getWidth();
          }
          i = i + edgeSize;
       }else {
          view = this.d.n(5);
          i = this.d.getWidth() - edgeSize;
       }
       if (view != null && (!uoe || (view.getLeft() < i || (!uoe && (view.getLeft() > i && !this.d.r(view)))))) {
          this.b.smoothSlideViewTo(view, i, view.getTop());
          view.getLayoutParams().c = true;
          this.d.invalidate();
          this.n();
          this.d.b();
       }
    label_0067 :
       return;
    }
    public void p(){
       this.d.removeCallbacks(this.c);
    }
    public void q(ViewDragHelper p0){
       this.b = p0;
    }
}
