package bb3.d;
import z1.a;
import bb3.e;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class d implements a	// class@00035d
{
    public final e a;

    public void d(e p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.a.b().onNext(p0);
       }
       return;
    }
}
