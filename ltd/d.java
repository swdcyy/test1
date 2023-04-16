package ltd.d;
import ltd.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.c;

public abstract class d extends x	// class@001cc5
{
    public Object _consensus;
    public static final AtomicReferenceFieldUpdater a;

    static {
       d.a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    }
    public void d(){
       super();
       this._consensus = c.a;
    }
    public d a(){
       return this;
    }
    public final Object c(Object p0){
       d t_consensus = this._consensus;
       if (t_consensus == c.a) {
          t_consensus = this.e(this.h(p0));
       }
       this.d(p0, t_consensus);
       return t_consensus;
    }
    public abstract void d(Object p0,Object p1);
    public final Object e(Object p0){
       d t_consensus = this._consensus;
       Object a = c.a;
       if (t_consensus != a) {
          return t_consensus;
       }
       if (d.a.compareAndSet(this, a, p0)) {
          return p0;
       }
       return this._consensus;
    }
    public long f(){
       return 0;
    }
    public final boolean g(){
       boolean b = (this._consensus != c.a)? true: false;
       return b;
    }
    public abstract Object h(Object p0);
}
