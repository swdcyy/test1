package mu1.a$a;
import mu1.g;
import mu1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import du1.d;
import k2b.e0;
import java.lang.Boolean;

public class a$a implements g	// class@003217
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j.a();
    }
    public boolean b(){
       return this.a.s;
    }
    public e0 c(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j.i();
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.j.e();
    }
    public void f1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.a.j.f1(p0);
       return;
    }
}
