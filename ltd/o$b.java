package ltd.o$b;
import ltd.o$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.o;
import ltd.o$d;
import ltd.x;

public class o$b extends o$a	// class@001cd7
{
    public Object _affectedNode;
    public final o b;
    public final o c;
    public static final AtomicReferenceFieldUpdater d;

    static {
       o$b.d = AtomicReferenceFieldUpdater.newUpdater(o$b.class, Object.class, "_affectedNode");
    }
    public void o$b(o p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
       this._affectedNode = null;
    }
    public void f(o p0,o p1){
       this.c.K(this.b);
    }
    public void g(o$d p0){
       o$b.d.compareAndSet(this, null, p0.a);
    }
    public final o h(){
       return this._affectedNode;
    }
    public final o i(){
       return this.b;
    }
    public boolean k(o p0,Object p1){
       boolean b = (p1 != this.b)? true: false;
       return b;
    }
    public final o l(x p0){
       return this.b.B(p0);
    }
    public Object m(o p0,o p1){
       o.c.compareAndSet(this.c, this.c, p0);
       o.b.compareAndSet(this.c, this.c, this.b);
       return this.c;
    }
}
