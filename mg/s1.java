package mg.s1;
import n3d.a;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.jsmodel.component.JsVideoCaptureResult;
import com.feature.post.bridge.y;
import android.os.Bundle;

public final class s1 implements a	// class@00265c
{
    public final int b;
    public final g c;

    public void s1(int p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       s1 tc = this.c;
       Object[] objArray = new Object[0];
       l.D().w("PostBridgeModuleImpl", "verifyLiveUser\(\) resultCode="+p1, objArray);
       if (this.b == p0) {
          if (p1 == -1) {
             tc.onSuccess(y.Pa(p2));
          }else {
             p0 = 412;
             if (p2 != null) {
                p0 = p2.getIntExtra("errorCode", p0);
             }
             tc.a(p0, y.Oa(p0), null);
          }
       }
       return;
    }
}
