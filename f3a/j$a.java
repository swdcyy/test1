package f3a.j$a;
import qvb.q;
import f3a.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import y8c.t;
import qvb.p;
import f3a.i;
import qvb.i;
import java.util.Objects;
import com.yxcorp.gifshow.fragment.e;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.view.View;
import g9c.d;

public class j$a implements q	// class@002285
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       this.b.q.x();
       this.b.q.k(p0, p1);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, j$a.class, "1")) {
          return;
       }
       this.b.q.d(p0);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
    }
    public void v2(boolean p0,boolean p1){
       j q;
       i i;
       i oi = i.class;
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.b.q.x();
       j$a tb = this.b;
       if (tb.q instanceof i) {
          Object[] objArray = null;
          if (tb.p.isEmpty()) {
             q = this.b.q;
             Objects.requireNonNull(q);
             if (!PatchProxy.applyVoid(objArray, q, oi, "4")) {
                e f = q.f;
                if (f != null) {
                   f.setVisibility(8);
                }
                i = q.i;
                if (i != null) {
                   i.setVisibility(0);
                }
             }
          }else {
             q = this.b.q;
             Objects.requireNonNull(q);
             if (!PatchProxy.applyVoid(objArray, q, oi, "3") && q.c.U0(q.j)) {
                q.c.m1(q.j);
             }
          }
       }
       return;
    }
}
