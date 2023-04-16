package ptd.g;
import ltd.b0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.sync.SemaphoreKt;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class g extends b0	// class@0021fe
{
    public AtomicReferenceArray e;

    public void g(long p0,g p1,int p2){
       super(p0, p1, p2);
       this.e = new AtomicReferenceArray(SemaphoreKt.f);
    }
    public int o(){
       return SemaphoreKt.f;
    }
    public final void r(int p0){
       this.e.set(p0, SemaphoreKt.e);
       this.p();
    }
    public final boolean s(int p0,Object p1,Object p2){
       return this.e.compareAndSet(p0, p1, p2);
    }
    public final Object t(int p0){
       return this.e.get(p0);
    }
    public String toString(){
       return "SemaphoreSegment[id="+this.n()+", hashCode="+this.hashCode()+']';
    }
    public final Object u(int p0,Object p1){
       return this.e.getAndSet(p0, p1);
    }
    public final void v(int p0,Object p1){
       this.e.set(p0, p1);
    }
}
