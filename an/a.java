package an.a;
import brd.y;
import android.os.Looper;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Thread;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Objects;

public final class a	// class@00007e
{

    public static boolean a(y p0){
       if (Looper.myLooper() == Looper.getMainLooper()) {
          return true;
       }
       p0.onError(new IllegalStateException("Expected to be called on the main thread but was "+Thread.currentThread().getName()));
       return false;
    }
    public static void b(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
    }
}
