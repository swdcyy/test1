package kq9.a;
import java.lang.Object;
import java.util.LinkedHashMap;
import eq9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import kq9.c;

public abstract class a	// class@002cfe
{
    public final Map a;
    public final Map b;
    public final b c;
    public c d;

    public void a(){
       super();
       this.a = new LinkedHashMap();
       this.b = new LinkedHashMap();
       this.c = new b();
    }
    public final Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       return this.b.get(p0);
    }
    public final b b(){
       return this.c;
    }
    public final Map c(){
       return this.b;
    }
    public final Map d(){
       return this.a;
    }
    public final Object e(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       return this.a.get(p0);
    }
    public abstract void f();
    public abstract void g(c p0);
}
