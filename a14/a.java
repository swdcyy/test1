package a14.a;
import java.lang.Object;
import java.util.Stack;
import a14.a$a;
import a14.a$b;
import ks3.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;

public class a	// class@000015
{
    public final Stack a;

    public void a(){
       super();
       this.a = new Stack();
    }
    public void a(a$a p0){
       super();
       this.a = new Stack();
    }
    public static a b(){
       return a$b.a;
    }
    public boolean a(o p0){
       o obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       this.a.push(p0);
       p0.c();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj != this.a.peek()) {
             obj.a();
          }
       }
       return true;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.isEmpty()) {
          return false;
       }
       this.a.pop().b();
       if (!this.a.isEmpty()) {
          this.a.peek().c();
       }
       return true;
    }
}
