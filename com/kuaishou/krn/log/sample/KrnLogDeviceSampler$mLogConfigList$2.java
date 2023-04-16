package com.kuaishou.krn.log.sample.KrnLogDeviceSampler$mLogConfigList$2;
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
import com.kuaishou.krn.log.sample.KrnLogDeviceSampler$mLogConfigList$2$a;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.krn.log.sample.KrnLogDeviceSampler;

public final class KrnLogDeviceSampler$mLogConfigList$2 extends Lambda implements a	// class@0008f7
{
    public static final KrnLogDeviceSampler$mLogConfigList$2 INSTANCE;

    static {
       KrnLogDeviceSampler$mLogConfigList$2.INSTANCE = new KrnLogDeviceSampler$mLogConfigList$2();
    }
    public void KrnLogDeviceSampler$mLogConfigList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List value;
       d obj = PatchProxy.apply(null, this, KrnLogDeviceSampler$mLogConfigList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("kds_log_device_sample_key_list", new KrnLogDeviceSampler$mLogConfigList$2$a().getType(), KrnLogDeviceSampler.c(KrnLogDeviceSampler.c));
          if (value != null) {
          label_003c :
             return value;
          }
       }
       value = KrnLogDeviceSampler.c(KrnLogDeviceSampler.c);
       goto label_003c ;
    }
}
