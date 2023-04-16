package l3.j$b;
import java.lang.Runnable;
import l3.j;
import w3.a;
import java.lang.String;
import java.lang.Object;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.ListenableWorker$a;
import k3.h;
import u3.r;
import java.lang.Throwable;

public class j$b implements Runnable	// class@00250a
{
    public final a b;
    public final String c;
    public final j d;

    public void j$b(j p0,a p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       Object[] objArray;
       Throwable[] throwableArr;
       int i = 1;
       int i1 = 0;
       try{
          ListenableWorker$a uoa = this.b.get();
          if (uoa == null) {
             Object[] objArray1 = new Object[i];
             objArray1[i1] = this.d.f.c;
             Throwable[] throwableArr1 = new Throwable[i1];
             h.c().b(j.u, String.format("%s returned a null result. Treating it as a failure.", objArray1), throwableArr1);
          }else {
             objArray = new Object[]{this.d.f.c,uoa};
             Throwable[] throwableArr2 = new Throwable[i1];
             h.c().a(j.u, String.format("%s returned a %s result.", objArray), throwableArr2);
             this.d.h = uoa;
          }
       }catch(java.util.concurrent.CancellationException e2){
          objArray = new Object[i];
          objArray[i1] = this.c;
          throwableArr = new Throwable[i];
          throwableArr[i1] = e2;
          h.c().d(j.u, String.format("%s was cancelled", objArray), throwableArr);
       }catch(java.lang.InterruptedException e2){
       }catch(java.util.concurrent.ExecutionException e2){
       }
       objArray = new Object[i];
       objArray[i1] = this.c;
       throwableArr = new Throwable[i];
       throwableArr[i1] = e2;
       h.c().b(j.u, String.format("%s failed because it threw an exception/error", objArray), throwableArr);
    }
}
