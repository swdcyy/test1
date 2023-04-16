package com.kuaishou.krn.experiment.ExpConfigKt$kdsMemoryMonitorSampleRatio$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import java.lang.Double;
import java.lang.reflect.Type;

public final class ExpConfigKt$kdsMemoryMonitorSampleRatio$2 extends Lambda implements a	// class@0008a1
{
    public static final ExpConfigKt$kdsMemoryMonitorSampleRatio$2 INSTANCE;

    static {
       ExpConfigKt$kdsMemoryMonitorSampleRatio$2.INSTANCE = new ExpConfigKt$kdsMemoryMonitorSampleRatio$2();
    }
    public void ExpConfigKt$kdsMemoryMonitorSampleRatio$2(){
       super(0);
    }
    public final double invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$kdsMemoryMonitorSampleRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = KrnInternalManager.c.a().c();
       double d = 0x3fe0000000000000;
       if (obj != null) {
          Double value = obj.getValue("kdsMemoryMonitorSampleRatio", Double.TYPE, Double.valueOf(d));
          if (value != null) {
             d = value.doubleValue();
          }
       }
       return d;
    }
    public Object invoke(){
       return Double.valueOf(this.invoke());
    }
}
