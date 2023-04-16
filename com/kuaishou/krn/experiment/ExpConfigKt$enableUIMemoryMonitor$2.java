package com.kuaishou.krn.experiment.ExpConfigKt$enableUIMemoryMonitor$2;
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
import jk0.b;
import jk0.c;

public final class ExpConfigKt$enableUIMemoryMonitor$2 extends Lambda implements a	// class@000896
{
    public static final ExpConfigKt$enableUIMemoryMonitor$2 INSTANCE;

    static {
       ExpConfigKt$enableUIMemoryMonitor$2.INSTANCE = new ExpConfigKt$enableUIMemoryMonitor$2();
    }
    public void ExpConfigKt$enableUIMemoryMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$enableUIMemoryMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KrnInternalManager.c.a().c();
       boolean b = false;
       boolean booleanx = (obj != null)? obj.getBoolean("kdsEnableUIMemoryMonitor", b): false;
       if (booleanx || c.a().N()) {
          b = true;
       }
       return b;
    }
}
