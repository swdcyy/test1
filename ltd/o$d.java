package ltd.o$d;
import ltd.x;
import ltd.o;
import ltd.o$a;
import ltd.d;
import ltd.b;
import java.lang.Object;
import ltd.p;
import ltd.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import java.lang.String;
import java.lang.StringBuilder;

public final class o$d extends x	// class@001cd9
{
    public final o a;
    public final o b;
    public final o$a c;

    public void o$d(o p0,o p1,o$a p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public d a(){
       return this.c.b();
    }
    public Object c(Object p0){
       d uod;
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       o$d obj = this.c.j(this);
       Object a = p.a;
       if (obj == a) {
          obj = this.b;
          if (o.b.compareAndSet(p0, this, obj.Y())) {
             obj.B(null);
          }
          return a;
       }else if(obj != null){
          this.a().e(obj);
          obj = 1;
       }else {
          boolean b = this.a().g();
       }
       obj = (obj)? this.b: this.a();
       o.b.compareAndSet(p0, this, obj);
       return null;
    }
    public final void d(){
       this.c.g(this);
    }
    public String toString(){
       return "PrepareOp\(op="+this.a()+')';
    }
}
