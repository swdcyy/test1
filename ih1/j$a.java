package ih1.j$a;
import yg1.a;
import ih1.j;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class j$a implements a	// class@0028e6
{
    public final j a;
    public final a b;

    public void j$a(j p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$a.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          this.a.b = p1;
          this.b.a(p0, p1);
       }
       return;
    }
}
