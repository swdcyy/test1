package g79.b$a;
import io.reactivex.g;
import g79.b;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k79.f;
import brd.g;

public final class b$a implements g	// class@002427
{
    public final b b;
    public final int c;

    public void b$a(b p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.q(p0, "it");
       p0.onNext(this.b.h(this.c));
       return;
    }
}
