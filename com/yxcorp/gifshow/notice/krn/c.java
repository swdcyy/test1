package com.yxcorp.gifshow.notice.krn.c;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.notice.krn.ReminderMixBridge;
import qtb.a;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import com.yxcorp.gifshow.notice.krn.b;
import com.yxcorp.gifshow.notice.krn.a;

public class c extends a	// class@0021a1
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
       obj.add(ModuleSpec.nativeModuleSpec(ReminderMixBridge.class, new a(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(ModuleSpec.viewManagerSpec(b.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(a.a));
       return uArrayList;
    }
}