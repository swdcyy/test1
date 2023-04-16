package d11.b;
import brd.x;
import java.lang.Object;
import brd.t;
import brd.w;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import z12.e;
import t45.d;
import brd.z;

public final class b implements x	// class@001ef1
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final w apply(t p0){
       String[] stringArray;
       boolean b = false;
       if (a.t().u("SOURCE_LIVE").d("enableRegisterHeadsetStateInMainThread", b)) {
          stringArray = new String[b];
          e.c("LiveAudienceHeadsetPresenter", "registerHeadsetPlugMonitor on main thread", stringArray);
       }else {
          stringArray = new String[b];
          e.c("LiveAudienceHeadsetPresenter", "registerHeadsetPlugMonitor on async thread", stringArray);
          p0 = p0.subscribeOn(d.c);
       }
       return p0;
    }
}
