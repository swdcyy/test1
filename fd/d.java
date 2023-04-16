package fd.d;
import java.lang.String;
import gg.a;

public class d	// class@001feb
{
    public static boolean a;

    public static synchronized void a(){
       _monitor_enter(d.class);
       if (!d.a) {
          a.c("static-webp");
          d.a = true;
       }
       _monitor_exit(d.class);
       return;
    }
}
