package androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import a2.x;
import a2.t;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g;
import android.view.ViewConfiguration;
import android.content.res.Resources;
import android.view.animation.DecelerateInterpolator;
import android.util.DisplayMetrics;
import cw9.c;
import a2.y;
import a2.u;
import android.view.View;
import android.content.res.TypedArray;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import androidx.swiperefreshlayout.widget.CircleImageView;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i;
import android.widget.ListView;
import androidx.core.widget.ListViewCompat;
import c3.a;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e;
import java.lang.Math;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d;
import android.view.View$MeasureSpec;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c;
import a2.i0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h;
import androidx.core.content.ContextCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b;

public class SwipeRefreshLayout extends ViewGroup implements x, t	// class@0009a0
{
    public int A;
    public int B;
    public a C;
    public Animation D;
    public Animation E;
    public Animation F;
    public Animation G;
    public Animation H;
    public boolean I;
    public int J;
    public boolean K;
    public SwipeRefreshLayout$i L;
    public Animation$AnimationListener M;
    public final Animation N;
    public final Animation O;
    public View b;
    public SwipeRefreshLayout$j c;
    public boolean d;
    public int e;
    public float f;
    public float g;
    public final y h;
    public final u i;
    public final int[] j;
    public final int[] k;
    public boolean l;
    public int m;
    public int n;
    public float o;
    public float p;
    public boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public final DecelerateInterpolator u;
    public CircleImageView v;
    public int w;
    public int x;
    public float y;
    public int z;
    public static final String P;
    public static final int[] Q;

    static {
       SwipeRefreshLayout.P = "SwipeRefreshLayout";
       int[] ointArray = new int[]{0x101000e};
       SwipeRefreshLayout.Q = ointArray;
    }
    public void SwipeRefreshLayout(Context p0){
       super(p0, null);
    }
    public void SwipeRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = false;
       this.f = 0xbf800000;
       int[] ointArray = new int[2];
       this.j = ointArray;
       int[] ointArray1 = new int[2];
       this.k = ointArray1;
       this.r = -1;
       this.w = -1;
       this.M = new SwipeRefreshLayout$a(this);
       this.N = new SwipeRefreshLayout$f(this);
       this.O = new SwipeRefreshLayout$g(this);
       this.e = ViewConfiguration.get(p0).getScaledTouchSlop();
       this.m = this.getResources().getInteger(0x10e0001);
       this.setWillNotDraw(false);
       this.u = new DecelerateInterpolator(2.00f);
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.J = (int)(uDisplayMetr.density * 40.00f);
       this.d();
       this.setChildrenDrawingOrderEnabled(true);
       int i = (int)(uDisplayMetr.density * 64.00f);
       this.A = i;
       this.f = (float)i;
       this.h = new y(this);
       this.i = new u(this);
       this.setNestedScrollingEnabled(true);
       i = - this.J;
       this.n = i;
       this.z = i;
       this.i(0x3f800000);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, SwipeRefreshLayout.Q);
       this.setEnabled(typedArray.getBoolean(false, true));
       typedArray.recycle();
    }
    public final void a(int p0,Animation$AnimationListener p1){
       this.x = p0;
       this.N.reset();
       this.N.setDuration(200);
       this.N.setInterpolator(this.u);
       if (p1 != null) {
          this.v.setAnimationListener(p1);
       }
       this.v.clearAnimation();
       this.v.startAnimation(this.N);
       return;
    }
    public final void b(int p0,Animation$AnimationListener p1){
       if (this.s != null) {
          this.s(p0, p1);
       }else {
          this.x = p0;
          this.O.reset();
          this.O.setDuration(200);
          this.O.setInterpolator(this.u);
          if (p1 != null) {
             this.v.setAnimationListener(p1);
          }
          this.v.clearAnimation();
          this.v.startAnimation(this.O);
       }
       return;
    }
    public boolean c(){
       SwipeRefreshLayout tL = this.L;
       if (tL != null) {
          return tL.a(this, this.b);
       }
       tL = this.b;
       if (tL instanceof ListView) {
          return ListViewCompat.a(tL, -1);
       }
       return tL.canScrollVertically(-1);
    }
    public final void d(){
       this.v = new CircleImageView(this.getContext(), -328966);
       a uoa = new a(this.getContext());
       this.C = uoa;
       uoa.o(1);
       this.v.setImageDrawable(this.C);
       this.v.setVisibility(8);
       this.addView(this.v);
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       return this.i.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       return this.i.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       return this.i.c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       return this.i.f(p0, p1, p2, p3, p4);
    }
    public final void e(){
       if (this.b == null) {
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (!childAt.equals(this.v)) {
                this.b = childAt;
                break ;
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void f(float p0){
       if (p0 - this.f > 0) {
          this.m(true, true);
       }else {
          this.d = false;
          this.C.m(0, 0);
          SwipeRefreshLayout$e uoe = null;
          if (this.s == null) {
             uoe = new SwipeRefreshLayout$e(this);
          }
          this.b(this.n, uoe);
          this.C.g(false);
       }
       return;
    }
    public final boolean g(Animation p0){
       boolean b = (p0 != null && (p0.hasStarted() && !p0.hasEnded()))? true: false;
       return b;
    }
    public int getChildDrawingOrder(int p0,int p1){
       SwipeRefreshLayout tw = this.w;
       if (tw < null) {
          return p1;
       }
       p0--;
       if (p1 == p0) {
          return tw;
       }
       if (p1 >= tw) {
          p1++;
       }
       return p1;
    }
    public int getNestedScrollAxes(){
       return this.h.a();
    }
    public int getProgressCircleDiameter(){
       return this.J;
    }
    public int getProgressViewEndOffset(){
       return this.A;
    }
    public int getProgressViewStartOffset(){
       return this.z;
    }
    public final void h(float p0){
       this.C.g(true);
       float f = Math.min(0x3f800000, Math.abs((p0 / this.f)));
       float f1 = ((float)Math.max(((double)f - 0x3fd999999999999a), 0) * 5.00f) / 3.00f;
       float f2 = Math.abs(p0) - this.f;
       SwipeRefreshLayout tB = this.B;
       if (tB <= null) {
          tB = (this.K != null)? this.A - this.z: this.A;
       }
    label_0034 :
       float f3 = (float)tB;
       double d = (double)(Math.max(0, (Math.min(f2, (f3 * 2.00f)) / f3)) / 4.00f);
       f2 = (float)(d - Math.pow(d, 2.00f)) * 2.00f;
       int i = this.z + (int)((f3 * f) + ((f3 * f2) * 2.00f));
       if (this.v.getVisibility()) {
          this.v.setVisibility(0);
       }
       if (this.s == null) {
          this.v.setScaleX(0x3f800000);
          this.v.setScaleY(0x3f800000);
       }
       if (this.s != null) {
          this.setAnimationProgress(Math.min(0x3f800000, (p0 / this.f)));
       }
       if (p0 - this.f < 0) {
          if (this.C.getAlpha() > 0.00f && !this.g(this.F)) {
             this.q();
          }
       }else if(this.C.getAlpha() < 0.00f && !this.g(this.G)){
          this.p();
       }
       this.C.m(0, Math.min(0x3f4ccccd, (f1 * 0x3f4ccccd)));
       this.C.h(Math.min(0x3f800000, f1));
       this.C.j(((((f1 * 0.40f) - 0.25f) + (f2 * 2.00f)) * 0x3f000000));
       this.setTargetOffsetTopAndBottom((i - this.n));
       return;
    }
    public boolean hasNestedScrollingParent(){
       return this.i.k();
    }
    public void i(float p0){
       SwipeRefreshLayout tx = this.x;
       this.setTargetOffsetTopAndBottom(((tx + (int)((float)(this.z - tx) * p0)) - this.v.getTop()));
    }
    public boolean isNestedScrollingEnabled(){
       return this.i.m();
    }
    public final void j(MotionEvent p0){
       int actionIndex = p0.getActionIndex();
       if (p0.getPointerId(actionIndex) == this.r) {
          actionIndex = (!actionIndex)? 1: 0;
          this.r = p0.getPointerId(actionIndex);
       }
       return;
    }
    public void k(){
       this.v.clearAnimation();
       this.C.stop();
       this.v.setVisibility(8);
       this.setColorViewAlpha(255);
       if (this.s != null) {
          this.setAnimationProgress(0);
       }else {
          this.setTargetOffsetTopAndBottom((this.z - this.n));
       }
       this.n = this.v.getTop();
       return;
    }
    public void l(boolean p0,int p1,int p2){
       this.s = p0;
       this.z = p1;
       this.A = p2;
       this.K = true;
       this.k();
       this.d = false;
    }
    public final void m(boolean p0,boolean p1){
       if (this.d != p0) {
          this.I = p1;
          this.e();
          this.d = p0;
          if (p0) {
             this.a(this.n, this.M);
          }else {
             this.r(this.M);
          }
       }
       return;
    }
    public final Animation n(int p0,int p1){
       SwipeRefreshLayout$d uod = new SwipeRefreshLayout$d(this, p0, p1);
       uod.setDuration(300);
       this.v.setAnimationListener(null);
       this.v.clearAnimation();
       this.v.startAnimation(uod);
       return uod;
    }
    public final void o(float p0){
       SwipeRefreshLayout tp = this.p;
       SwipeRefreshLayout te = this.e;
       if ((p0 - tp) - (float)te > 0 && this.q == null) {
          this.o = tp + (float)te;
          this.q = true;
          this.C.setAlpha(76);
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.k();
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       this.e();
       int actionMasked = p0.getActionMasked();
       if (this.t != null && !actionMasked) {
          this.t = false;
       }
       if (this.isEnabled() && (this.t == null && (!this.c() && (this.d != null || this.l != null)))) {
          return false;
       }else if(actionMasked){
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked != 3) {
                   if (actionMasked == 6) {
                      this.j(p0);
                   }
                }
             }else {
                SwipeRefreshLayout tr = this.r;
                if (tr == -1) {
                   return false;
                }else {
                   actionMasked = p0.findPointerIndex(tr);
                   if (actionMasked < 0) {
                      return false;
                   }else {
                      this.o(p0.getY(actionMasked));
                   }
                }
             }
          }
          this.q = false;
          this.r = -1;
       }else {
          this.setTargetOffsetTopAndBottom((this.z - this.v.getTop()));
          actionMasked = p0.getPointerId(false);
          this.r = actionMasked;
          this.q = false;
          actionMasked = p0.findPointerIndex(actionMasked);
          if (actionMasked < 0) {
             return false;
          }else {
             this.p = p0.getY(actionMasked);
          }
       }
       return this.q;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int measuredWidt = this.getMeasuredWidth();
       p1 = this.getMeasuredHeight();
       if (!this.getChildCount()) {
          return;
       }
       if (this.b == null) {
          this.e();
       }
       SwipeRefreshLayout tb = this.b;
       if (tb == null) {
          return;
       }else {
          p3 = this.getPaddingLeft();
          p4 = this.getPaddingTop();
          tb.layout(p3, p4, (((measuredWidt - this.getPaddingLeft()) - this.getPaddingRight()) + p3), (((p1 - this.getPaddingTop()) - this.getPaddingBottom()) + p4));
          measuredWidt = measuredWidt / 2;
          p1 = this.v.getMeasuredWidth() / 2;
          p4 = measuredWidt - p1;
          SwipeRefreshLayout tn = this.n;
          this.v.layout(p4, tn, (measuredWidt + p1), (this.v.getMeasuredHeight() + tn));
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (this.b == null) {
          this.e();
       }
       SwipeRefreshLayout tb = this.b;
       if (tb == null) {
          return;
       }else {
          tb.measure(View$MeasureSpec.makeMeasureSpec(((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()), 0x40000000), View$MeasureSpec.makeMeasureSpec(((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()), 0x40000000));
          this.v.measure(View$MeasureSpec.makeMeasureSpec(this.J, 0x40000000), View$MeasureSpec.makeMeasureSpec(this.J, 0x40000000));
          this.w = -1;
          tb = 0;
          while (tb < this.getChildCount()) {
             if (this.getChildAt(tb) == this.v) {
                this.w = tb;
                break ;
             }
             tb++;
          }
          return;
       }
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       return this.dispatchNestedFling(p1, p2, p3);
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return this.dispatchNestedPreFling(p1, p2);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       float f = 0;
       if (p2 > 0) {
          SwipeRefreshLayout tg = this.g;
          if (tg - f > 0) {
             float f1 = (float)p2;
             if (f1 - tg > 0) {
                p3[1] = p2 - (int)tg;
                this.g = f;
             }else {
                this.g = tg - f1;
                p3[1] = p2;
             }
             this.h(this.g);
          }
       }
       if (this.K != null && (p2 > 0 && (!this.g - f && Math.abs((p2 - p3[1])) > 0))) {
          this.v.setVisibility(8);
       }
    label_003e :
       SwipeRefreshLayout tj = this.j;
       if (this.dispatchNestedPreScroll((p1 - p3[0]), (p2 - p3[1]), tj, null)) {
          p3[0] = p3[0] + tj[0];
          p3[1] = p3[1] + tj[1];
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       this.dispatchNestedScroll(p1, p2, p3, p4, this.k);
       p4 = p4 + this.k[1];
       if (p4 < 0 && !this.c()) {
          float f = this.g + (float)Math.abs(p4);
          this.g = f;
          this.h(f);
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       this.h.b(p0, p1, p2);
       this.startNestedScroll((p2 & 0x02));
       this.g = 0;
       this.l = true;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       boolean b = (this.isEnabled() && (this.t == null && (this.d == null && (p2 & 0x02))))? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       this.h.d(p0);
       this.l = false;
       SwipeRefreshLayout tg = this.g;
       if (tg > 0) {
          this.f(tg);
          this.g = 0;
       }
       this.stopNestedScroll();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       boolean b = false;
       if (this.t != null && !actionMasked) {
          this.t = b;
       }
       if (this.isEnabled() && (this.t == null && (!this.c() && (this.d != null || this.l != null)))) {
          return b;
       }else {
          boolean b1 = true;
          if (actionMasked) {
             float f = 0x3f000000;
             if (actionMasked != b1) {
                if (actionMasked != 2) {
                   if (actionMasked != 3) {
                      if (actionMasked != 5) {
                         if (actionMasked == 6) {
                            this.j(p0);
                         }
                      }else {
                         actionMasked = p0.getActionIndex();
                         if (actionMasked < 0) {
                            return b;
                         }else {
                            this.r = p0.getPointerId(actionMasked);
                         }
                      }
                   }else {
                      return b;
                   }
                }else {
                   actionMasked = p0.findPointerIndex(this.r);
                   if (actionMasked < 0) {
                      return b;
                   }else {
                      float y = p0.getY(actionMasked);
                      this.o(y);
                      if (this.q != null) {
                         y = (y - this.o) * f;
                         if (y > 0) {
                            this.h(y);
                         }else {
                            return b;
                         }
                      }
                   }
                }
             }else {
                actionMasked = p0.findPointerIndex(this.r);
                if (actionMasked < 0) {
                   return b;
                }else if(this.q != null){
                   this.q = b;
                   this.f(((p0.getY(actionMasked) - this.o) * f));
                }
                this.r = -1;
                return b;
             }
          }else {
             this.r = p0.getPointerId(b);
             this.q = b;
          }
          return b1;
       }
    }
    public final void p(){
       this.G = this.n(this.C.getAlpha(), 255);
    }
    public final void q(){
       this.F = this.n(this.C.getAlpha(), 76);
    }
    public void r(Animation$AnimationListener p0){
       SwipeRefreshLayout$c uoc = new SwipeRefreshLayout$c(this);
       this.E = uoc;
       uoc.setDuration(150);
       this.v.setAnimationListener(p0);
       this.v.clearAnimation();
       this.v.startAnimation(this.E);
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       SwipeRefreshLayout tb = this.b;
       if (tb == null || i0.Z(tb)) {
          super.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public final void s(int p0,Animation$AnimationListener p1){
       this.x = p0;
       this.y = this.v.getScaleX();
       SwipeRefreshLayout$h oh = new SwipeRefreshLayout$h(this);
       this.H = oh;
       oh.setDuration(150);
       if (p1 != null) {
          this.v.setAnimationListener(p1);
       }
       this.v.clearAnimation();
       this.v.startAnimation(this.H);
       return;
    }
    public void setAnimationProgress(float p0){
       this.v.setScaleX(p0);
       this.v.setScaleY(p0);
    }
    public void setColorScheme(int[] p0){
       this.setColorSchemeResources(p0);
    }
    public void setColorSchemeColors(int[] p0){
       this.e();
       this.C.i(p0);
    }
    public void setColorSchemeResources(int[] p0){
       Context context = this.getContext();
       int[] ointArray = new int[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          ointArray[i] = ContextCompat.getColor(context, p0[i]);
       }
       this.setColorSchemeColors(ointArray);
       return;
    }
    public final void setColorViewAlpha(int p0){
       this.v.getBackground().setAlpha(p0);
       this.C.setAlpha(p0);
    }
    public void setDistanceToTriggerSync(int p0){
       this.f = (float)p0;
    }
    public void setEnabled(boolean p0){
       super.setEnabled(p0);
       if (!p0) {
          this.k();
       }
       return;
    }
    public void setNestedScrollingEnabled(boolean p0){
       this.i.n(p0);
    }
    public void setOnChildScrollUpCallback(SwipeRefreshLayout$i p0){
       this.L = p0;
    }
    public void setOnRefreshListener(SwipeRefreshLayout$j p0){
       this.c = p0;
    }
    public void setProgressBackgroundColor(int p0){
       this.setProgressBackgroundColorSchemeResource(p0);
    }
    public void setProgressBackgroundColorSchemeColor(int p0){
       this.v.setBackgroundColor(p0);
    }
    public void setProgressBackgroundColorSchemeResource(int p0){
       this.setProgressBackgroundColorSchemeColor(ContextCompat.getColor(this.getContext(), p0));
    }
    public void setRefreshing(boolean p0){
       if (p0 && this.d != p0) {
          this.d = p0;
          int i = (this.K == null)? this.A + this.z: this.A;
          this.setTargetOffsetTopAndBottom((i - this.n));
          this.I = false;
          this.t(this.M);
       }else {
          this.m(p0, false);
       }
       return;
    }
    public void setSize(int p0){
       if (p0 && p0 != 1) {
          return;
       }
       DisplayMetrics uDisplayMetr = c.c(this.getResources());
       this.J = (!p0)? (int)(uDisplayMetr.density * 56.00f): (int)(uDisplayMetr.density * 40.00f);
       this.v.setImageDrawable(null);
       this.C.o(p0);
       this.v.setImageDrawable(this.C);
       return;
    }
    public void setSlingshotDistance(int p0){
       this.B = p0;
    }
    public void setTargetOffsetTopAndBottom(int p0){
       this.v.bringToFront();
       i0.e0(this.v, p0);
       this.n = this.v.getTop();
    }
    public boolean startNestedScroll(int p0){
       return this.i.p(p0);
    }
    public void stopNestedScroll(){
       this.i.r();
    }
    public final void t(Animation$AnimationListener p0){
       this.v.setVisibility(0);
       this.C.setAlpha(255);
       SwipeRefreshLayout$b uob = new SwipeRefreshLayout$b(this);
       this.D = uob;
       uob.setDuration((long)this.m);
       if (p0 != null) {
          this.v.setAnimationListener(p0);
       }
       this.v.clearAnimation();
       this.v.startAnimation(this.D);
       return;
    }
}
