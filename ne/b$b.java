package ne.b$b;
import java.lang.Object;
import ne.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ne.b$a;

public class b$b	// class@0026f4
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public void b$b(){
       super();
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = new b(this.a, this.b, this.c, this.d, this.e, this.f, null);
       return obj;
    }
}
