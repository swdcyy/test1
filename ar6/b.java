package ar6.b;
import ar6.c;
import zq6.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zq6.u;
import zq6.p;
import ar6.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ar6.a;
import ar6.a$b;
import wr6.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalAccessException;

public final class b extends c	// class@00039d
{
    public i f;

    public void b(i p0,boolean p1,Object p2){
       a.p(p0, "watcher");
       super(null, p1, null);
       this.f = p0;
    }
    public void d(p p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "valueW");
       this.f.b(p0, p1.value());
       if (a.i.a()) {
          Object[] objArray = new Object[0];
          a.c.w("ChildStateReader", "notifyListenerMulti\(\) "+p0+' '+p1.value(), objArray);
       }
       return;
    }
    public Object value(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalAccessException("不能调用");
    }
}
