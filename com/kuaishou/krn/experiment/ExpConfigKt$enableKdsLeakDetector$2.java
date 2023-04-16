package com.kuaishou.krn.experiment.ExpConfigKt$enableKdsLeakDetector$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;

public final class ExpConfigKt$enableKdsLeakDetector$2 extends Lambda implements a	// class@000885
{
    public static final ExpConfigKt$enableKdsLeakDetector$2 INSTANCE;

    static {
       ExpConfigKt$enableKdsLeakDetector$2.INSTANCE = new ExpConfigKt$enableKdsLeakDetector$2();
    }
    public void ExpConfigKt$enableKdsLeakDetector$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       d obj = PatchProxy.apply(null, this, ExpConfigKt$enableKdsLeakDetector$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!c.a().b()) {
          obj = KrnInternalManager.c.a().c();
          boolean booleanx = (obj != null)? obj.getBoolean("kdsEnableLeakDetector", b): false;
          if (booleanx) {
             b = true;
          }
       }
       return b;
    }
}
