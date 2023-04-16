package com.kuaishou.krn.log.sample.KrnLogEventSampler$mLogConfigList$2;
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
import com.kuaishou.krn.log.sample.KrnLogEventSampler$mLogConfigList$2$a;
import java.lang.reflect.Type;
import el.a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class KrnLogEventSampler$mLogConfigList$2 extends Lambda implements a	// class@0008fb
{
    public static final KrnLogEventSampler$mLogConfigList$2 INSTANCE;

    static {
       KrnLogEventSampler$mLogConfigList$2.INSTANCE = new KrnLogEventSampler$mLogConfigList$2();
    }
    public void KrnLogEventSampler$mLogConfigList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List value;
       d obj = PatchProxy.apply(null, this, KrnLogEventSampler$mLogConfigList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("kds_log_event_sample", new KrnLogEventSampler$mLogConfigList$2$a().getType(), CollectionsKt__CollectionsKt.E());
          if (value != null) {
          label_0038 :
             return value;
          }
       }
       value = CollectionsKt__CollectionsKt.E();
       goto label_0038 ;
    }
}
