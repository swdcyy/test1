package cx8.a$a$a;
import io.reactivex.g;
import cx8.a$a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cx8.a$a$a$a;
import erd.f;
import ce6.a;

public final class a$a$a implements g	// class@002006
{
    public final a$a b;

    public void a$a$a(a$a p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       a$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       this.b.e(p0);
       p0.setCancellable(a$a$a$a.a);
       a = this.b.a;
       a.m(a);
       a.b4();
       return;
    }
}
