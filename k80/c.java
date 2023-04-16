package k80.c;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class c	// class@002492
{

    public static final boolean a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$isEmpty");
       boolean b = true;
       if (p0.isFile()) {
          if (p0.length()) {
             b = false;
          }
          return b;
       }else {
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null) {
             uFileArray = new File[false];
          }
          int len = uFileArray.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                return b;
             }
             object oobject = uFileArray[i];
             a.o(oobject, "file");
             if (!c.a(oobject)) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return false;
       }
    }
}
