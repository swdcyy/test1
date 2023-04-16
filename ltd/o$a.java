package ltd.o$a;
import ltd.b;
import ltd.d;
import java.lang.Object;
import ltd.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.x;
import ltd.c;
import ltd.o$d;
import ltd.p;
import kotlin.TypeCastException;
import java.lang.String;
import kotlin.jvm.internal.a;

public abstract class o$a extends b	// class@001cd6
{

    public void o$a(){
       super();
    }
    public final void a(d p0,Object p1){
       int i = (p1 == null)? 1: 0;
       o oo = this.h();
       if (oo != null) {
          o oo1 = this.i();
          if (oo1 != null) {
             o oo2 = (i)? this.m(oo, oo1): oo1;
             if (o.b.compareAndSet(oo, p0, oo2) && i) {
                this.f(oo, oo1);
             }
          }
       }
       return;
    }
    public final Object c(d p0){
       Object obj;
       while (true) {
          o oo = this.l(p0);
          if (oo == null) {
             return c.b;
          }
          o _next = oo._next;
          obj = null;
          if (_next == p0) {
             break ;
          }else if(p0.g()){
             return obj;
          }else if(_next instanceof x){
             if (p0.b(_next)) {
                return c.b;
             }
             _next.c(oo);
          }else {
             o$d obj1 = this.e(oo);
             if (obj1 != null) {
                return obj1;
             }
             if (this.k(oo, _next)) {
                continue ;
             }else if(_next != null){
                obj1 = new o$d(oo, _next, this);
                if (o.b.compareAndSet(oo, _next, obj1) && obj1.c(oo) != p.a) {
                label_004f :
                   return obj;
                }
                continue ;
             }else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
             }
          }
       }
       return obj;
    }
    public Object e(o p0){
       return null;
    }
    public abstract void f(o p0,o p1);
    public abstract void g(o$d p0);
    public abstract o h();
    public abstract o i();
    public Object j(o$d p0){
       this.g(p0);
       return null;
    }
    public boolean k(o p0,Object p1){
       return false;
    }
    public o l(x p0){
       o oo = this.h();
       if (oo == null) {
          a.L();
       }
       return oo;
    }
    public abstract Object m(o p0,o p1);
}
