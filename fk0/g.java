package fk0.g;
import msd.l;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import fk0.j;
import hi0.c;

public final class g implements l	// class@002367
{
    public final KrnBundleLoadInfo b;

    public void g(KrnBundleLoadInfo p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       KrnBundleLoadInfo d0 = this.b.d0;
       j initMemory = d0.initMemory;
       if (initMemory == null) {
       }else {
          d0.startRunMemory = p0;
          c.c(initMemory, p0);
       }
       return null;
    }
}
