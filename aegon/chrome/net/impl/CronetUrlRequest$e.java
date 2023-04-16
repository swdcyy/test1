package aegon.chrome.net.impl.CronetUrlRequest$e;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.Object;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import aegon.chrome.net.impl.m;
import java.lang.Exception;

public class CronetUrlRequest$e implements Runnable	// class@0000ae
{
    public final CronetUrlRequest b;

    public void CronetUrlRequest$e(CronetUrlRequest p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.j();
       CronetUrlRequest g = this.b.g;
       _monitor_enter(g);
       if (this.b.n()) {
          _monitor_exit(g);
          return;
       }else {
          CronetUrlRequest$e tb = this.b;
          tb.f = true;
          _monitor_exit(g);
          try{
             tb.k.e(tb, tb.z);
          }catch(java.lang.Exception e0){
             this.b.p(e0);
          }
          return;
       }
    }
}
