package mg.k4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsGetEditDraftDataParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import mg.j4$b;
import f55.g;
import mg.k;

public class k4 extends z	// class@00262e
{

    public void k4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (this.e() == null) {
       }else {
          Object[] objArray = new Object[0];
          l.D().w("Bridge_Post", "getEditDraftData safeRun: ", objArray);
          k.b(this.e(), p0, new j4$b(this, p0.mCallBack, "getEditDraftData"));
       }
       return;
    }
}
