package f3a.a$a;
import im8.g;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f3a.f;
import java.util.HashMap;

public final class a$a implements g	// class@002279
{
    public ObservableMap b;

    public void a$a(){
       super();
       this.b = new ObservableMap(new LinkedHashMap());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a$a.class, new f());
       }else {
          obj.put(a$a.class, null);
       }
       return obj;
    }
}
