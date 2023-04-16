package dy8.b$c;
import dy8.g;
import java.lang.Object;
import dy8.b$a;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import u49.c;

public class b$c implements g	// class@0020fa
{

    public void b$c(){
       super();
    }
    public void b$c(b$a p0){
       super();
    }
    public t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3a268c29).r(p0);
    }
    public t b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3a268c29).B(p0);
    }
}
