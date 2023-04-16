package bk7.c$a;
import bk7.b$a;
import bk7.a;
import bk7.c;
import bk7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c$a extends b$a	// class@000426
{
    public String q;

    public void c$a(){
       super();
    }
    public a a(){
       return this.e();
    }
    public b b(){
       return this.e();
    }
    public c e(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
}
