package nu6.c$a;
import nu6.a;
import java.lang.Object;
import iu6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;

public final class c$a implements a	// class@0033d2
{

    public void c$a(){
       super();
    }
    public boolean a(a p0){
       File obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bundleEntity");
       obj = new File(p0.e());
       boolean b = false;
       if (obj.exists()) {
          File[] uFileArray = obj.listFiles();
          if (uFileArray != null) {
             int i = (!uFileArray.length)? 1: 0;
             if ((i ^ 1) == 1) {
                b = true;
             }
          }
       }
       return b;
    }
}
