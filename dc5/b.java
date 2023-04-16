package dc5.b;
import com.kwai.chat.kwailink.log.KLog;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.String;
import com.kwai.chat.kwailink.log.KLog$KLogLevel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q87.d;
import com.kwai.logger.KwaiLog;
import java.lang.Throwable;
import q87.e;
import q87.f;
import dc5.a;
import java.lang.Runnable;
import t45.c;
import java.util.Queue;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import dc5.c$a;
import java.lang.Enum;

public class b implements KLog	// class@0014ae
{
    public e a;
    public AtomicBoolean b;
    public Queue c;

    public void b(){
       super();
       this.b = new AtomicBoolean(false);
       this.c = new ConcurrentLinkedQueue();
    }
    public void a(String p0,KLog$KLogLevel p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       this.c(KwaiLog.k(p0, this.d(p1), p2, p3, objArray));
       return;
    }
    public void b(String p0,KLog$KLogLevel p1,String p2,String p3,Throwable p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
             return;
          }
       }
       this.c(KwaiLog.j(p0, this.d(p1), p2, p3, p4));
       return;
    }
    public final void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (this.a == null && this.b.compareAndSet(false, true)) {
          this.a = f.b("im");
          this.b.set(false);
          if (this.a != null) {
             c.a(new a(this));
          }
       }
       if (this.a == null) {
          this.c.add(p0);
          return;
       }else {
          this.a.d(p0);
          return;
       }
    }
    public final int d(KLog$KLogLevel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = c$a.a[p0.ordinal()];
       int i1 = 1;
       if (i == i1) {
          return i1;
       }
       if (i == 3) {
          return 4;
       }
       if (i == 4) {
          return 8;
       }
       if (i != 5) {
          return 2;
       }
       return 16;
    }
}
