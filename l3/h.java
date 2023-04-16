package l3.h;
import java.lang.String;
import k3.h;
import android.content.Context;
import java.io.File;
import android.os.Build$VERSION;
import java.lang.Throwable;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.lang.StringBuilder;

public class h	// class@002505
{
    public static final String a;
    public static final String[] b;

    static {
       h.a = h.f("WrkDbPathHelper");
       String[] stringArray = new String[]{"-journal","-shm","-wal"};
       h.b = stringArray;
    }
    public static File a(Context p0){
       if (Build$VERSION.SDK_INT < 23) {
          return h.b(p0);
       }
       return h.c(p0, "androidx.work.workdb");
    }
    public static File b(Context p0){
       return p0.getDatabasePath("androidx.work.workdb");
    }
    public static File c(Context p0,String p1){
       return new File(p0.getNoBackupFilesDir(), p1);
    }
    public static void d(Context p0){
       Object[] objArray;
       String str;
       File uFile = h.b(p0);
       if (Build$VERSION.SDK_INT >= 23 && uFile.exists()) {
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(h.a, "Migrating WorkDatabase to the no-backup directory", throwableArr);
          HashMap hashMap = h.e(p0);
          Iterator iterator = hashMap.keySet().iterator();
          while (iterator.hasNext()) {
             File uFile1 = iterator.next();
             File uFile2 = hashMap.get(uFile1);
             if (uFile1.exists() && uFile2 != null) {
                int i = 1;
                if (uFile2.exists()) {
                   objArray = new Object[i];
                   objArray[0] = uFile2;
                   Throwable[] throwableArr1 = new Throwable[0];
                   h.c().h(h.a, String.format("Over-writing contents of %s", objArray), throwableArr1);
                }
                int i1 = 2;
                if (uFile1.renameTo(uFile2)) {
                   objArray = new Object[i1];
                   objArray[0] = uFile1;
                   objArray[i] = uFile2;
                   str = String.format("Migrated %s to %s", objArray);
                }else {
                   objArray = new Object[i1];
                   objArray[0] = uFile1;
                   objArray[i] = uFile2;
                   str = String.format("Renaming %s to %s failed", objArray);
                }
                Throwable[] throwableArr2 = new Throwable[0];
                h.c().a(h.a, str, throwableArr2);
             }
          }
       }
       return;
    }
    public static Map e(Context p0){
       HashMap hashMap = new HashMap();
       if (Build$VERSION.SDK_INT >= 23) {
          File uFile = h.b(p0);
          File uFile1 = h.a(p0);
          hashMap.put(uFile, uFile1);
          String[] b = h.b;
          int len = b.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = b[i];
             hashMap.put(new File(uFile.getPath()+oobject), new File(uFile1.getPath()+oobject));
          }
       }
       return hashMap;
    }
}
