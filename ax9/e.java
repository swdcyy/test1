package ax9.e;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.api.feed.misc.bridge.OpenDetailPageParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yo5.b;
import f55.c;
import com.kwai.bridge.a;
import android.app.Activity;
import ax9.d;
import f55.g;

public class e extends z	// class@0002e3
{

    public void e(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a.c(b.class).B7(this.e(), p0, new d(this, p0));
       }
       return;
    }
}
