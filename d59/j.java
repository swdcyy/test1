package d59.j;
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
import a59.e;

public final class j extends f	// class@002050
{
    public final AdMKPageLoadPresenter d;

    public void j(AdMKPageLoadPresenter p0,String p1,l p2){
       this.d = p0;
       super(p1, p2);
    }
    public Object c(JSONObject p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       p0.J = p1;
       return this.e();
    }
}
