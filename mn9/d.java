package mn9.d;
import io.reactivex.g;
import mn9.f;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import mn9.b;

public final class d implements g	// class@003062
{
    public final f b;
    public final Object c;

    public void d(f p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().s("PostListComponentRepo", "loadDataList with dataProvider: "+this.b.a, objArray);
       d tc = this.c;
       if (tc != null) {
          this.b.a.g(p0, tc);
       }else {
          this.b.a.b(p0);
       }
       return;
    }
}
