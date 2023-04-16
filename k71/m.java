package k71.m;
import uxc.b;
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

public final class m implements b	// class@002cbe
{
    public final LiveYodaWebViewFragment a;

    public void m(LiveYodaWebViewFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       c obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.getFragmentManager();
       a.m(obj);
       obj.popBackStack();
       return true;
    }
}
