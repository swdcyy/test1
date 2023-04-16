package dy8.b$b;
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

public class b$b implements g	// class@0020f9
{

    public void b$b(){
       super();
    }
    public void b$b(b$a p0){
       super();
    }
    public t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3a268c29).a(p0);
    }
    public t b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x3a268c29).d(p0);
    }
}
