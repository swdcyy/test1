package bs6.h;
import qi0.a;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.kds.baidumap.modules.KdsBaiduMapModule;
import bs6.a;
import javax.inject.Provider;
import com.facebook.react.bridge.ModuleSpec;
import bs6.g;
import bs6.c;
import bs6.d;
import bs6.f;
import bs6.e;
import bs6.b;

public class h extends a	// class@0005fc
{

    public void h(){
       super();
    }
    public List createKrnNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(ModuleSpec.nativeModuleSpec(KdsBaiduMapModule.class, new a(p0)));
       return obj;
    }
    public List createKrnViewManagers(ReactApplicationContext p0){
       p0 = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(ModuleSpec.viewManagerSpec(g.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(c.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(d.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(f.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(e.a));
       uArrayList.add(ModuleSpec.viewManagerSpec(b.a));
       return uArrayList;
    }
}
