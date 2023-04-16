package fva.c;
import erd.g;
import fva.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class c implements g	// class@002a05
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, c.class, "1")) {
          this.b.R8();
       }
       return;
    }
}
