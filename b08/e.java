package b08.e;
import erd.g;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import f08.f;
import java.lang.StringBuilder;
import java.lang.String;
import kotlin.Pair;
import qrd.r0;
import com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import java.lang.Integer;
import trd.t0;
import f08.f$a;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;

public final class e implements g	// class@0002ed
{
    public final PendantDataServer b;
    public final SignalPendant c;

    public void e(PendantDataServer p0,SignalPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       f$a a;
       e uoe = this;
       Map map = p0;
       e b = uoe.b;
       e c = uoe.c;
       Objects.requireNonNull(b);
       String str = "new signal ";
       if (map) {
          String str1 = "needRequestServer";
          if (map.containsKey(str1)) {
             String str2 = "businessHasRequest";
             if (!map.containsKey(str2)) {
             label_0109 :
                f$a.v(f.a, b.i, str+c.pendantCode+" businessHandleResult is error", null, false, null, 28, null);
             }else {
                Boolean tRUE = Boolean.TRUE;
                boolean b1 = (a.g(map.get(str1), tRUE) && a.g(map.get(str2), Boolean.FALSE))? true: false;
                boolean b2 = (a.g(map.get(str1), tRUE) && a.g(map.get(str2), tRUE))? true: false;
                String obj = map.get("businessData");
                boolean b3 = b.j(c);
                Pair[] pairArray = new Pair[]{r0.a("needRequest", Boolean.valueOf(b1)),r0.a("needPackageBusinessData", Boolean.valueOf(b2)),r0.a("callbackApi", c.callbackApi),r0.a("DACLogLevel", Integer.valueOf(LogLevel.HIGH.getLevel()))};
                f$a.u(f.a, b.i, str+c.pendantCode+" process business handle", false, t0.j0(pairArray), 4, null);
                if (b1) {
                   if (b3) {
                      b.o(c);
                   }else {
                      SignalPendant action = c.action;
                      try{
                         obj = a.a.q(c.throughInfo);
                      }catch(java.lang.Exception e0){
                         Throwable throwable = e0;
                         a = f.a;
                         PendantDataServer i = b.i;
                         Pair[] pairArray1 = new Pair[1];
                         SignalPendant pendantCode = c.pendantCode;
                         if (pendantCode == null) {
                            pendantCode = "";
                         }
                         pairArray1[0] = r0.a("pendantCode", pendantCode);
                         f$a.v(a, i, "new signal throughInfo serialize error", throwable, false, t0.j0(pairArray1), 8, null);
                         a = 0;
                      }
                      str1 = a;
                      b.p(action, str1, c.pendantResourceId, "signaling", c);
                   }
                }else {
                   b.n(b2, c, obj);
                }
             }
          }else {
             goto label_0109 ;
          }
       }else {
          goto label_0109 ;
       }
       return;
    }
}
