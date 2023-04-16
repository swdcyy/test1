package au1.c;
import yt1.b;
import java.lang.Object;
import yt1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import au1.c$a;
import au1.c$d;
import au1.c$b;

public class c implements b	// class@0002b8
{

    public void c(){
       super();
    }
    public a a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                return null;
             }else {
                return new c$a();
             }
          }else {
             return new c$d();
          }
       }else {
          return new c$b();
       }
    }
}
