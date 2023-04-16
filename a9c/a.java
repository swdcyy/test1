package a9c.a;
import u2.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import lnc.n8;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.i3;
import java.lang.Number;
import java.lang.Boolean;

public final class a implements f	// class@0000ab
{
    public final RecyclerView$Adapter a;
    public n8 b;

    public void a(RecyclerView$Adapter p0){
       super();
       this.a = p0;
    }
    public void a(RecyclerView$Adapter p0,n8 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.a.s0(p0, p1);
       a tb = this.b;
       if (tb != null) {
          i3 oi3 = i3.f();
          oi3.d("action", "calculateDiffAfter");
          oi3.c("adapterCount", Integer.valueOf(this.a.getItemCount()));
          oi3.a("directNotify", Boolean.FALSE);
          oi3.d("notify", "onRemoved");
          oi3.d("position", "position");
          oi3.d("count", "count");
          tb.a(oi3.e());
       }
       return;
    }
    public void b(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "4")) {
          return;
       }
       this.a.q0(p0, p1, p2);
       a tb = this.b;
       if (tb != null) {
          i3 oi3 = i3.f();
          oi3.d("action", "calculateDiffAfter");
          oi3.c("adapterCount", Integer.valueOf(this.a.getItemCount()));
          oi3.a("directNotify", Boolean.FALSE);
          oi3.d("notify", "onChanged");
          oi3.d("position", "position");
          oi3.d("count", "count");
          tb.a(oi3.e());
       }
       return;
    }
    public void c(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.r0(p0, p1);
       a tb = this.b;
       if (tb != null) {
          i3 oi3 = i3.f();
          oi3.d("action", "calculateDiffAfter");
          oi3.c("adapterCount", Integer.valueOf(this.a.getItemCount()));
          oi3.a("directNotify", Boolean.FALSE);
          oi3.d("notify", "onInserted");
          oi3.d("position", "position");
          oi3.d("count", "count");
          tb.a(oi3.e());
       }
       return;
    }
    public void d(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       this.a.o0(p0, p1);
       a tb = this.b;
       if (tb != null) {
          i3 oi3 = i3.f();
          oi3.d("action", "calculateDiffAfter");
          oi3.c("adapterCount", Integer.valueOf(this.a.getItemCount()));
          oi3.a("directNotify", Boolean.FALSE);
          oi3.d("notify", "onMoved");
          oi3.d("position", "position");
          oi3.d("count", "count");
          tb.a(oi3.e());
       }
       return;
    }
}
