package androidx.drawerlayout.widget.DrawerLayout$b;
import a2.a;
import androidx.drawerlayout.widget.DrawerLayout;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Object;
import b2.d;
import android.view.ViewParent;
import a2.i0;
import android.view.ViewGroup;
import java.lang.String;
import java.lang.Class;
import b2.d$a;

public class DrawerLayout$b extends a	// class@00073d
{
    public final Rect d;
    public final DrawerLayout e;

    public void DrawerLayout$b(DrawerLayout p0){
       this.e = p0;
       super();
       this.d = new Rect();
    }
    public boolean a(View p0,AccessibilityEvent p1){
       if (p1.getEventType() != 32) {
          return super.a(p0, p1);
       }
       List text = p1.getText();
       View view = this.e.p();
       if (view != null) {
          CharSequence uCharSequenc = this.e.s(this.e.t(view));
          if (uCharSequenc != null) {
             text.add(uCharSequenc);
          }
       }
       return true;
    }
    public void f(View p0,d p1){
       if (DrawerLayout.O) {
          super.f(p0, p1);
       }else {
          d uod = d.O(p1);
          super.f(p0, uod);
          p1.z0(p0);
          ViewParent viewParent = i0.I(p0);
          if (viewParent instanceof View) {
             p1.r0(viewParent);
          }
          this.m(p1, uod);
          uod.Q();
          this.l(p1, p0);
       }
       p1.a0(DrawerLayout.class.getName());
       p1.j0(false);
       p1.k0(false);
       p1.R(d$a.e);
       p1.R(d$a.f);
       return;
    }
    public boolean g(ViewGroup p0,View p1,AccessibilityEvent p2){
       if (DrawerLayout.O || DrawerLayout.A(p1)) {
          return super.g(p0, p1, p2);
       }
       return false;
    }
    public final void l(d p0,ViewGroup p1){
       int childCount = p1.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p1.getChildAt(i);
          if (DrawerLayout.A(childAt)) {
             p0.c(childAt);
          }
          i = i + 1;
       }
       return;
    }
    public final void m(d p0,d p1){
       DrawerLayout$b td = this.d;
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
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
       p1.setClassName(DrawerLayout.class.getName());
    }
}
