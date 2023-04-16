package el9.k0$a;
import androidx.recyclerview.widget.RecyclerView$r;
import el9.k0;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import pk9.i;
import xl8.b;
import java.util.Set;
import java.util.Iterator;
import xk9.n;
import l17.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import im8.f;
import java.util.Objects;
import android.os.SystemClock;
import java.lang.Math;
import pk9.i$a;

public class k0$a extends RecyclerView$r	// class@0021f1
{
    public final k0 a;

    public void k0$a(k0 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       k0$a uoa = k0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       int i = 0;
       if (!p1) {
          k0$a ta = this.a;
          k0 t = ta.t;
          t.d = i;
          t.e = i;
          t.f = 0;
          t.g = i;
          ta.s.d(Integer.valueOf(i));
       }
       if (this.a.p.isEmpty()) {
          return;
       }else {
          Iterator iterator = this.a.p.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          if (!p1 && !this.a.u.c()) {
             View view = p0.getLayoutManager().findViewByPosition(i);
             if (view != null && (- view.getTop()) != this.a.r.get().intValue()) {
                this.a.r.set(Integer.valueOf((- view.getTop())));
             }
          }
          return;
       }
    }
    public void b(RecyclerView p0,int p1,int p2){
       int i;
       if (PatchProxy.isSupport(k0$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, k0$a.class, "1")) {
          return;
       }
       k0 t = this.a.t;
       Objects.requireNonNull(t);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), t, oi, "1")) {
          t.e = t.e + p2;
          i = t.d + 1;
          t.d = i;
          if (i >= t.c) {
             long l = SystemClock.uptimeMillis();
             i e = t.e;
             if (e != null) {
                i f = t.f;
                if (f > 0 && l - f > 0) {
                   i = (int)((long)(e * 1000) / (l - f));
                   if (!PatchProxy.isSupport(oi) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), t, oi, "2") && i != t.g)) {
                      t.g = i;
                      if (t.h != null) {
                         if (Math.abs(i) < t.b) {
                            t.h = false;
                            oi = t.i;
                            if (oi != null) {
                               oi.b();
                            }
                         }
                      }else if(Math.abs(i) > t.a){
                         t.h = true;
                         oi = t.i;
                         if (oi != null) {
                            oi.a();
                         }
                      }
                   }
                }
             }
             t.e = 0;
             t.d = 0;
             t.f = l;
          }
       }
       t = this.a.r;
       t.set(Integer.valueOf((t.get().intValue() + p2)));
       if (this.a.p.isEmpty()) {
          return;
       }else {
          Iterator iterator = this.a.p.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p1, p2);
          }
          return;
       }
    }
}
