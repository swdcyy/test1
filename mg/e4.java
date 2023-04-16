package mg.e4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusParams;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import android.app.Activity;
import mg.j4$b;
import f55.g;
import com.feature.post.bridge.j;

public class e4 extends z	// class@0025f6
{

    public void e4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (p0 != null && p0.mTaskIdList != null) {
          Object[] objArray = new Object[0];
          l.D().w("Bridge_Post", "getVideoUploadStatus safeRun: ", objArray);
          j.c(this.e(), p0, new j4$b(this, p0.mCallback, "getVideoUploadStatus"));
       }
       return;
    }
}
