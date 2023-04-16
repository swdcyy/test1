package com.kuaishou.krn.log.sample.KdsMemoryWarningSampler;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$a;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$mSettings$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$enableDeliverMemoryInfo$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public final class KdsMemoryWarningSampler	// class@0008ee
{
    public static final KdsMemoryWarningSampler$a a;
    public static final p b;
    public static final p c;
    public static final KdsMemoryWarningSampler d;

    static {
       KdsMemoryWarningSampler.d = new KdsMemoryWarningSampler();
       KdsMemoryWarningSampler$a uoa = new KdsMemoryWarningSampler$a(false, 0, 0);
       KdsMemoryWarningSampler.a = v0;
       KdsMemoryWarningSampler.b = s.c(KdsMemoryWarningSampler$mSettings$2.INSTANCE);
       KdsMemoryWarningSampler.c = s.c(KdsMemoryWarningSampler$enableDeliverMemoryInfo$2.INSTANCE);
    }
    public void KdsMemoryWarningSampler(){
       super();
    }
    public static final KdsMemoryWarningSampler$a a(KdsMemoryWarningSampler p0){
       return KdsMemoryWarningSampler.a;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, KdsMemoryWarningSampler.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = KdsMemoryWarningSampler.c.getValue();
       }
       return obj.booleanValue();
    }
    public final KdsMemoryWarningSampler$a c(){
       Object obj = PatchProxy.apply(null, this, KdsMemoryWarningSampler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KdsMemoryWarningSampler.b.getValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, KdsMemoryWarningSampler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c().enable;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, KdsMemoryWarningSampler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Math.random() - this.c().sampleRatio < 0)? true: false;
       return b;
    }
}
