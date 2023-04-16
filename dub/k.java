package dub.k;
import xr4.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentMap;
import com.google.common.collect.Maps;

public class k	// class@002575
{
    public b a;
    public Map b;
    public Map c;
    public String d;
    public PublishSubject e;
    public static final a$a f;

    static {
       k.f = new a$a();
    }
    public void k(){
       super();
    }
    public a$a a(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ok = this.b;
       if (ok == null) {
          return k.f;
       }else {
          return Optional.fromNullable(ok.get(Integer.valueOf(p0))).or(k.f);
       }
    }
    public void b(int p0,Object p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ok, "2")) {
          return;
       }
       if (p1 != null) {
          if (this.c == null) {
             this.c = Maps.q();
          }
          this.c.put(Integer.valueOf(p0), p1);
       }else {
          p1 = this.c;
          if (p1 != null) {
             p1.remove(Integer.valueOf(p0));
          }
       }
       return;
    }
}
