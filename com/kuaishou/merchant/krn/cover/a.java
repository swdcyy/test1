package com.kuaishou.merchant.krn.cover.a;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.krn.cover.LinkBridge;
import p04.a;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import java.util.ArrayList;
import java.util.Collections;

public class a extends a	// class@001863
{

    public void a(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(LinkBridge.class, new a(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Collections.emptyList();
    }
}
