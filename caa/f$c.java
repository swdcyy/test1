package caa.f$c;
import erd.o;
import java.lang.Object;
import daa.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import kotlin.jvm.internal.a;

public final class f$c implements o	// class@000590
{
    public static final f$c b;

    static {
       f$c.b = new f$c();
    }
    public void f$c(){
       super();
    }
    public Object apply(Object p0){
       h oh = PatchProxy.applyOneRefs(p0, this, f$c.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          oh = p0.configs;
       }
       return oh;
    }
}
