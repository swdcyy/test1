package b02.b;
import ee3.z;
import java.lang.Object;
import fe3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class b implements z	// class@0002f3
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final d a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String id = mE.getId();
       a.o(id, "QCurrentUser.ME.id");
       return new d(id);
    }
}
