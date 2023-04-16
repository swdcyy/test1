package bx8.k$f;
import erd.r;
import java.lang.Object;
import java.lang.Double;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public final class k$f implements r	// class@00047e
{
    public static final k$f b;

    static {
       k$f.b = new k$f();
    }
    public void k$f(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, k$f.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.b().w("ShareReEditRepo", "progress: "+p0, objArray);
          b = a.g(p0, Double.valueOf(200.00f));
       }
       return b;
    }
}
