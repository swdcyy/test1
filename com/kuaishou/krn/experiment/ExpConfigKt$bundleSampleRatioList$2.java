package com.kuaishou.krn.experiment.ExpConfigKt$bundleSampleRatioList$2;
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
import com.kuaishou.krn.experiment.ExpConfigKt$bundleSampleRatioList$2$a;
import java.lang.reflect.Type;
import el.a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ExpConfigKt$bundleSampleRatioList$2 extends Lambda implements a	// class@000872
{
    public static final ExpConfigKt$bundleSampleRatioList$2 INSTANCE;

    static {
       ExpConfigKt$bundleSampleRatioList$2.INSTANCE = new ExpConfigKt$bundleSampleRatioList$2();
    }
    public void ExpConfigKt$bundleSampleRatioList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List value;
       d obj = PatchProxy.apply(null, this, ExpConfigKt$bundleSampleRatioList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("kdsBundleSampleRatio", new ExpConfigKt$bundleSampleRatioList$2$a().getType(), CollectionsKt__CollectionsKt.E());
          if (value != null) {
          label_0038 :
             return value;
          }
       }
       value = CollectionsKt__CollectionsKt.E();
       goto label_0038 ;
    }
}
