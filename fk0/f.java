package fk0.f;
import msd.l;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import fk0.j;
import hi0.c;

public final class f implements l	// class@002366
{
    public final KrnBundleLoadInfo b;

    public void f(KrnBundleLoadInfo p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       KrnBundleLoadInfo d0 = this.b.d0;
       j entryMemory = d0.entryMemory;
       if (entryMemory == null) {
       }else {
          d0.initMemory = p0;
          c.c(entryMemory, p0);
       }
       return null;
    }
}
