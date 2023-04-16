package ai2.d;
import io.reactivex.g;
import ai2.e;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import ai2.b;
import brd.g;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class d implements g	// class@0000da
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (this.b.b.b() != null) {
          List list = this.b.b.b();
          a.m(list);
          if (!list.isEmpty()) {
             list = this.b.b.b();
             a.m(list);
             p0.onNext(list);
          label_0042 :
             return;
          }
       }
       p0.onNext(CollectionsKt__CollectionsKt.E());
       goto label_0042 ;
    }
}
