package mg.j1;
import f55.g;
import mg.k1;
import com.kwai.feature.post.api.feature.bridge.JsSelectLocationParams;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import vxc.z;
import java.io.Serializable;

public class j1 implements g	// class@002611
{
    public final JsSelectLocationParams b;
    public final k1 c;

    public void j1(k1 p0,JsSelectLocationParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       this.c.d(this.b.mCallback, new JsErrorResult(p0, p1));
    }
    public void onSuccess(Object p0){
       this.c.d(this.b.mCallback, p0);
    }
}
