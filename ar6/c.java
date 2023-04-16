package ar6.c;
import zq6.s;
import zq6.g;
import zq6.u;
import java.lang.Object;
import ar6.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zq6.p;
import ar6.a;
import ar6.a$b;
import wr6.a;
import java.lang.StringBuilder;
import q87.c;

public class c implements s, g	// class@00039e
{
    public Object b;
    public u c;
    public final boolean d;
    public final Object e;

    public void c(u p0,boolean p1,Object p2){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public Object a(){
       return this.e;
    }
    public final void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "valueW");
       this.b = p0.value();
       return;
    }
    public boolean c(){
       boolean b = (this.c == null)? true: false;
       return b;
    }
    public void d(p p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "stateId");
       a.p(p1, "valueW");
       this.b = p1.value();
       c tc = this.c;
       if (tc == null) {
          return;
       }
       a.m(tc);
       c tb = this.b;
       a.m(tb);
       tc.onChange(tb);
       if (a.i.a()) {
          Object[] objArray = new Object[0];
          a.c.w("ChildStateReader", "notifyListener\(\) "+p0.b()+' '+p1, objArray);
       }
       return;
    }
    public void release(){
       this.c = null;
    }
    public Object value(){
       return this.b;
    }
}
