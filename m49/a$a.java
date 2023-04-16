package m49.a$a;
import java.lang.Object;
import nsd.u;
import android.app.Activity;
import m49.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class a$a	// class@002de9
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final a a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       return new a(p0);
    }
}
