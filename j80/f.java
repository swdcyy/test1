package j80.f;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import android.os.Environment;
import java.lang.Number;
import y56.a;
import java.lang.Boolean;

public class f	// class@0019bc
{

    public void f(){
       super();
    }
    public static void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "9")) {
          return;
       }
       if (p0 != null && p0.exists()) {
          p0.delete();
       }
       return;
    }
    public static File b(Context p0){
       File obj = PatchProxy.applyOneRefs(p0, null, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (SystemUtil.a(24))? p0.getDataDir(): null;
       if (obj == null) {
          obj = new File(Environment.getDataDirectory().getPath()+"/data/"+p0.getPackageName());
          if (!obj.exists()) {
             return null;
          }
       }
       return obj;
    }
    public static long c(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (!p0.exists()) {
          return l;
       }
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          return l;
       }
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          long l1 = (oobject.isDirectory())? f.c(oobject): oobject.length();
          l = l + l1;
       }
       return l;
    }
    public static long d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.c(new File(p0));
    }
    public static boolean e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new File(p0).exists();
    }
    public static String f(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, f.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       return p0.replaceAll("[\\\\/:*?\"<>|]", "_");
    }
}
