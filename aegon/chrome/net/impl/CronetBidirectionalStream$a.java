package aegon.chrome.net.impl.CronetBidirectionalStream$a;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import java.lang.Object;
import java.lang.String;
import aegon.chrome.net.b;
import j0.p;
import java.lang.Exception;

public class CronetBidirectionalStream$a implements Runnable	// class@0001bb
{
    public final boolean b;
    public final CronetBidirectionalStream c;

    public void CronetBidirectionalStream$a(CronetBidirectionalStream p0,boolean p1){
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
          CronetBidirectionalStream$a tc = this.c;
          tc.s = this.b;
          tc.v = 2;
          if (!CronetBidirectionalStream.h(tc.f)) {
             tc = this.c;
             if (tc.s != null) {
                tc.w = 10;
             label_0031 :
                _monitor_exit(o);
                try{
                   CronetBidirectionalStream$a tc1 = this.c;
                   tc1.c.f(tc1);
                }catch(java.lang.Exception e0){
                   this.c.n(e0);
                }
                return;
             }
          }
          this.c.w = 8;
          goto label_0031 ;
       }
    }
}
