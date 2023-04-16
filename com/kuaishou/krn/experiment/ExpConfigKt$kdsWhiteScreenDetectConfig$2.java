package com.kuaishou.krn.experiment.ExpConfigKt$kdsWhiteScreenDetectConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import pi0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.experiment.ExpConfigKt$kdsWhiteScreenDetectConfig$2$a;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.krn.apm.wsd.model.KdsFrameworkConfig;

public final class ExpConfigKt$kdsWhiteScreenDetectConfig$2 extends Lambda implements a	// class@0008a4
{
    public static final ExpConfigKt$kdsWhiteScreenDetectConfig$2 INSTANCE;

    static {
       ExpConfigKt$kdsWhiteScreenDetectConfig$2.INSTANCE = new ExpConfigKt$kdsWhiteScreenDetectConfig$2();
    }
    public void ExpConfigKt$kdsWhiteScreenDetectConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       a value;
       d obj = PatchProxy.apply(null, this, ExpConfigKt$kdsWhiteScreenDetectConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("kds_whitescreen_detect_config", new ExpConfigKt$kdsWhiteScreenDetectConfig$2$a().getType(), new a(null));
          if (value != null) {
          label_003a :
             return value;
          }
       }
       value = new a(null);
       goto label_003a ;
    }
}
