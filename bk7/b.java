package bk7.b;
import bk7.a;
import bk7.b$a;
import bk7.a$a;
import bk7.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b extends a	// class@000425
{
    public int p;
    public String q;

    public void b(b$a p0){
       super(p0);
       this.p = p0.o;
       this.q = p0.p;
    }
    public a$b a(){
       a$b obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$b();
       obj.b = this.q;
       obj.a = this.p;
       obj.d = 1;
       String str = (!this.j())? "API": "GD_API";
       obj.e = str;
       obj.f = "RECOMMENDED";
       return obj;
    }
}
