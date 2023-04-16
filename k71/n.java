package k71.n;
import uxc.a;
import com.kuaishou.live.webview.LiveYodaWebViewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;

public final class n implements a	// class@002cbf
{
    public final LiveYodaWebViewFragment a;

    public void n(LiveYodaWebViewFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       c obj = PatchProxy.apply(null, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.getFragmentManager();
       a.m(obj);
       obj.popBackStack();
       return true;
    }
}
