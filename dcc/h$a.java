package dcc.h$a;
import erd.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class h$a implements o	// class@002176
{
    public static final h$a b;

    static {
       h$a.b = new h$a();
    }
    public void h$a(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, h$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "user1");
          uBoolean = Boolean.valueOf(p0.mHasReverseRemoved);
       }
       return uBoolean;
    }
}
