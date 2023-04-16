package com.yxcorp.gifshow.message.newgroup.manage.krn.a;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import bfb.q;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;

public class a extends a	// class@001d7e
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
       obj.add(ModuleSpec.nativeModuleSpec(IMGroupSettingBridge.class, new q(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       return null;
    }
}
