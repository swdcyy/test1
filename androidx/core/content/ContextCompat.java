package androidx.core.content.ContextCompat;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Process;
import java.lang.IllegalArgumentException;
import android.os.Build$VERSION;
import java.io.File;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import androidx.core.content.ContextCompat$b;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import androidx.core.content.ContextCompat$a;
import java.util.HashMap;
import android.content.Intent;
import android.os.Bundle;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;

public class ContextCompat	// class@00070b
{
    public static final Object sLock;
    public static TypedValue sTempValue;

    static {
       ContextCompat.sLock = new Object();
    }
    public void ContextCompat(){
       super();
    }
    public static int checkSelfPermission(Context p0,String p1){
       if (p1 != null) {
          return p0.checkPermission(p1, Process.myPid(), Process.myUid());
       }
       throw new IllegalArgumentException("permission is null");
    }
    public static Context createDeviceProtectedStorageContext(Context p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return p0.createDeviceProtectedStorageContext();
       }
       return null;
    }
    public static synchronized File createFilesDir(File p0){
       _monitor_enter(ContextCompat.class);
       if (!p0.exists() && !p0.mkdirs()) {
          if (p0.exists()) {
             _monitor_exit(ContextCompat.class);
             return p0;
          }else {
             p0.getPath();
             _monitor_exit(ContextCompat.class);
             return null;
          }
       }else {
          _monitor_exit(ContextCompat.class);
          return p0;
       }
    }
    public static File getCodeCacheDir(Context p0){
       return p0.getCodeCacheDir();
    }
    public static int getColor(Context p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getColor(p1);
       }
       return p0.getResources().getColor(p1);
    }
    public static ColorStateList getColorStateList(Context p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getColorStateList(p1);
       }
       return p0.getResources().getColorStateList(p1);
    }
    public static File getDataDir(Context p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return p0.getDataDir();
       }
       ApplicationInfo dataDir = p0.getApplicationInfo().dataDir;
       File uFile = (dataDir != null)? new File(dataDir): null;
       return uFile;
    }
    public static Drawable getDrawable(Context p0,int p1){
       return p0.getDrawable(p1);
    }
    public static File[] getExternalCacheDirs(Context p0){
       return p0.getExternalCacheDirs();
    }
    public static File[] getExternalFilesDirs(Context p0,String p1){
       return p0.getExternalFilesDirs(p1);
    }
    public static Executor getMainExecutor(Context p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getMainExecutor();
       }
       return new ContextCompat$b(new Handler(p0.getMainLooper()));
    }
    public static File getNoBackupFilesDir(Context p0){
       return p0.getNoBackupFilesDir();
    }
    public static File[] getObbDirs(Context p0){
       return p0.getObbDirs();
    }
    public static Object getSystemService(Context p0,Class p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getSystemService(p1);
       }
       String systemServic = ContextCompat.getSystemServiceName(p0, p1);
       p0 = (systemServic != null)? p0.getSystemService(systemServic): null;
       return p0;
    }
    public static String getSystemServiceName(Context p0,Class p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getSystemServiceName(p1);
       }
       return ContextCompat$a.a.get(p1);
    }
    public static boolean isDeviceProtectedStorage(Context p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return p0.isDeviceProtectedStorage();
       }
       return false;
    }
    public static boolean startActivities(Context p0,Intent[] p1){
       return ContextCompat.startActivities(p0, p1, null);
    }
    public static boolean startActivities(Context p0,Intent[] p1,Bundle p2){
       p0.startActivities(p1, p2);
       return true;
    }
    public static void startActivity(Context p0,Intent p1,Bundle p2){
       p0.startActivity(p1, p2);
    }
    public static void startForegroundService(Context p0,Intent p1){
       if (Build$VERSION.SDK_INT >= 26) {
          a.d(p0, p1);
       }else {
          a.e(p0, p1);
       }
       return;
    }
}
