package e1b.a;
import nl8.a;
import z0.a;
import erd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y0b.h;
import y0b.j;
import z0b.b;
import i1b.c;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$i;
import i1b.b;
import z0b.c;

public class a extends a	// class@0025e6
{
    public RecyclerView$i u;
    public final g v;
    public final a w;

    public void a(){
       super(null, null);
    }
    public void a(a p0){
       super(p0, null);
    }
    public void a(a p0,g p1){
       super();
       this.w = p0;
       this.v = null;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.u == null) {
          j oj = this.W8();
          b uob = this.P8();
          a tv = this.v;
          a tw = this.w;
          b uob1 = PatchProxy.applyFourRefs(oj, uob, tv, tw, null, c.class, "2");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob1 = new b(oj, tw, uob, tv);
          }
          this.u = uob1;
       }
       this.P8().C0().F0(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       try{
          if (this.u != null) {
             this.P8().C0().I0(this.u);
          }
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
}
