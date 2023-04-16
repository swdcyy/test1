package e61.g;
import e61.c;
import e61.e;
import java.lang.Object;
import e61.g$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.LruCache;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Number;

public class g implements c	// class@0020af
{
    public LruCache a;

    public void g(int p0){
       super(p0, null);
    }
    public void g(int p0,e p1){
       super();
       this.a = new g$a(this, p0, p1);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       this.a.evictAll();
       return;
    }
    public boolean contains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.get(p0) != null)? true: false;
       return b;
    }
    public void d(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
    public void e(String p0,Object p1,long p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, g.class, "2")) {
          return;
       }
       this.a.put(p0, p1);
       return;
    }
    public Object get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.get(p0);
    }
    public void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "5")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public long size(){
       Object obj = PatchProxy.apply(null, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (long)this.a.size();
    }
}
