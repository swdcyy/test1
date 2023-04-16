package mg.f4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import android.app.Activity;
import mg.j4$b;
import java.lang.String;
import f55.g;
import com.feature.post.bridge.m;

public class f4 extends z	// class@0025fc
{

    public void f4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       m.a(this.e(), p0, new j4$b(this, p0.mCallback, "selectAndUploadMedia"));
    }
}
