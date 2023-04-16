package yb7.n;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import tb7.b;

public final class n	// class@00287c
{
    public static String a;
    public static String b;
    public static String c;
    public static int d;

    public static long a(Context p0){
       ActivityManager systemServic = p0.getSystemService("activity");
       if (systemServic == null) {
          return 0;
       }
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       systemServic.getMemoryInfo(memoryInfo);
       return memoryInfo.availMem;
    }
    public static String b(Context p0){
       return b.e(p0);
    }
    public static boolean c(Context p0){
       return b.i(p0);
    }
}
