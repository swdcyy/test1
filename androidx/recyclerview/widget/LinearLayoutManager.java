package androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m$h;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager$a;
import androidx.recyclerview.widget.LinearLayoutManager$b;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.LinearLayoutManager$c;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.s;
import java.util.List;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$c;
import java.lang.Math;
import androidx.recyclerview.widget.LinearLayoutManager$SavedState;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.w;
import android.graphics.PointF;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import androidx.recyclerview.widget.o;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class LinearLayoutManager extends RecyclerView$LayoutManager implements m$h, RecyclerView$x$b	// class@000879
{
    public int b;
    public LinearLayoutManager$c c;
    public s d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public LinearLayoutManager$SavedState m;
    public final LinearLayoutManager$a n;
    public final LinearLayoutManager$b o;
    public int p;
    public int[] q;

    public void LinearLayoutManager(Context p0){
       super(p0, 1, false);
    }
    public void LinearLayoutManager(Context p0,int p1,boolean p2){
       super();
       this.b = 1;
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = true;
       this.j = -1;
       this.k = Integer.MIN_VALUE;
       this.m = null;
       this.n = new LinearLayoutManager$a();
       this.o = new LinearLayoutManager$b();
       this.p = 2;
       int[] ointArray = new int[2];
       this.q = ointArray;
       this.setOrientation(p1);
       this.setReverseLayout(p2);
    }
    public void LinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super();
       this.b = 1;
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = true;
       this.j = -1;
       this.k = Integer.MIN_VALUE;
       this.m = null;
       this.n = new LinearLayoutManager$a();
       this.o = new LinearLayoutManager$b();
       this.p = 2;
       int[] ointArray = new int[2];
       this.q = ointArray;
       RecyclerView$LayoutManager$Properties properties = RecyclerView$LayoutManager.getProperties(p0, p1, p2, p3);
       this.setOrientation(properties.orientation);
       this.setReverseLayout(properties.reverseLayout);
       this.N0(properties.stackFromEnd);
    }
    private void H0(RecyclerView$t p0,int p1,int p2){
       if (p1 == p2) {
          return;
       }
       if (p2 > p1) {
          for (p2--; p2 >= p1; p2--) {
             this.removeAndRecycleViewAt(p2, p0);
          }
       }else {
          while (p1 > p2) {
             this.removeAndRecycleViewAt(p1, p0);
             p1--;
          }
       }
       return;
    }
    public void D0(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$c p2,LinearLayoutManager$b p3){
       LinearLayoutManager tg;
       LinearLayoutManager$c uoc;
       int i1;
       LinearLayoutManager$c uoc1;
       int i2;
       int i3;
       View view = p2.d(p0);
       if (view == null) {
          p3.b = true;
          return;
       }else {
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          LinearLayoutManager$b uob = -1;
          int i = 0;
          if (p2.l == null) {
             tg = this.g;
             uoc = (p2.f == uob)? 1: null;
             if (tg == uoc) {
                this.addView(view);
             }else {
                this.addView(view, i);
             }
          }else {
             tg = this.g;
             uoc = (p2.f == uob)? 1: null;
             if (tg == uoc) {
                this.addDisappearingView(view);
             }else {
                this.addDisappearingView(view, i);
             }
          }
          this.measureChildWithMargins(view, i, i);
          p3.a = this.d.e(view);
          if (this.b == true) {
             if (this.isLayoutRTL()) {
                i1 = this.getWidth() - this.getPaddingRight();
                i = i1 - this.d.f(view);
             }else {
                i = this.getPaddingLeft();
                i1 = this.d.f(view) + i;
             }
             if (p2.f == uob) {
                p2 = p2.b;
                uoc1 = p2;
                i2 = i1;
                i3 = p2 - p3.a;
             }else {
                p2 = p2.b;
                i3 = p2;
                i2 = i1;
                uoc1 = p3.a + p2;
             }
          }else {
             i1 = this.getPaddingTop();
             i = this.d.f(view) + i1;
             if (p2.f == uob) {
                p2 = p2.b;
                i2 = p2;
                i3 = i1;
                uoc1 = i;
                i = p2 - p3.a;
             }else {
                p2 = p2.b;
                i3 = i1;
                i2 = p3.a + p2;
                uoc1 = i;
                LinearLayoutManager$c uoc2 = p2;
             }
          }
          this.layoutDecoratedWithMargins(view, i, i3, i2, uoc1);
          if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
             p3.c = true;
          }
          p3.d = view.hasFocusable();
          return;
       }
    }
    public int E(){
       int i = -1;
       View view = this.W((this.getChildCount() - 1), i, 1, false);
       if (view == null) {
       }else {
          i = this.getPosition(view);
       }
       return i;
    }
    public final void E0(RecyclerView$t p0,RecyclerView$y p1,int p2,int p3){
       LinearLayoutManager c;
       LinearLayoutManager linearLayout = this;
       RecyclerView$t ot = p0;
       RecyclerView$y oy = p1;
       if (!p1.i() || (!this.getChildCount() || (!p1.g() && this.supportsPredictiveItemAnimations()))) {
          List list = p0.k();
          int i = list.size();
          int position = this.getPosition(this.getChildAt(0));
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          while (i1 < i) {
             RecyclerView$ViewHolder viewHolder = list.get(i1);
             if (!viewHolder.isRemoved()) {
                int i4 = 1;
                LinearLayoutManager linearLayout1 = (viewHolder.getLayoutPosition() < position)? 1: null;
                if (linearLayout1 != linearLayout.g) {
                   i4 = -1;
                }
                if (i4 == -1) {
                   i2 = i2 + linearLayout.d.e(viewHolder.itemView);
                }else {
                   i3 = i3 + linearLayout.d.e(viewHolder.itemView);
                }
             }
             i1 = i1 + 1;
          }
          linearLayout.c.l = list;
          if (i2 > 0) {
             this.U0(this.getPosition(this.d0()), p2);
             c = linearLayout.c;
             c.h = i2;
             c.c = 0;
             c.a();
             this.Q(ot, linearLayout.c, oy, 0);
          }
          if (i3 > 0) {
             this.S0(this.getPosition(this.c0()), p3);
             c = linearLayout.c;
             c.h = i3;
             c.c = 0;
             c.a();
             this.Q(ot, linearLayout.c, oy, 0);
          }
          linearLayout.c.l = null;
       }
    label_00ad :
       return;
    }
    public void F0(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$a p2,int p3){
    }
    public void G(View p0,View p1,int p2,int p3){
       this.assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
       this.ensureLayoutState();
       this.resolveShouldLayoutReverse();
       p3 = this.getPosition(p1);
       LinearLayoutManager linearLayout = 1;
       LinearLayoutManager linearLayout1 = (this.getPosition(p0) < p3)? 1: -1;
       if (this.g != null) {
          if (linearLayout1 == linearLayout) {
             this.scrollToPositionWithOffset(p3, (this.d.i() - (this.d.g(p1) + this.d.e(p0))));
          }else {
             this.scrollToPositionWithOffset(p3, (this.d.i() - this.d.d(p1)));
          }
       }else if(linearLayout1 == -1){
          this.scrollToPositionWithOffset(p3, this.d.g(p1));
       }else {
          this.scrollToPositionWithOffset(p3, (this.d.d(p1) - this.d.e(p0)));
       }
       return;
    }
    public final void G0(RecyclerView$t p0,LinearLayoutManager$c p1){
       if (p1.a != null && p1.m == null) {
          LinearLayoutManager$c g = p1.g;
          LinearLayoutManager$c i = p1.i;
          if (p1.f == -1) {
             this.I0(p0, g, i);
          }else {
             this.J0(p0, g, i);
          }
       }
       return;
    }
    public void H(boolean p0){
       this.i = p0;
    }
    public final void I0(RecyclerView$t p0,int p1,int p2){
       int childCount = this.getChildCount();
       if (p1 < 0) {
          return;
       }
       int i = (this.d.h() - p1) + p2;
       if (this.g != null) {
          p2 = 0;
          while (p2 < childCount) {
             View childAt = this.getChildAt(p2);
             if (this.d.g(childAt) < i || this.d.r(childAt) < i) {
                this.H0(p0, 0, p2);
                return;
             }
             p2++;
          }
       }else {
          childCount = childCount - 1;
          p1 = childCount;
          while (p1 >= 0) {
             View childAt1 = this.getChildAt(p1);
             if (this.d.g(childAt1) < i || this.d.r(childAt1) < i) {
                this.H0(p0, childCount, p1);
                break ;
             }
             p1--;
          }
       }
       return;
    }
    public final void J0(RecyclerView$t p0,int p1,int p2){
       if (p1 < 0) {
          return;
       }
       p1 = p1 - p2;
       p2 = this.getChildCount();
       if (this.g != null) {
          p2--;
          int i = p2;
          while (i >= 0) {
             View childAt = this.getChildAt(i);
             if (this.d.d(childAt) > p1 || this.d.q(childAt) > p1) {
                this.H0(p0, p2, i);
                return;
             }
             i = i - 1;
          }
       }else {
          int i1 = 0;
          while (i1 < p2) {
             View childAt1 = this.getChildAt(i1);
             if (this.d.d(childAt1) > p1 || this.d.q(childAt1) > p1) {
                this.H0(p0, 0, i1);
                break ;
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public boolean K0(){
       boolean b = (!this.d.l() && !this.d.h())? true: false;
       return b;
    }
    public void L0(int p0){
       this.p = p0;
    }
    public void M0(boolean p0){
       this.l = p0;
    }
    public void N(RecyclerView$y p0,int[] p1){
       int i1;
       int i = this.e0(p0);
       if (this.c.f == -1) {
          i1 = 0;
       }else {
          i1 = i;
          i = 0;
       }
       p1[0] = i;
       p1[1] = i1;
       return;
    }
    public void N0(boolean p0){
       this.assertNotInLayoutOrScroll(null);
       if (this.h == p0) {
          return;
       }
       this.h = p0;
       this.requestLayout();
       return;
    }
    public void O(RecyclerView$y p0,LinearLayoutManager$c p1,RecyclerView$LayoutManager$c p2){
       LinearLayoutManager$c d = p1.d;
       if (d >= null && d < p0.c()) {
          p2.a(d, Math.max(0, p1.g));
       }
       return;
    }
    public final boolean O0(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$a p2){
       boolean b = false;
       if (!this.getChildCount()) {
          return b;
       }
       View focusedChild = this.getFocusedChild();
       if (focusedChild != null && p2.d(focusedChild, p1)) {
          p2.c(focusedChild, this.getPosition(focusedChild));
          return true;
       }else {
          LinearLayoutManager th = this.h;
          if (this.e != th) {
             return b;
          }
          View view = this.Z(p0, p1, p2.d, th);
          if (view == null) {
             return b;
          }
          p2.b(view, this.getPosition(view));
          if (!p1.g() && this.supportsPredictiveItemAnimations()) {
             int i = this.d.g(view);
             int i1 = this.d.d(view);
             int i2 = this.d.n();
             int i3 = this.d.i();
             int i4 = (i1 <= i2 && i < i2)? 1: 0;
             if (i >= i3 && i1 > i3) {
                b = true;
             }
             if (i4 || b) {
                if (p2.d != null) {
                   i2 = i3;
                }
                p2.c = i2;
             }
          }
       label_006e :
          return true;
       }
    }
    public LinearLayoutManager$c P(){
       return new LinearLayoutManager$c();
    }
    public final boolean P0(RecyclerView$y p0,LinearLayoutManager$a p1){
       int i2;
       boolean b = false;
       if (!p0.g()) {
          LinearLayoutManager tj = this.j;
          int i = -1;
          if (tj != i) {
             int i1 = Integer.MIN_VALUE;
             if (tj < null || tj >= p0.c()) {
                this.j = i;
                this.k = i1;
             }else {
                p1.b = this.j;
                LinearLayoutManager tm = this.m;
                if (tm != null && tm.a()) {
                   LinearLayoutManager$SavedState d = this.m.d;
                   p1.d = d;
                   p1.c = (d != null)? this.d.i() - this.m.c: this.d.n() + this.m.c;
                   return true;
                }else if(this.k == i1){
                   View view = this.findViewByPosition(this.j);
                   if (view != null) {
                      if (this.d.e(view) > this.d.o()) {
                         p1.a();
                         return true;
                      }else if((this.d.g(view) - this.d.n()) < 0){
                         p1.c = this.d.n();
                         p1.d = b;
                         return true;
                      }else if((this.d.i() - this.d.d(view)) < 0){
                         p1.c = this.d.i();
                         p1.d = true;
                         return true;
                      }else if(p1.d != null){
                         i2 = this.d.d(view) + this.d.p();
                      }else {
                         i2 = this.d.g(view);
                      }
                      p1.c = i2;
                   }else if(this.getChildCount() > 0){
                      i2 = (this.j < this.getPosition(this.getChildAt(b)))? 1: 0;
                      if (i2 == this.g) {
                         b = true;
                      }
                      p1.d = b;
                   }
                   p1.a();
                   return true;
                }else {
                   tm = this.g;
                   p1.d = tm;
                   p1.c = (tm != null)? this.d.i() - this.k: this.d.n() + this.k;
                   return true;
                }
             }
          }
       }
       return b;
    }
    public int Q(RecyclerView$t p0,LinearLayoutManager$c p1,RecyclerView$y p2,boolean p3){
       LinearLayoutManager$c c = p1.c;
       LinearLayoutManager$c g = p1.g;
       if (g != Integer.MIN_VALUE) {
          if (c < null) {
             p1.g = g + c;
          }
          this.G0(p0, p1);
       }
       int i = p1.c + p1.h;
       LinearLayoutManager to = this.o;
       while (p1.m != null || (i > 0 && p1.c(p2))) {
          to.a();
          this.D0(p0, p2, p1, to);
          if (to.b != null) {
             break ;
          }else {
             int i1 = to.a * p1.f;
             int i2 = p1.b + i1;
             p1.b = i2;
             if (to.c != null && (p1.l != null || !p2.g())) {
                LinearLayoutManager$b a = to.a;
                i2 = p1.c - a;
                p1.c = i2;
                i = i - a;
             }
             LinearLayoutManager$c g1 = p1.g;
             if (g1 != Integer.MIN_VALUE) {
                i2 = g1 + to.a;
                p1.g = i2;
                LinearLayoutManager$c c1 = p1.c;
                if (c1 < null) {
                   i2 = i2 + c1;
                   p1.g = i2;
                }
                this.G0(p0, p1);
             }
             if (p3 && to.d != null) {
                break ;
             }
          }
       }
       return (c - p1.c);
    }
    public final void Q0(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$a p2){
       if (this.P0(p1, p2)) {
          return;
       }
       if (this.O0(p0, p1, p2)) {
          return;
       }
       p2.a();
       int i = (this.h != null)? p1.c() - 1: 0;
       p2.b = i;
       return;
    }
    public final View R(){
       return this.V(0, this.getChildCount());
    }
    public final void R0(int p0,int p1,boolean p2,RecyclerView$y p3){
       View view;
       LinearLayoutManager tc1;
       this.c.m = this.K0();
       this.c.f = p0;
       LinearLayoutManager tq = this.q;
       int i = 0;
       tq[i] = i;
       int i1 = 1;
       tq[i1] = i;
       this.N(p3, tq);
       int i2 = Math.max(i, this.q[i]);
       int i3 = Math.max(i, this.q[i1]);
       if (p0 == i1) {
          i = 1;
       }
       LinearLayoutManager tc = this.c;
       int i4 = (i)? i3: i2;
       tc.h = i4;
       if (!i) {
          i2 = i3;
       }
       tc.i = i2;
       if (i) {
          tc.h = i4 + this.d.j();
          view = this.c0();
          tq = this.c;
          if (this.g != null) {
             i1 = -1;
          }
          tq.e = i1;
          tc1 = this.c;
          tq.d = this.getPosition(view) + tc1.e;
          tc1.b = this.d.d(view);
          view = this.d.d(view) - this.d.i();
       }else {
          view = this.d0();
          tq = this.c;
          tq.h = tq.h + this.d.n();
          tq = this.c;
          if (this.g == null) {
             i1 = -1;
          }
          tq.e = i1;
          tc1 = this.c;
          tq.d = this.getPosition(view) + tc1.e;
          tc1.b = this.d.g(view);
          view = (- this.d.g(view)) + this.d.n();
       }
       LinearLayoutManager tc2 = this.c;
       tc2.c = p1;
       if (p2) {
          tc2.c = p1 - view;
       }
       tc2.g = view;
       return;
    }
    public View S(boolean p0,boolean p1){
       if (this.g != null) {
          return this.W(0, this.getChildCount(), p0, p1);
       }
       return this.W((this.getChildCount() - 1), -1, p0, p1);
    }
    public final void S0(int p0,int p1){
       this.c.c = this.d.i() - p1;
       LinearLayoutManager tc = this.c;
       int i = (this.g != null)? -1: 1;
       tc.e = i;
       tc.d = p0;
       tc.f = 1;
       tc.b = p1;
       tc.g = Integer.MIN_VALUE;
       return;
    }
    public View T(boolean p0,boolean p1){
       if (this.g != null) {
          return this.W((this.getChildCount() - 1), -1, p0, p1);
       }
       return this.W(0, this.getChildCount(), p0, p1);
    }
    public final void T0(LinearLayoutManager$a p0){
       this.S0(p0.b, p0.c);
    }
    public final View U(){
       return this.V((this.getChildCount() - 1), -1);
    }
    public final void U0(int p0,int p1){
       this.c.c = p1 - this.d.n();
       LinearLayoutManager tc = this.c;
       tc.d = p0;
       p0 = (this.g != null)? 1: -1;
       tc.e = p0;
       tc.f = -1;
       tc.b = p1;
       tc.g = Integer.MIN_VALUE;
       return;
    }
    public View V(int p0,int p1){
       LinearLayoutManager linearLayout;
       int i;
       this.ensureLayoutState();
       if (p1 > p0) {
          linearLayout = 1;
       }else if(p1 < p0){
          linearLayout = -1;
       }else {
          linearLayout = null;
       }
       if (!linearLayout) {
          return this.getChildAt(p0);
       }else if(this.d.g(this.getChildAt(p0)) < this.d.n()){
          i = 0x4004;
       }else {
          int i1 = 4161;
          i = 4097;
       }
       View view = (this.b == null)? this.mHorizontalBoundCheck.a(p0, p1, 0x4104, i): this.mVerticalBoundCheck.a(p0, p1, 0x4104, i);
       return view;
    }
    public final void V0(LinearLayoutManager$a p0){
       this.U0(p0.b, p0.c);
    }
    public View W(int p0,int p1,boolean p2,boolean p3){
       this.ensureLayoutState();
       int i = 320;
       int i1 = (p2)? 0x6003: 320;
       if (!p3) {
          i = 0;
       }
       View view = (this.b == null)? this.mHorizontalBoundCheck.a(p0, p1, i1, i): this.mVerticalBoundCheck.a(p0, p1, i1, i);
       return view;
    }
    public final View X(){
       View view = (this.g != null)? this.R(): this.U();
       return view;
    }
    public final View Y(){
       View view = (this.g != null)? this.U(): this.R();
       return view;
    }
    public View Z(RecyclerView$t p0,RecyclerView$y p1,boolean p2,boolean p3){
       int i1;
       LinearLayoutManager linearLayout = this;
       this.ensureLayoutState();
       int childCount = this.getChildCount();
       int i = -1;
       if (p3) {
          childCount = this.getChildCount() - 1;
          i1 = -1;
       }else {
          i = childCount;
          childCount = 0;
          i1 = 1;
       }
       int i2 = p1.c();
       int i3 = linearLayout.d.n();
       int i4 = linearLayout.d.i();
       View view = null;
       int i5 = view;
       int i6 = i5;
       while (true) {
          if (childCount != i) {
             View childAt = linearLayout.getChildAt(childCount);
             int position = linearLayout.getPosition(childAt);
             int i7 = linearLayout.d.g(childAt);
             int i8 = linearLayout.d.d(childAt);
             if (position >= 0 && position < i2) {
                if (childAt.getLayoutParams().isItemRemoved()) {
                   if (i6 == null) {
                      i6 = childAt;
                   }
                }else if(i8 <= i3 && i7 < i3){
                   position = 1;
                }else {
                   position = 0;
                }
                LinearLayoutManager linearLayout1 = (i7 >= i4 && i8 > i4)? 1: null;
                if (position || linearLayout1) {
                   if (p2) {
                      if (linearLayout1) {
                      label_0073 :
                         i5 = childAt;
                      }else if(view == null){
                      label_0078 :
                         childCount = childCount + i1;
                      }
                   }else if(position){
                      goto label_0073 ;
                   }else if(view == null){
                   }
                   view = childAt;
                   goto label_0078 ;
                }else {
                   return childAt;
                }
             }else {
                goto label_0078 ;
             }
          }else if(view != null){
             view = (i5 != null)? i5: i6;
          }
          break ;
       }
       return view;
    }
    public final int a0(int p0,RecyclerView$t p1,RecyclerView$y p2,boolean p3){
       int i = this.d.i() - p0;
       if (i <= 0) {
          return 0;
       }
       int i1 = - this.scrollBy((- i), p1, p2);
       p0 = p0 + i1;
       if (p3) {
          int i2 = this.d.i() - p0;
          if (i2 > 0) {
             this.d.t(i2);
             return (i2 + i1);
          }
       }
       return i1;
    }
    public void assertNotInLayoutOrScroll(String p0){
       if (this.m == null) {
          super.assertNotInLayoutOrScroll(p0);
       }
       return;
    }
    public final int b0(int p0,RecyclerView$t p1,RecyclerView$y p2,boolean p3){
       int i = p0 - this.d.n();
       if (i <= 0) {
          return 0;
       }
       int i1 = - this.scrollBy(i, p1, p2);
       p0 = p0 + i1;
       if (p3) {
          p0 = p0 - this.d.n();
          if (p0 > 0) {
             this.d.t((- p0));
             i1 = i1 - p0;
          }
       }
       return i1;
    }
    public int c(){
       int i = -1;
       View view = this.W((this.getChildCount() - 1), i, false, 1);
       if (view == null) {
       }else {
          i = this.getPosition(view);
       }
       return i;
    }
    public final View c0(){
       int i = (this.g != null)? 0: this.getChildCount() - 1;
       return this.getChildAt(i);
    }
    public boolean canScrollHorizontally(){
       boolean b = (this.b == null)? true: false;
       return b;
    }
    public boolean canScrollVertically(){
       boolean b = true;
       if (this.b == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void collectAdjacentPrefetchPositions(int p0,int p1,RecyclerView$y p2,RecyclerView$LayoutManager$c p3){
       if (this.b == null) {
       }else {
          p0 = p1;
       }
       if (this.getChildCount() && p0) {
          this.ensureLayoutState();
          int i = (p0 > 0)? 1: -1;
          this.R0(i, Math.abs(p0), true, p2);
          this.O(p2, this.c, p3);
       }
       return;
    }
    public void collectInitialPrefetchPositions(int p0,RecyclerView$LayoutManager$c p1){
       LinearLayoutManager$SavedState d;
       LinearLayoutManager$SavedState b;
       LinearLayoutManager tm = this.m;
       int i = -1;
       if (tm != null && tm.a()) {
          tm = this.m;
          d = tm.d;
          b = tm.b;
       }else {
          this.resolveShouldLayoutReverse();
          d = this.g;
          b = this.j;
          if (b == i) {
             b = (d != null)? p0 - 1: 0;
          }
       }
       if (d == null) {
          i = 1;
       }
       for (int i1 = 0; i1 < this.p && (b >= 0 && b < p0); i1 = i1 + 1) {
          p1.a(b, 0);
          b = b + i;
       }
       return;
    }
    public int computeHorizontalScrollExtent(RecyclerView$y p0){
       return this.computeScrollExtent(p0);
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       return this.computeScrollOffset(p0);
    }
    public int computeHorizontalScrollRange(RecyclerView$y p0){
       return this.computeScrollRange(p0);
    }
    public final int computeScrollExtent(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       this.ensureLayoutState();
       return w.a(p0, this.d, this.T((this.i ^ 1), 1), this.S((this.i ^ 1), 1), this, this.i);
    }
    public final int computeScrollOffset(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       this.ensureLayoutState();
       return w.b(p0, this.d, this.T((this.i ^ 1), 1), this.S((this.i ^ 1), 1), this, this.i, this.g);
    }
    public final int computeScrollRange(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       this.ensureLayoutState();
       return w.c(p0, this.d, this.T((this.i ^ 1), 1), this.S((this.i ^ 1), 1), this, this.i);
    }
    public PointF computeScrollVectorForPosition(int p0){
       if (!this.getChildCount()) {
          return null;
       }
       int i = 0;
       int i1 = 1;
       if (p0 < this.getPosition(this.getChildAt(i))) {
          i = 1;
       }
       if (i != this.g) {
          i1 = -1;
       }
       if (this.b == null) {
          return new PointF((float)i1, 0);
       }else {
          return new PointF(0, (float)i1);
       }
    }
    public int computeVerticalScrollExtent(RecyclerView$y p0){
       return this.computeScrollExtent(p0);
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       return this.computeScrollOffset(p0);
    }
    public int computeVerticalScrollRange(RecyclerView$y p0){
       return this.computeScrollRange(p0);
    }
    public int convertFocusDirectionToLayoutDirection(int p0){
       int i = -1;
       int i1 = 1;
       if (p0 != i1) {
          if (p0 != 2) {
             if (p0 != 17) {
                if (p0 != 33) {
                   if (p0 != 66) {
                      if (p0 != 130) {
                         return Integer.MIN_VALUE;
                      }else if(this.b == i1){
                         i1 = Integer.MIN_VALUE;
                      }
                      return i1;
                   }else if(this.b == null){
                      i1 = Integer.MIN_VALUE;
                   }
                   return i1;
                }else if(this.b == i1){
                   i = Integer.MIN_VALUE;
                }
                return i;
             }else if(this.b == null){
                i = Integer.MIN_VALUE;
             }
             return i;
          }else if(this.b == i1){
             return i1;
          }else if(this.isLayoutRTL()){
             return i;
          }else {
             return i1;
          }
       }else if(this.b == i1){
          return i;
       }else if(this.isLayoutRTL()){
          return i1;
       }else {
          return i;
       }
    }
    public final View d0(){
       int i = (this.g != null)? this.getChildCount() - 1: 0;
       return this.getChildAt(i);
    }
    public int e0(RecyclerView$y p0){
       if (p0.e()) {
          return this.d.o();
       }
       return 0;
    }
    public void ensureLayoutState(){
       if (this.c == null) {
          this.c = this.P();
       }
       return;
    }
    public boolean f0(){
       return this.l;
    }
    public View findViewByPosition(int p0){
       int childCount = this.getChildCount();
       if (!childCount) {
          return null;
       }
       int i = p0 - this.getPosition(this.getChildAt(0));
       if (i >= 0 && i < childCount) {
          View childAt = this.getChildAt(i);
          if (this.getPosition(childAt) == p0) {
             return childAt;
          }
       }
       return super.findViewByPosition(p0);
    }
    public boolean g0(){
       return this.h;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       return new RecyclerView$LayoutParams(-2, -2);
    }
    public int getOrientation(){
       return this.b;
    }
    public boolean getReverseLayout(){
       return this.f;
    }
    public int h(){
       View view = this.W(0, this.getChildCount(), true, 0);
       int i = (view == null)? -1: this.getPosition(view);
       return i;
    }
    public int i0(){
       View view = this.W(0, this.getChildCount(), 0, true);
       int i = (view == null)? -1: this.getPosition(view);
       return i;
    }
    public boolean isAutoMeasureEnabled(){
       return (this instanceof SlideHorizontalAtlasPlayer$PageAutoScrollLayoutManager ^ 0x01);
    }
    public boolean isLayoutRTL(){
       boolean b = true;
       if (this.getLayoutDirection() == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean k(){
       return this.i;
    }
    public void onDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       super.onDetachedFromWindow(p0, p1);
       if (this.l != null) {
          this.removeAndRecycleAllViews(p1);
          p1.c();
       }
       return;
    }
    public View onFocusSearchFailed(View p0,int p1,RecyclerView$t p2,RecyclerView$y p3){
       this.resolveShouldLayoutReverse();
       if (!this.getChildCount()) {
          return null;
       }
       int i = this.convertFocusDirectionToLayoutDirection(p1);
       p1 = Integer.MIN_VALUE;
       if (i == p1) {
          return null;
       }
       this.ensureLayoutState();
       this.R0(i, (int)((float)this.d.o() * 0.33f), false, p3);
       LinearLayoutManager tc = this.c;
       tc.g = p1;
       tc.a = false;
       this.Q(p2, tc, p3, true);
       boolean b = -1;
       View view = (i == b)? this.Y(): this.X();
       i = (i == b)? this.d0(): this.c0();
       if (i.hasFocusable()) {
          if (view == null) {
             return null;
          }else {
             return i;
          }
       }else {
          return view;
       }
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       if (this.getChildCount() > 0) {
          p0.setFromIndex(this.i0());
          p0.setToIndex(this.c());
       }
       return;
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       LinearLayoutManager tj;
       int i3;
       LinearLayoutManager$c b;
       LinearLayoutManager$c d;
       LinearLayoutManager$c c;
       LinearLayoutManager$c b1;
       int i = -1;
       if (this.m != null || (this.j != i && !p1.c())) {
          this.removeAndRecycleAllViews(p0);
          return;
       }else {
          LinearLayoutManager tm = this.m;
          if (tm != null && tm.a()) {
             this.j = this.m.b;
          }
          this.ensureLayoutState();
          this.c.a = false;
          this.resolveShouldLayoutReverse();
          View focusedChild = this.getFocusedChild();
          LinearLayoutManager tn = this.n;
          if (tn.e != null && (this.j != i || this.m != null)) {
             tn.e();
             tm = this.n;
             tm.d = this.g ^ this.h;
             this.Q0(p0, p1, tm);
             this.n.e = true;
          }else if(focusedChild != null && (this.d.g(focusedChild) >= this.d.i() || this.d.d(focusedChild) <= this.d.n())){
             this.n.c(focusedChild, this.getPosition(focusedChild));
          }
          tm = this.c;
          int i1 = (tm.k >= null)? 1: -1;
          tm.f = i1;
          tm = this.q;
          tm[0] = false;
          tm[1] = false;
          this.N(p1, tm);
          int i2 = Math.max(false, this.q[0]) + this.d.n();
          i1 = Math.max(false, this.q[1]) + this.d.j();
          if (p1.g()) {
             tj = this.j;
             if (tj != i && this.k != Integer.MIN_VALUE) {
                View view = this.findViewByPosition(tj);
                if (view != null) {
                   if (this.g != null) {
                      i3 = this.d.i() - this.d.d(view);
                      tj = this.k;
                   }else {
                      int i4 = this.d.g(view) - this.d.n();
                      i3 = this.k;
                   }
                   i3 = i3 - tj;
                   if (i3 > 0) {
                      i2 = i2 + i3;
                   }else {
                      i1 = i1 - i3;
                   }
                }
             }
          }
          tj = this.n;
          if (tj.d != null) {
             if (this.g != null) {
             label_00f8 :
                i = 1;
             }
          }else if(this.g != null){
          }
          this.F0(p0, p1, tj, i);
          this.detachAndScrapAttachedViews(p0);
          this.c.m = this.K0();
          this.c.j = p1.g();
          this.c.i = 0;
          LinearLayoutManager tn1 = this.n;
          if (tn1.d != null) {
             this.V0(tn1);
             tn1 = this.c;
             tn1.h = i2;
             this.Q(p0, tn1, p1, false);
             tm = this.c;
             b = tm.b;
             d = tm.d;
             c = tm.c;
             if (c > null) {
                i1 = i1 + c;
             }
             this.T0(this.n);
             tm = this.c;
             tm.h = i1;
             tm.d = tm.d + tm.e;
             this.Q(p0, tm, p1, false);
             tm = this.c;
             b1 = tm.b;
             c = tm.c;
             if (c > null) {
                this.U0(d, b);
                tn1 = this.c;
                tn1.h = c;
                this.Q(p0, tn1, p1, false);
                b = this.c.b;
             }
          }else {
             this.T0(tn1);
             tn1 = this.c;
             tn1.h = i1;
             this.Q(p0, tn1, p1, false);
             tn1 = this.c;
             b1 = tn1.b;
             d = tn1.d;
             b = tn1.c;
             if (b > null) {
                i2 = i2 + b;
             }
             this.V0(this.n);
             tn1 = this.c;
             tn1.h = i2;
             tn1.d = tn1.d + tn1.e;
             this.Q(p0, tn1, p1, false);
             tm = this.c;
             b = tm.b;
             c = tm.c;
             if (c > null) {
                this.S0(d, b1);
                tn = this.c;
                tn.h = c;
                this.Q(p0, tn, p1, false);
                b1 = this.c.b;
             }
          }
          if (this.getChildCount() > 0) {
             if (this.g ^ this.h) {
                i2 = this.a0(b1, p0, p1, true);
                i = b + i2;
                i1 = b1 + i2;
                i2 = this.b0(i, p0, p1, false);
             }else {
                i2 = this.b0(b, p0, p1, true);
                i = b + i2;
                i1 = b1 + i2;
                i2 = this.a0(i1, p0, p1, false);
             }
             b = i + i2;
             b1 = i1 + i2;
          }
          this.E0(p0, p1, b, b1);
          if (!p1.g()) {
             this.d.u();
          }else {
             this.n.e();
          }
          this.e = this.h;
          return;
       }
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       super.onLayoutCompleted(p0);
       this.m = null;
       this.j = -1;
       this.k = Integer.MIN_VALUE;
       this.n.e();
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof LinearLayoutManager$SavedState) {
          this.m = p0;
          if (this.j != -1) {
             p0.b();
          }
          this.requestLayout();
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       View view;
       LinearLayoutManager tm = this.m;
       if (tm != null) {
          return new LinearLayoutManager$SavedState(tm);
       }
       LinearLayoutManager$SavedState savedState = new LinearLayoutManager$SavedState();
       if (this.getChildCount() > 0) {
          this.ensureLayoutState();
          int i = this.e ^ this.g;
          savedState.d = i;
          if (i) {
             view = this.c0();
             savedState.c = this.d.i() - this.d.d(view);
             savedState.b = this.getPosition(view);
          }else {
             view = this.d0();
             savedState.b = this.getPosition(view);
             savedState.c = this.d.g(view) - this.d.n();
          }
       }else {
          savedState.b();
       }
       return savedState;
    }
    public final void resolveShouldLayoutReverse(){
       this.g = (this.b == 1 || !this.isLayoutRTL())? this.f: this.f ^ 1;
       return;
    }
    public int scrollBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (!this.getChildCount() || !p0) {
          return 0;
       }
       this.ensureLayoutState();
       boolean b = true;
       this.c.a = b;
       int i = (p0 > 0)? 1: -1;
       int i1 = Math.abs(p0);
       this.R0(i, i1, b, p2);
       LinearLayoutManager tc = this.c;
       int i2 = tc.g + this.Q(p1, tc, p2, 0);
       if (i2 < 0) {
          return 0;
       }else if(i1 > i2){
          p0 = i * i2;
       }
       this.d.t((- p0));
       p1.k = p0;
       return p0;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (this.b == 1) {
          return 0;
       }
       return this.scrollBy(p0, p1, p2);
    }
    public void scrollToPosition(int p0){
       this.j = p0;
       this.k = Integer.MIN_VALUE;
       LinearLayoutManager tm = this.m;
       if (tm != null) {
          tm.b();
       }
       this.requestLayout();
       return;
    }
    public void scrollToPositionWithOffset(int p0,int p1){
       this.j = p0;
       this.k = p1;
       LinearLayoutManager tm = this.m;
       if (tm != null) {
          tm.b();
       }
       this.requestLayout();
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (this.b == null) {
          return 0;
       }
       return this.scrollBy(p0, p1, p2);
    }
    public void setOrientation(int p0){
       if (p0 && p0 != 1) {
          throw new IllegalArgumentException("invalid orientation:"+p0);
       }
       this.assertNotInLayoutOrScroll(null);
       if (p0 != this.b || this.d == null) {
          s os = s.b(this, p0);
          this.d = os;
          this.n.a = os;
          this.b = p0;
          this.requestLayout();
       }
       return;
    }
    public void setReverseLayout(boolean p0){
       this.assertNotInLayoutOrScroll(null);
       if (p0 == this.f) {
          return;
       }
       this.f = p0;
       this.requestLayout();
       return;
    }
    public boolean shouldMeasureTwice(){
       boolean b = (this.getHeightMode() != 0x40000000 && (this.getWidthMode() != 0x40000000 && this.hasFlexibleChildInBothOrientations()))? true: false;
       return b;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       o oo = new o(p0.getContext());
       oo.p(p2);
       this.startSmoothScroll(oo);
    }
    public boolean supportsPredictiveItemAnimations(){
       boolean b = (this.m == null && this.e == this.h)? true: false;
       return b;
    }
}
