package qd6.a;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.feature.core.receiver.a;
import kotlin.Pair;
import com.kwai.framework.plugin.qigsaw.receiver.MainProcessReceiver;
import qrd.r0;
import com.kwai.framework.plugin.qigsaw.receiver.CloudGameProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniGame0ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniGame1ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniGame2ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniGame3ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniGame4ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniGame5ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniApp0ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniApp1ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniApp2ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniApp3ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.MiniApp4ProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.CommonMiniServiceProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.CompatibilityProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.RemoteProcessReceiver;
import com.kwai.framework.plugin.qigsaw.receiver.DpbenchmarkProcessReceiver;
import java.util.Map;
import trd.t0;
import java.util.Objects;
import android.app.Application;

public final class a	// class@002268
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(Context p0){
       a a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       String str1 = "app";
       a.p(p0, str1);
       a = a.a;
       Pair[] pairArray = new Pair[17];
       pairArray[0] = r0.a("", MainProcessReceiver.class);
       pairArray[1] = r0.a(":cloudgame", CloudGameProcessReceiver.class);
       pairArray[2] = r0.a(":sogame0", MiniGame0ProcessReceiver.class);
       pairArray[3] = r0.a(":sogame1", MiniGame1ProcessReceiver.class);
       pairArray[4] = r0.a(":sogame2", MiniGame2ProcessReceiver.class);
       pairArray[5] = r0.a(":sogame3", MiniGame3ProcessReceiver.class);
       pairArray[6] = r0.a(":sogame4", MiniGame4ProcessReceiver.class);
       pairArray[7] = r0.a(":sogame5", MiniGame5ProcessReceiver.class);
       pairArray[8] = r0.a(":mini0", MiniApp0ProcessReceiver.class);
       pairArray[9] = r0.a(":mini1", MiniApp1ProcessReceiver.class);
       pairArray[10] = r0.a(":mini2", MiniApp2ProcessReceiver.class);
       pairArray[11] = r0.a(":mini3", MiniApp3ProcessReceiver.class);
       pairArray[12] = r0.a(":mini4", MiniApp4ProcessReceiver.class);
       pairArray[13] = r0.a(":commonMiniService", CommonMiniServiceProcessReceiver.class);
       pairArray[14] = r0.a(":compatibility", CompatibilityProcessReceiver.class);
       pairArray[15] = r0.a(":remote", RemoteProcessReceiver.class);
       pairArray[16] = r0.a(":dpbenchmark", DpbenchmarkProcessReceiver.class);
       Map map = t0.W(pairArray);
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(p0, map, a, a.class, str)) {
          a.p(p0, str1);
          a.p(map, "processToReceiverMap");
          if (!p0 instanceof Application) {
             p0 = p0.getApplicationContext();
             a.o(p0, "app.applicationContext");
          }
          a.b = p0;
          a.c = map;
       }
       return;
    }
}
