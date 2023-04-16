package f7a.a;
import yg5.q0;
import java.lang.Object;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vw9.g;

public final class a implements q0	// class@0022d9
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final PresenterV2 a(TabsPanelConfig p0){
       p0 = PatchProxy.applyOneRefsWithListener(p0, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new g());
       PatchProxy.onMethodExit(a.class, "1");
       return presenterV2;
    }
}
