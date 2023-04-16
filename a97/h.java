package a97.h;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;

public class h	// class@000087
{
    public static final Handler a;

    static {
       h.a = new Handler(Looper.getMainLooper());
    }
    public static void a(Runnable p0){
       if (Looper.getMainLooper() == Looper.myLooper()) {
          p0.run();
       }else {
          h.a.post(p0);
       }
       return;
    }
}
