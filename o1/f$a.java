package o1.f$a;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import o1.f$a$b;
import java.lang.Runnable;
import android.graphics.Typeface;
import o1.f$a$a;

public abstract class f$a	// class@002741
{

    public void f$a(){
       super();
    }
    public static Handler c(Handler p0){
       if (p0 == null) {
          p0 = new Handler(Looper.getMainLooper());
       }
       return p0;
    }
    public final void a(int p0,Handler p1){
       f$a.c(p1).post(new f$a$b(this, p0));
    }
    public final void b(Typeface p0,Handler p1){
       f$a.c(p1).post(new f$a$a(this, p0));
    }
    public abstract void d(int p0);
    public abstract void e(Typeface p0);
}
