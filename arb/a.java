package arb.a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import arb.f;
import java.util.Map;

public class a implements g	// class@0002ce
{
    public final PublishSubject b;
    public Map c;
    public j0 d;

    public void a(){
       super();
       this.b = PublishSubject.g();
       this.c = new HashMap();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new f());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
