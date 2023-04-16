package hp8.d;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class d	// class@0025c9
{

    public void d(){
       super();
    }
    public static File a(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{p1};
       return new File(p0.getFilesDir(), String.format("kds_native/font/%s", objArray));
    }
}
