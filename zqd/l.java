package zqd.l;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import java.lang.Object;

public abstract class l	// class@002b5f
{
    public l b;
    public static final AtomicReferenceFieldUpdater c;

    static {
       AtomicReferenceFieldUpdater uAtomicRefer = PlatformDependent.w(l.class, "next");
       if (uAtomicRefer == null) {
          uAtomicRefer = AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b");
       }
       l.c = uAtomicRefer;
    }
    public void l(){
       super();
    }
    public Object a(){
       return this.e();
    }
    public final l b(){
       return this.b;
    }
    public final void c(l p0){
       l.c.lazySet(this, p0);
    }
    public void d(){
       this.c(null);
    }
    public abstract Object e();
}
