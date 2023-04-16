package mg.a2;
import n3d.a;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.webview.jsmodel.component.JsVideoCaptureResult;
import com.feature.post.bridge.y;
import java.lang.String;
import android.os.Bundle;

public final class a2 implements a	// class@0025cb
{
    public final g b;

    public void a2(g p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a2 tb = this.b;
       if (p1 == -1) {
          tb.onSuccess(y.Pa(p2));
       }else {
          p1 = 412;
          if (p2 != null) {
             p1 = p2.getIntExtra("errorCode", p1);
          }
          tb.a(p1, y.Oa(p1), null);
       }
       return;
    }
}
