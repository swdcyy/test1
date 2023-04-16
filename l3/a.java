package l3.a;
import k3.k;
import java.lang.Object;
import android.os.Looper;
import android.os.Handler;
import w1.d;
import java.lang.Runnable;

public class a implements k	// class@0024fd
{
    public final Handler a;

    public void a(){
       super();
       this.a = d.a(Looper.getMainLooper());
    }
    public void a(Handler p0){
       super();
       this.a = p0;
    }
    public void a(long p0,Runnable p1){
       this.a.postDelayed(p1, p0);
    }
    public void b(Runnable p0){
       this.a.removeCallbacks(p0);
    }
}
