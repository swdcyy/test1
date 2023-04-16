package ep2.c$c;
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

public final class c$c implements g	// class@0027ae
{
    public final l b;

    public void c$c(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else {
          b.k0(b.a(), "GuestSpeakPrepareWatchLogic Arya: audience ktv on error", p0);
          a.o(p0, "error");
          this.b.invoke(p0);
       }
       return;
    }
}
