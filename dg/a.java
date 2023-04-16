package dg.a;
import dg.i;
import android.view.Choreographer;
import dg.a$a;
import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;

public class a extends i	// class@001e5d
{
    public final Choreographer b;
    public final Choreographer$FrameCallback c;
    public boolean d;
    public long e;

    public void a(Choreographer p0){
       super();
       this.b = p0;
       this.c = new a$a(this);
    }
    public static a c(){
       return new a(Choreographer.getInstance());
    }
    public void a(){
       if (this.d != null) {
          return;
       }
       this.d = true;
       this.e = SystemClock.uptimeMillis();
       this.b.removeFrameCallback(this.c);
       this.b.postFrameCallback(this.c);
       return;
    }
    public void b(){
       this.d = false;
       this.b.removeFrameCallback(this.c);
    }
}
