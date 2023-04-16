package mn9.e;
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

public final class e implements g	// class@003063
{
    public final f b;

    public void e(f p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().s("PostListComponentRepo", "loadMore with dataProvider: "+this.b.a, objArray);
       this.b.a.c(p0);
       return;
    }
}
