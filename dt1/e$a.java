package dt1.e$a;
import z0.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dt1.f;
import kotlin.jvm.internal.a;
import dt1.f$a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import lu7.f;
import dt1.f$b;

public final class e$a implements a	// class@002018
{
    public static final e$a a;

    static {
       e$a.a = new e$a();
    }
    public void e$a(){
       super();
    }
    public Object apply(Object p0){
       f$a uoa = PatchProxy.applyOneRefs(p0, this, e$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else if(a.g(p0, Boolean.TRUE)){
          p0 = f.p(QCurrentUser.me());
          a.o(p0, "UserExt.toUserInfo\(QCurrentUser.me\(\)\)");
          uoa = new f$a(p0);
       }else {
          uoa = f$b.a;
       }
       return uoa;
    }
}
