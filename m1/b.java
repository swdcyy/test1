package m1.b;
import android.content.Context;
import java.lang.String;
import l1.c;
import android.content.pm.PackageManager;
import android.os.Process;

public final class b	// class@001e2e
{

    public static int a(Context p0,String p1,int p2,int p3,String p4){
       object oobject;
       if (p0.checkPermission(p1, p2, p3) == -1) {
          return -1;
       }
       p1 = c.c(p1);
       if (p1 == null) {
          return 0;
       }
       if (p4 == null) {
          String[] packagesForU = p0.getPackageManager().getPackagesForUid(p3);
          if (packagesForU == null || packagesForU.length <= 0) {
             return -1;
          }else {
             oobject = packagesForU[0];
          }
       }
       if (c.b(p0, p1, oobject)) {
          return -2;
       }else {
          return 0;
       }
    }
    public static int b(Context p0,String p1){
       return b.a(p0, p1, Process.myPid(), Process.myUid(), p0.getPackageName());
    }
}
