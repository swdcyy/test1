package aegon.chrome.net.impl.CronetBidirectionalStream$h;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetBidirectionalStream;
import java.nio.ByteBuffer;
import java.lang.Object;
import aegon.chrome.net.b;
import aegon.chrome.net.r;
import j0.p;
import java.lang.Exception;

public final class CronetBidirectionalStream$h implements Runnable	// class@0001c2
{
    public ByteBuffer b;
    public final boolean c;
    public final CronetBidirectionalStream d;

    public void CronetBidirectionalStream$h(CronetBidirectionalStream p0,ByteBuffer p1,boolean p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       try{
          CronetBidirectionalStream$h tb = this.b;
          this.b = null;
          CronetBidirectionalStream o = this.d.o;
          _monitor_enter(o);
          if (this.d.l()) {
             _monitor_exit(o);
             return;
          }else {
             CronetBidirectionalStream$h tc = this.c;
             int i = 0;
             if (tc != null) {
                CronetBidirectionalStream$h td = this.d;
                td.w = 10;
                if (td.v == 4) {
                   i = 1;
                }
             }
             _monitor_exit(o);
             CronetBidirectionalStream$h td1 = this.d;
             td1.c.h(td1, td1.x, tb, tc);
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
