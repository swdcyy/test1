package c31.h$b;
import c31.h$a;
import c31.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import dk2.b;

public class h$b implements h$a	// class@000464
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.q.c(p0);
       return;
    }
}
