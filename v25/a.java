package v25.a;
import v25.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import zsd.u;

public class a implements b	// class@002660
{
    public final String a;

    public void a(){
       super("");
    }
    public void a(String p0){
       a.p(p0, "logTag");
       super();
       this.a = p0;
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       if (p1 != null) {
          u.S1(p1);
       }
       return;
    }
    public void info(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       if (p1 != null) {
          u.S1(p1);
       }
       return;
    }
    public void report(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       a.p(p0, "tag");
       return;
    }
}
