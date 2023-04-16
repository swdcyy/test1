package zx6.b;
import zx6.b$a;
import nsd.u;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import zx6.b$b;
import java.lang.Runnable;

public abstract class b	// class@003fa5
{
    public final Handler a;
    public boolean b;
    public final Runnable c;
    public static final b$a d;

    static {
       b.d = new b$a(null);
    }
    public void b(){
       super();
       this.a = new Handler(Looper.getMainLooper());
       this.c = new b$b(this);
    }
    public final void a(){
       this.a.postDelayed(this.c, 200);
    }
    public abstract void b();
    public final void c(){
       if (this.b != null) {
          return;
       }
       this.a.removeCallbacks(this.c);
       this.a();
       this.b = true;
       return;
    }
    public final void d(){
       this.b();
       this.a.removeCallbacks(this.c);
       this.b = false;
    }
}
