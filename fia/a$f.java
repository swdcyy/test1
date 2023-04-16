package fia.a$f;
import erd.g;
import fia.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.Objects;

public final class a$f implements g	// class@0028e9
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       a$f uof = a$f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uof, "1")) {
          Objects.requireNonNull(this.b);
          if (!b) {
             a.E = 0;
          }
       }
       return;
    }
}
