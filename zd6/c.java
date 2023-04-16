package zd6.c;
import com.kwai.plugin.dva.install.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zd6.c$a;
import java.lang.Runnable;
import t45.c;

public final class c implements a	// class@002928
{

    public void c(){
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "pluginName");
       c.a(new c$a(this, p0));
       return;
    }
}
