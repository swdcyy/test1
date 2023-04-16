package mg.p3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsEditDraftParams;
import mg.j4;
import mg.j4$c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import mg.j4$b;
import f55.g;
import mg.d;

public class p3 extends z	// class@00264b
{

    public void p3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (j4.a.a(true)) {
       }else if(this.e() == null){
          Object[] objArray = new Object[0];
          l.D().w("Bridge_Post", "editDraft safeRun: ", objArray);
          d.c(this.e(), p0, new j4$b(this, p0.mCallBack, "editDraft"));
       }
       return;
    }
}
