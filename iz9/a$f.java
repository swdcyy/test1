package iz9.a$f;
import erd.g;
import iz9.a;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import qp7.x0;
import qp7.b;
import wr7.g;
import java.util.Objects;
import pp7.b;
import java.lang.StringBuilder;

public final class a$f implements g	// class@0028d1
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       float f = p0.floatValue();
       a$f uof = a$f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, uof, "1")) {
          g og = this.b.E();
          Objects.requireNonNull(og);
          g og1 = g.class;
          if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), og, og1, "7")) {
             og.h.f(Float.valueOf(f));
          }
          if (!f || !f - 0x3f800000) {
             this.b.p0("setAlpha: "+f);
          }
       }
       return;
    }
}
