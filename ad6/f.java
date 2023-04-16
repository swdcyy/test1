package ad6.f;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.PluginManager;

public final class f implements a	// class@00007a
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       if (p1 != null && p1.a(false) == true) {
          PluginManager.H.L(true);
       }
       return;
    }
}
