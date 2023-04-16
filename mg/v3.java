package mg.v3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JSGetEligibleDraftDataParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import mg.j4$b;
import f55.g;
import mg.k;

public class v3 extends z	// class@002670
{

    public void v3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (this.e() == null) {
       }else {
          Object[] objArray = new Object[0];
          l.D().w("Bridge_Post", "photosWithStartTime safeRun: ", objArray);
          k.c(this.e(), p0, new j4$b(this, p0.mCallback, "photosWithStartTime"));
       }
       return;
    }
}
