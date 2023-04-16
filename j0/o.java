package j0.o;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.lang.IllegalStateException;
import android.os.Build$VERSION;
import java.util.Locale;
import android.os.Build;

public final class o	// class@00199e
{
    public static final Object a;
    public static int b;

    static {
       o.a = new Object();
    }
    public static void a(StringBuilder p0){
       p0+" Cronet/"+"95.0.4638.74";
    }
    public static String b(Context p0){
       String packageName;
       StringBuilder str = p0.getPackageName()+'/';
       Object a = o.a;
       _monitor_enter(a);
       if (!o.b) {
          PackageManager packageManag = p0.getPackageManager();
          packageName = p0.getPackageName();
          try{
             int i = 0;
             o.b = packageManag.getPackageInfo(packageName, i).versionCode;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             throw new IllegalStateException("Cannot determine package version");
          }
       }
       _monitor_exit(a);
       str = str+o.b+" \(Linux; U; Android "+Build$VERSION.RELEASE+"; "+Locale.getDefault().toString();
       packageName = Build.MODEL;
       if (packageName.length() > 0) {
          str = str+"; "+packageName;
       }
       packageName = Build.ID;
       if (packageName.length() > 0) {
          str = str+"; Build/"+packageName;
       }
       str = str+";";
       o.a(str);
       return str+')';
    }
}
