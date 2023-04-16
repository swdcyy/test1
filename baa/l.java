package baa.l;
import erd.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class l implements o	// class@00043b
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          a.p(p0, "it");
       }
       return l1.a;
    }
}
