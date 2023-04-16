package ax9.h;
import f55.g;
import ax9.i;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vxc.z;

public class h implements g	// class@0002e6
{
    public final JsCallbackParams b;
    public final i c;

    public void h(i p0,JsCallbackParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h.class, "2")) {
          return;
       }
       this.c.d(this.b.mCallback, new JsErrorResult(p0, p1));
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.c.d(this.b.mCallback, p0);
       return;
    }
}
