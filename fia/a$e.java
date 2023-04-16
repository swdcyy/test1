package fia.a$e;
import erd.g;
import fia.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$e implements g	// class@0028e8
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$e.class, "1")) {
       }else {
          a.o(p0, "showStrong");
          this.b.u = p0.booleanValue();
          PatchProxy.onMethodExit(a$e.class, "1");
       }
       return;
    }
}
