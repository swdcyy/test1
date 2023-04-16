package com.kuaishou.live.bridge.rn.c;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bridge.rn.LiveRnBridge;
import t71.c;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import java.util.ArrayList;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import java.util.Objects;
import android.content.Context;
import c0d.a;
import com.kuaishou.live.viewmanager.richtext.LiveRnRichTextViewManager;
import com.kuaishou.live.bridge.rn.a;
import com.kuaishou.live.bridge.rn.b;

public class c extends a	// class@000e34
{

    public void c(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(LiveRnBridge.class, new c(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       String str = "3";
       LiveMaterialResourceManager obj = PatchProxy.applyOneRefs(p0, this, c.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveMaterialResourceManager.h;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, LiveMaterialResourceManager.class, str)) {
          obj.c(p0, null);
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(ModuleSpec.nativeModuleSpec(LiveRnRichTextViewManager.class, a.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(b.a));
       return uArrayList;
    }
}
