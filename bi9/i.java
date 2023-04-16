package bi9.i;
import bi9.b;
import km6.d;
import java.util.List;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pi9.p;
import qr4.k$l$a;
import java.lang.Integer;

public class i extends b	// class@0004b3
{

    public void i(){
       super();
    }
    public void a(d p0,List p1){
       p0.i = p1;
    }
    public boolean b(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.a != null && p.d(p0.floatValue(), this.a.floatValue())){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void c(int p0,Object p1){
       p1.b = p1.b + (long)p0;
    }
    public Object d(int p0,int p1,Object p2){
       k$l$a ol$a;
       if (PatchProxy.isSupport(i.class)) {
          ol$a = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, i.class, "2");
          if (ol$a != PatchProxyResult.class) {
          label_0034 :
             return ol$a;
          }
       }
       ol$a = new k$l$a();
       ol$a.a = (long)p0;
       ol$a.b = (long)p1;
       ol$a.c = p2.floatValue();
       goto label_0034 ;
    }
}
