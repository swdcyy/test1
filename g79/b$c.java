package g79.b$c;
import io.reactivex.g;
import g79.b;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k79.f;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import r79.c;
import com.yxcorp.gifshow.models.QMedia;
import brd.g;

public final class b$c implements g	// class@002429
{
    public final b b;
    public final int c;
    public final int d;

    public void b$c(b p0,int p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       f uof = this.b.h(this.c);
       Iterator iterator = uof.f(0, (this.d - 1)).iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (uoc instanceof QMedia) {
             p0.onNext(uoc);
          }
       }
       p0.onComplete();
       uof.close();
       return;
    }
}
