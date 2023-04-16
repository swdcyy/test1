package ek0.e;
import mb.b;
import java.lang.Object;
import lb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.krn.c;

public class e implements b	// class@00217d
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public boolean a(a p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return (c.b().j() ^ 0x01);
    }
    public void b(a p0,String p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2");
    }
    public void c(a p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "1")) {
          return;
       }
       String.format(p1, p2);
       return;
    }
}
