package co5.m;
import co5.m$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import co5.m$b;

public class m	// class@000720
{
    public final boolean a;
    public final int b;
    public final m$a c;
    public final String d;

    public void m(boolean p0,m$a p1,String p2){
       super();
       this.a = p0;
       this.b = (p1 != null)? p1.a: 0;
       this.c = p1;
       this.d = p2;
       return;
    }
    public static m a(){
       Object obj = PatchProxy.apply(null, null, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(false, null, null);
    }
    public static m$b b(){
       Object obj = PatchProxy.apply(null, null, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m$b();
    }
}
