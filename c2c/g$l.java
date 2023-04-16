package c2c.g$l;
import erd.g;
import c2c.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class g$l implements g	// class@00050a
{
    public final g b;

    public void g$l(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       g$l ol = g$l.class;
       if (PatchProxy.isSupport(ol) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, ol, "1") && b)) {
          this.b.P8();
       }
       return;
    }
}
