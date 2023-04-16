package caa.f$a;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import daa.h;
import kotlin.jvm.internal.a;

public final class f$a implements o	// class@00058e
{
    public static final f$a b;

    static {
       f$a.b = new f$a();
    }
    public void f$a(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
       }
       return obj;
    }
}
