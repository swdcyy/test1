package mg.u3;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.kwai.feature.post.api.feature.bridge.JsMediaSceneLaunchParams;
import mg.j4;
import mg.j4$c;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mg.j4$b;
import f55.g;
import mg.d;

public class u3 extends z	// class@00266a
{

    public void u3(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       Object[] objArray;
       if (j4.a.a(true)) {
       }else {
          int i = 0;
          String str = "Bridge_Post";
          if (p0 == null) {
             objArray = new Object[i];
             l.D().w(str, "launchMediaScene safeRun:  params is null", objArray);
          }else if(this.e() == null){
             objArray = new Object[i];
             l.D().w(str, "launchMediaScene safeRun: ", objArray);
             d.e(this.e(), p0, new j4$b(this, p0.mCallBack, "launchMediaScene"));
          }
       }
       return;
    }
}
