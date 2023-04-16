package aegon.chrome.net.impl.CronetUrlRequest$b;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUrlRequest;
import java.lang.Object;
import aegon.chrome.net.impl.CronetUploadDataStream;
import aegon.chrome.net.impl.l;
import java.lang.Throwable;
import aegon.chrome.net.impl.CronetUploadDataStream$d;
import aegon.chrome.net.impl.f;
import K.S;

public class CronetUrlRequest$b implements Runnable	// class@0000ab
{
    public final CronetUrlRequest b;

    public void CronetUrlRequest$b(CronetUrlRequest p0){
       this.b = p0;
       super();
    }
    public void run(){
       CronetUrlRequest y = this.b.y;
       CronetUploadDataStream i = y.i;
       _monitor_enter(i);
       y.k = 2;
       _monitor_exit(i);
       y.c.j();
       long l = y.b.a();
       y.d = l;
       y.e = l;
       CronetUploadDataStream i1 = y.i;
       _monitor_enter(i1);
       y.k = 3;
       _monitor_exit(i1);
       y = this.b.g;
       _monitor_enter(y);
       if (this.b.n()) {
          _monitor_exit(y);
          return;
       }else {
          CronetUrlRequest$b tb = this.b;
          CronetUrlRequest y1 = tb.y;
          i = y1.i;
          _monitor_enter(i);
          f.g();
          y1.j = S.MA4X1aZa(y1, tb.c, y1.d);
          _monitor_exit(i);
          this.b.t();
          _monitor_exit(y);
          return;
       }
    }
}
