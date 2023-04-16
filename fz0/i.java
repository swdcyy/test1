package fz0.i;
import lnc.c3$a;
import java.lang.Object;
import mk1.a0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import java.util.Set;

public final class i implements c3$a	// class@0023e4
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final void apply(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, a0.class, "3")) {
       }else {
          b9.a(p0.d);
          p0.a = true;
          p0.b = true;
          p0.c = 0;
          p0.e.clear();
       }
       return;
    }
}
