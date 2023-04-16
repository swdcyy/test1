package dcc.e$a;
import erd.o;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class e$a implements o	// class@00216e
{
    public static final e$a b;

    static {
       e$a.b = new e$a();
    }
    public void e$a(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, e$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "user1");
          uBoolean = Boolean.valueOf(p0.mFavorited);
       }
       return uBoolean;
    }
}
