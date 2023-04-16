package a66.f;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.switchs.e;
import com.kwai.framework.switchs.c;
import z1.k;
import uv8.p0;
import com.yxcorp.gifshow.n;
import com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.c;
import com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.a;
import sua.q;
import com.yxcorp.gifshow.homeroot.d;
import com.yxcorp.gifshow.reminder.friend.heartbeat.d;
import com.yxcorp.gifshow.reminder.friend.heartbeat.a;
import zcc.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.reminder.friend.heartbeat.b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class f	// class@00002f
{
    public static final Map a;

    static {
       boolean b;
       f.a = new HashMap();
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, f.class, str)) {
       }else {
          String str1 = "3";
          if (!PatchProxy.applyVoid(objArray, objArray, e.class, str1)) {
             f.b("kswitchReportInfoVer", c.b);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, p0.class, str1)) {
             f.b("tab", n.b);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, c.class, "2")) {
             f.b("lastMyFollowNotifyTime", a.b);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, q.class, str)) {
             f.b("recoTabId", d.b);
          }
          if (!PatchProxy.applyVoid(objArray, objArray, d.class, "2")) {
             f.b("friendTabShownInfo", a.b);
             if (!l.b()) {
                Object obj = PatchProxy.apply(objArray, objArray, l.class, "13");
                b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableReportRedDotConsumeData", false);
                if (!b) {
                }
             }
             f.b("friendTabRedDotClearInfo", b.b);
             goto label_0097 ;
          }
       }
    }
    public void f(){
       super();
    }
    public static Map a(){
       HashMap obj = PatchProxy.apply(null, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       Iterator iterator = f.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object obj1 = uEntry.getValue().get();
          if (obj1 != null) {
             obj.put(uEntry.getKey(), obj1);
          }
       }
       return obj;
    }
    public static void b(String p0,k p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "2")) {
          return;
       }
       f.a.put(p0, p1);
       return;
    }
}
