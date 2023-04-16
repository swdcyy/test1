package aegon.chrome.net.impl.CronetUrlRequest$d;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import aegon.chrome.net.impl.k;
import java.lang.String;
import java.lang.Object;
import aegon.chrome.net.q;
import aegon.chrome.net.r;
import aegon.chrome.net.impl.m;
import java.lang.Exception;

public class CronetUrlRequest$d implements Runnable	// class@0001c9
{
    public final k b;
    public final String c;
    public final CronetUrlRequest d;

    public void CronetUrlRequest$d(CronetUrlRequest p0,k p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       this.d.j();
       CronetUrlRequest g = this.d.g;
       _monitor_enter(g);
       if (this.d.n()) {
          _monitor_exit(g);
          return;
       }else {
          CronetUrlRequest$d td = this.d;
          td.e = true;
          _monitor_exit(g);
          try{
             td.k.d(td, this.b, this.c);
          }catch(java.lang.Exception e0){
             this.d.p(e0);
          }
          return;
       }
    }
}
