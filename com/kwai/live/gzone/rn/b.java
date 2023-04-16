package com.kwai.live.gzone.rn.b;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge;
import y67.h;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import com.kwai.live.gzone.rn.LiveGzoneKRNHalfScreenWebViewBridge;
import y67.i;
import com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge;
import y67.j;
import java.util.Collections;

public class b extends a	// class@000df8
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
       obj.add(ModuleSpec.nativeModuleSpec(LiveGzoneKRNFragmentDismissBridge.class, new h(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(LiveGzoneKRNHalfScreenWebViewBridge.class, new i(p0)));
       obj.add(ModuleSpec.nativeModuleSpec(LiveGzoneKRNShowTaskRewardDialogBridge.class, new j(p0)));
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
