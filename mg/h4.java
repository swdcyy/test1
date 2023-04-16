package mg.h4;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsIntownPageShareParams;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import mg.j4$b;
import f55.g;
import mg.m0;

public class h4 extends z	// class@002608
{

    public void h4(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (this.e() == null) {
       }else {
          Object[] objArray = new Object[0];
          l.D().w("Bridge_Post", "inTownShare safeRun: ", objArray);
          m0.a(this.e(), p0, new j4$b(this, p0.mCallback, "inTownShare"));
       }
       return;
    }
}
