package d4b.l;
import erd.g;
import d4b.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import kotlin.jvm.internal.a;
import d4b.a$a;

public final class l implements g	// class@002435
{
    public final h b;

    public void l(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("MagicRepository", "requestAndSaveData success", objArray);
          l tb = this.b;
          tb.f = false;
          a.o(p0, "resultList");
          tb.b.Q6(p0);
       }
       return;
    }
}
