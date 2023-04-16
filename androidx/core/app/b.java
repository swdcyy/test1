package androidx.core.app.b;
import android.app.Activity;
import android.content.Intent;
import java.lang.String;
import android.content.ComponentName;
import android.content.Context;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import java.lang.StringBuilder;

public final class b	// class@0006fc
{

    public static Intent a(Activity p0){
       Intent parentActivi = p0.getParentActivityIntent();
       if (parentActivi != null) {
          return parentActivi;
       }
       String str = b.c(p0);
       if (str == null) {
          return null;
       }
       try{
          ComponentName uComponentNa = new ComponentName(p0, str);
          Intent intent = (b.d(p0, uComponentNa) == null)? Intent.makeMainActivity(uComponentNa): new Intent().setComponent(uComponentNa);
          return intent;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          return null;
       }
    }
    public static Intent b(Context p0,ComponentName p1){
       String str = b.d(p0, p1);
       if (str == null) {
          return null;
       }
       ComponentName uComponentNa = new ComponentName(p1.getPackageName(), str);
       Intent intent = (b.d(p0, uComponentNa) == null)? Intent.makeMainActivity(uComponentNa): new Intent().setComponent(uComponentNa);
       return intent;
    }
    public static String c(Activity p0){
       try{
          return b.d(p0, p0.getComponentName());
       }catch(android.content.pm.PackageManager$NameNotFoundException e1){
          throw new IllegalArgumentException(e1);
       }
    }
    public static String d(Context p0,ComponentName p1){
       PackageManager packageManag = p0.getPackageManager();
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 640;
       if (sDK_INT >= 29) {
          i = 0x100c0280;
       }else if(sDK_INT >= 24){
          i = 0xc0280;
       }
       ActivityInfo activityInfo = packageManag.getActivityInfo(p1, i);
       ActivityInfo parentActivi = activityInfo.parentActivityName;
       if (parentActivi != null) {
          return parentActivi;
       }else {
          activityInfo = activityInfo.metaData;
          String str = null;
          if (activityInfo == null) {
             return str;
          }else {
             String str1 = activityInfo.getString("android.support.PARENT_ACTIVITY");
             if (str1 == null) {
                return str;
             }else if(str1.charAt(0) == '.'){
                str1 = p0.getPackageName()+str1;
             }
             return str1;
          }
       }
    }
    public static void e(Activity p0,Intent p1){
       p0.navigateUpTo(p1);
    }
    public static boolean f(Activity p0,Intent p1){
       return p0.shouldUpRecreateTask(p1);
    }
}
