package ap2.d;
import erd.g;
import ap2.g;
import msd.l;
import java.lang.Object;
import com.kuaishou.live.common.core.basic.heartbeat.HeartbeatResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.utility.SystemUtil;
import x91.d;
import kotlin.Result;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__IndentKt;
import java.lang.NullPointerException;
import java.lang.Throwable;
import qrd.j0;
import java.lang.CharSequence;
import e17.i;

public final class d implements g	// class@0002a8
{
    public final g b;
    public final l c;

    public void d(g p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       d obj;
       StringBuilder str;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "audienceHeartbeat response");
          p0 = p0.heartbeatResult;
          if (p0 != null) {
             p0 = p0.entrySet();
             if (p0 != null) {
                p0 = p0.iterator();
                while (true) {
                   if (p0.hasNext()) {
                      obj = p0.next();
                      Integer key = obj.getKey();
                      str = 3;
                      g og = (key != null && key.intValue() == str)? 1: null;
                      if (!og) {
                         continue ;
                      }
                   }else {
                      obj = null;
                   }
                   if (obj != null) {
                      p0 = obj.getValue();
                      if (p0 != null) {
                         this.c.invoke(p0);
                         obj = this.b;
                         Objects.requireNonNull(obj);
                         if (!PatchProxy.applyVoidOneRefs(p0, obj, g.class, "7") && SystemUtil.K()) {
                            long l = d.a(p0);
                            if (l - null) {
                               p0 = p0.get("errorMsg");
                               str = "\n          debug:–ƒÃ¯«Î«Û ß∞‹ \n          errorCode = ["+l+"]\n          errorMsg = [";
                               if (p0 != null) {
                                  p0 = Result.constructor-impl(StringsKt__IndentKt.p(str+p0+"]\n          "));
                                  if (Result.exceptionOrNull-impl(p0) != null) {
                                     p0 = "";
                                  }
                                  i.d(R.style.arg_RES_7f110668, p0);
                                  break ;
                               }else {
                                  throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
