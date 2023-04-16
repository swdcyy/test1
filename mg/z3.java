package mg.z3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsVideoUploadStatusParams;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import q87.c;
import android.app.Activity;
import mg.j4$b;
import f55.g;
import com.feature.post.bridge.j;

public class z3 extends z	// class@002685
{

    public void z3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (p0 != null && p0.mTaskIdList != null) {
          Object[] objArray = new Object[0];
          l.D().s("Bridge_Post", "resumeVideoUpload safeRun\(\) called with: params = ["+p0+"]", objArray);
          j.e(this.e(), p0, new j4$b(this, p0.mCallback, "resumeVideoUpload"));
       }
       return;
    }
}
