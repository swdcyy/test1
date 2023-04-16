package ltd.o$e;
import ltd.o$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.o;
import ltd.n;
import ltd.x;
import ltd.o$d;
import ltd.z;
import kotlin.TypeCastException;
import kotlin.jvm.internal.a;

public class o$e extends o$a	// class@001cda
{
    public Object _affectedNode;
    public Object _originalNext;
    public final o b;
    public static final AtomicReferenceFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;

    static {
       o$e.c = AtomicReferenceFieldUpdater.newUpdater(o$e.class, Object.class, "_affectedNode");
       o$e.d = AtomicReferenceFieldUpdater.newUpdater(o$e.class, Object.class, "_originalNext");
    }
    public void o$e(o p0){
       super();
       this.b = p0;
       this._affectedNode = null;
       this._originalNext = null;
    }
    public static void o(){
    }
    public Object e(o p0){
       p0 = (p0 == this.b)? n.g(): null;
       return p0;
    }
    public final void f(o p0,o p1){
       p1.B(null);
    }
    public void g(o$d p0){
       o$e.c.compareAndSet(this, null, p0.a);
       o$e.d.compareAndSet(this, null, p0.b);
    }
    public final o h(){
       return this._affectedNode;
    }
    public final o i(){
       return this._originalNext;
    }
    public final boolean k(o p0,Object p1){
       if (!p1 instanceof z) {
          return false;
       }
       p1.a.Q();
       return true;
    }
    public final o l(x p0){
       o$e tb = this.b;
       while (true) {
          o _next = tb._next;
          if (_next instanceof x) {
             if (p0.b(_next)) {
                break ;
             }else {
                _next.c(this.b);
             }
          }else if(_next != null){
             return _next;
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
          }
       }
       return null;
    }
    public final Object m(o p0,o p1){
       return p1.Y();
    }
    public final Object n(){
       o oo = this.h();
       if (oo == null) {
          a.L();
       }
       return oo;
    }
}
