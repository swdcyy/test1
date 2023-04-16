package androidx.slidingpanelayout.widget.SlidingPaneLayout$a;
import a2.a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import android.graphics.Rect;
import android.view.View;
import b2.d;
import java.lang.String;
import java.lang.Class;
import java.lang.CharSequence;
import android.view.ViewParent;
import a2.i0;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class SlidingPaneLayout$a extends a	// class@00098f
{
    public final Rect d;
    public final SlidingPaneLayout e;

    public void SlidingPaneLayout$a(SlidingPaneLayout p0){
       this.e = p0;
       super();
       this.d = new Rect();
    }
    public void f(View p0,d p1){
       d uod = d.O(p1);
       super.f(p0, uod);
       this.l(p1, uod);
       uod.Q();
       p1.a0(SlidingPaneLayout.class.getName());
       p1.z0(p0);
       ViewParent viewParent = i0.I(p0);
       if (viewParent instanceof View) {
          p1.r0(viewParent);
       }
       int childCount = this.e.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.e.getChildAt(i);
          if (!this.m(childAt) && !childAt.getVisibility()) {
             i0.D0(childAt, 1);
             p1.c(childAt);
          }
          i = i + 1;
       }
       return;
    }
    public boolean g(ViewGroup p0,View p1,AccessibilityEvent p2){
       if (!this.m(p1)) {
          return super.g(p0, p1, p2);
       }
       return false;
    }
    public final void l(d p0,d p1){
       SlidingPaneLayout$a td = this.d;
       p1.l(td);
       p0.V(td);
       p1.m(td);
       p0.W(td);
       p0.E0(p1.L());
       p0.p0(p1.u());
       p0.a0(p1.o());
       p0.e0(p1.q());
       p0.h0(p1.E());
       p0.b0(p1.D());
       p0.j0(p1.F());
       p0.k0(p1.G());
       p0.T(p1.A());
       p0.x0(p1.K());
       p0.n0(p1.H());
       p0.a(p1.k());
       p0.o0(p1.s());
    }
    public boolean m(View p0){
       return this.e.isDimmed(p0);
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
       p1.setClassName(SlidingPaneLayout.class.getName());
    }
}
