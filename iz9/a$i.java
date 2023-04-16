package iz9.a$i;
import erd.g;
import iz9.a;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import qp7.x0;
import qp7.b;
import wr7.g;
import java.util.Objects;
import pp7.b;

public final class a$i implements g	// class@0028d4
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       a$i oi = a$i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oi, "1")) {
          g og = this.b.E();
          Objects.requireNonNull(og);
          g og1 = g.class;
          if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), og, og1, "1")) {
             og.e.f(Integer.valueOf(i));
          }
       }
       return;
    }
}
