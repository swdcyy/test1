package j99.t$a;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import androidx.collection.ArraySet;
import e1a.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j99.q;
import java.util.Map;
import java.util.HashMap;

public class t$a implements g	// class@0027d4
{
    public int b;
    public List c;
    public PublishSubject d;
    public Set e;
    public a f;
    public Set g;
    public e h;
    public v1 i;

    public void t$a(){
       super();
       this.d = PublishSubject.g();
       this.e = new ArraySet();
       this.h = new e();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, t$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(t$a.class, new q());
       }else {
          obj.put(t$a.class, null);
       }
       return obj;
    }
}
