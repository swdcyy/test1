package dh.a;
import java.lang.Object;
import androidx.collection.LruCache;
import java.lang.String;
import bh.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a	// class@001e6a
{
    public final LruCache a;
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
       this.a = new LruCache(20);
    }
    public static a b(){
       return a.b;
    }
    public i a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(p0);
    }
    public void c(String p0,i p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
}
