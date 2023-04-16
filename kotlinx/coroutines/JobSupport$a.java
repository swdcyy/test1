package kotlinx.coroutines.JobSupport$a;
import ftd.l;
import asd.c;
import kotlinx.coroutines.JobSupport;
import ftd.z1;
import java.lang.Throwable;
import java.lang.Object;
import kotlinx.coroutines.JobSupport$c;
import ftd.x;
import java.util.concurrent.CancellationException;
import java.lang.String;

public final class JobSupport$a extends l	// class@001926
{
    public final JobSupport i;

    public void JobSupport$a(c p0,JobSupport p1){
       super(p0, 1);
       this.i = p1;
    }
    public Throwable p(z1 p0){
       Object obj = this.i.y0();
       if (obj instanceof JobSupport$c) {
          Throwable throwable = obj.e();
          if (throwable != null) {
             return throwable;
          }
       }
       if (obj instanceof x) {
          return obj.a;
       }else {
          return p0.O();
       }
    }
    public String z(){
       return "AwaitContinuation";
    }
}
