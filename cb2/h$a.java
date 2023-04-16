package cb2.h$a;
import wq5.b;
import cb2.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import pm8.a;

public class h$a extends b	// class@000507
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0 - 0x3f800000 < 0) {
          a.C1(true);
       }
       return;
    }
}
