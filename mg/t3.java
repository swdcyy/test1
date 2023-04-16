package mg.t3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsSaveTempImagesParams;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import android.app.Activity;
import mg.j4$b;
import f55.g;
import mg.d;

public class t3 extends z	// class@002664
{

    public void t3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       Object[] objArray;
       int i = 0;
       String str = "Bridge_Post";
       if (p0 == null) {
          objArray = new Object[i];
          l.D().w(str, "saveTempImages safeRun:  params is null", objArray);
       }else {
          objArray = new Object[i];
          l.D().w(str, "saveTempImages safeRun: ", objArray);
          d.f(this.e(), p0, new j4$b(this, p0.mCallback, "saveTempImages"));
       }
       return;
    }
}
