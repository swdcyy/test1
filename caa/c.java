package caa.c;
import erd.g;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import caa.e;

public final class c implements g	// class@00058b
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       e.b = true;
       e.c = false;
       this.b.invoke();
       return;
    }
}
