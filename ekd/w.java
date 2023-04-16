package ekd.w;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import java.lang.String;
import ekd.i1;
import java.io.FileFilter;
import java.lang.Exception;
import java.lang.Runtime;

public class w	// class@000d82
{
    public static int a;
    public static double b;

    public static synchronized int a(){
       int len;
       _monitor_enter(w.class);
       if (!w.a) {
          String a = SystemUtil.a;
          try{
             len = new File("/sys/devices/system/cpu/").listFiles(new i1()).length;
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
             len = Runtime.getRuntime().availableProcessors();
          }
          w.a = len;
       }
       _monitor_exit(w.class);
       return w.a;
    }
    public static synchronized double b(){
       _monitor_enter(w.class);
       if (!w.b) {
          w.b = SystemUtil.h();
       }
       _monitor_exit(w.class);
       return w.b;
    }
}
