package az3.g;
import erd.g;
import az3.f;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements g	// class@0002de
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          this.b.R8();
       }
       return;
    }
}
