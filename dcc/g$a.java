package dcc.g$a;
import erd.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class g$a implements o	// class@002172
{
    public static final g$a b;

    static {
       g$a.b = new g$a();
    }
    public void g$a(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "user1");
          uBoolean = Boolean.valueOf(p0.mHasRemoved);
       }
       return uBoolean;
    }
}
