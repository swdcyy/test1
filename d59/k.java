package d59.k;
import y49.f;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.String;
import msd.l;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import a59.e;

public final class k extends f	// class@002051
{
    public final AdMKPageLoadPresenter d;

    public void k(AdMKPageLoadPresenter p0,String p1,l p2){
       this.d = p0;
       super(p1, p2);
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       String str = p0.optString("event");
       a.o(str, "event");
       this.d.D.put(str, p1);
       return this.e();
    }
}
