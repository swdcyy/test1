package kq8.b;
import cq8.g;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g00.b;
import oz.b;
import pz.c;
import oz.e;

public class b implements g	// class@002c0f
{
    public final ConcurrentHashMap a;

    public void b(){
       super();
       this.a = new ConcurrentHashMap(6);
    }
    public ConcurrentHashMap a(){
       return this.a;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.a.clear();
       return;
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.a.put("LNKRenderARKBridge", new b());
       this.a.put("EventBus", new b());
       this.a.put("AdDesign", new c());
       this.a.put("KwaiBridgeCenter", new e());
       return;
    }
}
