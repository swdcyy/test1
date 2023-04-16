package ac3.f;
import ac3.e;
import ac3.i;
import hf3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class f extends e	// class@000069
{
    public final boolean a;

    public void f(boolean p0){
       super();
       this.a = p0;
    }
    public b b(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "connectionConfig");
       b uob = super.b(p0);
       uob.e = true;
       uob.f = this.a;
       return uob;
    }
}
