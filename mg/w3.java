package mg.w3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsGetPublishedDataParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mg.j4$b;
import java.lang.String;
import f55.g;
import mg.k;

public class w3 extends z	// class@002675
{

    public void w3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (this.e() == null) {
       }else {
          k.e(this.e(), p0, new j4$b(this, p0.mCallback, "publishPhotosWithLimitNumber"));
       }
       return;
    }
}
