package m9a.u;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class u	// class@002f96
{

    public void u(){
       super();
    }
    public static int a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       return Math.max(p0.getWidth(), p0.getHeight());
    }
    public static int b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       return Math.min(p0.getWidth(), p0.getHeight());
    }
}
