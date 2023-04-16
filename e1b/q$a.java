package e1b.q$a;
import qvb.q;
import e1b.q;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import f1b.d;
import f1b.a;
import java.util.List;
import qvb.p;
import androidx.recyclerview.widget.RecyclerView;
import z0b.b;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import f1b.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class q$a implements q	// class@0025fc
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
    }
    public void Z1(boolean p0,boolean p1){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       q v = this.b.v;
       Objects.requireNonNull(v);
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), v, uod, "6") && p0)) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, v, uod, "8")) {
             v.b();
             v.a();
             d e = v.e;
             if (e != null && !PatchProxy.applyVoid(objArray, e, a.class, "4")) {
                e.a();
                e.b.clear();
             }
          }
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
    }
    public void v2(boolean p0,boolean p1){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       q v = this.b.v;
       Objects.requireNonNull(v);
       if (!PatchProxy.applyVoid(null, v, d.class, "5")) {
          d b = v.b;
          if (b != null) {
             b.h0().getViewTreeObserver().addOnGlobalLayoutListener(new c(v));
          }
       }
       return;
    }
}
