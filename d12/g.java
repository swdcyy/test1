package d12.g;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import kp3.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d12.o;
import java.util.Map;
import java.util.HashMap;

public class g implements g	// class@00241b
{
    public PublishSubject b;
    public boolean c;
    public long d;
    public z e;
    public PublishSubject f;
    public PublishSubject g;

    public void g(){
       super();
       this.b = PublishSubject.g();
       this.e = new e();
       this.f = PublishSubject.g();
       this.g = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new o());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
}
