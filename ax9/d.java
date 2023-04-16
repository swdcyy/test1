package ax9.d;
import f55.g;
import ax9.e;
import com.kwai.feature.api.feed.misc.bridge.OpenDetailPageParams;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vxc.z;

public class d implements g	// class@0002e2
{
    public final OpenDetailPageParams b;
    public final e c;

    public void d(e p0,OpenDetailPageParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "2")) {
          return;
       }
       this.c.d(this.b.mCallback, new JsErrorResult(p0, p1));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.c.d(this.b.mCallback, p0);
       return;
    }
}
