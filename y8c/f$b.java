package y8c.f$b;
import im8.g;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y8c.o;
import java.util.Map;
import java.util.HashMap;

public class f$b implements g	// class@0049f8
{
    public int b;
    public d c;
    public List d;
    public i e;
    public a f;
    public Map g;

    public void f$b(){
       super();
    }
    public void f$b(f$b p0){
       super();
       this.b = p0.b;
       this.c = p0.c;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.d = p0.d;
    }
    public BaseFragment a(){
       return this.f;
    }
    public int b(){
       return this.b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f$b.class, new o());
       }else {
          obj.put(f$b.class, null);
       }
       return obj;
    }
}
