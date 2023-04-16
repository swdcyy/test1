package k59.d;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k59.u;
import java.util.Map;
import java.util.HashMap;

public class d implements g	// class@002ad4
{
    public int b;
    public WebViewFragment c;
    public BaseFragment d;
    public boolean e;
    public PublishSubject f;
    public c g;
    public h h;
    public KwaiActionBar i;
    public boolean j;
    public String k;
    public long l;
    public h2 m;
    public m1 n;
    public boolean o;
    public List p;

    public void d(){
       super();
       this.b = 0;
       this.f = PublishSubject.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new u());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
}
