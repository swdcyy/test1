package ap2.e;
import erd.g;
import ap2.g;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import ee1.a;

public final class e implements g	// class@0002a9
{
    public final g b;

    public void e(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       long l = p0.longValue();
       p0 = e.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, p0, "1")) {
          this.b.h.h0(l);
       }
       return;
    }
}
