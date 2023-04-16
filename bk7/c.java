package bk7.c;
import bk7.b;
import bk7.c$a;
import bk7.b$a;
import bk7.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c extends b	// class@000427
{
    public String r;

    public void c(c$a p0){
       super(p0);
       this.r = p0.q;
    }
    public a$b a(){
       a$b obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.c = this.r;
       obj.d = 0;
       obj.f = "KEYWORD";
       return obj;
    }
}
