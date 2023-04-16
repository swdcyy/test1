package com.yxcorp.gifshow.profile.krn.f;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.krn.ProfileStatusBridge;
import p3c.j;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import com.yxcorp.gifshow.profile.krn.KrnProfileBridge;
import p3c.k;

public class f extends a	// class@001371
{

    public void f(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(ProfileStatusBridge.class, new j(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(KrnProfileBridge.class, new k(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       return null;
    }
}
