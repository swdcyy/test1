package ne.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class c	// class@0026f6
{

    public void c(){
       super();
    }
    public static int a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return Math.min(Math.max(0, (p2 - p0)), p1);
    }
}
