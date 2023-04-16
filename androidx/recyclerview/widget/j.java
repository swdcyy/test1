package androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.j$a;
import androidx.recyclerview.widget.j$b;
import java.lang.Math;
import androidx.recyclerview.widget.j$c;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.j$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.MotionEvent;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.ViewGroup;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Object;
import java.lang.Float;
import android.view.View;
import a2.i0;

public class j extends RecyclerView$n implements RecyclerView$q	// class@000918
{
    public final ValueAnimator A;
    public int B;
    public final Runnable C;
    public final RecyclerView$r D;
    public final int b;
    public final int c;
    public final StateListDrawable d;
    public final Drawable e;
    public final int f;
    public final int g;
    public final StateListDrawable h;
    public final Drawable i;
    public final int j;
    public final int k;
    public int l;
    public int m;
    public float n;
    public int o;
    public int p;
    public float q;
    public int r;
    public int s;
    public RecyclerView t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public final int[] y;
    public final int[] z;
    public static final int[] E;
    public static final int[] F;

    static {
       int[] ointArray = new int[]{0x10100a7};
       j.E = ointArray;
       ointArray = new int[0];
       j.F = ointArray;
    }
    public void j(RecyclerView p0,StateListDrawable p1,Drawable p2,StateListDrawable p3,Drawable p4,int p5,int p6,int p7){
       super();
       this.r = 0;
       this.s = 0;
       this.u = false;
       this.v = false;
       this.w = 0;
       this.x = 0;
       int[] ointArray = new int[2];
       this.y = ointArray;
       ointArray = new int[2];
       this.z = ointArray;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.A = valueAnimato;
       this.B = 0;
       this.C = new j$a(this);
       this.D = new j$b(this);
       this.d = p1;
       this.e = p2;
       this.h = p3;
       this.i = p4;
       this.f = Math.max(p5, p1.getIntrinsicWidth());
       this.g = Math.max(p5, p2.getIntrinsicWidth());
       this.j = Math.max(p5, p3.getIntrinsicWidth());
       this.k = Math.max(p5, p4.getIntrinsicWidth());
       this.b = p6;
       this.c = p7;
       p1.setAlpha(255);
       p2.setAlpha(255);
       valueAnimato.addListener(new j$c(this));
       valueAnimato.addUpdateListener(new j$d(this));
       this.f(p0);
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       j tw = this.w;
       boolean b = false;
       if (tw == 1) {
          boolean b1 = this.q(p1.getX(), p1.getY());
          boolean b2 = this.p(p1.getX(), p1.getY());
          if (!p1.getAction() && (b1 || b2)) {
             if (b2) {
                this.x = 1;
                this.q = (float)(int)p1.getX();
             }else if(b1){
                this.x = 2;
                this.n = (float)(int)p1.getY();
             }
             this.u(2);
          label_0048 :
             b = true;
          }
       }else if(tw == 2){
          goto label_0048 ;
       }
       return b;
    }
    public void e(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       if (this.r != this.t.getWidth() || this.s != this.t.getHeight()) {
          this.r = this.t.getWidth();
          this.s = this.t.getHeight();
          this.u(0);
          return;
       }else if(this.B != null){
          if (this.u != null) {
             this.j(p0);
          }
          if (this.v != null) {
             this.i(p0);
          }
       }
       return;
    }
    public void f(RecyclerView p0){
       j tt = this.t;
       if (tt == p0) {
          return;
       }
       if (tt != null) {
          this.h();
       }
       this.t = p0;
       if (p0 != null) {
          this.v();
       }
       return;
    }
    public final void g(){
       this.t.removeCallbacks(this.C);
    }
    public final void h(){
       this.t.removeItemDecoration(this);
       this.t.removeOnItemTouchListener(this);
       this.t.removeOnScrollListener(this.D);
       this.g();
    }
    public final void i(Canvas p0){
       j tj = this.j;
       int i = this.s - tj;
       j to = this.o;
       int i1 = this.p - (to / 2);
       this.h.setBounds(0, 0, to, tj);
       this.i.setBounds(0, 0, this.r, this.k);
       p0.translate(0, (float)i);
       this.i.draw(p0);
       p0.translate((float)i1, 0);
       this.h.draw(p0);
       p0.translate((float)(- i1), (float)(- i));
    }
    public final void j(Canvas p0){
       j tf = this.f;
       int i = this.r - tf;
       j tl = this.l;
       int i1 = this.m - (tl / 2);
       this.d.setBounds(0, 0, tf, tl);
       this.e.setBounds(0, 0, this.g, this.s);
       if (this.o()) {
          this.e.draw(p0);
          p0.translate((float)this.f, (float)i1);
          p0.scale(0xbf800000, 0x3f800000);
          this.d.draw(p0);
          p0.scale(0xbf800000, 0x3f800000);
          p0.translate((float)(- this.f), (float)(- i1));
       }else {
          p0.translate((float)i, 0);
          this.e.draw(p0);
          p0.translate(0, (float)i1);
          this.d.draw(p0);
          p0.translate((float)(- i), (float)(- i1));
       }
       return;
    }
    public final int[] k(){
       j tz = this.z;
       j tc = this.c;
       tz[0] = tc;
       int i = this.r - tc;
       tz[1] = i;
       return tz;
    }
    public final int[] l(){
       j ty = this.y;
       j tc = this.c;
       ty[0] = tc;
       int i = this.s - tc;
       ty[1] = i;
       return ty;
    }
    public void m(int p0){
       j tB = this.B;
       int i = 2;
       if (tB != 1) {
          if (tB != i) {
          label_0033 :
             return;
          }
       }else {
          this.A.cancel();
       }
       this.B = 3;
       tB = this.A;
       float[] uofloatArray = new float[i];
       uofloatArray[0] = tB.getAnimatedValue().floatValue();
       uofloatArray[1] = 0;
       tB.setFloatValues(uofloatArray);
       this.A.setDuration((long)p0);
       this.A.start();
       goto label_0033 ;
    }
    public final void n(float p0){
       int this;
       int[] ointArray = this.k();
       p0 = Math.max((float)ointArray[0], Math.min((float)ointArray[1], p0));
       if (Math.abs(((float)this.p - p0)) - 0x40000000 < 0) {
          return;
       }
       this = this.t(this.q, p0, ointArray, this.t.computeHorizontalScrollRange(), this.t.computeHorizontalScrollOffset(), this.r);
       if (this) {
          this.t.scrollBy(this, 0);
       }
       this.q = p0;
       return;
    }
    public final boolean o(){
       boolean b = true;
       if (i0.B(this.t) == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
       if (this.w == null) {
          return;
       }
       if (!p1.getAction()) {
          boolean b = this.q(p1.getX(), p1.getY());
          boolean b1 = this.p(p1.getX(), p1.getY());
          if (b || b1) {
             if (b1) {
                this.x = 1;
                this.q = (float)(int)p1.getX();
             }else if(b){
                this.x = 2;
                this.n = (float)(int)p1.getY();
             }
             this.u(2);
          }
       }else if(p1.getAction() == 1 && this.w == 2){
          this.n = 0;
          this.q = 0;
          this.u(1);
          this.x = 0;
       }else if(p1.getAction() == 2 && this.w == 2){
          this.w();
          if (this.x == 1) {
             this.n(p1.getX());
          }
          if (this.x == 2) {
             this.y(p1.getY());
          }
       }
       return;
    }
    public boolean p(float p0,float p1){
       boolean b;
       if (p1 - (float)(this.s - this.j) >= 0) {
          j tp = this.p;
          j to = this.o;
          if (p0 - (float)(tp - (to / 2)) >= 0 && p0 - (float)(tp + (to / 2)) <= 0) {
             b = true;
          label_0022 :
             return b;
          }
       }
       b = false;
       goto label_0022 ;
    }
    public boolean q(float p0,float p1){
       boolean b;
       if (this.o()) {
          if (p0 - (float)this.f <= 0) {
          label_0018 :
             j tm = this.m;
             j tl = this.l;
             if (p1 - (float)(tm - (tl / 2)) >= 0 && p1 - (float)(tm + (tl / 2)) <= 0) {
                b = true;
             label_0030 :
                return b;
             }
          }
       }else if(p0 - (float)(this.r - this.f) >= 0){
          goto label_0018 ;
       }
       b = false;
       goto label_0030 ;
    }
    public void r(){
       this.t.invalidate();
    }
    public final void s(int p0){
       this.g();
       this.t.postDelayed(this.C, (long)p0);
    }
    public final int t(float p0,float p1,int[] p2,int p3,int p4,int p5){
       int i = p2[1] - p2[0];
       if (!i) {
          return 0;
       }
       p3 = p3 - p5;
       int i1 = (int)(((p1 - p0) / (float)i) * (float)p3);
       p4 = p4 + i1;
       if (p4 < p3 && p4 >= 0) {
          return i1;
       }
       return 0;
    }
    public void u(int p0){
       int i = 2;
       if (p0 == i && this.w != i) {
          this.d.setState(j.E);
          this.g();
       }
       if (!p0) {
          this.r();
       }else {
          this.w();
       }
       if (this.w == i && p0 != i) {
          this.d.setState(j.F);
          this.s(1200);
       }else if(p0 == 1){
          this.s(1500);
       }
       this.w = p0;
       return;
    }
    public final void v(){
       this.t.addItemDecoration(this);
       this.t.addOnItemTouchListener(this);
       this.t.addOnScrollListener(this.D);
    }
    public void w(){
       j tB = this.B;
       if (tB != null) {
          if (tB != 3) {
          label_003c :
             return;
          }else {
             this.A.cancel();
          }
       }
       this.B = 1;
       j tA = this.A;
       float[] uofloatArray = new float[]{tA.getAnimatedValue().floatValue(),0x3f800000};
       tA.setFloatValues(uofloatArray);
       this.A.setDuration(500);
       this.A.setStartDelay(0);
       this.A.start();
       goto label_003c ;
    }
    public void x(int p0,int p1){
       int i = this.t.computeVerticalScrollRange();
       j ts = this.s;
       int i1 = 0;
       int b = ((i - ts) > 0 && ts >= this.b)? true: false;
       this.u = b;
       b = this.t.computeHorizontalScrollRange();
       j tr = this.r;
       boolean b1 = ((b - tr) > 0 && tr >= this.b)? true: false;
       this.v = b1;
       j tu = this.u;
       if (tu == null && !b1) {
          if (this.w != null) {
             this.u(i1);
          }
          return;
       }else if(tu != null){
          float f = (float)ts;
          this.m = (int)((f * ((float)p1 + (f / 2.00f))) / (float)i);
          this.l = Math.min(ts, ((ts * ts) / i));
       }
       if (this.v != null) {
          float f1 = (float)tr;
          this.p = (int)((f1 * ((float)p0 + (f1 / 2.00f))) / (float)b);
          this.o = Math.min(tr, ((tr * tr) / b));
       }
       j tw = this.w;
       if (tw == null || tw == 1) {
          this.u(1);
       }
       return;
    }
    public final void y(float p0){
       int this;
       int[] ointArray = this.l();
       p0 = Math.max((float)ointArray[0], Math.min((float)ointArray[1], p0));
       if (Math.abs(((float)this.m - p0)) - 0x40000000 < 0) {
          return;
       }
       this = this.t(this.n, p0, ointArray, this.t.computeVerticalScrollRange(), this.t.computeVerticalScrollOffset(), this.s);
       if (this) {
          this.t.scrollBy(0, this);
       }
       this.n = p0;
       return;
    }
}
