package fk0.h;
import msd.l;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import fk0.j;
import hi0.c;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import com.kuaishou.krn.log.model.KrnLogCommonParams;

public final class h implements l	// class@002368
{
    public final KrnBundleLoadInfo b;

    public void h(KrnBundleLoadInfo p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       h tb = this.b;
       KrnBundleLoadInfo d0 = tb.d0;
       j startRunMemo = d0.startRunMemory;
       if (startRunMemo == null) {
       }else {
          d0.endRunMemory = p0;
          c.c(startRunMemo, p0);
          p0 = tb.b;
          if (p0 == LoadingStateTrack$LoadType.PRE_BASIC_BUNDLE || (p0 == LoadingStateTrack$LoadType.PRE_BUSINESS_BUNDLE && tb.k())) {
             tb.o(null);
          }
       }
       return null;
    }
}
