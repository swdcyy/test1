package aegon.chrome.net.impl.CronetBidirectionalStream$c;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import aegon.chrome.net.r$a;
import java.lang.Object;
import aegon.chrome.net.b;
import aegon.chrome.net.r;
import j0.p;
import java.lang.Exception;

public class CronetBidirectionalStream$c implements Runnable	// class@0001bd
{
    public final r$a b;
    public final CronetBidirectionalStream c;

    public void CronetBidirectionalStream$c(CronetBidirectionalStream p0,r$a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       CronetBidirectionalStream o = this.c.o;
       _monitor_enter(o);
       if (this.c.l()) {
          _monitor_exit(o);
          return;
       }else {
          _monitor_exit(o);
          try{
             CronetBidirectionalStream$c tc = this.c;
             tc.c.e(tc, tc.x, this.b);
          }catch(java.lang.Exception e0){
             this.c.n(e0);
          }
          return;
       }
    }
}
