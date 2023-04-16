package b8a.l1$b;
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

public final class l1$b implements g	// class@0003bf
{
    public static final l1$b b;

    static {
       l1$b.b = new l1$b();
    }
    public void l1$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1$b.class, "1")) {
       }else {
          a.p(p0, "e");
          o.C().e("KTV_RECORD", "enter ktv load plugin error", p0);
          ExceptionHandler.handleCaughtException(p0);
       }
       return;
    }
}
