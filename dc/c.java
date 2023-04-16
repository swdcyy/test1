package dc.c;
import dc.b;
import dc.a;
import dc.c$b;
import hb.b;
import java.util.concurrent.ScheduledExecutorService;
import dc.c$a;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;

public class c extends b	// class@001e35
{
    public final b e;
    public final ScheduledExecutorService f;
    public boolean g;
    public long h;
    public long i;
    public long j;
    public c$b k;
    public final Runnable l;

    public void c(a p0,c$b p1,b p2,ScheduledExecutorService p3){
       super(p0);
       this.g = false;
       this.i = 2000;
       this.j = 1000;
       this.l = new c$a(this);
       this.k = p1;
       this.e = p2;
       this.f = p3;
    }
    public static b b(a p0,b p1,ScheduledExecutorService p2){
       return new c(p0, p0, p1, p2);
    }
    public synchronized void c(){
       if (this.g == null) {
          this.g = true;
          this.f.schedule(this.l, this.j, TimeUnit.MILLISECONDS);
       }
       return;
    }
    public boolean drawFrame(Drawable p0,Canvas p1,int p2){
       this.h = this.e.now();
       this.c();
       return super.drawFrame(p0, p1, p2);
    }
}
