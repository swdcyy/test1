package aegon.chrome.net.impl.CronetBidirectionalStream$b;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import java.lang.Object;
import aegon.chrome.net.b;
import aegon.chrome.net.r;
import j0.p;
import java.lang.Exception;

public class CronetBidirectionalStream$b implements Runnable	// class@0001bc
{
    public final CronetBidirectionalStream b;

    public void CronetBidirectionalStream$b(CronetBidirectionalStream p0){
       this.b = p0;
       super();
    }
    public void run(){
       CronetBidirectionalStream o = this.b.o;
       _monitor_enter(o);
       if (this.b.l()) {
          _monitor_exit(o);
          return;
       }else {
          CronetBidirectionalStream$b tb = this.b;
          tb.v = 2;
          _monitor_exit(o);
          try{
             tb.c.d(tb, tb.x);
          }catch(java.lang.Exception e0){
             this.b.n(e0);
          }
          return;
       }
    }
}
