package b02.c;
import erd.g;
import ee1.a;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public final class c implements g	// class@0002f4
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       long l = p0.longValue();
       p0 = c.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, p0, "1")) {
          this.b.h0(l);
       }
       return;
    }
}
