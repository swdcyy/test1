package ih1.f$e;
import erd.o;
import java.lang.Object;
import zg1.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import ih1.h;

public final class f$e implements o	// class@0028dd
{
    public static final f$e b;

    static {
       f$e.b = new f$e();
    }
    public void f$e(){
       super();
    }
    public Object apply(Object p0){
       h oh = PatchProxy.applyOneRefs(p0, this, f$e.class, "1");
       if (oh != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          oh = new h(p0);
       }
       return oh;
    }
}
