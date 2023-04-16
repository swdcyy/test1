package m9a.f;
import com.yxcorp.gifshow.detail.util.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class f	// class@002f7d
{
    public static boolean a;

    static {
       f.a = Suppliers.a(a.b).get().booleanValue();
    }
    public void f(){
       super();
    }
    public static boolean a(PhotoDetailParam p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getBizType() != 4) {
          return (f.a ^ 1);
       }
       return 1;
    }
}
