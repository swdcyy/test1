package nf0.b$a;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.model.PendantCustomEventConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.ui.PendantExpHelper;
import kotlin.jvm.internal.a;

public final class b$a implements Runnable	// class@0032fc
{
    public final PendantCustomEventConfig b;

    public void b$a(PendantCustomEventConfig p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a tb = this.b;
       a.o(tb, "pendantCustomEventConfig");
       PendantExpHelper.a = tb;
       return;
    }
}
