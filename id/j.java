package id.j;
import id.b0;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Object;
import id.i;
import id.c0;
import com.facebook.imagepipeline.request.ImageRequest;
import id.j$a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;

public class j implements b0	// class@0021b4
{
    public final b0 a;
    public final ScheduledExecutorService b;

    public void j(b0 p0,ScheduledExecutorService p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void produceResults(i p0,c0 p1){
       ImageRequest imageRequest = p1.b();
       j tb = this.b;
       if (tb != null) {
          tb.schedule(new j$a(this, p0, p1), (long)imageRequest.f(), TimeUnit.MILLISECONDS);
       }else {
          this.a.produceResults(p0, p1);
       }
       return;
    }
}
