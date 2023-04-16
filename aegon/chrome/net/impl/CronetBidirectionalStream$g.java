package aegon.chrome.net.impl.CronetBidirectionalStream$g;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import java.lang.Object;
import aegon.chrome.net.b;
import aegon.chrome.net.r;
import java.nio.ByteBuffer;
import j0.p;
import java.lang.Exception;

public final class CronetBidirectionalStream$g implements Runnable	// class@0001c1
{
    public ByteBuffer b;
    public boolean c;
    public final CronetBidirectionalStream d;

    public void CronetBidirectionalStream$g(CronetBidirectionalStream p0){
       this.d = p0;
       super();
    }
    public void run(){
       try{
          CronetBidirectionalStream$g tb = this.b;
          this.b = null;
          CronetBidirectionalStream o = this.d.o;
          _monitor_enter(o);
          if (this.d.l()) {
             _monitor_exit(o);
             return;
          }else {
             CronetBidirectionalStream$g tc = this.c;
             int i = 0;
             if (tc != null) {
                CronetBidirectionalStream$g td = this.d;
                td.v = 4;
                if (td.w == 10) {
                   i = 1;
                }
             }else {
                this.d.v = 2;
             }
             _monitor_exit(o);
             CronetBidirectionalStream$g td1 = this.d;
             td1.c.c(td1, td1.x, tb, tc);
             if (i) {
                this.d.m();
             }
          }
       }catch(java.lang.Exception e0){
          this.d.n(e0);
       }
       return;
    }
}
