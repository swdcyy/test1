package yk4.i;
import qvb.n0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import qvb.a;
import qvb.o;

public abstract class i extends n0	// class@0038af
{

    public void i(){
       super();
    }
    public void V1(){
       i oi = i.class;
       if (PatchProxy.applyVoid(null, this, oi, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, oi, "2")) {
          this.c.k(true);
       }
       return;
    }
    public void W1(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.p0();
       this.invalidate();
       this.load();
       return;
    }
}
