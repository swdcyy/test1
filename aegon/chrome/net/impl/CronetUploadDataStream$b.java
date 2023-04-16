package aegon.chrome.net.impl.CronetUploadDataStream$b;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetUploadDataStream;
import java.lang.Object;
import i0.k;
import aegon.chrome.net.impl.l;
import java.lang.Throwable;

public class CronetUploadDataStream$b implements Runnable	// class@0001c5
{
    public final CronetUploadDataStream b;

    public void CronetUploadDataStream$b(CronetUploadDataStream p0){
       this.b = p0;
       super();
    }
    public void run(){
       CronetUploadDataStream i = this.b.i;
       _monitor_enter(i);
       CronetUploadDataStream$b tb = this.b;
       if (!tb.j) {
          _monitor_exit(i);
          return;
       }else {
          tb.f(3);
          tb = this.b;
          tb.k = 1;
          try{
             _monitor_exit(i);
             tb.e();
             CronetUploadDataStream$b tb1 = this.b;
             tb1.b.c(tb1);
          }catch(java.lang.Exception e0){
             this.b.i(e0);
          }
          return;
       }
    }
}
