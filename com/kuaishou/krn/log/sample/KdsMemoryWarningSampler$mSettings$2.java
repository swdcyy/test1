package com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$mSettings$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$mSettings$2$a;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler;

public final class KdsMemoryWarningSampler$mSettings$2 extends Lambda implements a	// class@0008ed
{
    public static final KdsMemoryWarningSampler$mSettings$2 INSTANCE;

    static {
       KdsMemoryWarningSampler$mSettings$2.INSTANCE = new KdsMemoryWarningSampler$mSettings$2();
    }
    public void KdsMemoryWarningSampler$mSettings$2(){
       super(0);
    }
    public final KdsMemoryWarningSampler$a invoke(){
       KdsMemoryWarningSampler$a value;
       d obj = PatchProxy.apply(null, this, KdsMemoryWarningSampler$mSettings$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("KdsEnableSampledMemoryWarning", new KdsMemoryWarningSampler$mSettings$2$a().getType(), KdsMemoryWarningSampler.a(KdsMemoryWarningSampler.d));
          if (value != null) {
          label_003c :
             return value;
          }
       }
       value = KdsMemoryWarningSampler.a(KdsMemoryWarningSampler.d);
       goto label_003c ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
