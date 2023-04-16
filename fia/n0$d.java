package fia.n0$d;
import erd.g;
import fia.n0;
import java.lang.Object;
import wca.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class n0$d implements g	// class@002929
{
    public final n0 b;

    public void n0$d(n0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$d.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.onFollowPreRequestEvent(p0);
       }
       return;
    }
}
