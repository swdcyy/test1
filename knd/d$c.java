package knd.d$c;
import erd.g;
import knd.d;
import msd.l;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.lang.Boolean;

public final class d$c implements g	// class@0017d9
{
    public final d b;
    public final l c;

    public void d$c(d p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("RecommendTextRepoV2", "loadDefaultRecoTextList list = "+p0, objArray);
          this.b.c.clear();
          a.o(p0, "list");
          this.b.c.addAll(p0);
          this.c.invoke(Boolean.TRUE);
       }
       return;
    }
}
