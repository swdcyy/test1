package d6b.d$i;
import erd.g;
import d6b.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;

public final class d$i implements g	// class@00245e
{
    public final d b;

    public void d$i(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       d$i oi = d$i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, oi, "1")) {
          if (!b) {
             b = this.b.E;
             if (b != null) {
                b.o();
             }
          }else {
             b = this.b;
             if (b.E == null) {
                b.J = true;
                b.V8(b.A);
             }
          }
       }
       return;
    }
}
