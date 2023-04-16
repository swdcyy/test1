package com.kuaishou.krn.experiment.ExpConfigKt$sharedRuntimeBundleGroups$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.experiment.ExpConfigKt$sharedRuntimeBundleGroups$2$a;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.krn.experiment.KdsSharedRuntimeBundleGroupKt;

public final class ExpConfigKt$sharedRuntimeBundleGroups$2 extends Lambda implements a	// class@0008b3
{
    public static final ExpConfigKt$sharedRuntimeBundleGroups$2 INSTANCE;

    static {
       ExpConfigKt$sharedRuntimeBundleGroups$2.INSTANCE = new ExpConfigKt$sharedRuntimeBundleGroups$2();
    }
    public void ExpConfigKt$sharedRuntimeBundleGroups$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List value;
       d obj = PatchProxy.apply(null, this, ExpConfigKt$sharedRuntimeBundleGroups$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("KdsEnableShareRuntime", new ExpConfigKt$sharedRuntimeBundleGroups$2$a().getType(), KdsSharedRuntimeBundleGroupKt.a());
          if (value != null) {
          label_0038 :
             return value;
          }
       }
       value = KdsSharedRuntimeBundleGroupKt.a();
       goto label_0038 ;
    }
}
