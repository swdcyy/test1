package com.yxcorp.plugin.setting.krn.b;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.yxcorp.plugin.setting.krn.KrnSettingsRedDotModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.plugin.setting.krn.KrnSettingsBLoCModule;
import rgd.d;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import rgd.e;
import rgd.f;
import rgd.g;
import rgd.h;
import java.util.Collections;

public class b extends a	// class@0008cd
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
       obj.add(ModuleSpec.nativeModuleSpec(KrnSettingsBLoCModule.class, new d(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnSettingsRedDotModule.class, new e(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnSettingsRedDotModule.class, new f(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnSettingsRedDotModule.class, new g(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnSettingsRedDotModule.class, new h(p0)));
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
