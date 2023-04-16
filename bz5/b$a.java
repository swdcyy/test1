package bz5.b$a;
import java.lang.Object;
import java.util.ArrayList;
import bz5.b$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import bz5.b;

public class b$a	// class@000633
{
    public final List a;

    public void b$a(){
       super();
       this.a = new ArrayList(4);
    }
    public b$a a(b$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.size() >= 4) {
          return this;
       }
       this.a.add(p0);
       return this;
    }
    public b b(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
}
