package ci3.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class c	// class@00056b
{

    public void c(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableLiteLiveRecommendOpt", false);
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSimpleLiveStreamingAddNewDislike", false);
    }
}
