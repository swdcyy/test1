package com.kuaishou.krn.experiment.ExpConfigKt$krnEngineLaunchReporterRatio$2;
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

public final class ExpConfigKt$krnEngineLaunchReporterRatio$2 extends Lambda implements a	// class@0008a5
{
    public static final ExpConfigKt$krnEngineLaunchReporterRatio$2 INSTANCE;

    static {
       ExpConfigKt$krnEngineLaunchReporterRatio$2.INSTANCE = new ExpConfigKt$krnEngineLaunchReporterRatio$2();
    }
    public void ExpConfigKt$krnEngineLaunchReporterRatio$2(){
       super(0);
    }
    public final double invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$krnEngineLaunchReporterRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = KrnInternalManager.c.a().c();
       double d = 0;
       if (obj != null) {
          Double value = obj.getValue("KrnEngineLaunchReporterRatio", Double.TYPE, Double.valueOf(d));
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