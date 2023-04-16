package bp7.b;
import uo7.g0;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.k;
import java.lang.String;
import uo7.h0;
import uo7.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bp7.a;
import kotlin.jvm.internal.a;
import uo7.g0$a;

public final class b implements g0	// class@000439
{

    public void b(){
       super();
    }
    public c0 S3(ShareAnyResponse$ShareObject p0,k p1,String p2,String p3,h0 p4){
       a uoa;
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          uoa = PatchProxy.apply(objArray, this, b.class, "1");
          if (uoa != PatchProxyResult.class) {
          label_003b :
             return uoa;
          }
       }
       a.p(p0, "shareData");
       a.p(p1, "conf");
       a.p(p4, "urlMgr");
       uoa = new a(p0, p1);
       goto label_003b ;
    }
    public c0 W(ShareAnyResponse$ShareObject p0,k p1,String p2,String p3,h0 p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "conf");
       a.p(p4, "urlMgr");
       return g0$a.a(this, p0, p1, p2, p3, p4);
    }
    public boolean available(){
       return true;
    }
}
