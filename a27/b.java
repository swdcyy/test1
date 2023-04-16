package a27.b;
import java.lang.Object;
import android.content.Context;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.o;

public class b	// class@00002d
{
    public static SharedPreferences a;

    public void b(){
       super();
    }
    public static SharedPreferences a(Context p0){
       if (b.a == null) {
          _monitor_enter(b.class);
          if (b.a == null) {
             b.a = o.c(p0, "keyboard.common", 0);
          }
          _monitor_exit(b.class);
       }
       return b.a;
    }
}
