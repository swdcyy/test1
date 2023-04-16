package ll8.d;
import bwd.d;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import bwd.c;
import bwd.a;
import java.lang.Class;
import java.util.Map;
import bwd.b;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import bwd.e;
import txc.d;
import org.greenrobot.eventbus.ThreadMode;
import java.lang.String;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;

public class d implements d	// class@001db0
{
    public static final Map a;
    public static final AtomicBoolean b;

    static {
       d.a = new HashMap();
       d.b = new AtomicBoolean(false);
    }
    public void d(){
       super();
    }
    public static void b(c p0){
       d.a.put(p0.a(), p0);
    }
    public c a(Class p0){
       if (!d.b.getAndSet(true)) {
          e[] uoeArray = new e[true];
          ThreadMode mAIN = ThreadMode.MAIN;
          uoeArray[0] = new e("onEventMainThread", d.class, mAIN);
          d.b(new b(KwaiYodaWebViewActivity.class, true, uoeArray));
          uoeArray = new e[]{new e("onEventMainThread", JsEmitParameter.class, mAIN),new e("onEventMainThread", NetworkTypeMonitor$a.class, mAIN),new e("onEventMainThread", NetworkTypeMonitor$d.class, mAIN),new e("onEventMainThread", NetworkTypeMonitor$c.class, mAIN)};
          d.b(new b(JsNativeEventCommunication.class, true, uoeArray));
       }
       c uoc = d.a.get(p0);
       if (uoc != null) {
          return uoc;
       }else {
          return null;
       }
    }
}
