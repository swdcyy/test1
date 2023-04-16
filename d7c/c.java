package d7c.c;
import d7c.h;
import a7c.d;
import ml8.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f7c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c extends h	// class@002124
{

    public void c(d p0){
       super(p0);
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       if (this.a.f() != null) {
          this.a.f().a(p0);
       }
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a.e()) {
          return this.a.e();
       }
       return 0x7f0d0954;
    }
}
