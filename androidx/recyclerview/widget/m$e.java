package androidx.recyclerview.widget.m$e;
import androidx.recyclerview.widget.m$e$a;
import androidx.recyclerview.widget.m$e$b;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.view.View;
import java.lang.Math;
import u2.c;
import u2.b;
import a2.i0;
import androidx.recyclerview.widget.RecyclerView$l;
import android.content.res.Resources;
import android.view.ViewGroup;
import cw9.c;
import android.view.animation.Interpolator;
import bac.h;
import android.graphics.Canvas;
import androidx.recyclerview.widget.m$g;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.m$h;

public abstract class m$e	// class@000924
{
    public int a;
    public static final Interpolator b;
    public static final Interpolator c;

    static {
       m$e.b = new m$e$a();
       m$e.c = new m$e$b();
    }
    public void m$e(){
       super();
       this.a = -1;
    }
    public static int e(int p0,int p1){
       int i = p0 & 0xc0c0c;
       if (!i) {
          return p0;
       }
       p0 = p0 & (~ i);
       if (!p1) {
          p1 = i << 2;
       }else {
          p1 = i << 1;
          p0 = p0 | (-789517 & p1);
          p1 = (p1 & 0xc0c0c) << 2;
       }
       return (p0 | p1);
    }
    public static int r(int p0,int p1){
       return (p1 << (p0 * 8));
    }
    public static int s(int p0,int p1){
       return (m$e.r(2, p0) | (m$e.r(1, p1) | m$e.r(0, (p1 | p0))));
    }
    public abstract void A(RecyclerView$ViewHolder p0,int p1);
    public boolean a(RecyclerView p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2){
       return true;
    }
    public RecyclerView$ViewHolder b(RecyclerView$ViewHolder p0,List p1,int p2,int p3){
       int i7;
       RecyclerView$ViewHolder viewHolder = p0;
       int i = p2 + viewHolder.itemView.getWidth();
       int i1 = p3 + viewHolder.itemView.getHeight();
       int i2 = p2 - viewHolder.itemView.getLeft();
       int i3 = p3 - viewHolder.itemView.getTop();
       int i4 = p1.size();
       RecyclerView$ViewHolder viewHolder1 = null;
       int i5 = -1;
       int i6 = 0;
       while (i6 < i4) {
          RecyclerView$ViewHolder viewHolder2 = p1.get(i6);
          if (i2 > 0) {
             i7 = viewHolder2.itemView.getRight() - i;
             if (i7 < 0 && viewHolder2.itemView.getRight() > viewHolder.itemView.getRight()) {
                i7 = Math.abs(i7);
                if (i7 > i5) {
                   viewHolder1 = viewHolder2;
                   i5 = i7;
                }
             }
          }
          if (i2 < 0) {
             i7 = viewHolder2.itemView.getLeft() - p2;
             if (i7 > 0 && viewHolder2.itemView.getLeft() < viewHolder.itemView.getLeft()) {
                i7 = Math.abs(i7);
                if (i7 > i5) {
                   viewHolder1 = viewHolder2;
                   i5 = i7;
                }
             }
          }
          if (i3 < 0) {
             i7 = viewHolder2.itemView.getTop() - p3;
             if (i7 > 0 && viewHolder2.itemView.getTop() < viewHolder.itemView.getTop()) {
                i7 = Math.abs(i7);
                if (i7 > i5) {
                   viewHolder1 = viewHolder2;
                   i5 = i7;
                }
             }
          }
          if (i3 > 0) {
             i7 = viewHolder2.itemView.getBottom() - i1;
             if (i7 < 0 && viewHolder2.itemView.getBottom() > viewHolder.itemView.getBottom()) {
                i7 = Math.abs(i7);
                if (i7 > i5) {
                   viewHolder1 = viewHolder2;
                   i5 = i7;
                }
             }
          }
          i6 = i6 + 1;
       }
       return viewHolder1;
    }
    public void c(RecyclerView p0,RecyclerView$ViewHolder p1){
       c.a.d(p1.itemView);
    }
    public int d(int p0,int p1){
       int i = p0 & 0x303030;
       if (!i) {
          return p0;
       }
       p0 = p0 & (~ i);
       if (!p1) {
          p1 = i >> 2;
       }else {
          p1 = i >> 1;
          p0 = p0 | (-3158065 & p1);
          p1 = (p1 & 0x303030) >> 2;
       }
       return (p0 | p1);
    }
    public final int f(RecyclerView p0,RecyclerView$ViewHolder p1){
       return this.d(this.j(p0, p1), i0.B(p0));
    }
    public long g(RecyclerView p0,int p1,float p2,float p3){
       long l;
       RecyclerView$l itemAnimator = p0.getItemAnimator();
       if (itemAnimator == null) {
          l = (p1 == 8)? 200: 250;
          return l;
       }else if(p1 == 8){
          l = itemAnimator.n();
       }else {
          l = itemAnimator.o();
       }
       return l;
    }
    public final int h(RecyclerView p0){
       if (this.a == -1) {
          this.a = c.b(p0.getResources(), 0x7f070477);
       }
       return this.a;
    }
    public float i(RecyclerView$ViewHolder p0){
       return 0x3f000000;
    }
    public abstract int j(RecyclerView p0,RecyclerView$ViewHolder p1);
    public float k(float p0){
       return p0;
    }
    public float l(RecyclerView$ViewHolder p0){
       return 0x3f000000;
    }
    public float m(float p0){
       return p0;
    }
    public boolean n(RecyclerView p0,RecyclerView$ViewHolder p1){
       boolean b = (this.f(p0, p1) & 0xff0000)? true: false;
       return b;
    }
    public int o(RecyclerView p0,int p1,int p2,int p3,long p4){
       float f = 0x3f800000;
       int i = (int)((float)((int)Math.signum((float)p2) * this.h(p0)) * m$e.c.getInterpolation(Math.min(f, (((float)Math.abs(p2) * f) / (float)p1))));
       if (p4 - 2000 > 0) {
       }else {
          f = (float)p4 / 0x44fa0000;
       }
       i = (int)((float)i * m$e.b.getInterpolation(f));
       if (!i) {
          i = (p2 > 0)? 1: -1;
       }
    label_0042 :
       return i;
    }
    public boolean p(){
       return true;
    }
    public boolean q(){
       return (this instanceof h ^ 0x01);
    }
    public void t(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,float p3,float p4,int p5,boolean p6){
       c.a.a(p0, p1, p2.itemView, p3, p4, p5, p6);
    }
    public void u(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,float p3,float p4,int p5,boolean p6){
       c.a.c(p0, p1, p2.itemView, p3, p4, p5, p6);
    }
    public void v(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,List p3,int p4,float p5,float p6){
       int i = p3.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          m$g og = p3.get(i1);
          og.e();
          this.t(p0, p1, og.e, og.j, og.k, og.f, false);
          p0.restoreToCount(p0.save());
       }
       if (p2 != null) {
          this.t(p0, p1, p2, p5, p6, p4, true);
          p0.restoreToCount(p0.save());
       }
       return;
    }
    public void w(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,List p3,int p4,float p5,float p6){
       List list = p3;
       int i = p3.size();
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          m$g og = list.get(i2);
          this.u(p0, p1, og.e, og.j, og.k, og.f, false);
          p0.restoreToCount(p0.save());
       }
       if (p2 != null) {
          this.u(p0, p1, p2, p5, p6, p4, true);
          p0.restoreToCount(p0.save());
       }
       i = i - 1;
       while (i >= 0) {
          m$g og1 = list.get(i);
          m$g m = og1.m;
          if (m != null && og1.i == null) {
             list.remove(i);
          }else if(m == null){
             i1 = 1;
          }
          i = i - 1;
       }
       if (i1) {
          p1.invalidate();
       }
       return;
    }
    public abstract boolean x(RecyclerView p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2);
    public void y(RecyclerView p0,RecyclerView$ViewHolder p1,int p2,RecyclerView$ViewHolder p3,int p4,int p5,int p6){
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof m$h) {
          layoutManage.G(p1.itemView, p3.itemView, p5, p6);
          return;
       }else if(layoutManage.canScrollHorizontally()){
          if (layoutManage.getDecoratedLeft(p3.itemView) <= p0.getPaddingLeft()) {
             p0.scrollToPosition(p4);
          }
          if (layoutManage.getDecoratedRight(p3.itemView) >= (p0.getWidth() - p0.getPaddingRight())) {
             p0.scrollToPosition(p4);
          }
       }
       if (layoutManage.canScrollVertically()) {
          if (layoutManage.getDecoratedTop(p3.itemView) <= p0.getPaddingTop()) {
             p0.scrollToPosition(p4);
          }
          if (layoutManage.getDecoratedBottom(p3.itemView) >= (p0.getHeight() - p0.getPaddingBottom())) {
             p0.scrollToPosition(p4);
          }
       }
       return;
    }
    public void z(RecyclerView$ViewHolder p0,int p1){
       if (p0 != null) {
          c.a.b(p0.itemView);
       }
       return;
    }
}
