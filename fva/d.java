package fva.d;
import erd.g;
import fva.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class d implements g	// class@002a06
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, d.class, "1")) {
          this.b.R8();
       }
       return;
    }
}
