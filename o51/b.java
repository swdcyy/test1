package o51.b;
import com.kuaishou.live.basic.player.LivePlayerNetworkRetryConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;

public class b	// class@003476
{
    public static final LivePlayerNetworkRetryConfig a;

    static {
       b.a = new LivePlayerNetworkRetryConfig();
    }
    public void b(){
       super();
    }
    public static LivePlayerNetworkRetryConfig a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().u("SOURCE_LIVE").getValue("livePlayerRetryScenes", LivePlayerNetworkRetryConfig.class, b.a);
    }
}
