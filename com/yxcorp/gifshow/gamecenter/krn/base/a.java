package com.yxcorp.gifshow.gamecenter.krn.base.a;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.gamecenter.krn.bridge.ZtGameKrnDownloadBridge;
import dma.b;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;

public class a extends a	// class@0012b1
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
       obj.add(ModuleSpec.nativeModuleSpec(ZtGameKrnDownloadBridge.class, new b(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       return null;
    }
}
