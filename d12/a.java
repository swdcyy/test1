package d12.a;
import z41.b;
import java.lang.Object;
import androidx.fragment.app.FragmentActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import z41.c;
import z41.d;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import z41.a;

public class a implements b	// class@002415
{
    public LiveBizParam a;

    public void a(){
       super();
    }
    public static a e(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(p0).a(a.class);
    }
    public LiveBizParam a(){
       return this.a;
    }
    public void b(){
       a.a(this);
    }
}
