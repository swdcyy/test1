package m9a.w;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.NetworkUtilsCached;
import o56.a;
import android.content.Context;
import f3b.k;
import java.lang.Boolean;

public class w	// class@002f9a
{

    public void w(){
       super();
    }
    public static int a(){
       Object obj = PatchProxy.apply(null, null, w.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (w.b()) {
          return 1;
       }
       if (NetworkUtilsCached.l()) {
          return 2;
       }
       if (NetworkUtilsCached.j()) {
          return k.a(NetworkUtilsCached.a(a.B));
       }
       return 0;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (NetworkUtilsCached.k() ^ 0x01);
    }
}
