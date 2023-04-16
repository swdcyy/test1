package b77.s;
import erd.g;
import b77.q;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s implements g	// class@0003ed
{
    public final q b;

    public void s(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
       }else {
          this.b.S8();
       }
       return;
    }
}
