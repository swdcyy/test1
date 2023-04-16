package ep8.b;
import androidx.recyclerview.widget.RecyclerView$i;
import ep8.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;

public final class b extends RecyclerView$i	// class@002221
{
    public final d a;

    public void b(d p0){
       super();
       this.a = p0;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.a.k0();
       return;
    }
    public void h(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.a.p0(this.n(p0), p1);
       return;
    }
    public void i(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, b.class, "3")) {
          return;
       }
       this.a.p0(this.n(p0), p1);
       return;
    }
    public void j(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       this.a.r0(this.n(p0), p1);
       return;
    }
    public void k(int p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "6")) {
          return;
       }
       this.a.o0(this.n(p0), this.n(p1));
       return;
    }
    public void l(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "5")) {
          return;
       }
       this.a.s0(this.n(p0), p1);
       return;
    }
    public final int n(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       int i = this.a.M0();
       b ta = this.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.apply(null, ta, d.class, "14");
       int i1 = (obj1 != patchProxyRe)? obj1.intValue(): ta.h.getItemCount();
       return ((i + i1) + p0);
    }
}
