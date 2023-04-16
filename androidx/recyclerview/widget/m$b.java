package androidx.recyclerview.widget.m$b;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.m;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import a2.f;
import androidx.recyclerview.widget.m$g;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.List;
import androidx.recyclerview.widget.m$e;
import android.view.VelocityTracker;
import java.lang.Runnable;
import android.view.ViewGroup;

public class m$b implements RecyclerView$q	// class@00091f
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       m$b tb;
       this.b.A.a(p1);
       int actionMasked = p1.getActionMasked();
       boolean b = true;
       if (!actionMasked) {
          actionMasked.m = p1.getPointerId(0);
          actionMasked.e = p1.getX();
          actionMasked.f = p1.getY();
          this.b.t();
          tb = this.b;
          if (tb.d == null) {
             m$g og = tb.l(p1);
             if (og != null) {
                m$b tb1 = this.b;
                tb1.e = tb1.e - og.j;
                tb1.f = tb1.f - og.k;
                tb1.k(og.e, b);
                if (this.b.b.remove(og.e.itemView)) {
                   tb1 = this.b;
                   tb1.n.c(tb1.s, og.e);
                }
                this.b.y(og.e, og.f);
                tb = this.b;
                tb.E(p1, tb.p, 0);
             }
          }
       }else {
          int i = -1;
          if (actionMasked == 3 || actionMasked == b) {
             tb = this.b;
             tb.m = i;
             tb.y(null, 0);
          }else {
             m m = this.b.m;
             if (m != i) {
                int i1 = p1.findPointerIndex(m);
                if (i1 >= 0) {
                   this.b.h(actionMasked, p1, i1);
                }
             }
          }
       }
       m u = this.b.u;
       if (u != null) {
          u.addMovement(p1);
       }
       if (this.b.d == null) {
          b = false;
       }
       return b;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
       if (!p0) {
          return;
       }
       this.b.y(null, 0);
       return;
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
       this.b.A.a(p1);
       m u = this.b.u;
       if (u != null) {
          u.addMovement(p1);
       }
       int i = -1;
       if (this.b.m == i) {
          return;
       }else {
          int actionMasked = p1.getActionMasked();
          int i1 = p1.findPointerIndex(this.b.m);
          if (i1 >= 0) {
             this.b.h(actionMasked, p1, i1);
          }
          m$b tb = this.b;
          m d = tb.d;
          if (d == null) {
             return;
          }else {
             int i2 = 0;
             if (actionMasked != 1) {
                if (actionMasked != 2) {
                   if (actionMasked != 3) {
                      if (actionMasked == 6) {
                         actionMasked = p1.getActionIndex();
                         m$b tb1 = this.b;
                         if (p1.getPointerId(actionMasked) == tb1.m) {
                            if (!actionMasked) {
                               i2 = 1;
                            }
                            tb1.m = p1.getPointerId(i2);
                            m$b tb2 = this.b;
                            tb2.E(p1, tb2.p, actionMasked);
                         }
                      }
                   }else {
                      u = tb.u;
                      if (u != null) {
                         u.clear();
                      label_008b :
                         this.b.y(null, i2);
                         u.m = i;
                      }else {
                         goto label_008b ;
                      }
                   }
                }else if(i1 >= 0){
                   tb.E(p1, tb.p, i1);
                   this.b.s(d);
                   m$b tb3 = this.b;
                   tb3.s.removeCallbacks(tb3.t);
                   this.b.t.run();
                   this.b.s.invalidate();
                }
             }else {
                goto label_008b ;
             }
             return;
          }
       }
    }
}
