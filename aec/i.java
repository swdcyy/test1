package aec.i;
import erd.g;
import aec.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i implements g	// class@000103
{
    public final d b;

    public void i(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          this.b.R8();
          this.b.P8();
       }
       return;
    }
}
