package bo1.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import d61.m;

public final class e	// class@0003d0
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "message");
       m.a(new IllegalStateException(p0));
       return;
    }
}
