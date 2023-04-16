package c87.a;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import lr3.b;
import java.lang.Throwable;
import lr3.d;

public class a	// class@000511
{

    public void a(){
       super();
    }
    public static void a(String p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "5")) {
          return;
       }
       b.g(LocalLifeLiveLogBiz.LIVE_ROOM, p0, p1, p2);
       return;
    }
    public static void b(LocalLifeLiveLogBiz p0,String p1,Map p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       d.a("localLifeLiveMessage", p0, "LocalLifeLive", p1, p2, null, false, 2);
       return;
    }
}
