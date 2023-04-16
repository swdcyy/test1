package ep8.g;
import androidx.recyclerview.widget.RecyclerView$i;
import ep8.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;

public final class g extends RecyclerView$i	// class@002228
{
    public final d a;

    public void g(d p0){
       super();
       this.a = p0;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.a.k0();
       return;
    }
    public void h(int p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "2")) {
          return;
       }
       this.a.p0(p0, p1);
       return;
    }
    public void i(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, g.class, "3")) {
          return;
       }
       this.a.p0(p0, p1);
       return;
    }
    public void j(int p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "4")) {
          return;
       }
       this.a.r0(p0, p1);
       return;
    }
    public void k(int p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "6")) {
          return;
       }
       this.a.o0(p0, p1);
       return;
    }
    public void l(int p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "5")) {
          return;
       }
       this.a.s0(p0, p1);
       return;
    }
}
