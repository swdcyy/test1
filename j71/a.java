package j71.a;
import j71.c;
import j71.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import no1.c;
import lp3.c;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;

public final class a extends c	// class@002a52
{

    public void a(){
       super();
    }
    public void m(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "request");
       this.g(c.class).G6(p0.a());
       return;
    }
}
