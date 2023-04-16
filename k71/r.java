package k71.r;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.r$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import rp5.a;
import lp3.c;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import lp3.e;
import kq3.a;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;

public final class r extends AbstractLiveJsCommand	// class@002cc5
{

    public void r(){
       super();
    }
    public Class a(){
       return r$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, r.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof r$a) {
          return m.g.c("invalid params");
       }
       if (p0.a() == null) {
          return m.g.c("param is required");
       }
       a uoa = this.g(a.class);
       Activity uActivity = uoa.c();
       if (uActivity == null) {
          return m.g.c("no current activity");
       }
       BaseFragment uBaseFragmen = uoa.t();
       c childFragmen = (uBaseFragmen != null)? uBaseFragmen.getChildFragmentManager(): null;
       uoa = a.d(uActivity, childFragmen, this.h());
       uoa.g("js-bridge-custom-h5");
       uoa.f("live-js-bridge-custom-h5");
       LiveWebViewParam liveWebViewP = p0.a();
       uoa.b = liveWebViewP;
       liveWebViewP.mInOutAnimation = 0x7f1103e0;
       a.c().h(p0.a().mWebUrl, uoa);
       return m$a.g(m.g, null, false, 3, null);
    }
}
