package mg.y3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsGetPhotoCoverPathParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mg.j4$b;
import java.lang.String;
import f55.g;
import mg.k;

public class y3 extends z	// class@002680
{

    public void y3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (this.e() == null) {
       }else {
          k.d(this.e(), p0, new j4$b(this, p0.mCallback, "photoCoverPathWithIdentifier"));
       }
       return;
    }
}
