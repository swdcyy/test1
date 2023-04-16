package nfd.i3;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class i3	// class@001dba
{

    public void i3(){
       super();
    }
    public static boolean a(Uri p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && ("search").equals(p0.getScheme()))? true: false;
       return b;
    }
}
