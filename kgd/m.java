package kgd.m;
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

public final class m implements o	// class@0017a5
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public Object apply(Object p0){
       Result result = PatchProxy.applyOneRefs(p0, this, m.class, "1");
       if (result != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          result = Result.box-impl(Result.constructor-impl(j0.a(p0)));
       }
       return result;
    }
}
