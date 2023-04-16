package n2b.g;
import java.util.HashMap;
import java.lang.Object;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.util.List;
import java.util.Iterator;

public class g	// class@001f06
{
    public static boolean a;
    public static boolean b;
    public static Context c;
    public static Map d;
    public static Map e;
    public static boolean f;

    static {
       g.d = new HashMap();
       g.e = new HashMap();
       g.f = false;
    }
    public void g(){
       super();
    }
    public static String a(ClientLog$ReportEvent p0,boolean p1){
       String str = "";
       if (p0 == null) {
          return str;
       }
       ClientLog$ReportEvent eventPackage = p0.eventPackage;
       if (eventPackage != null) {
          ClientEvent$EventPackage showEvent = eventPackage.showEvent;
          if (showEvent != null) {
             if (p1) {
                str = "show";
             }else {
                ClientEvent$ShowEvent action = showEvent.action;
                String str1 = (action != 1 && (action == 2 || action == 3))? "pageShow": "elementShow";
                str = str1;
             }
          }else if(eventPackage.clickEvent != null){
             str = "click";
          }else if(eventPackage.taskEvent != null){
             str = "task";
          }
       }else {
          p0 = p0.statPackage;
          if (p0 != null) {
             if (p0.videoStatEvent != null) {
                str = "videoStat";
             }else if(p0.audienceStatEvent != null){
                str = "audienceStat";
             }else if(p0.livePlayBizStatEvent != null){
                str = "livePlayBizStat";
             }
          }
       }
       return str;
    }
    public static boolean b(){
       Map obj = PatchProxy.apply(null, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!g.b) {
          return false;
       }
       if (g.f) {
          return true;
       }
       obj = g.e;
       if (obj != null && !obj.isEmpty()) {
          String str = "all";
          if (g.e.containsKey(str)) {
             obj = g.e.get(str);
             if (obj != null && !obj.isEmpty()) {
                str = "global_attr";
                if (obj.containsKey(str)) {
                   List list = obj.get(str);
                   if (list != null && !list.isEmpty()) {
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         if ((iterator.next()).equals("entry_tag")) {
                            g.f = true;
                            return true;
                         }
                      }
                   }
                }
             }
          }
       }
       return false;
    }
}
