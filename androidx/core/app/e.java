package androidx.core.app.e;
import java.lang.Object;
import java.util.HashSet;
import android.content.Context;
import java.lang.String;
import android.app.NotificationManager;
import java.util.Set;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import android.content.ComponentName;
import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import android.os.Build$VERSION;
import android.app.AppOpsManager;
import android.content.pm.ApplicationInfo;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import android.app.NotificationChannel;
import java.util.List;
import java.util.Collections;
import androidx.core.app.e$a;
import androidx.core.app.e$d;
import androidx.core.app.e$c;

public final class e	// class@00022e
{
    public final Context a;
    public final NotificationManager b;
    public static final String c = "OP_POST_NOTIFICATION";
    public static final Object d;
    public static String e;
    public static Set f;
    public static final Object g;
    public static e$c h;

    static {
       e.d = new Object();
       e.f = new HashSet();
       e.g = new Object();
    }
    public void e(Context p0){
       super();
       this.a = p0;
       this.b = p0.getSystemService("notification");
    }
    public static e e(Context p0){
       return new e(p0);
    }
    public static Set f(Context p0){
       String str = a.g(p0.getContentResolver(), "enabled_notification_listeners");
       Object d = e.d;
       _monitor_enter(d);
       if (str != null && !str.equals(e.e)) {
          String[] stringArray = str.split(":", -1);
          HashSet hashSet = new HashSet(stringArray.length);
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             ComponentName uComponentNa = ComponentName.unflattenFromString(stringArray[i]);
             if (uComponentNa != null) {
                hashSet.add(uComponentNa.getPackageName());
             }
             i = i + 1;
          }
          e.f = hashSet;
          e.e = str;
       }
       _monitor_exit(d);
       return e.f;
    }
    public static boolean l(Notification p0){
       Bundle uBundle = NotificationCompat.k(p0);
       boolean b = (uBundle != null && uBundle.getBoolean("android.support.useSideChannel"))? true: false;
       return b;
    }
    public boolean a(){
       if (Build$VERSION.SDK_INT >= 24) {
          return this.b.areNotificationsEnabled();
       }
       AppOpsManager systemServic = this.a.getSystemService("appops");
       String packageName = this.a.getApplicationContext().getPackageName();
       ApplicationInfo uid = this.a.getApplicationInfo().uid;
       try{
          boolean i = 1;
          Class uClass = Class.forName(AppOpsManager.class.getName());
          Class[] uClassArray = new Class[3];
          Class tYPE = Integer.TYPE;
          uClassArray[0] = tYPE;
          uClassArray[i] = tYPE;
          uClassArray[2] = String.class;
          Method method = uClass.getMethod("checkOpNoThrow", uClassArray);
          Object[] objArray = new Object[3];
          objArray[0] = Integer.valueOf(uClass.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class).intValue());
          objArray[i] = Integer.valueOf(uid);
          objArray[2] = packageName;
          if (method.invoke(systemServic, objArray).intValue()) {
             i = false;
          }
       label_0079 :
          return i;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.NoSuchFieldException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.RuntimeException e0){
       }
    }
    public void b(int p0){
       this.c(null, p0);
    }
    public void c(String p0,int p1){
       this.b.cancel(p0, p1);
    }
    public void d(NotificationChannel p0){
       if (Build$VERSION.SDK_INT >= 26) {
          this.b.createNotificationChannel(p0);
       }
       return;
    }
    public NotificationChannel g(String p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return this.b.getNotificationChannel(p0);
       }
       return null;
    }
    public List h(){
       if (Build$VERSION.SDK_INT >= 26) {
          return this.b.getNotificationChannels();
       }
       return Collections.emptyList();
    }
    public void i(int p0,Notification p1){
       this.j(null, p0, p1);
    }
    public void j(String p0,int p1,Notification p2){
       if (e.l(p2)) {
          this.k(new e$a(this.a.getPackageName(), p1, p0, p2));
          this.b.cancel(p0, p1);
       }else {
          this.b.notify(p0, p1, p2);
       }
       return;
    }
    public final void k(e$d p0){
       Object g = e.g;
       _monitor_enter(g);
       if (e.h == null) {
          e.h = new e$c(this.a.getApplicationContext());
       }
       e.h.h(p0);
       _monitor_exit(g);
       return;
    }
}
