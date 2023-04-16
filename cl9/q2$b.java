package cl9.q2$b;
import qvb.q;
import cl9.q2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import yk9.f;
import qvb.p;
import qvb.i;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;

public final class q2$b implements q	// class@00065a
{
    public final q2 b;

    public void q2$b(q2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       q2$b uob = q2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       if (p0) {
          q2$b tb = this.b;
          if (tb.z != null) {
             tb.z = false;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, q2.class, "5")) {
                q2 x = tb.x;
                if (x == null) {
                   a.S("commentShowPerformanceLogger");
                }
                x.d(false, false, tb.w);
             }
          }
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       q2 y;
       q2$b uob = q2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0) {
          q2$b tb = this.b;
          if (tb.z != null) {
             p1 = false;
             tb.z = p1;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, q2.class, "6")) {
                q2 q = tb.q;
                a.m(q);
                if (q.getCount() >= 5) {
                   p1 = true;
                }
                q = tb.x;
                if (q == null) {
                   a.S("commentShowPerformanceLogger");
                }
                q.d(true, p1, tb.w);
                if (p1) {
                   y = tb.y;
                   if (y == null) {
                      a.S("mCommentsFragment");
                   }
                   RecyclerView recyclerView = y.h0();
                   a.o(recyclerView, "mCommentsFragment.recyclerView");
                   RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
                   Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.ObservableLinearLayoutManager");
                   layoutManage.W0(tb.B);
                }else {
                   y = tb.x;
                   if (y == null) {
                      a.S("commentShowPerformanceLogger");
                   }
                   y.f();
                   q2 x = tb.x;
                   if (x == null) {
                      a.S("commentShowPerformanceLogger");
                   }
                   x.b();
                }
             }
          }
       }
       return;
    }
}
