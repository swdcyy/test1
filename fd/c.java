package fd.c;
import java.lang.String;
import gg.a;

public class c	// class@001fea
{
    public static boolean a;

    public static synchronized void a(){
       _monitor_enter(c.class);
       if (!c.a) {
          a.c("native-imagetranscoder");
          c.a = true;
       }
       _monitor_exit(c.class);
       return;
    }
}
