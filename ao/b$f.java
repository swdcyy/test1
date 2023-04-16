package ao.b$f;
import erd.g;
import ao.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import kotlin.jvm.internal.a;
import q87.c;
import ao.e;
import xn.a$b;
import java.lang.Long;
import qn.m;
import rn.b;
import xn.a;
import java.lang.Boolean;
import java.lang.Integer;

public final class b$f implements g	// class@000203
{
    public final b b;

    public void b$f(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
       }else {
          KwaiPopLog e = KwaiPopLog.e;
          a.o(p0, "it");
          Object[] objArray = new Object[0];
          e.t("KwaiPopWeb error", p0.getLocalizedMessage(), objArray);
          this.b.release();
          KwaiPopLog.G(e, this.b.e().l(), a$b.b, null, null, Long.valueOf(this.b.b), null, null, null, this.b.e().b(), "init error", 236, null);
       }
       return;
    }
}
