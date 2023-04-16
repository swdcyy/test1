package androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import a2.i0;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import android.view.ViewParent;
import java.lang.StringBuilder;
import android.content.res.Resources;
import java.lang.Object;
import a2.g;

public class CoordinatorLayout$LayoutParams extends ViewGroup$MarginLayoutParams	// class@0006c5
{
    public CoordinatorLayout$Behavior a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q;
    public Object r;

    public void CoordinatorLayout$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public void CoordinatorLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.e0);
       this.c = typedArray.getInteger(false, false);
       this.f = typedArray.getResourceId(1, -1);
       this.d = typedArray.getInteger(2, false);
       this.e = typedArray.getInteger(6, -1);
       this.g = typedArray.getInt(5, false);
       this.h = typedArray.getInt(4, false);
       int i = 3;
       boolean b = typedArray.hasValue(i);
       this.b = b;
       if (b) {
          this.a = CoordinatorLayout.L(p0, p1, typedArray.getString(i));
       }
       typedArray.recycle();
       CoordinatorLayout$LayoutParams ta = this.a;
       if (ta != null) {
          ta.onAttachedToLayoutParams(this);
       }
       return;
    }
    public void CoordinatorLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public void CoordinatorLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public void CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams p0){
       super(p0);
       this.b = false;
       this.c = 0;
       this.d = 0;
       this.e = -1;
       this.f = -1;
       this.g = 0;
       this.h = 0;
       this.q = new Rect();
    }
    public boolean a(){
       boolean b = (this.k == null && this.f != -1)? true: false;
       return b;
    }
    public boolean b(CoordinatorLayout p0,View p1,View p2){
       boolean b;
       if (p2 != this.l && !this.s(p2, i0.B(p0))) {
          CoordinatorLayout$LayoutParams ta = this.a;
          if (ta == null || !ta.layoutDependsOn(p0, p1, p2)) {
             b = false;
          label_001c :
             return b;
          }
       }
       b = true;
       goto label_001c ;
    }
    public boolean c(){
       if (this.a == null) {
          this.m = false;
       }
       return this.m;
    }
    public View d(CoordinatorLayout p0,View p1){
       if (this.f == -1) {
          this.l = null;
          this.k = null;
          return null;
       }else if(this.k == null || !this.t(p1, p0)){
          this.n(p1, p0);
       }
       return this.k;
    }
    public int e(){
       return this.f;
    }
    public CoordinatorLayout$Behavior f(){
       return this.a;
    }
    public boolean g(){
       return this.p;
    }
    public Rect h(){
       return this.q;
    }
    public boolean i(CoordinatorLayout p0,View p1){
       CoordinatorLayout$LayoutParams tm = this.m;
       if (tm != null) {
          return true;
       }
       CoordinatorLayout$LayoutParams ta = this.a;
       int b = (ta != null)? ta.blocksInteractionBelow(p0, p1): 0;
       b = b | tm;
       this.m = b;
       return b;
    }
    public boolean j(int p0){
       if (!p0) {
          return this.n;
       }
       if (p0 != 1) {
          return false;
       }
       return this.o;
    }
    public void k(){
       this.p = false;
    }
    public void l(int p0){
       this.r(p0, false);
    }
    public void m(){
       this.m = false;
    }
    public final void n(View p0,CoordinatorLayout p1){
       ViewParent parent;
       View view = p1.findViewById(this.f);
       this.k = view;
       View view1 = null;
       if (view != null) {
          if (view == p1) {
             if (p1.isInEditMode()) {
                this.l = view1;
                this.k = view1;
                return;
             }else {
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
             }
          }else {
             parent = view.getParent();
             while (true) {
                if (parent != p1 && parent != null) {
                   if (parent == p0) {
                      if (p1.isInEditMode()) {
                         break ;
                      }else {
                         throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                      }
                   }else if(parent instanceof View){
                      view = parent;
                   }
                   parent = parent.getParent();
                }else {
                   this.l = view;
                   return;
                }
             }
             this.l = view1;
             this.k = view1;
             return;
          }
       }else if(p1.isInEditMode()){
          this.l = view1;
          this.k = view1;
          return;
       }else {
          throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id "+p1.getResources().getResourceName(this.f)+" to anchor view "+p0);
       }
    }
    public void o(CoordinatorLayout$Behavior p0){
       CoordinatorLayout$LayoutParams ta = this.a;
       if (ta != p0) {
          if (ta != null) {
             ta.onDetachedFromLayoutParams();
          }
          this.a = p0;
          this.r = null;
          this.b = true;
          if (p0 != null) {
             p0.onAttachedToLayoutParams(this);
          }
       }
       return;
    }
    public void p(boolean p0){
       this.p = p0;
    }
    public void q(Rect p0){
       this.q.set(p0);
    }
    public void r(int p0,boolean p1){
       if (p0) {
          if (p0 == 1) {
             this.o = p1;
          }
       }else {
          this.n = p1;
       }
       return;
    }
    public final boolean s(View p0,int p1){
       boolean i = g.b(p0.getLayoutParams().g, p1);
       i = (i && (g.b(this.h, p1) & i) == i)? true: false;
       return i;
    }
    public final boolean t(View p0,CoordinatorLayout p1){
       if (this.k.getId() != this.f) {
          return false;
       }
       CoordinatorLayout$LayoutParams tk = this.k;
       ViewParent parent = tk.getParent();
       while (true) {
          if (parent != p1) {
             if (parent == null || parent == p0) {
                break ;
             }else if(parent instanceof View){
                tk = parent;
             }
             parent = parent.getParent();
          }else {
             this.l = tk;
             return true;
          }
       }
       this.l = null;
       this.k = null;
       return false;
    }
}
