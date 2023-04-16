package dhd.a$d;
import erd.g;
import dhd.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import ihc.a;
import lhc.b;

public final class a$d implements g	// class@000cc7
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          a.p(p0, "visibleCacheSize");
          b.a(this.b.getStatus(), p0);
       }
       return;
    }
}
