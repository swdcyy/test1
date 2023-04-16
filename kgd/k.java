package kgd.k;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Result;
import kotlin.jvm.internal.a;
import qrd.j0;

public final class k implements o	// class@00179d
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public Object apply(Object p0){
       Result result = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (result != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          result = Result.box-impl(Result.constructor-impl(j0.a(p0)));
       }
       return result;
    }
}
