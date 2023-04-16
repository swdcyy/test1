package com.yxcorp.gifshow.profile.krn.e;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.profile.krn.KrnUserInfoEditBridgeV2;
import p3c.i;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import com.yxcorp.gifshow.profile.krn.d;

public class e extends a	// class@001370
{

    public void e(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(KrnUserInfoEditBridgeV2.class, new i(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(ModuleSpec.viewManagerSpec(d.a));
       return uArrayList;
    }
}
