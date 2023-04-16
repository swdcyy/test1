package bi5.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.kwai.soc.arch.rubas.base.Rubas;

public class b	// class@0004a9
{

    public void b(){
       super();
    }
    public static void a(String p0,String p1,String p2,String p3,String p4,String p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "4")) {
             return;
          }
       }
       HashMap hashMap = new HashMap();
       hashMap.put("channel", p0);
       hashMap.put("namespace", p1);
       hashMap.put("bridge", p2);
       hashMap.put("moduleId", p3+"\("+p4+"\)");
       Rubas.d(p5, hashMap);
       return;
    }
}
