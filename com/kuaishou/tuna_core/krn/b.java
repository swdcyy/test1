package com.kuaishou.tuna_core.krn.b;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.tuna_core.krn.native_module.TunaButtonModule;
import yz4.a;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import com.kuaishou.tuna_core.krn.native_module.TunaFollowNotificationModule;
import yz4.b;
import com.kuaishou.tuna_core.krn.a;

public class b extends a	// class@0010d6
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
       obj.add(ModuleSpec.nativeModuleSpec(TunaButtonModule.class, new a(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(TunaFollowNotificationModule.class, new b(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(ModuleSpec.viewManagerSpec(a.a));
       return uArrayList;
    }
}
