package a05.a;
import lnc.g2$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebContentPresenter;

public final class a implements g2$a	// class@00000d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new TunaMultiWebTitlePresenter());
       obj.U7(new TunaMultiWebContentPresenter());
       PatchProxy.onMethodExit(a.class, "1");
       return obj;
    }
}
