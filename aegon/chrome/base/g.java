package aegon.chrome.base.g;
import android.os.Handler;
import android.os.Looper;
import java.lang.IllegalStateException;
import java.lang.Object;
import aegon.chrome.base.ThreadUtils$a;
import c0.a;
import java.util.HashMap;

public final class g	// class@00016d
{
    public final ThreadUtils$a a;
    public final a b;
    public Handler c;
    public HashMap d;

    public void g(){
       Looper looper = Looper.myLooper();
       if (looper == null) {
          throw new IllegalStateException();
       }
       super(new Handler(looper));
       return;
    }
    public void g(Handler p0){
       super();
       this.a = new ThreadUtils$a();
       this.b = new a();
       this.d = new HashMap();
       this.c = p0;
    }
}
