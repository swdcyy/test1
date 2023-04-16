package e1b.o;
import e1b.n;
import e1b.o$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import qvb.q;
import qvb.j;
import java.util.Map;
import java.lang.Boolean;

public abstract class o extends n	// class@0025f9
{
    public q x;

    public void o(){
       super();
       this.x = new o$a(this);
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oo, "2") && this.q() != null) {
          this.q().h(this.x);
       }
       return;
    }
    public void b9(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "3")) {
          return;
       }
       if (this.e9()) {
          this.q().load();
          p0.put("can_consume_loadmore", Boolean.valueOf(this.e9()));
       }
       return;
    }
    public abstract boolean e9();
    public abstract i q();
}
