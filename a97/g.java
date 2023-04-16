package a97.g;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Process;
import java.lang.Object;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Exception;

public class g	// class@000086
{
    public static String a;

    public static String a(Context p0){
       if (!TextUtils.isEmpty(g.a)) {
          return g.a;
       }
       try{
          int i = Process.myPid();
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic == null) {
             return "";
          }else {
             List runningAppPr = systemServic.getRunningAppProcesses();
             if (runningAppPr != null) {
                Iterator iterator = runningAppPr.iterator();
                while (iterator.hasNext()) {
                   ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                   if (runningAppPr1.pid == i) {
                      ActivityManager$RunningAppProcessInfo processName = runningAppPr1.processName;
                      g.a = processName;
                      return processName;
                   }
                }
             }
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return "";
    }
}
