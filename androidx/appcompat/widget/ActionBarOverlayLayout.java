package androidx.appcompat.widget.ActionBarOverlayLayout;
import w0.j;
import a2.x;
import a2.v;
import a2.w;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import a2.u0;
import androidx.appcompat.widget.ActionBarOverlayLayout$a;
import androidx.appcompat.widget.ActionBarOverlayLayout$b;
import androidx.appcompat.widget.ActionBarOverlayLayout$c;
import a2.y;
import w0.k;
import android.view.Menu;
import androidx.appcompat.view.menu.j$a;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import java.lang.Runnable;
import java.lang.CharSequence;
import android.util.SparseArray;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.WindowInsets;
import a2.i0;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Math;
import androidx.appcompat.widget.ActionBarContainer;
import p1.b;
import a2.u0$b;
import androidx.appcompat.widget.ActionBarOverlayLayout$d;
import androidx.appcompat.widget.Toolbar;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import android.view.ViewPropertyAnimator;
import android.os.IBinder;
import android.content.pm.ApplicationInfo;
import android.view.Window$Callback;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.widget.OverScroller;
import androidx.appcompat.widget.ContentFrameLayout;

public class ActionBarOverlayLayout extends ViewGroup implements j, x, v, w	// class@0005c5
{
    public OverScroller A;
    public ViewPropertyAnimator B;
    public final AnimatorListenerAdapter C;
    public final Runnable D;
    public final Runnable E;
    public final y F;
    public int b;
    public int c;
    public ContentFrameLayout d;
    public ActionBarContainer e;
    public k f;
    public Drawable g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public u0 v;
    public u0 w;
    public u0 x;
    public u0 y;
    public ActionBarOverlayLayout$d z;
    public static final int[] G;

    static {
       ActionBarOverlayLayout.G = new int[2]{0x7f0400d6,0x1010059};
    }
    public void ActionBarOverlayLayout(Context p0){
       super(p0, null);
    }
    public void ActionBarOverlayLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = 0;
       this.o = new Rect();
       this.p = new Rect();
       this.q = new Rect();
       this.r = new Rect();
       this.s = new Rect();
       this.t = new Rect();
       this.u = new Rect();
       u0 b = u0.b;
       this.v = b;
       this.w = b;
       this.x = b;
       this.y = b;
       this.C = new ActionBarOverlayLayout$a(this);
       this.D = new ActionBarOverlayLayout$b(this);
       this.E = new ActionBarOverlayLayout$c(this);
       this.t(p0);
       this.F = new y(this);
    }
    public boolean a(){
       this.x();
       return this.f.a();
    }
    public void b(Menu p0,j$a p1){
       this.x();
       this.f.b(p0, p1);
    }
    public boolean c(){
       this.x();
       return this.f.c();
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof ActionBarOverlayLayout$LayoutParams;
    }
    public boolean d(){
       this.x();
       return this.f.d();
    }
    public void draw(Canvas p0){
       super.draw(p0);
       if (this.g != null && this.h == null) {
          int i = (!this.e.getVisibility())? (int)(((float)this.e.getBottom() + this.e.getTranslationY()) + 0x3f000000): 0;
          this.g.setBounds(0, i, this.getWidth(), (this.g.getIntrinsicHeight() + i));
          this.g.draw(p0);
       }
       return;
    }
    public final void e(){
       this.s();
       this.E.run();
    }
    public boolean f(){
       this.x();
       return this.f.f();
    }
    public boolean fitSystemWindows(Rect p0){
       return super.fitSystemWindows(p0);
    }
    public boolean g(){
       this.x();
       return this.f.g();
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.p();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.q(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return new ActionBarOverlayLayout$LayoutParams(p0);
    }
    public int getActionBarHideOffset(){
       ActionBarOverlayLayout te = this.e;
       int i = (te != null)? - (int)te.getTranslationY(): 0;
       return i;
    }
    public int getNestedScrollAxes(){
       return this.F.a();
    }
    public CharSequence getTitle(){
       this.x();
       return this.f.getTitle();
    }
    public boolean h(){
       this.x();
       return this.f.h();
    }
    public void i(){
       this.x();
       this.f.i();
    }
    public boolean j(){
       this.x();
       return this.f.j();
    }
    public void k(SparseArray p0){
       this.x();
       this.f.L(p0);
    }
    public void l(SparseArray p0){
       this.x();
       this.f.R(p0);
    }
    public void m(int p0){
       this.x();
       if (p0 != 2) {
          if (p0 != 5) {
             if (p0 == 109) {
                this.setOverlayMode(true);
             }
          }else {
             this.f.N();
          }
       }else {
          this.f.q();
       }
       return;
    }
    public void n(){
       this.x();
       this.f.t();
    }
    public final boolean o(View p0,Rect p1,boolean p2,boolean p3,boolean p4,boolean p5){
       int i;
       ActionBarOverlayLayout$LayoutParams layoutParams = p0.getLayoutParams();
       boolean b = true;
       if (p2) {
          Rect left = p1.left;
          if (layoutParams.leftMargin != left) {
             layoutParams.leftMargin = left;
             i = 1;
          label_0014 :
             if (p3) {
                left = p1.top;
                if (layoutParams.topMargin != left) {
                   layoutParams.topMargin = left;
                   i = 1;
                }
             }
             if (p5) {
                Rect right = p1.right;
                if (layoutParams.rightMargin != right) {
                   layoutParams.rightMargin = right;
                   i = 1;
                }
             }
             if (p4) {
                p1 = p1.bottom;
                if (layoutParams.bottomMargin != p1) {
                   layoutParams.bottomMargin = p1;
                label_0036 :
                   return b;
                }
             }
             b = i;
             goto label_0036 ;
          }
       }
       i = 0;
       goto label_0014 ;
    }
    public WindowInsets onApplyWindowInsets(WindowInsets p0){
       boolean this;
       this.x();
       u0 ou0 = u0.w(p0);
       this = this.o(this.e, new Rect(ou0.i(), ou0.k(), ou0.j(), ou0.h()), true, true, false, true);
       i0.h(this, ou0, this.o);
       ActionBarOverlayLayout to = this.o;
       u0 ou01 = ou0.m(to.left, to.top, to.right, to.bottom);
       this.v = ou01;
       boolean b = true;
       if (!this.w.equals(ou01)) {
          this.w = this.v;
          this = 1;
       }
       if (!this.p.equals(this.o)) {
          this.p.set(this.o);
       }else {
          b = this;
       }
       if (b) {
          this.requestLayout();
       }
       return ou0.a().c().b().v();
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       this.t(this.getContext());
       i0.p0(this);
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.s();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int childCount = this.getChildCount();
       p1 = this.getPaddingLeft();
       p2 = this.getPaddingTop();
       p3 = 0;
       while (p3 < childCount) {
          View childAt = this.getChildAt(p3);
          if (childAt.getVisibility() != 8) {
             ActionBarOverlayLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             int i = layoutParams.leftMargin + p1;
             int i1 = layoutParams.topMargin + p2;
             int i2 = childAt.getMeasuredWidth() + i;
             int i3 = childAt.getMeasuredHeight() + i1;
             childAt.layout(i, i1, i2, i3);
          }
          p3++;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       ActionBarOverlayLayout tb;
       this.x();
       this.measureChildWithMargins(this.e, p0, 0, p1, 0);
       ActionBarOverlayLayout$LayoutParams layoutParams = this.e.getLayoutParams();
       int i = 0;
       int i1 = Math.max(i, ((this.e.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin));
       int layoutParams1 = Math.max(i, ((this.e.getMeasuredHeight() + layoutParams.topMargin) + layoutParams.bottomMargin));
       int i2 = View.combineMeasuredStates(i, this.e.getMeasuredState());
       ActionBarOverlayLayout uActionBarOv = (i0.Q(this) & 0x0100)? 1: null;
       if (uActionBarOv) {
          tb = this.b;
          if (this.j != null && this.e.getTabContainer() != null) {
             tb = tb + this.b;
          }
       }else if(this.e.getVisibility() != 8){
          tb = this.e.getMeasuredHeight();
       }else {
          tb = 0;
       }
       this.q.set(this.o);
       ActionBarOverlayLayout tv = this.v;
       this.x = tv;
       if (this.i == null && !uActionBarOv) {
          uActionBarOv = this.q;
          uActionBarOv.top = uActionBarOv.top + tb;
          uActionBarOv.bottom = uActionBarOv.bottom + i;
          this.x = tv.m(i, tb, i, i);
       }else {
          u0$b uob = new u0$b(this.x);
          uob.d(b.b(tv.i(), (this.x.k() + tb), this.x.j(), (this.x.h() + i)));
          this.x = uob.a();
       }
       this.o(this.d, this.q, true, true, true, true);
       if (!this.y.equals(this.x)) {
          ActionBarOverlayLayout tx = this.x;
          this.y = tx;
          i0.i(this.d, tx);
       }
       this.measureChildWithMargins(this.d, p0, 0, p1, 0);
       ActionBarOverlayLayout$LayoutParams layoutParams2 = this.d.getLayoutParams();
       i = View.combineMeasuredStates(i2, this.d.getMeasuredState());
       this.setMeasuredDimension(View.resolveSizeAndState(Math.max((Math.max(i1, ((this.d.getMeasuredWidth() + layoutParams2.leftMargin) + layoutParams2.rightMargin)) + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), p0, i), View.resolveSizeAndState(Math.max((Math.max(layoutParams1, ((this.d.getMeasuredHeight() + layoutParams2.topMargin) + layoutParams2.bottomMargin)) + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), p1, (i << 16)));
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       if (this.k == null || !p3) {
          return false;
       }
       if (this.z(p2)) {
          this.e();
       }else {
          this.y();
       }
       this.l = true;
       return true;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       return false;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       if (!p4) {
          this.onNestedPreScroll(p0, p1, p2, p3);
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       int i = this.m + p2;
       this.m = i;
       this.setActionBarHideOffset(i);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       if (!p5) {
          this.onNestedScroll(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5,int[] p6){
       this.onNestedScroll(p0, p1, p2, p3, p4, p5);
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       this.F.b(p0, p1, p2);
       this.m = this.getActionBarHideOffset();
       this.s();
       ActionBarOverlayLayout tz = this.z;
       if (tz != null) {
          tz.a();
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       if (!p3) {
          this.onNestedScrollAccepted(p0, p1, p2);
       }
       return;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       if (!(p2 & 0x02) || this.e.getVisibility()) {
          return false;
       }
       return this.k;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       boolean b = (!p3 && this.onStartNestedScroll(p0, p1, p2))? true: false;
       return b;
    }
    public void onStopNestedScroll(View p0){
       if (this.k != null && this.l == null) {
          if (this.m <= this.e.getHeight()) {
             this.w();
          }else {
             this.v();
          }
       }
       ActionBarOverlayLayout tz = this.z;
       if (tz != null) {
          tz.d();
       }
       return;
    }
    public void onStopNestedScroll(View p0,int p1){
       if (!p1) {
          this.onStopNestedScroll(p0);
       }
       return;
    }
    public void onWindowSystemUiVisibilityChanged(int p0){
       super.onWindowSystemUiVisibilityChanged(p0);
       this.x();
       int i = this.n ^ p0;
       this.n = p0;
       int i1 = 0;
       int i2 = (!(p0 & 0x04))? 1: 0;
       if (p0 & 0x0100) {
          i1 = 1;
       }
       ActionBarOverlayLayout tz = this.z;
       if (tz != null) {
          tz.b((i1 ^ 0x01));
          if (i2 || !i1) {
             this.z.c();
          }else {
             this.z.e();
          }
       }
       if ((i & 0x0100) && this.z != null) {
          i0.p0(this);
       }
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       super.onWindowVisibilityChanged(p0);
       this.c = p0;
       ActionBarOverlayLayout tz = this.z;
       if (tz != null) {
          tz.onWindowVisibilityChanged(p0);
       }
       return;
    }
    public ActionBarOverlayLayout$LayoutParams p(){
       return new ActionBarOverlayLayout$LayoutParams(-1, -1);
    }
    public ActionBarOverlayLayout$LayoutParams q(AttributeSet p0){
       return new ActionBarOverlayLayout$LayoutParams(this.getContext(), p0);
    }
    public final k r(View p0){
       if (p0 instanceof k) {
          return p0;
       }
       if (p0 instanceof Toolbar) {
          return p0.getWrapper();
       }
       throw new IllegalStateException("Can\'t make a decor toolbar out of "+p0.getClass().getSimpleName());
    }
    public void s(){
       this.removeCallbacks(this.D);
       this.removeCallbacks(this.E);
       ActionBarOverlayLayout tB = this.B;
       if (tB != null) {
          tB.cancel();
       }
       return;
    }
    public void setActionBarHideOffset(int p0){
       this.s();
       this.e.setTranslationY((float)(- Math.max(0, Math.min(p0, this.e.getHeight()))));
    }
    public void setActionBarVisibilityCallback(ActionBarOverlayLayout$d p0){
       this.z = p0;
       if (this.getWindowToken() != null) {
          this.z.onWindowVisibilityChanged(this.c);
          ActionBarOverlayLayout tn = this.n;
          if (tn != null) {
             this.onWindowSystemUiVisibilityChanged(tn);
             i0.p0(this);
          }
       }
       return;
    }
    public void setHasNonEmbeddedTabs(boolean p0){
       this.j = p0;
    }
    public void setHideOnContentScrollEnabled(boolean p0){
       if (p0 != this.k) {
          this.k = p0;
          if (!p0) {
             this.s();
             this.setActionBarHideOffset(0);
          }
       }
       return;
    }
    public void setIcon(int p0){
       this.x();
       this.f.setIcon(p0);
    }
    public void setIcon(Drawable p0){
       this.x();
       this.f.setIcon(p0);
    }
    public void setLogo(int p0){
       this.x();
       this.f.setLogo(p0);
    }
    public void setOverlayMode(boolean p0){
       this.i = p0;
       p0 = (p0 && this.getContext().getApplicationInfo().targetSdkVersion < 19)? true: false;
       this.h = p0;
       return;
    }
    public void setShowingForActionMode(boolean p0){
    }
    public void setUiOptions(int p0){
    }
    public void setWindowCallback(Window$Callback p0){
       this.x();
       this.f.setWindowCallback(p0);
    }
    public void setWindowTitle(CharSequence p0){
       this.x();
       this.f.setWindowTitle(p0);
    }
    public boolean shouldDelayChildPressedState(){
       return false;
    }
    public final void t(Context p0){
       TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.G);
       int i = 0;
       this.b = typedArray.getDimensionPixelSize(i, i);
       Drawable drawable = typedArray.getDrawable(1);
       this.g = drawable;
       boolean b = (drawable == null)? true: false;
       this.setWillNotDraw(b);
       typedArray.recycle();
       if (p0.getApplicationInfo().targetSdkVersion < 19) {
          i = true;
       }
       this.h = i;
       this.A = new OverScroller(p0);
       return;
    }
    public boolean u(){
       return this.i;
    }
    public final void v(){
       this.s();
       this.postDelayed(this.E, 600);
    }
    public final void w(){
       this.s();
       this.postDelayed(this.D, 600);
    }
    public void x(){
       if (this.d == null) {
          this.d = this.findViewById(0x7f0a0080);
          this.e = this.findViewById(0x7f0a0083);
          this.f = this.r(this.findViewById(0x7f0a007f));
       }
       return;
    }
    public final void y(){
       this.s();
       this.D.run();
    }
    public final boolean z(float p0){
       this.A.fling(0, 0, 0, (int)p0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
       boolean b = (this.A.getFinalY() > this.e.getHeight())? true: false;
       return b;
    }
}
