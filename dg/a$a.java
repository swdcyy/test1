package dg.a$a;
import android.view.Choreographer$FrameCallback;
import dg.a;
import java.lang.Object;
import dg.i;
import android.os.SystemClock;
import dg.c;
import android.view.Choreographer;

public class a$a implements Choreographer$FrameCallback	// class@001e5c
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void doFrame(long p0){
       a$a tb = this.b;
       if (tb.d != null && tb.a != null) {
          tb = SystemClock.uptimeMillis();
          a$a tb1 = this.b;
          tb1.a.c((double)(tb - tb1.e));
          tb1 = this.b;
          tb1.e = tb;
          tb1.b.postFrameCallback(tb1.c);
       }
       return;
    }
}
