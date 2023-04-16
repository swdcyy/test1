package a3b.b;
import a3b.a;
import a3b.b$a;
import nsd.u;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.timemachine.context.TMContext$properties$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import org.json.JSONObject;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.log.timemachine.TMLogManager;

public final class b implements a	// class@00003c
{
    public final p a;
    public final String b;
    public final AtomicInteger c;
    public static final b$a d;

    static {
       b.d = new b$a(null);
    }
    public void b(String p0,AtomicInteger p1,int p2,u p3){
       p1 = (p2 & 0x02)? new AtomicInteger(0): null;
       a.p(p0, "bizType");
       a.p(p1, "sessionIndex");
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(TMContext$properties$2.INSTANCE);
       return;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.c.get());
    }
    public Object b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       p0 = this.h().get(p0);
       if (!p0 instanceof Object) {
          p0 = null;
       }
       return p0;
    }
    public void c(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "tag");
       this.h().put(p0, p1);
       p1 = new Object[0];
       a.C().w("TMContext", "putContextValue: bizType = "+this.getBizType()+"; key="+p0+"; value="+p1, p1);
       return;
    }
    public Object d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       Object[] objArray = new Object[0];
       a.C().w("TMContext", "removeContextValue: bizType = "+this.getBizType()+"; key="+p0, objArray);
       return this.h().remove(p0);
    }
    public JSONObject e(){
       JSONObject obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       Iterator iterator = this.h().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          obj.put(key, uEntry.getValue());
       }
       return obj;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       this.h().clear();
       Object[] objArray = new Object[0];
       a.C().w("TMContext", "clearContext: bizType = "+this.getBizType(), objArray);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.c.incrementAndGet();
       Object[] objArray = new Object[0];
       a.C().w("TMContext", "incrementSessionId: bizType = "+this.getBizType()+"; bizSessionId="+TMLogManager.e.a(this.getBizType()).a(), objArray);
       return;
    }
    public String getBizType(){
       return this.b;
    }
    public final ConcurrentHashMap h(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
