package ln8.c;
import cq8.g;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fo8.a;
import go8.a;

public class c implements g	// class@002d07
{
    public final ConcurrentHashMap a;

    public void c(){
       super();
       this.a = new ConcurrentHashMap(3);
    }
    public ConcurrentHashMap a(){
       return this.a;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.a.clear();
       return;
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.a.put("LocalStorage", new a());
       this.a.put("Toast", new a());
       return;
    }
}
