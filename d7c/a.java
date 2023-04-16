package d7c.a;
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

public class a extends h	// class@002122
{

    public void a(d p0){
       super(p0);
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (this.a.d() != null) {
          this.a.d().a(p0);
       }
       return;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.a.c()) {
          return this.a.c();
       }
       return 0x7f0d06b0;
    }
}
