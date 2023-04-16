package mg.j4$b;
import f55.g;
import vxc.z;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public class j4$b implements g	// class@002615
{
    public z b;
    public String c;
    public String d;

    public void j4$b(z p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void a(int p0,String p1,Bundle p2){
       Object[] objArray = new Object[0];
       l.D().w("Bridge_Post", this.d+" onError\(\) called with: err = ["+p0+"], s = ["+p1, objArray);
       Serializable serializable = SerializableHook.getSerializable(p2, "bundle_result");
       if (serializable != null) {
          this.b.d(this.c, serializable);
       }else {
          this.b.d(this.c, new JsErrorResult(p0, p1));
       }
       return;
    }
    public void onSuccess(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("Bridge_Post", this.d+" onSuccess: ", objArray);
       this.b.d(this.c, p0);
    }
}
