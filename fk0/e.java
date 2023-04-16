package fk0.e;
import msd.l;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import fk0.j;
import hi0.c;

public final class e implements l	// class@002365
{
    public final KrnBundleLoadInfo b;

    public void e(KrnBundleLoadInfo p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       KrnBundleLoadInfo d0 = this.b.d0;
       d0.contentAppearedMemory = p0;
       j endRunMemory = d0.endRunMemory;
       if (endRunMemory != null) {
          c.c(endRunMemory, p0);
       }
       return null;
    }
}
