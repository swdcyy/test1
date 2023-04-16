package b2d.a;
import z1d.d$b;
import java.lang.Object;
import z1d.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$b;

public final class a implements d$b	// class@000319
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "launcher");
       d.f(p0, LoginPageLauncher$LoginType.PHONE_ONE_KEY_V4_LOGIN, 0, null, 6, null);
       return;
    }
}
