package qi0.a;
import rd.d;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import ge.b;

public abstract class a extends d	// class@003900
{

    public void a(){
       super();
    }
    public abstract List createKrnNativeModules(ReactApplicationContext p0);
    public abstract List createKrnViewManagers(ReactApplicationContext p0);
    public List getNativeModules(ReactApplicationContext p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       List list = this.createKrnNativeModules(p0);
       if (list != null && list.size() > 0) {
          obj.addAll(list);
       }
       return obj;
    }
    public b getReactModuleInfoProvider(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.getReactModuleInfoProviderViaReflection(this);
    }
    public List getViewManagers(ReactApplicationContext p0){
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.createKrnViewManagers(p0);
       if (obj != null) {
          return obj;
       }
       return super.getViewManagers(p0);
    }
}
