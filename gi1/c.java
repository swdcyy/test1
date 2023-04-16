package gi1.c;
import java.lang.Object;
import h03.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pz2.c;

public class c	// class@0024ee
{

    public void c(){
       super();
    }
    public static boolean a(a p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 == 1) {
          c uoc1 = p0.H();
          if (uoc1 == null) {
             return 1;
          }else if(uoc1.z() < 0x7ffffbb3){
             return 1;
          }
       }
       return false;
    }
}
