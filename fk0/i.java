package fk0.i;
import msd.l;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import fk0.j;
import hi0.c;

public final class i implements l	// class@002369
{
    public final KrnBundleLoadInfo b;
    public final KrnLogCommonParams c;

    public void i(KrnBundleLoadInfo p0,KrnLogCommonParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       i tb = this.b;
       i tc = this.c;
       if (tb.d0.contentAppearedMemory != null && tb.t()) {
          KrnBundleLoadInfo d0 = tb.d0;
          d0.onPauseMemory = p0;
          c.d(p0, d0.contentAppearedMemory);
          tb.o(tc);
       }
       return null;
    }
}
