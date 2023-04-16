package com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.b;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantHalfYodaModule;
import pk4.c;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import java.util.ArrayList;
import java.util.Collections;

public class b extends a	// class@00084e
{

    public void b(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(MerchantHalfYodaModule.class, new c(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Collections.emptyList();
    }
}
