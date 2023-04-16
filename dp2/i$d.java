package dp2.i$d;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import hp2.b;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class i$d implements g	// class@002576
{
    public final l b;

    public void i$d(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
       }else {
          b.k0(b.a(), "AudiencePrepareSing fail", p0);
          a.o(p0, "it");
          this.b.invoke(p0);
       }
       return;
    }
}
