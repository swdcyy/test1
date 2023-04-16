package mb1.c;
import java.lang.Object;
import ry1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import kotlin.jvm.internal.a;

public final class c	// class@003149
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public static final boolean a(b p0){
       Boolean uBoolean = null;
       Object obj = PatchProxy.applyOneRefs(p0, uBoolean, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          LiveUserStatusResponse liveUserStat = p0.D1();
          if (liveUserStat != null) {
             boolean b = (liveUserStat.mIsAnonymousLive == null && liveUserStat.mGemsCollectorNeedAnonymous != null)? true: false;
             uBoolean = Boolean.valueOf(b);
          }
       }
       return a.g(uBoolean, Boolean.TRUE);
    }
}
