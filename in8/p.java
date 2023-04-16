package in8.p;
import in8.u;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import java.util.Stack;
import java.lang.Object;
import in8.m;
import java.lang.Integer;
import java.lang.Class;
import hn8.e;
import in8.e;

public class p extends u	// class@0026e4
{
    public final Stack b;
    public String c;

    public void p(int p0,ReadableMap p1,b p2){
       super(p0, p1, p2);
       this.b = new Stack();
    }
    public void b(Object p0){
       m tmUpdateCont = this.mUpdateContext;
       e b = tmUpdateCont.b;
       tmUpdateCont.b = this.c;
       this.mNodesManager.a(this.b.peek().intValue(), m.class).b(p0);
       p0.b = b;
    }
    public boolean d(){
       m om = this.mNodesManager.a(this.b.peek().intValue(), m.class);
       if (om instanceof p) {
          return om.d();
       }
       return om.a;
    }
    public void e(){
       m om = this.mNodesManager.a(this.b.peek().intValue(), m.class);
       if (om instanceof p) {
          om.e();
       }else {
          om.b();
       }
       return;
    }
    public Object evaluate(){
       m tmUpdateCont = this.mUpdateContext;
       e b = tmUpdateCont.b;
       tmUpdateCont.b = this.c;
       this.mUpdateContext.b = b;
       return this.mNodesManager.a(this.b.peek().intValue(), m.class).value();
    }
    public void f(){
       m om = this.mNodesManager.a(this.b.peek().intValue(), m.class);
       if (om instanceof p) {
          om.f();
       }else {
          om.d();
       }
       return;
    }
}
