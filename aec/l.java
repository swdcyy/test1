package aec.l;
import qh7.b;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;

public final class l implements b	// class@000109
{
    public final b a;

    public void l(b p0){
       this.a = p0;
       super();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.a.a(p0);
       Log.b("PushSocial", "Success show push pop");
       return;
    }
}
