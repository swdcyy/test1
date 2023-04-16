package azb.e$c;
import erd.g;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import pm6.m;
import java.lang.Long;
import rq.a;
import lnc.p3;
import q87.c;

public final class e$c implements g	// class@00036b
{
    public static final e$c b;

    static {
       e$c.b = new e$c();
    }
    public void e$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          long l = System.currentTimeMillis();
          p0 = m.class;
          if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), null, p0, "10")) {
             a.X(l);
          }
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "GrowthGuideInfoRepo requestGuideInfo success", objArray);
       }
       return;
    }
}
