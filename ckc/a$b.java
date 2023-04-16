package ckc.a$b;
import tx4.l;
import so7.a;
import java.lang.Object;
import java.lang.String;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tx4.k;

public class a$b implements l	// class@0005c0
{
    public final a a;

    public void a$b(a p0){
       super();
       this.a = p0;
    }
    public Object a(String p0,String p1,h p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$b.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a$b ta = this.a;
       if (ta != null) {
          return ta.b(p0, p1);
       }
       return null;
    }
    public Object b(String p0,String p1,String p2,h p3){
       return k.a(this, p0, p1, p2, p3);
    }
}
