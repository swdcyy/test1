package fia.z$f;
import erd.g;
import fia.z;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import bia.d;

public final class z$f implements g	// class@002942
{
    public final z b;

    public void z$f(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       z$f uof = z$f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uof, "1")) {
          this.b.Y8();
          if (b) {
             z.R8(this.b).e(true);
          }
       }
       return;
    }
}
