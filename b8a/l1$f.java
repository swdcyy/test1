package b8a.l1$f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class l1$f implements g	// class@0003c3
{
    public static final l1$f b;

    static {
       l1$f.b = new l1$f();
    }
    public void l1$f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1$f.class, "1")) {
       }else {
          a.p(p0, "e");
          o.C().e("KTV_RECORD", "enter ktv load plugin error", p0);
          ExceptionHandler.handleCaughtException(p0);
       }
       return;
    }
}
