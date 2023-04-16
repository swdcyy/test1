package com.yxcorp.gifshow.easteregg.manager.BusinessConfigManager;
import com.yxcorp.gifshow.easteregg.manager.BusinessConfigManager$businessConfigs$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class BusinessConfigManager	// class@001acf
{
    public static final p a;
    public static final BusinessConfigManager b;

    static {
       BusinessConfigManager.b = new BusinessConfigManager();
       BusinessConfigManager.a = s.c(BusinessConfigManager$businessConfigs$2.INSTANCE);
    }
    public void BusinessConfigManager(){
       super();
    }
    public static final List a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BusinessConfigManager uBusinessCon = BusinessConfigManager.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uBusinessCon, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(p0, "name");
       Object obj2 = PatchProxy.apply(obj, obj, uBusinessCon, "1");
       if (obj2 != patchProxyRe) {
       }else {
          obj2 = BusinessConfigManager.a.getValue();
       }
       if (obj2 != null) {
          obj = obj2.get(p0);
       }
       return obj;
    }
}
