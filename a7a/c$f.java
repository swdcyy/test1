package a7a.c$f;
import erd.g;
import a7a.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class c$f implements g	// class@000047
{
    public final c b;

    public void c$f(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.c9(7);
          }else {
             this.b.b9(7);
          }
          PatchProxy.onMethodExit(c$f.class, "1");
       }
       return;
    }
}
