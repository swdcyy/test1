package v7.a;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import android.util.Log;
import com.android.kwai.platform.notification.core.log.StackLogException;
import com.kwai.lib.interfacies.AzerothCodeAdapter;
import com.google.gson.JsonElement;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import com.android.kwai.platform.notification.core.NotificationConfig;
import com.google.gson.Gson;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Process;
import android.content.Context;
import s7.a;
import android.app.ActivityManager;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;

public final class a	// class@002674
{
    public static final String a;
    public static String b;
    public static final a c;

    static {
       a.c = new a();
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       a.a = str;
       a.b = "";
    }
    public void a(){
       super();
    }
    public static void b(a p0,String p1,String p2,Pair[] p3,Throwable p4,int p5,Object p6){
       if (p5 & 0x02) {
          p2 = null;
       }
       if (p5 & 0x04) {
          p3 = new Pair[0];
       }
       if (p5 & 0x08) {
          p4 = null;
       }
       p0.a(p1, p2, p3, p4);
       return;
    }
    public static void f(a p0,String p1,String p2,Pair[] p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = "";
       }
       p3 = (p4 & 0x04)? new Pair[0]: null;
       p0.e(p1, p2, p3);
       return;
    }
    public final void a(String p0,String p1,Pair[] p2,Throwable p3){
       String stackTraceSt;
       a.p(p0, "key");
       a.p(p2, "pairs");
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("sdk_ver", "3.5.1");
       jsonObject.c0("sdk_config", this.c());
       jsonObject.c0("session", a.a);
       if (p3 != null) {
          stackTraceSt = Log.getStackTraceString(p3);
          if (stackTraceSt != null) {
          label_0038 :
             jsonObject.c0("stack", stackTraceSt);
             int len = p2.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = p2[i];
                String first = oobject.getFirst();
                jsonObject.c0(first, oobject.getSecond());
             }
             if (p1 == null) {
                p1 = "";
             }
             jsonObject.c0("simpleReason", p1);
             jsonObject.c0("processName", this.d());
             stackTraceSt = jsonObject.toString();
             a.o(stackTraceSt, "logJson.toString\(\)");
             AzerothCodeAdapter.b.addCustomStatEvent(0x3f800000, p0, stackTraceSt);
             return;
          }
       }
       stackTraceSt = Log.getStackTraceString(new StackLogException());
       goto label_0038 ;
    }
    public final String c(){
       String str;
       NotificationConfig notification = RemoteConfigManager.j.g();
       if (notification == null) {
          str = "empty";
       }else {
          str = new Gson().q(notification);
          a.o(str, "try {\n        Gson\(\).toJ¡­config.toString\(\)\n      }");
       }
       return str;
    }
    public final String d(){
       if (!TextUtils.isEmpty(a.b)) {
          return a.b;
       }
       int i = Process.myPid();
       ActivityManager systemServic = a.a().getSystemService("activity");
       if (systemServic != null) {
          List runningAppPr = systemServic.getRunningAppProcesses();
          if (runningAppPr != null && (runningAppPr.isEmpty() ^ 0x01)) {
             Iterator iterator = runningAppPr.iterator();
             while (iterator.hasNext()) {
                ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                if (runningAppPr1.pid == i) {
                   runningAppPr1 = runningAppPr1.processName;
                   a.o(runningAppPr1, "processInfo.processName");
                   a.b = runningAppPr1;
                }
             }
          }
       }
       return a.b;
    }
    public final void e(String p0,String p1,Pair[] p2){
       a.p(p0, "key");
       a.p(p1, "description");
       a.p(p2, "pairs");
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("sdk_ver", "3.5.1");
       jsonObject.c0("sdk_config", this.c());
       jsonObject.c0("description", p1);
       jsonObject.c0("session", a.a);
       jsonObject.c0("stack", Log.getStackTraceString(new StackLogException()));
       int len = p2.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p2[i];
          String first = oobject.getFirst();
          jsonObject.c0(first, oobject.getSecond());
       }
       jsonObject.c0("processName", this.d());
       String str = jsonObject.toString();
       a.o(str, "logJson.toString\(\)");
       AzerothCodeAdapter.b.addCustomStatEvent(0x3f800000, p0, str);
       return;
    }
}
