package lz9.b0$b;
import jta.f;
import lz9.b0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class b0$b extends f	// class@002ecc
{
    public final b0 a;

    public void b0$b(b0 p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       b0$b uob = b0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          this.a.o0();
       }
       return;
    }
}
