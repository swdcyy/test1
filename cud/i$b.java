package cud.i$b;
import okio.n;
import cud.i;
import java.lang.Object;
import okio.o;
import okio.b;
import qrd.l1;
import kotlin.TypeCastException;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;

public final class i$b implements n	// class@000c8b
{
    public final o b;
    public final i c;

    public void i$b(i p0){
       this.c = p0;
       super();
       this.b = new o();
    }
    public void close(){
       b uob = this.c.a();
       _monitor_enter(uob);
       i$b tc = this.c;
       tc.c = true;
       b uob1 = tc.a();
       if (uob1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
       }
       uob1.notifyAll();
       _monitor_exit(uob);
       return;
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       b uob = this.c.a();
       _monitor_enter(uob);
       if (!(this.c.d() ^ 0x01)) {
       label_005d :
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          if (!this.c.a().p()) {
             if (this.c.c()) {
                break ;
             }else {
                this.b.waitUntilNotified(this.c.a());
             }
          }else {
             long l = this.c.a().read(p0, p1);
             b uob1 = this.c.a();
             if (uob1 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
             }
             uob1.notifyAll();
             _monitor_exit(uob);
             return l;
          }
       }
       _monitor_exit(uob);
       return -1;
    }
    public o timeout(){
       return this.b;
    }
}
