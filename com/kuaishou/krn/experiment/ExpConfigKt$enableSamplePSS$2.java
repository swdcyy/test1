package com.kuaishou.krn.experiment.ExpConfigKt$enableSamplePSS$2;
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

public final class ExpConfigKt$enableSamplePSS$2 extends Lambda implements a	// class@000892
{
    public static final ExpConfigKt$enableSamplePSS$2 INSTANCE;

    static {
       ExpConfigKt$enableSamplePSS$2.INSTANCE = new ExpConfigKt$enableSamplePSS$2();
    }
    public void ExpConfigKt$enableSamplePSS$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$enableSamplePSS$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KrnInternalManager.c.a().c();
       boolean b = false;
       if (obj != null) {
          b = obj.getBoolean("kdsEnableSamplePSS", b);
       }
       return b;
    }
}