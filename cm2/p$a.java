package cm2.p$a;
import cm2.b$a;
import cm2.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import cm2.p$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class p$a implements b$a	// class@000567
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1){
       p$a uoa = p$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       p j = this.a.J;
       if (j != null) {
          j.a(p0, p1);
       }
       return;
    }
    public boolean b(){
       p obj = PatchProxy.apply(null, this, p$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.J;
       if (obj != null && obj.b()) {
          return true;
       }
       return false;
    }
    public boolean c(){
       return this.a.F;
    }
}
