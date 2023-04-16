package a5b.f;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import a5b.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public final class f	// class@00004b
{
    public static boolean a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final f d;

    static {
       f.d = new f();
       f.b = new ConcurrentHashMap();
       f.c = new ConcurrentHashMap();
    }
    public void f(){
       super();
    }
    public final h a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       h oh = (p0 != null)? f.b.get(p0): null;
       return oh;
    }
    public final void b(boolean p0){
       f.a = p0;
    }
    public final void c(String p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1 == null) {
          f.b.remove(p0);
       }else {
          f.b.put(p0, p1);
       }
       return;
    }
}
