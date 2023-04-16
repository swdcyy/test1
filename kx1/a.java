package kx1.a;
import java.lang.Object;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveWidgetConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;

public class a	// class@002e17
{

    public void a(){
       super();
    }
    public static LiveConfigStartupResponse$LiveInteractiveWidgetConfig a(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().u("SOURCE_LIVE").getValue("liveInteractiveWidgetConfig", LiveConfigStartupResponse$LiveInteractiveWidgetConfig.class, LiveConfigStartupResponse$LiveInteractiveWidgetConfig.createDefaultConfig());
    }
}
