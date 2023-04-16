package a5.m$a;
import java.util.concurrent.FutureTask;
import a5.m;
import java.util.concurrent.Callable;
import java.lang.Object;
import a5.k;
import java.lang.Throwable;

public class m$a extends FutureTask	// class@0000ec
{
    public final m b;

    public void m$a(m p0,Callable p1){
       this.b = p0;
       super(p1);
    }
    public void done(){
       if (this.isCancelled()) {
          return;
       }
       try{
          this.b.c(this.get());
       label_0020 :
          return;
       }catch(java.lang.InterruptedException e0){
       }catch(java.util.concurrent.ExecutionException e0){
       }
       this.b.c(new k(e0));
       goto label_0020 ;
    }
}
