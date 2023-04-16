package qj7.h;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.Boolean;

public class h	// class@002284
{
    public static String a;
    public static Boolean b;

    public void h(){
       super();
    }
    public static String a(Context p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(h.a)) {
          return h.a;
       }
       try{
          int i = Process.myPid();
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic != null) {
             List runningAppPr = systemServic.getRunningAppProcesses();
             if (runningAppPr != null) {
                Iterator iterator = runningAppPr.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                      if (runningAppPr1.pid == i) {
                         h.a = runningAppPr1.processName;
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       if (TextUtils.isEmpty(h.a)) {
          try{
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cmdline")));
             obj = "";
             int i1 = uBufferedRea.read();
             while (i1 > 0) {
                obj = obj+(char)i1;
             }
             h.a = obj;
             uBufferedRea.close();
          }catch(java.io.FileNotFoundException e3){
             e3.printStackTrace();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
       }
    }
    public static boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (h.b == null) {
          h.b = Boolean.valueOf((p0.getPackageName()).equals(h.a(p0)));
       }
       return h.b.booleanValue();
    }
}
