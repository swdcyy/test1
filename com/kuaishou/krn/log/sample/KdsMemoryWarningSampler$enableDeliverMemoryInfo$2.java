package com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$enableDeliverMemoryInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;

public final class KdsMemoryWarningSampler$enableDeliverMemoryInfo$2 extends Lambda implements a	// class@0008eb
{
    public static final KdsMemoryWarningSampler$enableDeliverMemoryInfo$2 INSTANCE;

    static {
       KdsMemoryWarningSampler$enableDeliverMemoryInfo$2.INSTANCE = new KdsMemoryWarningSampler$enableDeliverMemoryInfo$2();
    }
    public void KdsMemoryWarningSampler$enableDeliverMemoryInfo$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, KdsMemoryWarningSampler$enableDeliverMemoryInfo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KrnInternalManager.c.a().c();
       boolean b = false;
       if (obj != null) {
          b = obj.getBoolean("KdsEnableDeliverMemoryInfo", b);
       }
       return b;
    }
}
