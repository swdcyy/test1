package ya.i;
import ya.e;
import android.os.Handler;
import android.os.Looper;
import java.lang.Runnable;
import java.lang.Thread;

public class i extends e	// class@00286f
{
    public static i c;

    public void i(){
       super(new Handler(Looper.getMainLooper()));
    }
    public static i d(){
       if (i.c == null) {
          i.c = new i();
       }
       return i.c;
    }
    public void execute(Runnable p0){
       int i = (Thread.currentThread() == this.b.getLooper().getThread())? 1: 0;
       if (i) {
          p0.run();
       }else {
          super.execute(p0);
       }
       return;
    }
}
