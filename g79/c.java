package g79.c;
import erd.o;
import g79.b$b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import k79.m;

public final class c implements o	// class@00242d
{
    public final b$b b;

    public void c(b$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       List list = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          list = m.i.d(this.b.b);
       }
       return list;
    }
}
