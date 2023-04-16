package bk7.b$a;
import bk7.a$a;
import bk7.a;
import bk7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b$a extends a$a	// class@000424
{
    public int o;
    public String p;

    public void b$a(){
       super();
       this.o = 3000;
    }
    public a a(){
       return this.b();
    }
    public b b(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b(this);
    }
    public b$a c(String p0){
       this.p = p0;
       return this;
    }
    public b$a d(int p0){
       if (p0 > 0) {
          this.o = p0;
       }
       return this;
    }
}
