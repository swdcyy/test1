package com.yxcorp.gifshow.relation.pymk.rn.d;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.relation.pymk.rn.KSPymkBridge;
import nbc.m;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;

public class d extends a	// class@00195a
{

    public void d(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(KSPymkBridge.class, new m(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       return null;
    }
}
