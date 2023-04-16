package mg.a4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsRouterParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mg.j4$b;
import java.lang.String;
import f55.g;
import mg.v;

public class a4 extends z	// class@0025cd
{

    public void a4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (this.e() == null) {
       }else {
          v.c(p0, new j4$b(this, p0.mCallback, "jumpToUrl"));
       }
       return;
    }
}
