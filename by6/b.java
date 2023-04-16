package by6.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class b	// class@0004af
{

    public void b(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       Log.g("NetworkDetect", p0);
       return;
    }
}
