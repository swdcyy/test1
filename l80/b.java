package l80.b;
import java.lang.Object;
import msd.a;
import l80.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import l80.c;

public final class b	// class@001d65
{

    public static a a(Object p0,a p1,int p2,Object p3){
       p0 = PatchProxy.applyTwoRefs(null, p1, null, b.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(p1, "initializer");
          p0 = new c(p1, null);
       }
       return p0;
    }
}
