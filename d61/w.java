package d61.w;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;

public class w	// class@001f43
{

    public void w(){
       super();
    }
    public static boolean a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean requestedOri = p0.getRequestedOrientation();
       requestedOri = (requestedOri && (requestedOri == 8 || requestedOri == 6))? true: false;
       return requestedOri;
    }
    public static boolean b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof Activity) {
          return w.a(p0);
       }
       Resources resources = p0.getResources();
       boolean b = (resources != null && (resources.getConfiguration() != null && resources.getConfiguration().orientation == 2))? true: false;
       return b;
    }
}
