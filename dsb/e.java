package dsb.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class e	// class@00251e
{
    public String a;
    public int b;

    public void e(){
       super();
       this.a = "";
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public final void b(int p0){
       this.b = p0;
    }
}
