package iz9.b$c;
import erd.g;
import iz9.b;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.StringBuilder;

public final class b$c implements g	// class@0028d9
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       float f = p0.floatValue();
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, uoc, "1") && (!f - 0x3f800000 || !f))) {
          this.b.q0("swipeChanged: "+f);
       }
       return;
    }
}
